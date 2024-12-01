/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Connection.ConexaoBD;
import Model.Veiculos;
import Repository.IVeiculosCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
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
    
    @Override
    public void insertVeiculo(Veiculos veiculo, JComboBox<String> comboBoxMarca, JComboBox<String> comboBoxModelo) throws Exception {
        String modeloSelecionado = (String) comboBoxModelo.getSelectedItem();
        String marcaSelecionada = (String) comboBoxMarca.getSelectedItem();

        // Buscar o ID da marca
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

        // Buscar o ID do modelo
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

        // Inserir o veículo no banco de dados
        String sqlVeiculo = "INSERT INTO veiculos (placa, n_chassi, kilometragem, n_patrimonio, id_modelo, acessorios) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sqlVeiculo)) {
            preparedStatement.setString(1, veiculo.getPlaca());
            preparedStatement.setString(2, veiculo.getChassi());
            preparedStatement.setInt(3, Integer.parseInt(veiculo.getKilometragem()));
            preparedStatement.setString(4, veiculo.getPatrimonio());
            preparedStatement.setInt(5, idModelo);  // ID do modelo
            preparedStatement.setString(6, veiculo.getAcessorios());
            preparedStatement.executeUpdate();
            System.out.println("Veículo inserido com sucesso!");
        } catch (SQLException e) {
            throw new Exception("Erro ao inserir veículo: " + e.getMessage());
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

    @Override
    public void selectVeiculo(DefaultTableModel model) throws Exception {

    }
}