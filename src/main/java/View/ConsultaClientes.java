/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Connection.ConexaoBD;
import Controller.HashtableClienteController;
import Model.Cliente;
import Persistence.ClientesDAO;
import static Persistence.ClientesDAO.selectClientes;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guerra
 */
public class ConsultaClientes extends javax.swing.JFrame {

    private final HashtableClienteController repositorio;

    public ConsultaClientes() {
        repositorio = new HashtableClienteController();

        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Fecha apenas esta janela
        carregarClientesNaTabela();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        textBuscar = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF/CNPJ", "Telefone", "Endereço", "E-mail", "Contatos", "Inscrição Estadual"
            }
        ));
        jScrollPane1.setViewportView(tabelaClientes);

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar Cliente");

        buttonRefresh.setText("Refresh");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1234, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRefresh)
                            .addComponent(buttonBuscar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void carregarClientesNaTabela() {
        try (Connection conexao = ConexaoBD.getConexao()) {
            if (conexao != null && !conexao.isClosed()) {
                System.out.println("Conexão bem-sucedida com o banco de dados!");

                // Limpar a Hashtable antes de adicionar novos clientes
                repositorio.clear();

                // Popula o repositório com todos os clientes do banco
                selectClientes(conexao, repositorio);

                // Limpa a tabela antes de adicionar os dados
                DefaultTableModel model = (DefaultTableModel) tabelaClientes.getModel();
                model.setRowCount(0);

                // Adiciona todos os clientes na tabela usando um laço para iterar sobre a Hashtable
                Enumeration<Cliente> clientesEnum = repositorio.listarTodosClientes().elements();

                while (clientesEnum.hasMoreElements()) {
                    Cliente cliente = clientesEnum.nextElement();
                    model.addRow(new Object[]{
                        cliente.getNome(),
                        cliente.getCNPJ() != null && !cliente.getCNPJ().isEmpty() ? cliente.getCNPJ() : cliente.getCPF(),
                        cliente.getTelefones(),
                        cliente.getEndereco(),
                        cliente.getEmail(),
                        cliente.getContatos(),
                        cliente.getIns_Estadual() != null ? cliente.getIns_Estadual() : ""
                    });
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ou consultar o banco de dados: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro geral: " + e.getMessage());
        }
    }

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        try (Connection conexao = ConexaoBD.getConexao()) {
            if (conexao != null && !conexao.isClosed()) {
                System.out.println("Conexão bem-sucedida com o banco de dados!");

                // Limpar o repositório antes de buscar
                repositorio.clear();

                // Popula o repositório com todos os clientes do banco
                selectClientes(conexao, repositorio);

                // Busca pelo CPF digitado
                String chave = textBuscar.getText().trim();
                Cliente clienteEncontrado = repositorio.buscarClientePorChave(chave);

                if (clienteEncontrado != null) {
                    // Atualiza a tabela com o cliente encontrado
                    atualizarTabelaCliente(clienteEncontrado);
                } else {
                    System.out.println("Cliente não encontrado para o CPF: " + chave);
                    // Caso não encontre, limpa a tabela ou exibe uma mensagem
                    limparTabela();
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ou consultar o banco de dados: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro geral: " + e.getMessage());
        }

    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        carregarClientesNaTabela();
    }//GEN-LAST:event_buttonRefreshActionPerformed
// Método para atualizar a tabela com os dados do cliente encontrado

    private void atualizarTabelaCliente(Cliente cliente) {
        // Limpa a tabela antes de adicionar o cliente
        DefaultTableModel model = (DefaultTableModel) tabelaClientes.getModel();
        model.setRowCount(0);  // Limpa todas as linhas da tabela

        model.addRow(new Object[]{
            cliente.getNome(),
            cliente.getCNPJ() != null && !cliente.getCNPJ().isEmpty() ? cliente.getCNPJ() : cliente.getCPF(),
            cliente.getTelefones(),
            cliente.getEndereco(),
            cliente.getEmail(),
            cliente.getContatos(),
            cliente.getIns_Estadual() != null ? cliente.getIns_Estadual() : ""
        });
    }

    private void limparTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelaClientes.getModel();
        model.setRowCount(0);  // Limpa todas as linhas da tabela
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField textBuscar;
    // End of variables declaration//GEN-END:variables
}
