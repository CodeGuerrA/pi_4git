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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yurid
 */
public class MarcaDAO {

    private Connection conexao;

    public MarcaDAO() throws Exception {
        conexao = ConexaoBD.getConexao();  // Lógica para obter a conexão com o banco de dados
        if (conexao == null) {
            throw new Exception("Erro de conexão com o banco de dados.");
        }
    }

    public int adicionarMarca(String marca) throws SQLException {
        String sql = "INSERT INTO marca (nome) VALUES (?)";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, marca);

        // Executando a inserção
        preparedStatement.executeUpdate();

        // Obtendo o ID gerado
        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
        int idMarca = -1;
        if (generatedKeys.next()) {
            idMarca = generatedKeys.getInt(1);  // Obtendo o primeiro ID gerado
            System.out.println("ID da marca inserida: " + idMarca);
        }
        return idMarca;
    }

    public void removerMarca(String nomeMarca) throws Exception {
        String sql = "DELETE FROM marca WHERE nome = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, nomeMarca);
            preparedStatement.executeUpdate();
            System.out.println("Marca removida com sucesso!");
        } catch (SQLException e) {
            throw new Exception("Erro ao remover marca: " + e.getMessage());
        }
    }

    public List<String> selecionarMarcas() throws Exception {
        List<String> marcas = new ArrayList<>();
        String sql = "SELECT nome FROM marca";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                marcas.add(resultSet.getString("nome"));
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao selecionar marcas: " + e.getMessage());
        }
        return marcas;
    }
}
