/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Cliente;
import Persistence.ClientesDAO;
import Util.Validar;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

public class CadastroClientes extends javax.swing.JFrame {

    private final Principal principal; // Variável para manter referência do menu principal
    private final ConsultaClientes ListaClientes;

    public CadastroClientes(Principal principal) {
        initComponents();
        this.principal = principal;
        tipoPessoaCombox.setSelectedIndex(0);
        ListaClientes = new ConsultaClientes();

        // Definindo o layout, fundo, etc.
        FormularioPanel.setLayout(new CardLayout());
        FormularioPanel.add(pessoaFisica, "PessoaFisica");
        FormularioPanel.add(pessoaJuridica, "PessoaJuridica");
        // Define a cor de fundo
        Color backgroundColor = new Color(240, 248, 255);
        this.getContentPane().setBackground(backgroundColor);
        painelPrincipal.setBackground(backgroundColor);
        FormularioPanel.setBackground(backgroundColor);
        pessoaFisica.setBackground(backgroundColor);
        pessoaJuridica.setBackground(backgroundColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        tipoPessoaCombox = new javax.swing.JComboBox<>();
        FormularioPanel = new javax.swing.JPanel();
        pessoaFisica = new javax.swing.JPanel();
        NomePf = new javax.swing.JLabel();
        TextoNomepf = new javax.swing.JTextField();
        CPF_pf = new javax.swing.JLabel();
        TextoCpf_pf = new javax.swing.JTextField();
        adicionarFisica = new javax.swing.JButton();
        TelefonesFisico = new javax.swing.JLabel();
        TextTelefone = new javax.swing.JTextField();
        EnderecoFisica = new javax.swing.JLabel();
        TextoEnderecoFisica = new javax.swing.JTextField();
        emailFisico = new javax.swing.JLabel();
        TextoEmailFisica = new javax.swing.JTextField();
        buttton2Menu = new javax.swing.JButton();
        tabelaClientes2 = new javax.swing.JButton();
        pessoaJuridica = new javax.swing.JPanel();
        contatoJuridico = new javax.swing.JLabel();
        enderecoJuridico = new javax.swing.JLabel();
        textoEnderecoJuridico = new javax.swing.JTextField();
        emailJuridico = new javax.swing.JLabel();
        textoEmailJuridico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textoContatosJuridico = new javax.swing.JTextField();
        inscricaoJuridica = new javax.swing.JLabel();
        textoInscricaoJuridica = new javax.swing.JTextField();
        adicionarJuridica = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();
        textoNomeJuridica = new javax.swing.JTextField();
        nomeJuridico = new javax.swing.JLabel();
        textoTelefonesJuridico = new javax.swing.JTextField();
        textoCNPJ = new javax.swing.JTextField();
        cnpjJuridico = new javax.swing.JLabel();
        tabelaClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));

        painelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tipoPessoaCombox.setForeground(new java.awt.Color(255, 255, 255));
        tipoPessoaCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Jurídica" }));
        tipoPessoaCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPessoaComboxActionPerformed(evt);
            }
        });

        FormularioPanel.setLayout(new java.awt.CardLayout());

        pessoaFisica.setPreferredSize(new java.awt.Dimension(586, 400));

        NomePf.setText("Nome:");

        TextoNomepf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNomepfActionPerformed(evt);
            }
        });

        CPF_pf.setText("CPF:");

        TextoCpf_pf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCpf_pfActionPerformed(evt);
            }
        });

        adicionarFisica.setText("Adicionar");
        adicionarFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarFisicaActionPerformed(evt);
            }
        });

        TelefonesFisico.setText("Telefone:");

        TextTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelefoneActionPerformed(evt);
            }
        });

        EnderecoFisica.setText("Endereço:");

        TextoEnderecoFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoEnderecoFisicaActionPerformed(evt);
            }
        });

        emailFisico.setText("E-mail:");

        TextoEmailFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoEmailFisicaActionPerformed(evt);
            }
        });

        buttton2Menu.setText("Menu");
        buttton2Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttton2MenuActionPerformed(evt);
            }
        });

        tabelaClientes2.setText("Tabela");
        tabelaClientes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabelaClientes2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pessoaFisicaLayout = new javax.swing.GroupLayout(pessoaFisica);
        pessoaFisica.setLayout(pessoaFisicaLayout);
        pessoaFisicaLayout.setHorizontalGroup(
            pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pessoaFisicaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pessoaFisicaLayout.createSequentialGroup()
                        .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelefonesFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPF_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomePf, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pessoaFisicaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoNomepf, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pessoaFisicaLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoEmailFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoEnderecoFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoCpf_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pessoaFisicaLayout.createSequentialGroup()
                            .addComponent(emailFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(314, 314, 314))
                        .addComponent(EnderecoFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pessoaFisicaLayout.createSequentialGroup()
                        .addComponent(adicionarFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttton2Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tabelaClientes2)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        pessoaFisicaLayout.setVerticalGroup(
            pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pessoaFisicaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomePf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoNomepf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCpf_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonesFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoEnderecoFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnderecoFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoEmailFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarFisica)
                    .addComponent(buttton2Menu)
                    .addComponent(tabelaClientes2))
                .addGap(27, 27, 27))
        );

        FormularioPanel.add(pessoaFisica, "card2");

        pessoaJuridica.setBackground(new java.awt.Color(51, 51, 51));
        pessoaJuridica.setForeground(new java.awt.Color(102, 102, 102));

        contatoJuridico.setForeground(new java.awt.Color(255, 255, 255));
        contatoJuridico.setText("Telefones:");

        enderecoJuridico.setForeground(new java.awt.Color(255, 255, 255));
        enderecoJuridico.setText("Endereço:");

        emailJuridico.setForeground(new java.awt.Color(255, 255, 255));
        emailJuridico.setText("E-mail:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contatos:");

        inscricaoJuridica.setForeground(new java.awt.Color(255, 255, 255));
        inscricaoJuridica.setText("Inscrição Juridica");

        textoInscricaoJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoInscricaoJuridicaActionPerformed(evt);
            }
        });

        adicionarJuridica.setText("Adicionar");
        adicionarJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarJuridicaActionPerformed(evt);
            }
        });

        buttonMenu.setText("Menu");
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });

        nomeJuridico.setForeground(new java.awt.Color(255, 255, 255));
        nomeJuridico.setText("Nome:");

        textoTelefonesJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefonesJuridicoActionPerformed(evt);
            }
        });

        cnpjJuridico.setForeground(new java.awt.Color(255, 255, 255));
        cnpjJuridico.setText("CNPJ: ");

        tabelaClientes.setText("Tabela");
        tabelaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabelaClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pessoaJuridicaLayout = new javax.swing.GroupLayout(pessoaJuridica);
        pessoaJuridica.setLayout(pessoaJuridicaLayout);
        pessoaJuridicaLayout.setHorizontalGroup(
            pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pessoaJuridicaLayout.createSequentialGroup()
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(enderecoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoEnderecoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(nomeJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoNomeJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cnpjJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(contatoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoTelefonesJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(emailJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoEmailJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoContatosJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                        .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(inscricaoJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pessoaJuridicaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(adicionarJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                                .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tabelaClientes))
                            .addComponent(textoInscricaoJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        pessoaJuridicaLayout.setVerticalGroup(
            pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNomeJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpjJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contatoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoTelefonesJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoEnderecoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoEmailJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoContatosJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscricaoJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoInscricaoJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarJuridica)
                    .addComponent(buttonMenu)
                    .addComponent(tabelaClientes)))
        );

        FormularioPanel.add(pessoaJuridica, "card3");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoPessoaCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FormularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoPessoaCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tipoPessoaComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPessoaComboxActionPerformed
        CardLayout cardLayout = (CardLayout) FormularioPanel.getLayout();

        if (tipoPessoaCombox.getSelectedIndex() == 0) { // Pessoa Física
            cardLayout.show(FormularioPanel, "PessoaFisica");
        } else if (tipoPessoaCombox.getSelectedIndex() == 1) { // Pessoa Jurídica
            cardLayout.show(FormularioPanel, "PessoaJuridica");
        }
    }//GEN-LAST:event_tipoPessoaComboxActionPerformed
    private void limparCamposPessoaFisica() {
        TextoNomepf.setText("");
        TextoCpf_pf.setText("");
        TextTelefone.setText("");
        TextoEnderecoFisica.setText("");
        TextoEmailFisica.setText("");

    }

    private void limparCamposPessoaJuridica() {
        textoNomeJuridica.setText("");
        textoCNPJ.setText("");
        textoTelefonesJuridico.setText("");
        textoEnderecoJuridico.setText("");
        textoEmailJuridico.setText("");
        textoContatosJuridico.setText("");
        textoInscricaoJuridica.setText("");
    }
    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        if (principal != null) {

            this.setVisible(false);

            principal.setVisible(true);
        } else {

            System.out.println("Erro: a referência para o menu principal é null.");
        }
    }//GEN-LAST:event_buttonMenuActionPerformed

    private void adicionarJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarJuridicaActionPerformed
        try {
            // Coleta os dados do cliente
            String nome = textoNomeJuridica.getText().trim();
            String cnpj = textoCNPJ.getText().trim();
            String telefones = textoTelefonesJuridico.getText().trim();
            String endereco = textoEnderecoJuridico.getText().trim();
            String email = textoEmailJuridico.getText().trim();
            String contatos = textoContatosJuridico.getText().trim();
            String inscricaoEstadual = textoInscricaoJuridica.getText().trim();
            if (!Validar.validarEntradaPJ(nome, cnpj, telefones, endereco, email, contatos, inscricaoEstadual)) {
                return;
            }
            // Cria o cliente
            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setCNPJ(cnpj);
            cliente.setTelefones(telefones);
            cliente.setEndereco(endereco);
            cliente.setEmail(email);
            cliente.setContatos(contatos);
            cliente.setIns_Estadual(inscricaoEstadual);

            // Inserir o cliente no banco de dados
            ClientesDAO clientesDAO = new ClientesDAO();
            clientesDAO.insertPJ(cliente); // Chama o método para adicionar PJ

            // Exibe uma mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Cliente adicionado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            // Limpa os campos após adicionar
            textoNomeJuridica.setText("");
            textoCNPJ.setText("");
            textoTelefonesJuridico.setText("");
            textoEnderecoJuridico.setText("");
            textoEmailJuridico.setText("");
            textoContatosJuridico.setText("");
            textoInscricaoJuridica.setText("");

        } catch (Exception e) {
            e.printStackTrace(); // Exibe o erro caso algo dê errado
            JOptionPane.showMessageDialog(this, "Erro ao adicionar cliente: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_adicionarJuridicaActionPerformed

    private void textoTelefonesJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefonesJuridicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefonesJuridicoActionPerformed

    private void textoInscricaoJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoInscricaoJuridicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoInscricaoJuridicaActionPerformed

    private void buttton2MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttton2MenuActionPerformed
// Torna a janela atual invisível
        this.setVisible(false);

        // Torna o Principal (menu) visível novamente
        principal.setVisible(true);
    }//GEN-LAST:event_buttton2MenuActionPerformed

    private void TextoEmailFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoEmailFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoEmailFisicaActionPerformed

    private void TextoEnderecoFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoEnderecoFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoEnderecoFisicaActionPerformed

    private void TextTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTelefoneActionPerformed

    private void adicionarFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarFisicaActionPerformed
        try {
            // Coleta os dados do cliente
            String nome = TextoNomepf.getText().trim();
            String cpf = TextoCpf_pf.getText().trim();
            String telefone = TextTelefone.getText().trim();
            String endereco = TextoEnderecoFisica.getText().trim();
            String email = TextoEmailFisica.getText().trim();
            if (!Validar.validarEntradaPF(nome, cpf, telefone, endereco, email)) {
                return;
            }
            // Cria o cliente
            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setCPF(cpf);
            cliente.setTelefones(telefone);
            cliente.setEndereco(endereco);
            cliente.setEmail(email);

            // Insere o cliente no banco de dados
            ClientesDAO clientesDAO = new ClientesDAO();
            clientesDAO.insertPF(cliente);
            JOptionPane.showMessageDialog(this, "Cliente adicionado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);// Método para adicionar cliente pessoa física
            TextoNomepf.setText("");
            TextoCpf_pf.setText("");
            TextTelefone.setText("");
            TextoEnderecoFisica.setText("");
            TextoEmailFisica.setText("");

        } catch (Exception e) {
            e.printStackTrace();  // Exibe o erro caso algo dê errado
            JOptionPane.showMessageDialog(this, "Erro ao adicionar cliente: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adicionarFisicaActionPerformed

    private void TextoCpf_pfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCpf_pfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCpf_pfActionPerformed

    private void TextoNomepfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNomepfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNomepfActionPerformed

    private void tabelaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelaClientesActionPerformed
        ListaClientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tabelaClientesActionPerformed

    private void tabelaClientes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelaClientes2ActionPerformed
        ListaClientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tabelaClientes2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Principal principal = new Principal();
            principal.setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF_pf;
    private javax.swing.JLabel EnderecoFisica;
    private javax.swing.JPanel FormularioPanel;
    private javax.swing.JLabel NomePf;
    private javax.swing.JLabel TelefonesFisico;
    private javax.swing.JTextField TextTelefone;
    private javax.swing.JTextField TextoCpf_pf;
    private javax.swing.JTextField TextoEmailFisica;
    private javax.swing.JTextField TextoEnderecoFisica;
    private javax.swing.JTextField TextoNomepf;
    private javax.swing.JButton adicionarFisica;
    private javax.swing.JButton adicionarJuridica;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttton2Menu;
    private javax.swing.JLabel cnpjJuridico;
    private javax.swing.JLabel contatoJuridico;
    private javax.swing.JLabel emailFisico;
    private javax.swing.JLabel emailJuridico;
    private javax.swing.JLabel enderecoJuridico;
    private javax.swing.JLabel inscricaoJuridica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nomeJuridico;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel pessoaFisica;
    private javax.swing.JPanel pessoaJuridica;
    private javax.swing.JButton tabelaClientes;
    private javax.swing.JButton tabelaClientes2;
    private javax.swing.JTextField textoCNPJ;
    private javax.swing.JTextField textoContatosJuridico;
    private javax.swing.JTextField textoEmailJuridico;
    private javax.swing.JTextField textoEnderecoJuridico;
    private javax.swing.JTextField textoInscricaoJuridica;
    private javax.swing.JTextField textoNomeJuridica;
    private javax.swing.JTextField textoTelefonesJuridico;
    private javax.swing.JComboBox<String> tipoPessoaCombox;
    // End of variables declaration//GEN-END:variables
}
