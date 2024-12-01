package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static Connection conexao = null;

    // Construtor da classe (não necessário para a implementação atual, mas deixei para manter consistência)
    public ConexaoBD() {
    }

    // Método estático para obter a conexão com o banco de dados
    public static Connection getConexao() throws Exception {
        try {
            // Verifica se a conexão já está estabelecida
            if (conexao == null || conexao.isClosed()) {
                String driver = "org.postgresql.Driver"; // Driver do PostgreSQL
                String url = "jdbc:postgresql://localhost:5432/mecanica"; // URL de conexão com o banco de dados
                String user = "postgres"; // Nome de usuário do banco de dados
                String password = "224046"; // Senha do banco de dados

                // Carrega o driver do PostgreSQL
                Class.forName(driver);

                // Estabelece a conexão
                conexao = DriverManager.getConnection(url, user, password);
            }
        } catch (ClassNotFoundException erro) {
            // Erro caso o driver do banco não seja encontrado
            throw new Exception("Driver não encontrado: " + erro.getMessage());
        } catch (SQLException erro) {
            // Erro caso haja um problema com a conexão (usuário, senha ou banco)
            throw new Exception("Erro na conexão com o banco de dados: " + erro.getMessage());
        }
        return conexao;
    }

    // Método para fechar a conexão (importante para evitar vazamento de recursos)
    public static void fecharConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("Conexão fechada com sucesso.");
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao fechar a conexão: " + erro.getMessage());
        }
    }
}
