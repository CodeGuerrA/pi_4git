package Persistence;

import Connection.ConexaoBD;
import Controller.HashtableColaboradorController;
import Model.Colaborador;
import Repository.IColaboradorCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ColaboradorDAO implements IColaboradorCRUD {

    private Connection conexao;

    public ColaboradorDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
        if (conexao == null) {
            throw new Exception("ERRO DE CONEXAO");
        }
    }

    @Override
    public void insertColaborador(Colaborador colaborador) throws Exception {
        String sql = "INSERT INTO funcionario (nome) VALUES (?)";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, colaborador.getNome());
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Colaborador inserido com sucesso!");
            } else {
                System.out.println("Falha ao inserir o colaborador.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao inserir colaborador: " + e.getMessage());
        }
    }

    @Override
    public void updateColaborador(Colaborador colaborador) throws Exception {
        String sql = "UPDATE funcionario SET nome = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, colaborador.getNome());
            preparedStatement.setInt(2, Integer.parseInt(colaborador.getId()));
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Colaborador atualizado com sucesso!");
            } else {
                System.out.println("Nenhum colaborador encontrado com o ID informado.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao atualizar colaborador: " + e.getMessage());
        }
    }

    @Override
    public void deleteColaboradorById(int id) throws Exception {
        String sql = "DELETE FROM funcionario WHERE id = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Colaborador removido com sucesso!");
            } else {
                System.out.println("Nenhum colaborador encontrado com o ID informado.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao remover colaborador: " + e.getMessage());
        }
    }

    public static void selectColaborador(Connection conexao, HashtableColaboradorController repositorioColaborador) throws SQLException {
        // Limpa o repositório de colaboradores antes de adicionar novos
        repositorioColaborador.clear();

        // Comando SQL para selecionar apenas o nome dos colaboradores
        String sql = "SELECT c.id, c.nome FROM funcionario c";

        // A conexão com o banco de dados deve ser fornecida de alguma forma, por exemplo:
        // Connection conexao = DriverManager.getConnection(...);
        try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            // Itera sobre cada linha retornada pelo ResultSet
            while (rs.next()) {
                // Criação de um novo objeto Colaborador
                Colaborador colaborador = new Colaborador();
                // Preenche apenas o nome do colaborador
                colaborador.setId(rs.getString("id"));
                colaborador.setNome(rs.getString("nome"));

                // Adiciona o colaborador ao repositório
                repositorioColaborador.adicionarColaborador(colaborador);
            }
        } catch (SQLException e) {
            // Se ocorrer um erro durante a consulta, lança uma exceção com a mensagem de erro detalhada
            throw new SQLException("Erro ao carregar os colaboradores: " + e.getMessage(), e);
        }
    }
}
