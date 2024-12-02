package Persistence;

import Connection.ConexaoBD;
import Controller.HashtableClienteController;
import Controller.HashtableServicoController;
import Model.Tarefas;
import Repository.IServicosCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yurid
 */
public class ServicoDAO implements IServicosCRUD {

    private Connection conexao;

    public ServicoDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
        if (conexao == null) {
            throw new Exception("ERRO DE CONEXAO");
        }
    }

    @Override
    public void insertServico(Tarefas tarefa) throws Exception {
        try {
            String sql = "INSERT INTO servicos (nome, preco_unit) VALUES (?, ?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, tarefa.getNome());
            preparedStatement.setDouble(2, tarefa.getPreco());
            preparedStatement.executeUpdate();

            // Obter o ID gerado
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);
                System.out.println("Serviço inserido com ID: " + id);
            } else {
                throw new Exception("Erro ao obter o ID do serviço.");
            }

        } catch (SQLException e) {
            throw new Exception("Erro ao inserir serviço: " + e.getMessage());
        }
    }

    @Override
    public void removerServico(String nome) throws Exception {
        try {
            String sql = "DELETE FROM servicos WHERE nome = ?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Serviço removido com sucesso!");
            } else {
                throw new Exception("Serviço com ID " + nome + " não encontrado.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao remover serviço: " + e.getMessage());
        }
    }

    @Override
    public void updateServico(Tarefas tarefa, String nomeAntigo) throws Exception {
        try {
            String sql = "UPDATE servicos SET nome = ?, preco_unit = ? WHERE nome = ?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, tarefa.getNome());
            preparedStatement.setDouble(2, tarefa.getPreco());
            preparedStatement.setString(3, nomeAntigo);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Serviço atualizado com sucesso!");
            } else {
                throw new Exception("Serviço com Nome " + tarefa.getNome()+ " não encontrado.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao atualizar serviço: " + e.getMessage());
        }
    }

    public static void selectServico(Connection conexao, HashtableServicoController repositorio) throws SQLException {
        repositorio.clear();

        String sql = "SELECT id, nome, preco_unit FROM servicos";
        try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                // Criação e preenchimento do serviço
                Tarefas tarefa = new Tarefas();
                tarefa.setNome(rs.getString("nome"));
                tarefa.setPreco(rs.getDouble("preco_unit"));

                // Adiciona o serviço ao repositório
                repositorio.adicionarServico(tarefa);
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao carregar os serviços: " + e.getMessage());
        }
    }
}