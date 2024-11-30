package Persistence;

import Connection.ConexaoBD;
import Controller.HashtableClienteController;
import Model.Cliente;
import Repository.IClientesCRUD;
import Service.ClienteService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author yurid
 */
public class ClientesDAO implements IClientesCRUD {

    private Connection conexao = null;

    public ClientesDAO() throws Exception {
        conexao = ConexaoBD.getConexao();
        if (conexao == null) {
            throw new Exception("ERRO DE CONEXAO");
        }
    }

    @Override
    public void insertPJ(Cliente objClientes) throws Exception {
        try {

            String sql1 = "insert into clientes (nome, endereco, email, telefone, telefone2)"
                    + "values (?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, objClientes.getNome());
            preparedStatement.setString(2, objClientes.getEndereco());
            preparedStatement.setString(3, objClientes.getEmail());
            preparedStatement.setString(4, objClientes.getTelefones());
            preparedStatement.setString(5, objClientes.getTelefones());
            preparedStatement.executeUpdate();

            System.out.println("Cliente Adicionado!");

            // Obter a chave gerada (id_cliente) após a inserção
            int idCliente = 0;
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys(); // Obter as chaves geradas
            if (generatedKeys.next()) {
                idCliente = generatedKeys.getInt(1); // Pega o primeiro ID gerado
                System.out.println("ID do Cliente inserido: " + idCliente);
            } else {
                throw new Exception("Erro ao obter o ID do cliente.");
            }

            String sql2 = "insert into pessoa_juridica (cnpj, contato, insc_estadual, id_cliente) values (?, ?, ?, ?);";
            PreparedStatement preparedStatement2 = conexao.prepareStatement(sql2);
            preparedStatement2.setString(1, objClientes.getCNPJ());
            preparedStatement2.setString(2, objClientes.getContatos());
            preparedStatement2.setString(3, objClientes.getIns_Estadual());
            preparedStatement2.setInt(4, idCliente);
            preparedStatement2.executeUpdate();
            System.out.println("PJ adicionado!");

        } catch (SQLException erro) {
            //Erro do comando SQL - chave, coluna, nome da tabela, ...
            throw new Exception("SQL Erro: " + erro.getMessage());
        } catch (Exception erro) {
            throw new Exception("Incluir Persistencia: " + erro);
        }
    }

    @Override
    public void insertPF(Cliente objClientes) throws Exception {
        try {
            // Inserir o cliente na tabela clientes e obter o ID gerado
            String sql1 = "INSERT INTO clientes (nome, endereco, email, telefone, telefone2) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS); // Usar RETURN_GENERATED_KEYS
            preparedStatement.setString(1, objClientes.getNome());
            preparedStatement.setString(2, objClientes.getEndereco());
            preparedStatement.setString(3, objClientes.getEmail());
            preparedStatement.setString(4, objClientes.getTelefones());
            preparedStatement.setString(5, objClientes.getTelefones());
            preparedStatement.executeUpdate();

            // Obter a chave gerada (id_cliente) após a inserção
            int idCliente = 0;
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys(); // Obter as chaves geradas
            if (generatedKeys.next()) {
                idCliente = generatedKeys.getInt(1); // Pega o primeiro ID gerado
                System.out.println("ID do Cliente inserido: " + idCliente);
            } else {
                throw new Exception("Erro ao obter o ID do cliente.");
            }

            // Agora, insira os dados na tabela pessoa_fisica usando o id_cliente
            String sql2 = "INSERT INTO pessoa_fisica (cpf, id_cliente) VALUES (?, ?)";
            PreparedStatement preparedStatement2 = conexao.prepareStatement(sql2);
            preparedStatement2.setString(1, objClientes.getCPF());
            preparedStatement2.setInt(2, idCliente); // Usar o id_cliente gerado
            preparedStatement2.executeUpdate();

        } catch (SQLException erro) {
            // Erro do comando SQL
            throw new Exception("SQL Erro: " + erro.getMessage());
        } catch (Exception erro) {
            throw new Exception("Incluir Persistência: " + erro);
        }
    }


    /*
    @Override
    public void updatePJ(Cliente objClientes) throws Exception {
        
    }*/
    @Override
    public void removerPJ(String cnpjCliente) throws Exception {
        try {
            String selectSql = "SELECT id_cliente FROM pessoa_juridica WHERE cnpj = ?";
            PreparedStatement selectStmt = conexao.prepareStatement(selectSql);
            selectStmt.setString(1, cnpjCliente);
            ResultSet rs = selectStmt.executeQuery();

            int idCliente = 0;
            if (rs.next()) {
                idCliente = rs.getInt("id_cliente");  // Pega o id_cliente da pessoa_fisica
                System.out.println("ID do Cliente: " + idCliente);
            } else {
                throw new Exception("CPF não encontrado.");
            }

            String deleteSqlPF = "DELETE FROM pessoa_juridica WHERE cnpj = ?";
            PreparedStatement deleteStmtPF = conexao.prepareStatement(deleteSqlPF);
            deleteStmtPF.setString(1, cnpjCliente);
            deleteStmtPF.executeUpdate();

            System.out.println("Pessoa juridica deletada!");
            String deleteSqlCliente = "DELETE FROM clientes WHERE id = ?";
            PreparedStatement deleteStmtCliente = conexao.prepareStatement(deleteSqlCliente);
            deleteStmtCliente.setInt(1, idCliente);
            deleteStmtCliente.executeUpdate();
            System.out.println("Cliente deletado!");

        } catch (SQLException e) {
            throw new Exception("Erro ao excluir cliente: " + e.getMessage());
        }
    }

    @Override
    public void removerPF(String cpfCliente) throws Exception {
        try {
            String selectSql = "SELECT id_cliente FROM pessoa_fisica WHERE cpf = ?";
            PreparedStatement selectStmt = conexao.prepareStatement(selectSql);
            selectStmt.setString(1, cpfCliente);
            ResultSet rs = selectStmt.executeQuery();

            int idCliente = 0;
            if (rs.next()) {
                idCliente = rs.getInt("id_cliente");  // Pega o id_cliente da pessoa_fisica
                System.out.println("ID do Cliente: " + idCliente);
            } else {
                throw new Exception("CPF não encontrado.");
            }

            String deleteSqlPF = "DELETE FROM pessoa_fisica WHERE cpf = ?";
            PreparedStatement deleteStmtPF = conexao.prepareStatement(deleteSqlPF);
            deleteStmtPF.setString(1, cpfCliente);
            deleteStmtPF.executeUpdate();

            System.out.println("Pessoa fisica deletada!");
            String deleteSqlCliente = "DELETE FROM clientes WHERE id = ?";
            PreparedStatement deleteStmtCliente = conexao.prepareStatement(deleteSqlCliente);
            deleteStmtCliente.setInt(1, idCliente);
            deleteStmtCliente.executeUpdate();
            System.out.println("Cliente deletado!");

        } catch (SQLException e) {
            throw new Exception("Erro ao excluir cliente: " + e.getMessage());
        }
    }

    @Override
    public void updatePJ(Cliente cliente, String cnpj) throws Exception {
        try {
            String selectSql = "SELECT id_cliente FROM pessoa_juridica WHERE cnpj = ?";
            PreparedStatement selectStmt = conexao.prepareStatement(selectSql);
            selectStmt.setString(1, cnpj);
            ResultSet rs = selectStmt.executeQuery();

            int idCliente = 0;
            if (rs.next()) {
                idCliente = rs.getInt("id_cliente");  // Pega o id_cliente da pessoa_fisica
                System.out.println("ID do Cliente: " + idCliente);
            } else {
                throw new Exception("CPF não encontrado.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao alterar o cliente: " + e.getMessage());
        }

    }

    @Override
    public void updatePF(Cliente cliente, String cpf) throws Exception {
        try {
            String selectSql = "SELECT id_cliente FROM pessoa_fisica WHERE cpf = ?";
            PreparedStatement selectStmt = conexao.prepareStatement(selectSql);
            selectStmt.setString(1, cpf);
            ResultSet rs = selectStmt.executeQuery();

            int idCliente = 0;
            if (rs.next()) {
                idCliente = rs.getInt("id_cliente");  // Pega o id_cliente da pessoa_fisica
                System.out.println("ID do Cliente: " + idCliente);
            } else {
                throw new Exception("CPF não encontrado.");
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao alterar o cliente: " + e.getMessage());
        }

    }

    public static void selectClientes(Connection conexao, HashtableClienteController repositorio) throws SQLException {
        repositorio.clear();

        String sql = "SELECT c.id AS id_cliente, c.nome, c.endereco, c.email, c.telefone, c.telefone2, "
                + "pf.cpf, pj.cnpj, pj.contato, pj.insc_estadual "
                + "FROM clientes c "
                + "LEFT JOIN pessoa_fisica pf ON c.id = pf.id_cliente "
                + "LEFT JOIN pessoa_juridica pj ON c.id = pj.id_cliente";

        try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                // Criação e preenchimento do cliente
                Cliente cliente = new Cliente();
                cliente.setID(Integer.toString(rs.getInt("id_cliente")));
                cliente.setNome(rs.getString("nome"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefones(rs.getString("telefone"));
                cliente.setCPF(rs.getString("cpf"));
                cliente.setCNPJ(rs.getString("cnpj"));
                cliente.setContatos(rs.getString("contato"));
                cliente.setIns_Estadual(rs.getString("insc_estadual"));

                // Adiciona o cliente ao repositório
                repositorio.adicionarCliente(cliente);

            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao carregar os clientes: " + e.getMessage());
        }
    }
}
