/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Connection.ConexaoBD;
import Controller.HashtableProdutoController;
import Model.Produto;
import Persistence.ProdutoDAO;
import static Persistence.ProdutoDAO.selectProdutos;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guerra
 */
public class CadastraProdutos extends javax.swing.JFrame {
    
    private final HashtableProdutoController repositoProdutoController;
    
    public CadastraProdutos() {
        repositoProdutoController = new HashtableProdutoController();
        initComponents();
        carregarProdutoNaTabela();
    }
    
    private void carregarProdutoNaTabela() {
        try (Connection conexao = ConexaoBD.getConexao()) {
            if (conexao != null && !conexao.isClosed()) {
                System.out.println("Conexão bem-sucedida com o banco de dados!");
                repositoProdutoController.clear();
                selectProdutos(conexao, repositoProdutoController);
                DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
                model.setRowCount(0);
                Enumeration<Produto> produtoEnum = repositoProdutoController.ListarTodosProdutos().elements();
                while (produtoEnum.hasMoreElements()) {
                    Produto colaborador = produtoEnum.nextElement();
                    model.addRow(new Object[]{
                        colaborador.getId(),
                        colaborador.getNome()
                    });
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ou consultar o banco de dados: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro geral: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textPreco = new javax.swing.JTextField();
        buttonAdicionar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textDescricao = new javax.swing.JTextField();
        textQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        atualizarbutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        recarregarTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Quantidade", "Preço_Unidade"
            }
        ));
        jScrollPane1.setViewportView(tabelaProdutos);

        jLabel1.setText("Nome");

        jLabel2.setText("Preço");

        buttonAdicionar.setText("Adicionar");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        buttonRemover.setText("Remover");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição");

        jLabel4.setText("Quantidade");

        atualizarbutton.setText("Atualizar");
        atualizarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarbuttonActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        recarregarTabela.setText("Refresh");
        recarregarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recarregarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(buttonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atualizarbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recarregarTabela))
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(602, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionar)
                    .addComponent(buttonRemover)
                    .addComponent(atualizarbutton)
                    .addComponent(recarregarTabela))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        try {
            // Obtém os dados dos campos de texto
            String nome = textNome.getText().trim();
            String descricao = textDescricao.getText().trim();
            String quantidade = textQuantidade.getText().trim();
            String unitario = textPreco.getText().trim();

            // Validações básicas (verificar se os campos estão preenchidos)
            if (nome.isEmpty() || descricao.isEmpty() || quantidade.isEmpty() || unitario.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return; // Encerra o método se houver campos vazios
            }

            // Converte os valores de quantidade e preço para números
            Double iquantidade = Double.parseDouble(quantidade);
            Double iunitario = Double.parseDouble(unitario);

            // Cria o objeto Produto e define suas propriedades
            Produto produto = new Produto();
            produto.setNome(nome);
            produto.setDescricao(descricao);
            produto.setQuantidade(iquantidade); // Define a quantidade
            produto.setPrecoUnitario(iunitario); // Define o preço unitário (propriedade hipotética)

            // Insere o produto no banco de dados
            ProdutoDAO produtodao = new ProdutoDAO();
            produtodao.insertProduto(produto);
            
            carregarProdutoNaTabela();
            
            JOptionPane.showMessageDialog(this, "Produto adicionado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
            textNome.setText("");
            textDescricao.setText("");
            textQuantidade.setText("");
            textPreco.setText("");
        } catch (NumberFormatException e) {
            // Trata erros de conversão de número
            JOptionPane.showMessageDialog(this, "Quantidade e preço devem ser números válidos.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Trata outros tipos de erro
            e.printStackTrace(); // Exibe o erro no console para depuração
            JOptionPane.showMessageDialog(this, "Erro ao adicionar produto: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        try {
            String input = textID.getText().trim();
            int id = Integer.parseInt(input);
            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.removerProduto(id);
            JOptionPane.showMessageDialog(this, "Produto removido com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            carregarProdutoNaTabela();
            textID.setText("");
            
        } catch (Exception e) {
            e.printStackTrace();  // Exibe o erro caso algo dê errado
            JOptionPane.showMessageDialog(this, "Erro ao adicionar Serviço : " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void atualizarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarbuttonActionPerformed
        try {
            String id = textID.getText().trim();
            String nomealterar = textNome.getText().trim();
            String descricaoAlterar = textDescricao.getText().trim();
            String quantidadeAlterar = textQuantidade.getText().trim();
            String precoUnitarioAlterar = textPreco.getText().trim();
            if (nomealterar.isEmpty() || descricaoAlterar.isEmpty() || quantidadeAlterar.isEmpty() || precoUnitarioAlterar.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return; // Encerra o método se houver campos vazios
            }
            Double i = Double.parseDouble(quantidadeAlterar);
            Double j = Double.parseDouble(precoUnitarioAlterar);
            
            Produto produto = new Produto();
            produto.setId(id);  // Setar o ID para localizar o registro
            produto.setNome(nomealterar);
            produto.setDescricao(descricaoAlterar);
            produto.setQuantidade(i);
            produto.setPrecoUnitario(j);
            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.updateProduto(produto);
            JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            carregarProdutoNaTabela();
            
            textID.setText("");
            textNome.setText("");
            textDescricao.setText("");
            textQuantidade.setText("");
            textPreco.setText("");
        } catch (Exception e) {
            e.printStackTrace(); // Exibe o erro no console para depuração
            JOptionPane.showMessageDialog(this, "Erro ao atualizar produto: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_atualizarbuttonActionPerformed

    private void recarregarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recarregarTabelaActionPerformed
        carregarProdutoNaTabela();
    }//GEN-LAST:event_recarregarTabelaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastraProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarbutton;
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JButton recarregarTabela;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPreco;
    private javax.swing.JTextField textQuantidade;
    // End of variables declaration//GEN-END:variables
}
