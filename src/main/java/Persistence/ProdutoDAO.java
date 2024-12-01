/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Model.Produto;
import Repository.IProdutosCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutosCRUD {

    private final Connection conexao;

    public ProdutoDAO(Connection conexao) throws Exception {
        this.conexao = conexao;
        if (this.conexao == null) {
            throw new Exception("ERRO DE CONEXÃO");
        }
    }

    @Override
    public void insertProduto(Produto produto) throws Exception {
        String sql = "INSERT INTO produto (nome, descricao, quantidade, preco_unit) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setDouble(3, produto.getQuantidade());
            preparedStatement.setDouble(4, produto.getPrecoUnitario());
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Produto inserido com sucesso!");
            } else {
                System.out.println("Falha ao inserir o produto.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao inserir produto: " + e.getMessage());
        }
    }

    @Override
    public void removerProduto(int id) throws Exception {
        String sql = "DELETE FROM produto WHERE id = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Produto removido com sucesso!");
            } else {
                System.out.println("Nenhum produto encontrado com o ID informado.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao remover produto: " + e.getMessage());
        }
    }

    @Override
    public void updateProduto(Produto produto) throws Exception {
        String sql = "UPDATE produto SET nome = ?, descricao = ?, quantidade = ?, preco_unit = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setDouble(3, produto.getQuantidade());
            preparedStatement.setDouble(4, produto.getPrecoUnitario());
            preparedStatement.setInt(5, Integer.parseInt(produto.getId()));
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Produto atualizado com sucesso!");
            } else {
                System.out.println("Nenhum produto encontrado com o ID informado.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    public static void selectProdutos(Connection conexao, List<Produto> repositorioProduto) throws SQLException {
        // Limpa o repositório de produtos antes de adicionar novos
        repositorioProduto.clear();

        // Comando SQL para selecionar todos os produtos
        String sql = "SELECT p.id, p.nome, p.descricao, p.quantidade, p.preco_unit FROM produto p";

        try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            // Itera sobre cada linha retornada pelo ResultSet
            while (rs.next()) {
                // Criação de um novo objeto Produto
                Produto produto = new Produto();
                // Preenche os atributos do produto
                produto.setId(String.valueOf(rs.getInt("id")));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPrecoUnitario(rs.getDouble("preco_unit"));

                // Adiciona o produto ao repositório
                repositorioProduto.add(produto);
            }
        } catch (SQLException e) {
            // Se ocorrer um erro durante a consulta, lança uma exceção com a mensagem de erro detalhada
            throw new SQLException("Erro ao carregar os produtos: " + e.getMessage(), e);
        }
    }
}
