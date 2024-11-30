/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.HashtableClienteController;
import Controller.HashtableVeiculoController;
import Model.Cliente;
import Model.Veiculos;
import Service.ClienteService;
import Util.Validar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guerra
 */
public class CadastroCarro extends javax.swing.JFrame {
//Esta faltando alguns metodos porem esta quase pronto essa classe: Não esquecer de termina ele segunda e começar o Posse

    private Principal principal;

    public CadastroCarro(Principal principal) {
        initComponents();
        this.principal = principal;
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textModelo = new javax.swing.JTextField();
        textMarca = new javax.swing.JTextField();
        textPlaca = new javax.swing.JTextField();
        textChassi = new javax.swing.JTextField();
        textPatrimonio = new javax.swing.JTextField();
        textKilometragem = new javax.swing.JTextField();
        textAcessorios = new javax.swing.JTextField();
        adicionarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        buttonMenuCarro = new javax.swing.JButton();
        escolhaData = new com.toedter.calendar.JDateChooser();
        comboxModelo = new javax.swing.JComboBox<>();
        comboxMarca = new javax.swing.JComboBox<>();
        adicionarModelo = new javax.swing.JButton();
        adicionarMarca = new javax.swing.JButton();
        removerModelo = new javax.swing.JButton();
        removerMarca = new javax.swing.JButton();
        comboxAcessorios = new javax.swing.JComboBox<>();
        AdicionarAcess = new javax.swing.JButton();
        removerAcess = new javax.swing.JButton();
        cadastroCarro = new javax.swing.JScrollPane();
        cadastroVeiculos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        identidade.setText("CPF/CNPJ");

        jLabel1.setText("Modelo");

        jLabel2.setText("Marca");

        jLabel3.setText("Placa");

        jLabel4.setText("Chassi");

        jLabel5.setText("Patrimonio");

        jLabel6.setText("KM");

        jLabel7.setText("Data Entrada");

        jLabel8.setText("Acessorios");

        textMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMarcaActionPerformed(evt);
            }
        });

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

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarButtonActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        buttonMenuCarro.setText("Menu");
        buttonMenuCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuCarroActionPerformed(evt);
            }
        });

        escolhaData.setDateFormatString("dd/MM/yyyy");

        comboxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Corolla", "Mustang", "Civic", "Camaro", "Série 3", "A4", "Golf", "Altima", "C-Class", "Wrangler" }));
        comboxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxModeloActionPerformed(evt);
            }
        });

        comboxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Toyota", "Ford", "Honda", "Chevrolet", "BMW", "Audi", "Volkswagen", "Nissan", "Mercedes-Benz", "Jeep" }));
        comboxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxMarcaActionPerformed(evt);
            }
        });

        adicionarModelo.setText("Adicionar");
        adicionarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarModeloActionPerformed(evt);
            }
        });

        adicionarMarca.setText("Adicionar");
        adicionarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMarcaActionPerformed(evt);
            }
        });

        removerModelo.setText("Remover");
        removerModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerModeloActionPerformed(evt);
            }
        });

        removerMarca.setText("Remover");
        removerMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerMarcaActionPerformed(evt);
            }
        });

        comboxAcessorios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Sistema de navegação (GPS)", "Câmera de ré", "Sensor de estacionamento", "Carregador de celular wireless", "Tapetes personalizados", "Faróis de neblina", "Suporte para celular", "Encosto de cabeça com tela LCD", "Caixa de som ou sis" }));

        AdicionarAcess.setText("Adicionar");
        AdicionarAcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarAcessActionPerformed(evt);
            }
        });

        removerAcess.setText("Remover");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(adicionarButton)
                        .addGap(18, 18, 18)
                        .addComponent(removerButton)
                        .addGap(18, 18, 18)
                        .addComponent(alterarButton)
                        .addGap(18, 18, 18)
                        .addComponent(buttonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonMenuCarro))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(identidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(comboxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboxAcessorios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textidentidade)
                                    .addComponent(textPlaca)
                                    .addComponent(textChassi)
                                    .addComponent(textPatrimonio)
                                    .addComponent(textKilometragem)
                                    .addComponent(escolhaData, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(comboxModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAcessorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adicionarModelo)
                            .addComponent(adicionarMarca)
                            .addComponent(AdicionarAcess))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removerModelo)
                            .addComponent(removerMarca)
                            .addComponent(removerAcess))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identidade)
                    .addComponent(textidentidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarModelo)
                    .addComponent(removerModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarMarca)
                    .addComponent(removerMarca))
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
                .addGap(14, 14, 14)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(escolhaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdicionarAcess)
                    .addComponent(removerAcess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarButton)
                    .addComponent(removerButton)
                    .addComponent(alterarButton)
                    .addComponent(buttonLimpar)
                    .addComponent(buttonMenuCarro))
                .addGap(31, 31, 31))
        );

        cadastroVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "Placa", "Chassi", "Patrimonio", "KM", "Data Entrada", "Acessorios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cadastroVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroVeiculosMouseClicked(evt);
            }
        });
        cadastroCarro.setViewportView(cadastroVeiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastroCarro)
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        // Captura do valor do ComboBox
        String modelo = (String) comboxModelo.getSelectedItem();
        String marca = (String) comboxMarca.getSelectedItem();
        String componentes = (String) comboxAcessorios.getSelectedItem();

        if (modelo == null || modelo.equals("Selecione...")) {
            modelo = textModelo.getText().trim();
            if (modelo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um modelo válido!");
                return;
            }
        }

        if (componentes == null || componentes.equals("Selecione...")) {
            componentes = textAcessorios.getText().trim();
            if (componentes.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um acessorio válido!");
                return;
            }
        }

        if (marca == null || marca.equals("Selecione...")) {
            marca = textMarca.getText().trim();
            if (marca.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, insira uma marca válida!");
                return;
            }

            String chave = textidentidade.getText().trim();
            String placa = textPlaca.getText().trim();//3
            String chassi = textChassi.getText().trim();//4
            String patrimonio = textPatrimonio.getText().trim();//5
            String kilometragemText = textKilometragem.getText().trim();//6
            Date dataEntrada = escolhaData.getDate();//7

            Veiculos veiculo = new Veiculos();
            veiculo.setModelo(modelo);
            veiculo.setMarca(marca);
            veiculo.setPlaca(placa);
            veiculo.setChassi(chassi);
            veiculo.setPatrimonio(patrimonio);
            veiculo.setKilometragem(kilometragemText);
            veiculo.setDataEntrada(dataEntrada);
            veiculo.setAcessorios(componentes);
            DefaultTableModel model = (DefaultTableModel) cadastroVeiculos.getModel();


            
        }
    }//GEN-LAST:event_adicionarButtonActionPerformed

    private void buttonMenuCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuCarroActionPerformed
        this.setVisible(false); // Esconde a tela de cadastro de carro

        // Torna o Principal (menu) visível novamente
        principal.setVisible(true);
    }//GEN-LAST:event_buttonMenuCarroActionPerformed


    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed


    }//GEN-LAST:event_removerButtonActionPerformed

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed
    
    }//GEN-LAST:event_alterarButtonActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        textidentidade.setText("");
        textModelo.setText("");     // Limpa o campo "Modelo".
        textMarca.setText("");      // Limpa o campo "Marca".
        textPlaca.setText("");      // Limpa o campo "Placa".
        textChassi.setText("");
        escolhaData.setDate(null);// Limpa o campo "Chassi".
        textPatrimonio.setText(""); // Limpa o campo "Patrimônio".
        textKilometragem.setText(""); // Limpa o campo "Kilometragem".

        // Redefine o seletor de data para nulo (removendo a data selecionada).
        escolhaData.setDate(null);
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void textMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMarcaActionPerformed

    private void comboxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxModeloActionPerformed


    }//GEN-LAST:event_comboxModeloActionPerformed

    private void adicionarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarModeloActionPerformed
        String modeloAdicionado = textModelo.getText().trim();

        if (!modeloAdicionado.isEmpty()) {
            // Adiciona o novo modelo ao ComboBox de modelos
            comboxModelo.addItem(modeloAdicionado);
        }
        textModelo.setText("");

    }//GEN-LAST:event_adicionarModeloActionPerformed

    private void adicionarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMarcaActionPerformed
        String marcaAdicionada = textMarca.getText().trim();
        if (!marcaAdicionada.isEmpty()) {
            // Adiciona a nova marca ao ComboBox de marcas (caso tenha esse ComboBox)
            comboxMarca.addItem(marcaAdicionada);

        }
        textMarca.setText("");
    }//GEN-LAST:event_adicionarMarcaActionPerformed

    private void removerModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerModeloActionPerformed
      

    }//GEN-LAST:event_removerModeloActionPerformed

    private void removerMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerMarcaActionPerformed
      
    }//GEN-LAST:event_removerMarcaActionPerformed

    private void cadastroVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroVeiculosMouseClicked
 
    }//GEN-LAST:event_cadastroVeiculosMouseClicked

    private void textAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAcessoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAcessoriosActionPerformed

    private void comboxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxMarcaActionPerformed

    private void AdicionarAcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarAcessActionPerformed
     
    }//GEN-LAST:event_AdicionarAcessActionPerformed

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
    private javax.swing.JButton adicionarMarca;
    private javax.swing.JButton adicionarModelo;
    private javax.swing.JButton alterarButton;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonMenuCarro;
    private javax.swing.JScrollPane cadastroCarro;
    private javax.swing.JTable cadastroVeiculos;
    private javax.swing.JComboBox<String> comboxAcessorios;
    private javax.swing.JComboBox<String> comboxMarca;
    private javax.swing.JComboBox<String> comboxModelo;
    private com.toedter.calendar.JDateChooser escolhaData;
    private javax.swing.JLabel identidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JButton removerAcess;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton removerMarca;
    private javax.swing.JButton removerModelo;
    private javax.swing.JTextField textAcessorios;
    private javax.swing.JTextField textChassi;
    private javax.swing.JTextField textKilometragem;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    private javax.swing.JTextField textPatrimonio;
    private javax.swing.JTextField textPlaca;
    private javax.swing.JTextField textidentidade;
    // End of variables declaration//GEN-END:variables
}
