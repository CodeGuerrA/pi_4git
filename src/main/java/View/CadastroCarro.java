/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.HashtableClienteController;
import Controller.HashtableVeiculoController;
import Model.Cliente;
import Model.Propriedade;
import Model.Veiculos;
import Persistence.VeiculosDAO;
import Service.ClienteService;
import Util.Validar;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guerra
 */
public class CadastroCarro extends javax.swing.JFrame {
//Esta faltando alguns metodos porem esta quase pronto essa classe: Não esquecer de termina ele segunda e começar o Posse

    private Principal principal;
    private final ConsultaVeiculos listaVeiculos;

    public CadastroCarro(Principal principal) {
        initComponents();
        listaVeiculos = new ConsultaVeiculos();
        this.principal = principal;
        try {
            preencherComboBoxMarcas(); // Chama o método que preenche as ComboBoxes
            preencherComboBoxModelos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao inicializar combos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        identidade = new javax.swing.JLabel();
        textidentidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textPlaca = new javax.swing.JTextField();
        textChassi = new javax.swing.JTextField();
        textPatrimonio = new javax.swing.JTextField();
        textKilometragem = new javax.swing.JTextField();
        textAcessorios = new javax.swing.JTextField();
        adicionarButton = new javax.swing.JButton();
        buttonMenuCarro = new javax.swing.JButton();
        comboxModelo = new javax.swing.JComboBox<>();
        comboxMarca = new javax.swing.JComboBox<>();
        AdicionarAcess = new javax.swing.JButton();
        buttonTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        painelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        identidade.setForeground(new java.awt.Color(255, 255, 255));
        identidade.setText("CPF/CNPJ");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modelo");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Placa");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Chassi");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Patrimonio");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("KM");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Acessorios");

        textAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAcessoriosActionPerformed(evt);
            }
        });

        adicionarButton.setText("Adicionar");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        buttonMenuCarro.setText("Menu");
        buttonMenuCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuCarroActionPerformed(evt);
            }
        });

        comboxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));
        comboxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxModeloActionPerformed(evt);
            }
        });

        comboxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));
        comboxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxMarcaActionPerformed(evt);
            }
        });

        AdicionarAcess.setText("Adicionar");
        AdicionarAcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarAcessActionPerformed(evt);
            }
        });

        buttonTabela.setText("Tabela");
        buttonTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(identidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboxMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                        .addComponent(textChassi)
                                        .addComponent(textPatrimonio)
                                        .addComponent(textKilometragem)))
                                .addGap(18, 18, 18)
                                .addComponent(AdicionarAcess))
                            .addComponent(comboxModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textidentidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(adicionarButton)
                        .addGap(18, 18, 18)
                        .addComponent(buttonMenuCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonTabela)))
                .addContainerGap(545, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textidentidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identidade))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textKilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdicionarAcess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarButton)
                    .addComponent(buttonMenuCarro)
                    .addComponent(buttonTabela))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        try {
            // Criar as instâncias de Veiculos e Propriedade
            Veiculos veiculo = new Veiculos();

            // Obter os dados dos campos de texto e combo boxes
            veiculo.setModelo(comboxModelo.getSelectedItem().toString()); // Seleciona o modelo do JComboBox
            veiculo.setMarca(comboxMarca.getSelectedItem().toString()); // Seleciona a marca do JComboBox
            veiculo.setPlaca(textPlaca.getText()); // Obtém a placa do JTextField
            veiculo.setChassi(textChassi.getText()); // Obtém o chassi do JTextField
            veiculo.setPatrimonio(textPatrimonio.getText()); // Obtém o patrimônio do JTextField
            veiculo.setKilometragem(textKilometragem.getText()); // Obtém a quilometragem do JTextField
            veiculo.setAcessorios(textAcessorios.getText()); // Obtém os acessórios do JTextField

            // Criar instância de Propriedade
            Propriedade propriedade = new Propriedade();

            // Definir ID do cliente e data de entrada
            propriedade.setIdCliente(Integer.parseInt(textidentidade.getText())); // Obtém o ID do cliente do JTextField
            propriedade.setDataEntrada(new Date());
            // Chamar o DAO para inserir o veículo e a propriedade
            VeiculosDAO veiculosDAO = new VeiculosDAO();
            veiculosDAO.insertVeiculo(veiculo, propriedade);

            // Mostrar mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Veículo e propriedade cadastrados com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            // Mostrar mensagem de erro
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar veículo e propriedade.");
        }


    }//GEN-LAST:event_adicionarButtonActionPerformed
    private void preencherComboBoxMarcas() throws Exception {
        try {
            VeiculosDAO dao = new VeiculosDAO();
            List<String> marcas = dao.buscarMarcas();
            for (String marca : marcas) {
                comboxMarca.addItem(marca);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar marcas: " + e.getMessage());
        }
    }

    private void preencherComboBoxModelos() throws Exception {
        try {
            VeiculosDAO dao = new VeiculosDAO();
            List<String> modelos = dao.buscarModelos(); // Busca os modelos do banco
            for (String modelo : modelos) {
                comboxModelo.addItem(modelo); // Adiciona cada modelo à combobox
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar modelos: " + e.getMessage());
        }
    }
    private void buttonMenuCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuCarroActionPerformed
        this.setVisible(false); // Esconde a tela de cadastro de carro

        // Torna o Principal (menu) visível novamente
        principal.setVisible(true);
    }//GEN-LAST:event_buttonMenuCarroActionPerformed


    private void comboxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxModeloActionPerformed


    }//GEN-LAST:event_comboxModeloActionPerformed

    private void textAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAcessoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAcessoriosActionPerformed

    private void comboxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxMarcaActionPerformed

    private void AdicionarAcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarAcessActionPerformed

    }//GEN-LAST:event_AdicionarAcessActionPerformed

    private void buttonTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTabelaActionPerformed
       listaVeiculos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonTabelaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Principal principal = new Principal();
            principal.setVisible(true); // Exibe a tela Principal
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarAcess;
    private javax.swing.JButton adicionarButton;
    private javax.swing.JButton buttonMenuCarro;
    private javax.swing.JButton buttonTabela;
    private javax.swing.JComboBox<String> comboxMarca;
    private javax.swing.JComboBox<String> comboxModelo;
    private javax.swing.JLabel identidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField textAcessorios;
    private javax.swing.JTextField textChassi;
    private javax.swing.JTextField textKilometragem;
    private javax.swing.JTextField textPatrimonio;
    private javax.swing.JTextField textPlaca;
    private javax.swing.JTextField textidentidade;
    // End of variables declaration//GEN-END:variables
}
