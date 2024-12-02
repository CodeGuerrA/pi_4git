package Persistence;

import Connection.ConexaoBD;
import Controller.HashtableVeiculoController;
import Model.Propriedade;
import Model.Veiculos;
import Repository.IVeiculosCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yurid
 */
public class VeiculosDAO implements IVeiculosCRUD {

    private Connection conexao = null;

    public VeiculosDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
        if (conexao == null) {
            throw new Exception("ERRO DE CONEXAO");
        }
    }

    public void insertVeiculo(Veiculos veiculo, Propriedade propriedade) throws Exception {
        String modeloSelecionado = veiculo.getModelo();
        String marcaSelecionada = veiculo.getMarca();

        String sqlMarca = "SELECT id FROM marca WHERE nome = ?";
        int idMarca = -1;
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sqlMarca)) {
            preparedStatement.setString(1, marcaSelecionada);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                idMarca = resultSet.getInt("id");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao buscar marca: " + e.getMessage());
        }

        String sqlModelo = "SELECT id FROM modelo WHERE nome = ? AND id_marca = ?";
        int idModelo = -1;
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sqlModelo)) {
            preparedStatement.setString(1, modeloSelecionado);
            preparedStatement.setInt(2, idMarca);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                idModelo = resultSet.getInt("id");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao buscar modelo: " + e.getMessage());
        }

        // Inserir o veículo no banco, caso ainda não exista
        String sqlVeiculo = "INSERT INTO veiculos (placa, n_chassi, kilometragem, n_patrimonio, id_modelo, acessorios) "
                + "VALUES (?, ?, ?, ?, ?, ?) ON CONFLICT (placa) DO NOTHING";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sqlVeiculo)) {
            preparedStatement.setString(1, veiculo.getPlaca());
            preparedStatement.setString(2, veiculo.getChassi());
            preparedStatement.setInt(3, Integer.parseInt(veiculo.getKilometragem())); // Aqui você ainda pode precisar de um inteiro
            preparedStatement.setString(4, veiculo.getPatrimonio());
            preparedStatement.setInt(5, idModelo);
            preparedStatement.setString(6, veiculo.getAcessorios());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Erro ao inserir veículo: " + e.getMessage());
        }

        // Verificar se o veículo já está vinculado a algum cliente
        String sqlVerificarVinculo = "SELECT id_clientes FROM propriedade WHERE id_veiculos = ? AND data_fim IS NULL";
        boolean possuiVinculo = false;
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sqlVerificarVinculo)) {
            preparedStatement.setString(1, veiculo.getPlaca()); // Corrigido para usar placa como String
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                possuiVinculo = true;

                // Atualizar a data_fim do vínculo existente
                String sqlAtualizarDataFim = "UPDATE propriedade SET data_fim = ? WHERE id_veiculo = ? AND data_fim IS NULL";
                try (PreparedStatement updateStatement = conexao.prepareStatement(sqlAtualizarDataFim)) {
                    updateStatement.setDate(1, new java.sql.Date(new Date().getTime()));
                    updateStatement.setString(2, veiculo.getPlaca()); // Corrigido para usar placa como String
                    updateStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao verificar vínculo do veículo: " + e.getMessage());
        }

        // Inserir o novo vínculo na tabela `propriedade`
        String sqlPropriedade = "INSERT INTO propriedade (id_clientes, id_veiculos, data_Inicio) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sqlPropriedade)) {
            preparedStatement.setInt(1, propriedade.getIdCliente());
            preparedStatement.setString(2, veiculo.getPlaca()); // Corrigido para usar placa como String
            preparedStatement.setDate(3, new java.sql.Date(propriedade.getDataEntrada().getTime()));
            preparedStatement.executeUpdate();
            System.out.println("Propriedade vinculada com sucesso!");
        } catch (SQLException e) {
            throw new Exception("Erro ao inserir propriedade: " + e.getMessage());
        }
    }

    @Override
    public void removerVeiculo(String placa) throws Exception {
        String sql = "DELETE FROM veiculos WHERE placa = ?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);

            preparedStatement.setString(1, placa);

            int linhasAfetadas = preparedStatement.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Veículo com a placa " + placa + " removido com sucesso.");
            } else {
                System.out.println("Veículo com a placa " + placa + " não encontrado.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao remover veículo: " + e.getMessage());
        }
    }

    @Override
    public void updateVeiculo(Veiculos veiculo, String placa) throws Exception {
        try {
            String sql = "UPDATE veiculos SET placa = ?, n_chassi = ?, kilometragem = ?, n_patrimonio = ?, id_modelo = ?, acessorios = ? WHERE placa = ?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);

            // Passando os novos valores
            preparedStatement.setString(1, veiculo.getPlaca());
            preparedStatement.setString(2, veiculo.getChassi());
            preparedStatement.setInt(3, Integer.parseInt(veiculo.getKilometragem())); // Convertendo para int
            preparedStatement.setString(4, veiculo.getPatrimonio());
            preparedStatement.setInt(5, Integer.parseInt(veiculo.getModelo())); // Modelo como Integer
            preparedStatement.setString(6, veiculo.getAcessorios()); // Acessórios como String

            // Usando a placa do veículo como critério de atualização
            preparedStatement.setString(7, placa);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Veículo atualizado com sucesso!");
            } else {
                System.out.println("Nenhum veículo encontrado com a placa informada.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao atualizar veículo: " + e.getMessage());
        }
    }

 public static void selectVeiculos(Connection conexao, HashtableVeiculoController repositorio) throws SQLException {
    repositorio.clear();

    // Certifique-se de usar o nome correto para as colunas e tabelas.
 String sql = "SELECT m.id AS id_veiculo, v.placa, v.n_chassi, v.kilometragem, v.n_patrimonio, "
            + "v.acessorios, m.nome AS modelo, ma.nome AS marca "
            + "FROM veiculos v "
            + "LEFT JOIN modelo m ON v.id_modelo = m.id "
            + "LEFT JOIN marca ma ON m.id_marca = ma.id"; // Certifique-se de que o nome da tabela 'marca' está correto.

    try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
            // Criação e preenchimento do veículo
            Veiculos veiculo = new Veiculos();
            veiculo.setPlaca(rs.getString("placa"));
            veiculo.setChassi(rs.getString("n_chassi"));
            veiculo.setKilometragem(String.valueOf(rs.getInt("kilometragem")));
            veiculo.setPatrimonio(rs.getString("n_patrimonio"));
            veiculo.setAcessorios(rs.getString("acessorios"));
            veiculo.setModelo(rs.getString("modelo"));
            veiculo.setMarca(rs.getString("marca"));

            // Adiciona o veículo ao repositório
            repositorio.adicionarVeiculo(veiculo);
        }
    } catch (SQLException e) {
        throw new SQLException("Erro ao carregar os veículos: " + e.getMessage());
    }
}



    public List<String> buscarMarcas() throws SQLException {
        List<String> marcas = new ArrayList<>();
        String sql = "SELECT nome FROM marca"; // Pega apenas o nome das marcas
        try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                marcas.add(rs.getString("nome")); // Adiciona o nome à lista
            }
        }
        return marcas;
    }

    public List<String> buscarModelos() throws SQLException {
        List<String> modelos = new ArrayList<>();
        String sql = "SELECT nome FROM modelo"; // Pega apenas o nome dos modelos
        try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                modelos.add(rs.getString("nome")); // Adiciona o nome à lista
            }
        }
        return modelos;
    }

}
