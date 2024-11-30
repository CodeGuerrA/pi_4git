package Persistence;

import Connection.ConexaoBD;
import Model.Colaborador;
import Repository.IColaboradorCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ColaboradorDAO implements IColaboradorCRUD {

    private Connection conexao = null;

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
    public void deleteColaboradorById(String id) throws Exception {
        String sql = "DELETE FROM funcionario WHERE id = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, String.valueOf(id)); 
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

    @Override
    public void selectColaborador(String nome) throws Exception {

    }
}
