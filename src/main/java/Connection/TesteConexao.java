/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

/**
 *
 * @author Guerra
 */
import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws Exception {
        try {
            // Tenta obter a conexão usando a classe ConexaoBD
            Connection conexao = ConexaoBD.getConexao();
            
            // Verifica se a conexão foi estabelecida
            if (conexao != null) {
                System.out.println("Conexão estabelecida com sucesso!");
                // Opcional: Mostra algumas informações sobre a conexão
                System.out.println("Status da conexão: " + !conexao.isClosed());
                System.out.println("URL da conexão: " + conexao.getMetaData().getURL());
                System.out.println("Usuário conectado: " + conexao.getMetaData().getUserName());
            } else {
                System.out.println("Erro: A conexão é nula.");
            }
        } catch (Exception e) {
            // Exibe qualquer erro que ocorrer
            System.err.println("Erro ao conectar ao banco de dados:");
            e.printStackTrace();
        } finally {
            // Fecha a conexão para liberar recursos (se necessário)
            try {
                if (ConexaoBD.getConexao() != null && !ConexaoBD.getConexao().isClosed()) {
                    ConexaoBD.getConexao().close();
                    System.out.println("Conexão fechada.");
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão:");
                e.printStackTrace();
            }
        }
    }
}

