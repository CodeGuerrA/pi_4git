/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Connection.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yurid
 */
public class ModeloDAO {

    private Connection conexao;

    public ModeloDAO() throws Exception {
        conexao = ConexaoBD.getConexao();  // Lógica para obter a conexão com o banco de dados
        if (conexao == null) {
            throw new Exception("Erro de conexão com o banco de dados.");
        }
    }

    // Método para adicionar um modelo
    public void adicionarModelo(String modelo, int idMarca) throws SQLException {
        String sql = "INSERT INTO modelo (nome, id_marca) VALUES (?, ?)";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, modelo);
        preparedStatement.setInt(2, idMarca);

        preparedStatement.executeUpdate();
        System.out.println("Modelo '" + modelo + "' adicionado com sucesso.");
    }

    // Método para remover um modelo
    public void removerModelo(String nomeModelo) throws Exception {
        String sql = "DELETE FROM modelo WHERE nome = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, nomeModelo);
            preparedStatement.executeUpdate();
            System.out.println("Modelo removido com sucesso!");
        } catch (SQLException e) {
            throw new Exception("Erro ao remover modelo: " + e.getMessage());
        }
    }

    // Método para selecionar os modelos de uma marca específica
    public List<String> selecionarModelosPorMarca(int idMarca) throws Exception {
        List<String> modelos = new ArrayList<>();
        String sql = "SELECT nome FROM modelo WHERE id_marca = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setInt(1, idMarca);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    modelos.add(resultSet.getString("nome"));
                }
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao selecionar modelos: " + e.getMessage());
        }
        return modelos;
    }
}
