/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ClienteController;
import Implementations.HashtableClienteRepository;
import Model.Cliente;
import Persistence.ClientesDAO;
import Service.ClienteService;
import Util.Validator;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroClientes extends javax.swing.JFrame {

    private DefaultTableModel model; // Declara o modelo da tabela fora do construtor

    private final ClienteController clienteController;
    private final Principal principal; // Variável para manter referência do menu principal

    public CadastroClientes(Principal principal) {
        initComponents();
        this.principal = principal;
        tipoPessoaCombox.setSelectedIndex(0);
        clienteController = new ClienteController(new ClienteService(new HashtableClienteRepository())); // Inicializa o controlador

        // Inicializa o modelo da tabela
        model = (DefaultTableModel) cadastroClientes.getModel(); // Instancia o modelo da tabela

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

        // Carregar a tabela de clientes ao iniciar
        clienteController.carregarTabela(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        tipoPessoaCombox = new javax.swing.JComboBox<>();
        FormularioPanel = new javax.swing.JPanel();
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
        alterar_ClientesPJ = new javax.swing.JButton();
        buttonLimpar1 = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();
        buttonRemoverPessoaJuridica = new javax.swing.JButton();
        textoNomeJuridica = new javax.swing.JTextField();
        nomeJuridico = new javax.swing.JLabel();
        textoTelefonesJuridico = new javax.swing.JTextField();
        textoCNPJ = new javax.swing.JTextField();
        cnpjJuridico = new javax.swing.JLabel();
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
        alterar_cliente2 = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        buttton2Menu = new javax.swing.JButton();
        buttonRemoverPessoaFisica = new javax.swing.JButton();
        tabelasCadastrados = new javax.swing.JScrollPane();
        cadastroClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));

        painelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tipoPessoaCombox.setForeground(new java.awt.Color(0, 0, 0));
        tipoPessoaCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Jurídica" }));
        tipoPessoaCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPessoaComboxActionPerformed(evt);
            }
        });

        FormularioPanel.setLayout(new java.awt.CardLayout());

        pessoaJuridica.setForeground(new java.awt.Color(102, 102, 102));

        contatoJuridico.setText("Telefones:");

        enderecoJuridico.setText("Endereço:");

        emailJuridico.setText("E-mail:");

        jLabel1.setText("Contatos:");

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

        alterar_ClientesPJ.setText("Alterar");
        alterar_ClientesPJ.setPreferredSize(new java.awt.Dimension(81, 23));
        alterar_ClientesPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterar_ClientesPJActionPerformed(evt);
            }
        });

        buttonLimpar1.setText("Limpar");
        buttonLimpar1.setPreferredSize(new java.awt.Dimension(81, 23));
        buttonLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpar1ActionPerformed(evt);
            }
        });

        buttonMenu.setText("Menu");
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });

        buttonRemoverPessoaJuridica.setText("Remover");
        buttonRemoverPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverPessoaJuridicaActionPerformed(evt);
            }
        });

        nomeJuridico.setText("Nome:");

        textoTelefonesJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefonesJuridicoActionPerformed(evt);
            }
        });

        cnpjJuridico.setText("CNPJ: ");

        javax.swing.GroupLayout pessoaJuridicaLayout = new javax.swing.GroupLayout(pessoaJuridica);
        pessoaJuridica.setLayout(pessoaJuridicaLayout);
        pessoaJuridicaLayout.setHorizontalGroup(
            pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(40, 40, 40)
                        .addComponent(enderecoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoEnderecoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                                .addComponent(adicionarJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alterar_ClientesPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonRemoverPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pessoaJuridicaLayout.createSequentialGroup()
                                .addComponent(inscricaoJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textoInscricaoJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(456, Short.MAX_VALUE))
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
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inscricaoJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoInscricaoJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(pessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterar_ClientesPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarJuridica)
                    .addComponent(buttonLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRemoverPessoaJuridica)
                    .addComponent(buttonMenu)))
        );

        FormularioPanel.add(pessoaJuridica, "card3");

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

        alterar_cliente2.setText("Alterar");
        alterar_cliente2.setPreferredSize(new java.awt.Dimension(81, 23));
        alterar_cliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterar_cliente2ActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.setPreferredSize(new java.awt.Dimension(81, 23));
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        buttton2Menu.setText("Menu");
        buttton2Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttton2MenuActionPerformed(evt);
            }
        });

        buttonRemoverPessoaFisica.setText("Remover");
        buttonRemoverPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverPessoaFisicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pessoaFisicaLayout = new javax.swing.GroupLayout(pessoaFisica);
        pessoaFisica.setLayout(pessoaFisicaLayout);
        pessoaFisicaLayout.setHorizontalGroup(
            pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pessoaFisicaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pessoaFisicaLayout.createSequentialGroup()
                        .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelefonesFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPF_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomePf, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pessoaFisicaLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(TextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pessoaFisicaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoCpf_pf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoNomepf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pessoaFisicaLayout.createSequentialGroup()
                        .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pessoaFisicaLayout.createSequentialGroup()
                                .addComponent(adicionarFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alterar_cliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonRemoverPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttton2Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pessoaFisicaLayout.createSequentialGroup()
                                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pessoaFisicaLayout.createSequentialGroup()
                                        .addComponent(emailFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))
                                    .addGroup(pessoaFisicaLayout.createSequentialGroup()
                                        .addComponent(EnderecoFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)))
                                .addGroup(pessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoEnderecoFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoEmailFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(463, Short.MAX_VALUE))))
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
                    .addComponent(alterar_cliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRemoverPessoaFisica)
                    .addComponent(buttton2Menu))
                .addGap(27, 27, 27))
        );

        FormularioPanel.add(pessoaFisica, "card2");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FormularioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(tipoPessoaCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

        cadastroClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF/CNPJ", "Telefones", "Endereço", "E-mail", "Contatos", "Inscrição Juridica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cadastroClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroClientesMouseClicked(evt);
            }
        });
        tabelasCadastrados.setViewportView(cadastroClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelasCadastrados)
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabelasCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
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

    private void cadastroClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroClientesMouseClicked
        int selectedRow = cadastroClientes.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) cadastroClientes.getModel();

        if (selectedRow >= 0) {
            // Limpar os campos antes de preencher
            limparCamposPessoaFisica();
            limparCamposPessoaJuridica();

            // Preencher os campos de acordo com o tipo de pessoa selecionado
            if (tipoPessoaCombox.getSelectedIndex() == 0) { // Pessoa Física
                TextoNomepf.setText(model.getValueAt(selectedRow, 0).toString());
                TextoCpf_pf.setText(model.getValueAt(selectedRow, 1).toString());
                TextTelefone.setText(model.getValueAt(selectedRow, 2).toString());
                TextoEnderecoFisica.setText(model.getValueAt(selectedRow, 3).toString());
                TextoEmailFisica.setText(model.getValueAt(selectedRow, 4).toString());

            } else if (tipoPessoaCombox.getSelectedIndex() == 1) { // Pessoa Jurídica
                textoNomeJuridica.setText(model.getValueAt(selectedRow, 0).toString());
                textoCNPJ.setText(model.getValueAt(selectedRow, 1).toString());
                textoTelefonesJuridico.setText(model.getValueAt(selectedRow, 2).toString());
                textoEnderecoJuridico.setText(model.getValueAt(selectedRow, 3).toString());
                textoEmailJuridico.setText(model.getValueAt(selectedRow, 4).toString());
                textoContatosJuridico.setText(model.getValueAt(selectedRow, 5).toString());
                textoInscricaoJuridica.setText(model.getValueAt(selectedRow, 6).toString());
            }
        }

    }//GEN-LAST:event_cadastroClientesMouseClicked
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
    private void buttonRemoverPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverPessoaJuridicaActionPerformed
        try {
            ClientesDAO clienteDao = new ClientesDAO();
            int i = cadastroClientes.getSelectedRow(); // Obtém a linha selecionada na tabela
            DefaultTableModel model = (DefaultTableModel) cadastroClientes.getModel();

            if (i >= 0) {
                String chave = (String) model.getValueAt(i, 1); // Coluna 1 contém o CPF (ou chave)

                boolean removido = clienteController.removerCliente(chave);

                if (removido) {
                    clienteDao.removerPJ(chave);
                    model.removeRow(i);
                    JOptionPane.showMessageDialog(rootPane, "Cliente removido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao remover o cliente da estrutura de dados.");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um cliente antes de remover.");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }


    }//GEN-LAST:event_buttonRemoverPessoaJuridicaActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        if (principal != null) {

            this.setVisible(false);

            principal.setVisible(true);
        } else {

            System.out.println("Erro: a referência para o menu principal é null.");
        }
    }//GEN-LAST:event_buttonMenuActionPerformed

    private void buttonLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpar1ActionPerformed
        textoNomeJuridica.setText("");
        textoCNPJ.setText("");
        textoTelefonesJuridico.setText("");
        textoEnderecoJuridico.setText("");
        textoEmailJuridico.setText("");
        textoContatosJuridico.setText("");
        textoInscricaoJuridica.setText("");
    }//GEN-LAST:event_buttonLimpar1ActionPerformed

//lembrar de fazer o update botton de pf
    private void alterar_ClientesPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterar_ClientesPJActionPerformed
        try {
            int i = cadastroClientes.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) cadastroClientes.getModel();
            ClientesDAO clienteDao = new ClientesDAO();

            if (i >= 0) {
                // Obtém os novos valores dos campos
                String novoNome = textoNomeJuridica.getText();
                String novoCNPJ = textoCNPJ.getText();
                String novoTelefone = textoTelefonesJuridico.getText();
                String novoEndereco = textoEnderecoJuridico.getText();
                String novoEmail = textoEmailJuridico.getText();
                String novosContatos = textoContatosJuridico.getText();
                String novaInscricao = textoInscricaoJuridica.getText();

                // Atualiza os dados na tabela
                model.setValueAt(novoNome, i, 0);
                model.setValueAt(novoCNPJ, i, 1);
                model.setValueAt(novoTelefone, i, 2);
                model.setValueAt(novoEndereco, i, 3);
                model.setValueAt(novoEmail, i, 4);
                model.setValueAt(novosContatos, i, 5);
                model.setValueAt(novaInscricao, i, 6);

                // Obtém a chave (CNPJ) do cliente para fazer a busca no Controller
                String chave = (String) model.getValueAt(i, 1);
                Cliente cliente = clienteController.buscarClientePorChave(chave);

                if (cliente != null) {
                    // Atualiza os dados do cliente
                    cliente.setNome(novoNome);
                    cliente.setCNPJ(novoCNPJ);
                    cliente.setTelefones(novoTelefone);
                    cliente.setEndereco(novoEndereco);
                    cliente.setEmail(novoEmail);
                    cliente.setContatos(novosContatos);
                    cliente.setIns_Estadual(novaInscricao);

                    // Atualiza na estrutura de dados do ClienteController
                    clienteController.atualizarCliente(chave, cliente);
                    clienteDao.updatePJ(cliente, chave);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um cliente antes de atualizar.");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }

    }//GEN-LAST:event_alterar_ClientesPJActionPerformed

    private void adicionarJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarJuridicaActionPerformed
        try {
            ClientesDAO clienteDao = new ClientesDAO();
            // Coleta os dados do cliente
            String nome = textoNomeJuridica.getText().trim();
            String cnpj = textoCNPJ.getText().trim();
            String telefones = textoTelefonesJuridico.getText().trim();
            String endereco = textoEnderecoJuridico.getText().trim();
            String email = textoEmailJuridico.getText();
            String contatos = textoContatosJuridico.getText();
            String inscricaoEstadual = textoInscricaoJuridica.getText();

            // Cria o cliente
            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setCNPJ(cnpj);
            cliente.setTelefones(telefones);
            cliente.setEndereco(endereco);
            cliente.setEmail(email);
            cliente.setContatos(contatos);
            cliente.setIns_Estadual(inscricaoEstadual);

            clienteDao.insertPJ(cliente);
            // Obtém o modelo da tabela
            DefaultTableModel model = (DefaultTableModel) cadastroClientes.getModel();

            // Adiciona o cliente à lista e atualiza a tabela
            clienteController.adicionarCliente(cliente, model);

            System.out.println(cliente.getID());

            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_adicionarJuridicaActionPerformed

    private void textoTelefonesJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefonesJuridicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefonesJuridicoActionPerformed

    private void textoInscricaoJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoInscricaoJuridicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoInscricaoJuridicaActionPerformed

    private void buttonRemoverPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverPessoaFisicaActionPerformed
        try {

            ClientesDAO clienteDao = new ClientesDAO();

            int i = cadastroClientes.getSelectedRow(); // Obtém a linha selecionada na tabela

            DefaultTableModel model = (DefaultTableModel) cadastroClientes.getModel();

            if (i >= 0) {
                String chave = (String) model.getValueAt(i, 1); // Coluna 1 contém o CPF (ou chave)

                boolean removido = clienteController.removerCliente(chave);

                if (removido) {
                    clienteDao.removerPF(chave);
                    model.removeRow(i);
                    JOptionPane.showMessageDialog(rootPane, "Cliente removido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao remover o cliente da estrutura de dados.");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um cliente antes de remover.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }


    }//GEN-LAST:event_buttonRemoverPessoaFisicaActionPerformed

    private void buttton2MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttton2MenuActionPerformed
// Torna a janela atual invisível
        this.setVisible(false);

        // Torna o Principal (menu) visível novamente
        principal.setVisible(true);
    }//GEN-LAST:event_buttton2MenuActionPerformed

    private void alterar_cliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterar_cliente2ActionPerformed
        try {
            ClientesDAO clienteDao = new ClientesDAO();
            String novoNome = TextoNomepf.getText();
            String novoCPF = TextoCpf_pf.getText();
            String novoTelefone = TextTelefone.getText();
            String novoEndereco = TextoEnderecoFisica.getText();
            String novoEmail = TextoEmailFisica.getText();

            // Verifica se os campos obrigatórios estão preenchidos
            if (novoNome.isEmpty() || novoCPF.isEmpty() || novoTelefone.isEmpty() || novoEndereco.isEmpty() || novoEmail.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Todos os campos obrigatórios devem ser preenchidos.");
                return; // Interrompe a execução do método
            }

            // Encontra o cliente baseado no CPF
            Cliente cliente = clienteController.buscarClientePorChave(novoCPF);
            if (cliente != null) {
                // Atualiza os dados do cliente
                cliente.setNome(novoNome);
                cliente.setCPF(novoCPF);
                cliente.setTelefones(novoTelefone);
                cliente.setEndereco(novoEndereco);
                cliente.setEmail(novoEmail);

                // Atualiza o cliente no controlador
                clienteController.atualizarCliente(novoCPF, cliente);

                // Atualiza a tabela com os novos dados
                DefaultTableModel model = (DefaultTableModel) cadastroClientes.getModel();
                int i = cadastroClientes.getSelectedRow();
                if (i >= 0) {
                    // Atualiza os valores na tabela na linha correspondente
                    model.setValueAt(novoNome, i, 0); // Atualiza nome
                    model.setValueAt(novoCPF, i, 1); // Atualiza CPF
                    model.setValueAt(novoTelefone, i, 2); // Atualiza telefone
                    model.setValueAt(novoEndereco, i, 3); // Atualiza endereço
                    model.setValueAt(novoEmail, i, 4); // Atualiza email
                    clienteDao.updatePF(cliente, novoCPF);
                }

                // Mensagem de sucesso
                JOptionPane.showMessageDialog(rootPane, "Cliente atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao encontrar o cliente.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }//GEN-LAST:event_alterar_cliente2ActionPerformed

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
            // Cria a instância do DAO e do modelo da tabela
            ClientesDAO clienteDao = new ClientesDAO();
            DefaultTableModel model = (DefaultTableModel) cadastroClientes.getModel(); // A tabela onde os dados serão exibidos

            // Limpa a tabela antes de adicionar os novos dados (isso pode ser feito após a inserção ou antes, dependendo da sua necessidade)
            model.setRowCount(0);

            // Carrega os dados dos clientes na tabela
            clienteDao.selectClientes(model); // Chama o método para popular a tabela com os dados do banco

            // Coleta os dados inseridos pelo usuário
            String nome = TextoNomepf.getText();
            String cpf = TextoCpf_pf.getText();
            String telefones = TextTelefone.getText();
            String endereco = TextoEnderecoFisica.getText();
            String email = TextoEmailFisica.getText();

            // Se as validações passarem, cria o cliente e salva
            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setCPF(cpf);
            cliente.setTelefones(telefones);
            cliente.setEndereco(endereco);
            cliente.setEmail(email);

            // Insere o cliente no banco de dados
            clienteDao.insertPF(cliente); // Insere o cliente na base de dados

            // Após a inserção, atualiza a tabela com os novos dados (garante que a tabela exiba o cliente recém-adicionado)
            model.addRow(new Object[]{
                cliente.getNome(),
                cliente.getCPF(),
                cliente.getTelefones(),
                cliente.getEndereco(),
                cliente.getEmail(), cliente.getCNPJ(), // Caso seja CNPJ de pessoa jurídica, ou deixe em branco caso não haja
                cliente.getContatos(), // Se houver outros contatos
                cliente.getIns_Estadual() // Caso tenha inscrição estadual
            });

            // Exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_adicionarFisicaActionPerformed

    private void TextoCpf_pfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCpf_pfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCpf_pfActionPerformed

    private void TextoNomepfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNomepfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNomepfActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        TextoNomepf.setText("");
        TextoCpf_pf.setText("");
        TextTelefone.setText("");
        TextoEnderecoFisica.setText("");
        TextoEmailFisica.setText("");
    }//GEN-LAST:event_buttonLimparActionPerformed
    public void carregarTabela() {
        DefaultTableModel model = (DefaultTableModel) cadastroClientes.getModel();
        clienteController.carregarTabela(model);
    }

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
    private javax.swing.JButton alterar_ClientesPJ;
    private javax.swing.JButton alterar_cliente2;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonLimpar1;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonRemoverPessoaFisica;
    private javax.swing.JButton buttonRemoverPessoaJuridica;
    private javax.swing.JButton buttton2Menu;
    private javax.swing.JTable cadastroClientes;
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
    private javax.swing.JScrollPane tabelasCadastrados;
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
