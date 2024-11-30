/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.HashtableServicoController;
import Model.Colaborador;
import Model.Tarefas;
import Persistence.ColaboradorDAO;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guerra
 */
public class CadastroColabServico extends javax.swing.JFrame {

    /**
     * Creates new form cadastroColaborador
     */
    public CadastroColabServico() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableCadastro = new javax.swing.JTabbedPane();
        tabledServico = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cadastroServico = new javax.swing.JTable();
        LabelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        LabelPreço = new javax.swing.JLabel();
        textPreco = new javax.swing.JTextField();
        buttonAdicionarServico = new javax.swing.JButton();
        buttonRemoverServico = new javax.swing.JButton();
        tabledColaborador = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableColaborador = new javax.swing.JTable();
        nomeColab = new javax.swing.JLabel();
        textColab = new javax.swing.JTextField();
        buttonAdicionarColb = new javax.swing.JButton();
        buttonRemoverCollab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastroServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço"
            }
        ));
        cadastroServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroServicoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cadastroServico);

        LabelNome.setText("Nome");

        LabelPreço.setText("Preço");

        textPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecoActionPerformed(evt);
            }
        });

        buttonAdicionarServico.setText("Adicionar");
        buttonAdicionarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarServicoActionPerformed(evt);
            }
        });

        buttonRemoverServico.setText("Remover");
        buttonRemoverServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabledServicoLayout = new javax.swing.GroupLayout(tabledServico);
        tabledServico.setLayout(tabledServicoLayout);
        tabledServicoLayout.setHorizontalGroup(
            tabledServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)
            .addGroup(tabledServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabledServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelNome)
                    .addComponent(textNome)
                    .addComponent(LabelPreço)
                    .addComponent(textPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addGap(88, 88, 88)
                .addComponent(buttonAdicionarServico)
                .addGap(26, 26, 26)
                .addComponent(buttonRemoverServico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabledServicoLayout.setVerticalGroup(
            tabledServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabledServicoLayout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelPreço)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabledServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdicionarServico)
                    .addComponent(buttonRemoverServico))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableCadastro.addTab("Serviço", tabledServico);

        tableColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane1.setViewportView(tableColaborador);

        nomeColab.setText("Nome");

        textColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColabActionPerformed(evt);
            }
        });

        buttonAdicionarColb.setText("Adicionar");
        buttonAdicionarColb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarColbActionPerformed(evt);
            }
        });

        buttonRemoverCollab.setText("Remover");

        javax.swing.GroupLayout tabledColaboradorLayout = new javax.swing.GroupLayout(tabledColaborador);
        tabledColaborador.setLayout(tabledColaboradorLayout);
        tabledColaboradorLayout.setHorizontalGroup(
            tabledColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)
            .addGroup(tabledColaboradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabledColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeColab, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textColab, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabledColaboradorLayout.createSequentialGroup()
                        .addComponent(buttonAdicionarColb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRemoverCollab)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabledColaboradorLayout.setVerticalGroup(
            tabledColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabledColaboradorLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(nomeColab, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(tabledColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionarColb)
                    .addComponent(buttonRemoverCollab))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tableCadastro.addTab("Colaborador", tabledColaborador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableCadastro)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableCadastro)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecoActionPerformed

    private void buttonAdicionarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarServicoActionPerformed


    }//GEN-LAST:event_buttonAdicionarServicoActionPerformed

    private void buttonRemoverServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverServicoActionPerformed


    }//GEN-LAST:event_buttonRemoverServicoActionPerformed

    private void cadastroServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroServicoMouseClicked

    }//GEN-LAST:event_cadastroServicoMouseClicked

    private void textColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textColabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textColabActionPerformed

    private void buttonAdicionarColbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarColbActionPerformed
        try {
            String nome = textColab.getText().trim();
            Colaborador colaborador = new Colaborador();
            colaborador.setNome(nome);

            ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
            colaboradorDAO.insertColaborador(colaborador);
            JOptionPane.showMessageDialog(this, "Colaborador adicionado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            textColab.setText("");
        } catch (Exception e) {
            e.printStackTrace();  // Exibe o erro caso algo dê errado
            JOptionPane.showMessageDialog(this, "Erro ao adicionar colaborador: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        ;

    }//GEN-LAST:event_buttonAdicionarColbActionPerformed
    private void atualizarTabelaCliente(Colaborador colaborador) {
        // Limpa a tabela antes de adicionar o colaborador
        DefaultTableModel model = (DefaultTableModel) tableColaborador.getModel();
        model.setRowCount(0);  

        // Adiciona o colaborador específico
        model.addRow(new Object[]{colaborador.getNome()});
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
            java.util.logging.Logger.getLogger(CadastroColabServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroColabServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroColabServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroColabServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroColabServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelPreço;
    private javax.swing.JButton buttonAdicionarColb;
    private javax.swing.JButton buttonAdicionarServico;
    private javax.swing.JButton buttonRemoverCollab;
    private javax.swing.JButton buttonRemoverServico;
    private javax.swing.JTable cadastroServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nomeColab;
    private javax.swing.JTabbedPane tableCadastro;
    private javax.swing.JTable tableColaborador;
    private javax.swing.JPanel tabledColaborador;
    private javax.swing.JPanel tabledServico;
    private javax.swing.JTextField textColab;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPreco;
    // End of variables declaration//GEN-END:variables
}