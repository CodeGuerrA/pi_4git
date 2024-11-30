package Util;





import Connection.ConexaoBD;
import Model.Cliente;
import Controller.HashtableClienteController;
import static Persistence.ClientesDAO.selectClientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando o repositório de clientes
        HashtableClienteController repositorio = new HashtableClienteController();

        // Conexão com o banco de dados via classe ConexaoBD
        try (Connection conexao = ConexaoBD.getConexao()) {

            if (conexao != null && !conexao.isClosed()) {
                System.out.println("Conexão bem-sucedida com o banco de dados!");

                // Chama o método selectClientes para adicionar os clientes ao repositório
                selectClientes(conexao, repositorio);

                // Scanner para ler a entrada do usuário (CPF para buscar o cliente)
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o CPF do cliente para consulta: ");
                String cpf = scanner.nextLine();

                // Buscando o cliente pelo CPF
                Cliente clienteEncontrado = repositorio.buscarClientePorChave(cpf);

                // Verificando se o cliente foi encontrado
                if (clienteEncontrado != null) {
                    // Exibindo os dados do cliente encontrado
                    System.out.println("Cliente encontrado:");
                    System.out.println("ID: " + clienteEncontrado.getID());
                    System.out.println("Nome: " + clienteEncontrado.getNome());
                    System.out.println("Endereço: " + clienteEncontrado.getEndereco());
                    System.out.println("Email: " + clienteEncontrado.getEmail());
                    System.out.println("Telefone: " + clienteEncontrado.getTelefones());
                    System.out.println("CPF: " + clienteEncontrado.getCPF());
                    System.out.println("CNPJ: " + clienteEncontrado.getCNPJ());
                    System.out.println("Contato: " + clienteEncontrado.getContatos());
                    System.out.println("Inscrição Estadual: " + clienteEncontrado.getIns_Estadual());
                } else {
                    System.out.println("Cliente não encontrado!");
                }

            } else {
                System.out.println("Falha na conexão com o banco de dados.");
            }
        } catch (SQLException e) {
            // Trata erros de conexão com o banco ou de execução do SQL
            System.out.println("Erro ao conectar ou consultar o banco de dados: " + e.getMessage());
        } catch (Exception e) {
            // Tratamento de outros erros
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
