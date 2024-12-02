/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Connection.ConexaoBD;
import Persistence.ClientesDAO;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guerra
 */
public class OrdemServicoview extends javax.swing.JFrame {

    private final ClientesDAO clientesDAO;
    private final Principal principal; // Variável para manter referência do menu principal

    /**
     * Creates new form OrdemServiço
     *
     * @throws java.lang.Exception
     */
    public OrdemServicoview(Principal principal) throws Exception {
        initComponents();
        this.principal = principal;

        configurarScrollPane();
        clientesDAO = new ClientesDAO(); // Inicializa o objeto ClientesDAO

        ListasNomes.setVisible(false);
        ScrollLista.setVisible(false);

        listServicos.setVisible(false);
        ScrollServicos.setVisible(false);

        listaColaborador.setVisible(false);
        scrollColaborador.setVisible(false);

        listaPecas.setVisible(false);
        ScrollPecas.setVisible(false);

    }

    private void configurarScrollPane() {
        JScrollPane scrollPane = new JScrollPane(ordemServico);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panelScroll.setLayout(new BorderLayout());
        panelScroll.add(scrollPane, BorderLayout.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        panelScroll = new javax.swing.JPanel();
        ordemServico = new javax.swing.JPanel();
        panelCliente = new javax.swing.JPanel();
        ScrollLista = new javax.swing.JScrollPane();
        ListasNomes = new javax.swing.JList<>();
        textocpfcnpj = new javax.swing.JTextField();
        labelCliente = new javax.swing.JLabel();
        textcodOS = new javax.swing.JTextField();
        LabelCodigoOs = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        labelIdentificador = new javax.swing.JLabel();
        labalEndereco = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        textTelefones = new javax.swing.JTextField();
        labelContato = new javax.swing.JLabel();
        textContato = new javax.swing.JTextField();
        labelInsEst = new javax.swing.JLabel();
        textInsEst = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        statusCombox = new javax.swing.JComboBox<>();
        panelVeiculos = new javax.swing.JPanel();
        labelModelo = new javax.swing.JLabel();
        textModelo = new javax.swing.JTextField();
        labelPlaca = new javax.swing.JLabel();
        textPlaca = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        textMarca = new javax.swing.JTextField();
        labelChassi = new javax.swing.JLabel();
        textChassi = new javax.swing.JTextField();
        labelKM = new javax.swing.JLabel();
        textKM = new javax.swing.JTextField();
        labelAcess = new javax.swing.JLabel();
        textAccs = new javax.swing.JTextField();
        textPatrimonio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        panelNome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Servico = new javax.swing.JPanel();
        labelServico = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        adicionarServico = new javax.swing.JButton();
        removerServico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textServicos = new javax.swing.JTextField();
        ScrollServicos = new javax.swing.JScrollPane();
        listServicos = new javax.swing.JList<>();
        textColaborador = new javax.swing.JTextField();
        textValorServico = new javax.swing.JTextField();
        scrollColaborador = new javax.swing.JScrollPane();
        listaColaborador = new javax.swing.JList<>();
        Pecas = new javax.swing.JPanel();
        labelPecas = new javax.swing.JLabel();
        spinnerPecas = new javax.swing.JSpinner();
        adicionarPecas = new javax.swing.JButton();
        textPecas = new javax.swing.JTextField();
        ScrollPecas = new javax.swing.JScrollPane();
        listaPecas = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePecassub = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableServicoexecutar = new javax.swing.JTable();
        painelFinal = new javax.swing.JPanel();
        labelTotal = new javax.swing.JLabel();
        textValorTotal = new javax.swing.JTextField();
        gerarOspdf = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        panelCliente.setLayout(null);

        ScrollLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ListasNomes.setBorder(null);
        ListasNomes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListasNomesMouseClicked(evt);
            }
        });
        ScrollLista.setViewportView(ListasNomes);

        panelCliente.add(ScrollLista);
        ScrollLista.setBounds(250, 50, 210, 100);

        textocpfcnpj.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textocpfcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textocpfcnpjActionPerformed(evt);
            }
        });
        textocpfcnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textocpfcnpjKeyReleased(evt);
            }
        });
        panelCliente.add(textocpfcnpj);
        textocpfcnpj.setBounds(250, 30, 211, 20);

        labelCliente.setText("Cliente");
        panelCliente.add(labelCliente);
        labelCliente.setBounds(730, 10, 98, 16);
        panelCliente.add(textcodOS);
        textcodOS.setBounds(34, 29, 110, 31);

        LabelCodigoOs.setText("Código OS");
        panelCliente.add(LabelCodigoOs);
        LabelCodigoOs.setBounds(34, 9, 57, 16);

        textoNome.setEditable(false);
        panelCliente.add(textoNome);
        textoNome.setBounds(726, 21, 199, 30);

        labelIdentificador.setText("CPF/CNPJ");
        panelCliente.add(labelIdentificador);
        labelIdentificador.setBounds(250, 10, 100, 16);

        labalEndereco.setText("Endereço");
        panelCliente.add(labalEndereco);
        labalEndereco.setBounds(726, 57, 61, 16);

        textEndereco.setEditable(false);
        panelCliente.add(textEndereco);
        textEndereco.setBounds(726, 71, 377, 30);

        labelEndereco.setText("Fones");
        panelCliente.add(labelEndereco);
        labelEndereco.setBounds(934, 7, 70, 16);

        textTelefones.setEditable(false);
        panelCliente.add(textTelefones);
        textTelefones.setBounds(937, 21, 237, 30);

        labelContato.setText("Contato");
        panelCliente.add(labelContato);
        labelContato.setBounds(1188, 7, 80, 16);

        textContato.setEditable(false);
        panelCliente.add(textContato);
        textContato.setBounds(1192, 21, 186, 30);

        labelInsEst.setText("Ins.Est");
        panelCliente.add(labelInsEst);
        labelInsEst.setBounds(1115, 57, 70, 16);

        textInsEst.setEditable(false);
        panelCliente.add(textInsEst);
        textInsEst.setBounds(1115, 71, 253, 30);

        labelEmail.setText("E-mail");
        panelCliente.add(labelEmail);
        labelEmail.setBounds(726, 107, 59, 16);

        textEmail.setEditable(false);
        panelCliente.add(textEmail);
        textEmail.setBounds(726, 121, 377, 30);

        statusCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Aberta", "Em andamento", "Concluida", "Cancelada" }));
        statusCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboxActionPerformed(evt);
            }
        });
        panelCliente.add(statusCombox);
        statusCombox.setBounds(40, 90, 110, 22);

        panelVeiculos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labelModelo.setText("Modelo");

        textModelo.setEditable(false);

        labelPlaca.setText("Placa");

        textPlaca.setEditable(false);

        labelMarca.setText("Marca");

        textMarca.setEditable(false);

        labelChassi.setText("N Chassi");

        textChassi.setEditable(false);

        labelKM.setText("Kilometragem");

        textKM.setEditable(false);

        labelAcess.setText("Acessorios");

        textAccs.setEditable(false);

        textPatrimonio.setEditable(false);

        jLabel4.setText("Patrimonio");

        javax.swing.GroupLayout panelVeiculosLayout = new javax.swing.GroupLayout(panelVeiculos);
        panelVeiculos.setLayout(panelVeiculosLayout);
        panelVeiculosLayout.setHorizontalGroup(
            panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVeiculosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMarca)
                    .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModelo))
                .addGap(18, 18, 18)
                .addGroup(panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVeiculosLayout.createSequentialGroup()
                        .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textKM, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVeiculosLayout.createSequentialGroup()
                        .addComponent(labelPlaca)
                        .addGap(167, 167, 167)
                        .addComponent(labelKM)
                        .addGap(161, 161, 161)
                        .addGroup(panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAcess)
                            .addComponent(textAccs, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelVeiculosLayout.createSequentialGroup()
                        .addGroup(panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelChassi)
                            .addComponent(textChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(670, Short.MAX_VALUE))
        );
        panelVeiculosLayout.setVerticalGroup(
            panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVeiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(labelChassi)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(labelMarca)
                    .addComponent(labelKM)
                    .addComponent(labelAcess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAccs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelNome.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ordem de Serviço");

        javax.swing.GroupLayout panelNomeLayout = new javax.swing.GroupLayout(panelNome);
        panelNome.setLayout(panelNomeLayout);
        panelNomeLayout.setHorizontalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeLayout.createSequentialGroup()
                .addGap(626, 626, 626)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNomeLayout.setVerticalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Servico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Servico.setLayout(null);

        labelServico.setText("Serviços");
        Servico.add(labelServico);
        labelServico.setBounds(7, 7, 130, 16);

        labelValor.setText("Valor R$:");
        Servico.add(labelValor);
        labelValor.setBounds(333, 7, 90, 16);

        adicionarServico.setText("Adicionar");
        adicionarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarServicoActionPerformed(evt);
            }
        });
        Servico.add(adicionarServico);
        adicionarServico.setBounds(489, 29, 81, 23);

        removerServico.setText("Remover");
        removerServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerServicoActionPerformed(evt);
            }
        });
        Servico.add(removerServico);
        removerServico.setBounds(588, 29, 90, 23);

        jLabel2.setText("Colaborador");
        Servico.add(jLabel2);
        jLabel2.setBounds(330, 60, 240, 16);

        textServicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textServicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textServicosKeyReleased(evt);
            }
        });
        Servico.add(textServicos);
        textServicos.setBounds(10, 30, 270, 20);

        ScrollServicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listServicos.setBorder(null);
        listServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listServicosMouseClicked(evt);
            }
        });
        ScrollServicos.setViewportView(listServicos);

        Servico.add(ScrollServicos);
        ScrollServicos.setBounds(10, 50, 270, 110);

        textColaborador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textColaborador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textColaboradorKeyReleased(evt);
            }
        });
        Servico.add(textColaborador);
        textColaborador.setBounds(330, 80, 220, 20);

        textValorServico.setEditable(false);
        Servico.add(textValorServico);
        textValorServico.setBounds(330, 30, 140, 22);

        scrollColaborador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listaColaborador.setBorder(null);
        listaColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaColaboradorMouseClicked(evt);
            }
        });
        scrollColaborador.setViewportView(listaColaborador);

        Servico.add(scrollColaborador);
        scrollColaborador.setBounds(330, 100, 220, 70);

        Pecas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Pecas.setLayout(null);

        labelPecas.setText("Peças");
        Pecas.add(labelPecas);
        labelPecas.setBounds(7, 7, 30, 16);
        Pecas.add(spinnerPecas);
        spinnerPecas.setBounds(328, 29, 64, 22);

        adicionarPecas.setText("Adicionar");
        adicionarPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPecasActionPerformed(evt);
            }
        });
        Pecas.add(adicionarPecas);
        adicionarPecas.setBounds(410, 29, 81, 23);

        textPecas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textPecas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPecasKeyReleased(evt);
            }
        });
        Pecas.add(textPecas);
        textPecas.setBounds(10, 30, 270, 20);

        ScrollPecas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listaPecas.setBorder(null);
        listaPecas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPecasMouseClicked(evt);
            }
        });
        ScrollPecas.setViewportView(listaPecas);

        Pecas.add(ScrollPecas);
        ScrollPecas.setBounds(10, 50, 270, 110);

        tablePecassub.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Peças a substituir", "Qtd", "Valor Un", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablePecassub);
        if (tablePecassub.getColumnModel().getColumnCount() > 0) {
            tablePecassub.getColumnModel().getColumn(1).setMinWidth(100);
            tablePecassub.getColumnModel().getColumn(1).setPreferredWidth(400);
            tablePecassub.getColumnModel().getColumn(1).setMaxWidth(350);
        }

        tableServicoexecutar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Colaborador", "Serviços ", "Preço"
            }
        ));
        tableServicoexecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableServicoexecutarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableServicoexecutar);

        painelFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labelTotal.setText("TOTAL R$:");

        gerarOspdf.setText("Gerar");
        gerarOspdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarOspdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFinalLayout = new javax.swing.GroupLayout(painelFinal);
        painelFinal.setLayout(painelFinalLayout);
        painelFinalLayout.setHorizontalGroup(
            painelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gerarOspdf)
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap(806, Short.MAX_VALUE))
        );
        painelFinalLayout.setVerticalGroup(
            painelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFinalLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(labelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gerarOspdf)
                .addContainerGap())
        );

        javax.swing.GroupLayout ordemServicoLayout = new javax.swing.GroupLayout(ordemServico);
        ordemServico.setLayout(ordemServicoLayout);
        ordemServicoLayout.setHorizontalGroup(
            ordemServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ordemServicoLayout.createSequentialGroup()
                .addGroup(ordemServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordemServicoLayout.createSequentialGroup()
                        .addGroup(ordemServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Servico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordemServicoLayout.createSequentialGroup()
                        .addComponent(painelFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(ordemServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(Pecas, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ordemServicoLayout.setVerticalGroup(
            ordemServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordemServicoLayout.createSequentialGroup()
                .addComponent(panelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ordemServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ordemServicoLayout.createSequentialGroup()
                        .addComponent(Pecas, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ordemServicoLayout.createSequentialGroup()
                        .addComponent(Servico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelScrollLayout = new javax.swing.GroupLayout(panelScroll);
        panelScroll.setLayout(panelScrollLayout);
        panelScrollLayout.setHorizontalGroup(
            panelScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ordemServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelScrollLayout.setVerticalGroup(
            panelScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelScrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ordemServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textocpfcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textocpfcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textocpfcnpjActionPerformed

    private void statusComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusComboxActionPerformed

    private void textocpfcnpjKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textocpfcnpjKeyReleased
        ListarCpfCnpj();
    }//GEN-LAST:event_textocpfcnpjKeyReleased

    private void ListasNomesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListasNomesMouseClicked
        buscarCpfCnpj();
    }//GEN-LAST:event_ListasNomesMouseClicked

    private void gerarOspdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarOspdfActionPerformed
        // Coletando os dados da interface gráfica
        String nomeCliente = textoNome.getText();
        String cpfCnpj = textocpfcnpj.getText();
        String endereco = textEndereco.getText();
        String telefone = textTelefones.getText();
        String email = textEmail.getText();
        String modeloVeiculo = textModelo.getText();
        String placaVeiculo = textPlaca.getText();
        String marcaVeiculo = textMarca.getText();

        // Coletando os serviços e peças das tabelas
        String servicos = coletarServicosDaTabela();
        String pecas = coletarPecasDaTabela();
        String valorTotal = textValorTotal.getText();

        // Criando o arquivo PDF
        try {
            String dest = "OrdemServico_" + nomeCliente + ".pdf";
            PdfWriter writer = new PdfWriter(dest);
            com.itextpdf.kernel.pdf.PdfDocument pdf = new com.itextpdf.kernel.pdf.PdfDocument(writer);
            Document document = new Document(pdf);

            // Cabeçalho
            document.add(new Paragraph("MECÂNICA VIANA")
                    .setBold().setFontSize(20).setTextAlignment(TextAlignment.CENTER));
            document.add(new Paragraph("RUA 222 QD 98 LT 46")
                    .setFontSize(12).setTextAlignment(TextAlignment.CENTER));
            document.add(new Paragraph("Próximo à Paróquia São Francisco de Assis")
                    .setFontSize(12).setTextAlignment(TextAlignment.CENTER));
            document.add(new Paragraph("Telefone: (62) 3095-1614 | (62) 3092-8775")
                    .setFontSize(12).setTextAlignment(TextAlignment.CENTER));
            document.add(new Paragraph("Email: mecanicaviana222@hotmail.com")
                    .setFontSize(12).setTextAlignment(TextAlignment.CENTER));
            document.add(new Paragraph("\n"));

            // Título
            document.add(new Paragraph("Ordem de Serviço")
                    .setBold().setFontSize(18).setTextAlignment(TextAlignment.CENTER));
            document.add(new Paragraph("\n"));

            // Informações do cliente
            document.add(new Paragraph("Cliente: " + nomeCliente).setFontSize(12));
            document.add(new Paragraph("CPF/CNPJ: " + cpfCnpj).setFontSize(12));
            document.add(new Paragraph("Endereço: " + endereco).setFontSize(12));
            document.add(new Paragraph("Telefone: " + telefone).setFontSize(12));
            document.add(new Paragraph("Email: " + email).setFontSize(12));
            document.add(new Paragraph("Veículo: " + modeloVeiculo + " - " + marcaVeiculo + " - " + placaVeiculo)
                    .setFontSize(12));
            document.add(new Paragraph("\n"));

            // Linha divisória
            document.add(new LineSeparator(new SolidLine()));

            // Serviços
            document.add(new Paragraph("Serviços:").setBold().setFontSize(14));
            if (!servicos.isEmpty()) {
                Table tabelaServicos = new Table(new float[]{3, 5, 2});
                tabelaServicos.addHeaderCell("Colaborador");
                tabelaServicos.addHeaderCell("Serviço");
                tabelaServicos.addHeaderCell("Preço");

                String[] servicosArray = servicos.split("\n");
                for (String servico : servicosArray) {
                    String[] detalhesServico = servico.split(" - ");
                    if (detalhesServico.length == 3) {
                        tabelaServicos.addCell(detalhesServico[0]);
                        tabelaServicos.addCell(detalhesServico[1]);
                        tabelaServicos.addCell(detalhesServico[2]);
                    }
                }
                document.add(tabelaServicos);
            } else {
                document.add(new Paragraph("Nenhum serviço selecionado.").setFontSize(12));
            }

// Adicionando tabela de peças ao PDF
            document.add(new Paragraph("Peças:").setBold().setFontSize(14).setTextAlignment(TextAlignment.LEFT));

// Verifica se há peças
            if (tablePecassub.getRowCount() > 0) {
                // Configura a tabela do PDF com as colunas corretas
                Table tabelaPecasPDF = new Table(new float[]{1, 4, 1, 2, 2});
                tabelaPecasPDF.setWidth(UnitValue.createPercentValue(100));

                // Adiciona cabeçalhos
                tabelaPecasPDF.addHeaderCell(new Cell().add(new Paragraph("ID").setBold()));
                tabelaPecasPDF.addHeaderCell(new Cell().add(new Paragraph("Peças a substituir").setBold()));
                tabelaPecasPDF.addHeaderCell(new Cell().add(new Paragraph("Qtd").setBold()));
                tabelaPecasPDF.addHeaderCell(new Cell().add(new Paragraph("Valor Un").setBold()));
                tabelaPecasPDF.addHeaderCell(new Cell().add(new Paragraph("Total").setBold()));

                // Adiciona os dados da tabela
                DefaultTableModel model = (DefaultTableModel) tablePecassub.getModel();
                for (int i = 0; i < model.getRowCount(); i++) {
                    tabelaPecasPDF.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 0).toString())));
                    tabelaPecasPDF.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 1).toString())));
                    tabelaPecasPDF.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 2).toString())));
                    tabelaPecasPDF.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 3).toString())));
                    tabelaPecasPDF.addCell(new Cell().add(new Paragraph(model.getValueAt(i, 4).toString())));
                }

                // Adiciona a tabela ao documento
                document.add(tabelaPecasPDF);
            } else {
                document.add(new Paragraph("Nenhuma peça adicionada.").setFontSize(12));
            }

            // Valor total
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("Valor Total: R$ " + valorTotal)
                    .setBold().setFontSize(14));

            // Finalizar o documento
            document.close();
            JOptionPane.showMessageDialog(null, "Ordem de Serviço gerada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a Ordem de Serviço.\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_gerarOspdfActionPerformed

    private void textServicosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textServicosKeyReleased
        try {
            listarServicos(); // Lista os serviços conforme o texto digitado
        } catch (Exception e) {
            System.out.println("Erro ao listar serviços: " + e.getMessage());
        }
    }//GEN-LAST:event_textServicosKeyReleased

    private void listServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listServicosMouseClicked
        try {
            buscarServicos(); // Busca o serviço ao clicar na lista
            // Esconde a lista após o clique

        } catch (Exception ex) {
            Logger.getLogger(OrdemServicoview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listServicosMouseClicked

    private void adicionarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarServicoActionPerformed
        try {
            String nomeServico = textServicos.getText();
            String precoStr = textValorServico.getText();

            if (nomeServico.isEmpty() || precoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, selecione um serviço e informe o preço.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double precoServico = Double.parseDouble(precoStr.replace("R$", "").trim().replace(",", "."));
            String nomeColaborador = textColaborador.getText();

            if (nomeColaborador.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, selecione um colaborador.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            adicionarServicoNaTabela(nomeColaborador, nomeServico, precoServico);

            JOptionPane.showMessageDialog(this, "Serviço adicionado com sucesso.",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Preço inválido. Verifique o valor informado.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar o serviço: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adicionarServicoActionPerformed
    private void adicionarServicoNaTabela(String nomeColaborador, String nomeServico, double preco) {
        DefaultTableModel model = (DefaultTableModel) tableServicoexecutar.getModel();
        model.addRow(new Object[]{nomeColaborador, nomeServico, preco});

        atualizarValorTotal();
    }
    private void tableServicoexecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableServicoexecutarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableServicoexecutarMouseClicked

    private void removerServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerServicoActionPerformed
        try {
            // Obtém o modelo da tabela
            DefaultTableModel model = (DefaultTableModel) tableServicoexecutar.getModel();

            // Obtém o índice da linha selecionada
            int selectedRow = tableServicoexecutar.getSelectedRow();

            // Verifica se alguma linha foi selecionada
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Por favor, selecione um serviço para remover.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Confirma a remoção do serviço
            int response = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o serviço?",
                    "Confirmar Remoção", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                // Remove a linha selecionada
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Serviço removido com sucesso.",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao remover o serviço: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removerServicoActionPerformed

    private void listaColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaColaboradorMouseClicked
        try {
            buscarColaborador();

        } catch (Exception ex) {
            Logger.getLogger(OrdemServicoview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listaColaboradorMouseClicked

    private void textColaboradorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textColaboradorKeyReleased
        try {
            listarColaborador(); // Lista os serviços conforme o texto digitado
        } catch (Exception e) {
            System.out.println("Erro ao listar serviços: " + e.getMessage());
        }
    }//GEN-LAST:event_textColaboradorKeyReleased

    private void textPecasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPecasKeyReleased
        listarPecas();
    }//GEN-LAST:event_textPecasKeyReleased

    private void listaPecasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPecasMouseClicked
        try {
            buscarPecas();
        } catch (Exception ex) {
            Logger.getLogger(OrdemServicoview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listaPecasMouseClicked

    private void adicionarPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPecasActionPerformed
        String nomePecaSelecionada = listaPecas.getSelectedValue();
        int quantidade = (Integer) spinnerPecas.getValue();

        if (nomePecaSelecionada != null && quantidade > 0) {
            try {
                String[] pecaInfo = nomePecaSelecionada.split(" - ");
                String nomePeca = pecaInfo[0];
                String descricaoPeca = pecaInfo[1];

                String sqlPreco = "SELECT id, preco_unit, quantidade FROM produto WHERE nome = ?";
                Connection conexao = ConexaoBD.getConexao();
                PreparedStatement stmtPreco = conexao.prepareStatement(sqlPreco);
                stmtPreco.setString(1, nomePeca);
                ResultSet rsPreco = stmtPreco.executeQuery();

                if (rsPreco.next()) {
                    int idPeca = rsPreco.getInt("id");
                    double preco = rsPreco.getDouble("preco_unit");
                    int quantidadeDisponivel = rsPreco.getInt("quantidade");

                    if (quantidade > quantidadeDisponivel) {
                        JOptionPane.showMessageDialog(null, "Quantidade insuficiente. Disponível: " + quantidadeDisponivel);
                    } else {
                        String[] novaLinha = new String[5];
                        novaLinha[0] = String.valueOf(idPeca);
                        novaLinha[1] = nomePeca + " - " + descricaoPeca;
                        novaLinha[2] = String.valueOf(quantidade);
                        novaLinha[3] = String.format("R$ %.2f", preco);
                        novaLinha[4] = String.format("R$ %.2f", preco * quantidade);

                        DefaultTableModel model = (DefaultTableModel) tablePecassub.getModel();
                        model.addRow(novaLinha);

                        atualizarValorTotal();
                    }
                }

                rsPreco.close();
                stmtPreco.close();

            } catch (SQLException e) {
                System.out.println("Erro ao adicionar peça: " + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(OrdemServicoview.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma peça e uma quantidade válida.");
        }
    }//GEN-LAST:event_adicionarPecasActionPerformed

//==============================================================================================
    private void listarColaborador() throws Exception {
        DefaultListModel<String> model = new DefaultListModel<>();
        listaColaborador.setModel(model);

        // Consulta SQL para buscar os colaboradores com base no texto digitado
        String readListaColaborador = "SELECT nome FROM funcionario WHERE nome LIKE ? ORDER BY nome ";

        try {
            // Estabelecendo a conexão com o banco de dados
            Connection conexao = ConexaoBD.getConexao();

            // Preparando a consulta
            PreparedStatement preparedStatement = conexao.prepareStatement(readListaColaborador);
            preparedStatement.setString(1, textColaborador.getText() + "%"); // Filtra os colaboradores conforme o texto digitado

            // Executando a consulta
            ResultSet rs = preparedStatement.executeQuery();

            model.clear(); // Limpa a lista antes de adicionar novos colaboradores

            while (rs.next()) {
                String nomeColaborador = rs.getString("nome");
                model.addElement(nomeColaborador); // Adiciona o nome do colaborador
            }

            rs.close();
            preparedStatement.close();

            // Tornando a lista visível novamente quando houver colaboradores
            if (!model.isEmpty()) {
                scrollColaborador.setVisible(true);
                listaColaborador.setVisible(true);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar colaboradores: " + e.getMessage());
            // Exibe uma mensagem de erro em caso de exceção
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buscarColaborador() throws Exception {
        String nomeSelecionado = listaColaborador.getSelectedValue();

        if (nomeSelecionado != null) {
            try (Connection conexao = ConexaoBD.getConexao(); PreparedStatement stmtNomeCol = conexao.prepareStatement("SELECT nome FROM funcionario WHERE nome = ?")) {

                stmtNomeCol.setString(1, nomeSelecionado);

                try (ResultSet rsColaborador = stmtNomeCol.executeQuery()) {

                    if (rsColaborador.next()) {
                        String nome = rsColaborador.getString("nome");

                        textColaborador.setText(nome);
                        scrollColaborador.setVisible(false);
                        listaColaborador.setVisible(false);
                    }
                }
            } catch (SQLException e) {
                System.out.println("Erro ao buscar colaborador: " + e.getMessage());
                // Exibe uma mensagem de erro para o usuário
                JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Caso nenhum colaborador seja selecionado
            JOptionPane.showMessageDialog(null, "Selecione um colaborador válido.", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void listarServicos() throws Exception {
        DefaultListModel<String> model = new DefaultListModel<>();
        listServicos.setModel(model);

        // Consulta SQL para buscar os serviços com base no texto digitado
        String readListaServico = "SELECT nome, preco_unit FROM servicos WHERE nome LIKE ? ORDER BY nome";

        try {
            // Estabelecendo a conexão com o banco de dados
            Connection conexao = ConexaoBD.getConexao();

            // Preparando a consulta
            PreparedStatement preparedStatement = conexao.prepareStatement(readListaServico);
            preparedStatement.setString(1, textServicos.getText() + "%"); // Filtra os serviços conforme o texto digitado

            // Executando a consulta
            ResultSet rs = preparedStatement.executeQuery();

            model.clear(); // Limpa a lista antes de adicionar novos elementos

            while (rs.next()) {
                String nomeServico = rs.getString("nome");
                double precoServico = rs.getDouble("preco_unit");
                model.addElement(nomeServico + " - R$ " + precoServico); // Adiciona o nome e preço formatado
            }

            rs.close();
            preparedStatement.close();

            // Tornando a lista visível novamente quando houver serviços
            if (!model.isEmpty()) {
                ScrollServicos.setVisible(true);
                listServicos.setVisible(true);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar serviços: " + e.getMessage());
        }
    }

    private void buscarServicos() throws Exception {
        String nomeSelecionado = listServicos.getSelectedValue(); // Pega o nome do serviço selecionado
        if (nomeSelecionado != null) {
            try {
                // Busca o preço do serviço selecionado
                String sqlPreco = "SELECT preco_unit FROM servicos WHERE nome = ?";
                Connection conexao = ConexaoBD.getConexao();
                PreparedStatement stmtPreco = conexao.prepareStatement(sqlPreco);
                stmtPreco.setString(1, nomeSelecionado.split(" - ")[0]); // Pega o nome antes do " - "
                ResultSet rsPreco = stmtPreco.executeQuery();

                if (rsPreco.next()) {
                    double preco = rsPreco.getDouble("preco_unit");

                    // Atualizando os campos de texto
                    textServicos.setText(nomeSelecionado.split(" - ")[0]); // Nome do serviço
                    textValorServico.setText(String.format("R$ %.2f", preco)); // Preço formatado
                    ScrollServicos.setVisible(false);
                    listServicos.setVisible(false);
                    rsPreco.close();
                    stmtPreco.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao buscar preço do serviço: " + e.getMessage());
            }
        }
    }
//======================================================================================================================================

    private void ListarCpfCnpj() {
        DefaultListModel<String> model = new DefaultListModel<>();
        ListasNomes.setModel(model);

        // Consulta SQL ajustada para buscar CPF ou CNPJ
        String readLista = "SELECT COALESCE(pf.cpf, pj.cnpj) AS identificador "
                + "FROM clientes c "
                + "LEFT JOIN pessoa_fisica pf ON c.id = pf.id_cliente "
                + "LEFT JOIN pessoa_juridica pj ON c.id = pj.id_cliente "
                + "WHERE COALESCE(pf.cpf, pj.cnpj) LIKE ? "
                + "ORDER BY identificador";

        try {
            // Estabelecendo a conexão com o banco de dados
            Connection conexao = ConexaoBD.getConexao();

            PreparedStatement preparedStatement = conexao.prepareStatement(readLista);
            preparedStatement.setString(1, textocpfcnpj.getText() + "%"); // Busca com o início do CPF/CNPJ

            // Executando a consulta
            ResultSet rs = preparedStatement.executeQuery();

            model.clear();

            while (rs.next()) {
                ScrollLista.setVisible(true);
                ListasNomes.setVisible(true);
                model.addElement(rs.getString("identificador")); // Adiciona CPF ou CNPJ na lista
            }

            rs.close();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println("Erro ao listar CPF/CNPJ: " + e);
        }
    }

    private void buscarCpfCnpj() {
        int linha = ListasNomes.getSelectedIndex();

        if (linha >= 0) {
            // Consulta SQL para buscar os dados do cliente com base no CPF ou CNPJ, incluindo o veículo
            String sqlCliente = "SELECT c.id AS id_cliente, c.nome, c.email, c.endereco, c.telefone, "
                    + "pf.cpf, pj.cnpj, pj.contato, pj.insc_estadual, "
                    + "v.placa, v.n_chassi, v.kilometragem, v.n_patrimonio, v.acessorios, "
                    + "m.nome AS modelo, ma.nome AS marca "
                    + "FROM clientes c "
                    + "LEFT JOIN pessoa_fisica pf ON c.id = pf.id_cliente "
                    + "LEFT JOIN pessoa_juridica pj ON c.id = pj.id_cliente "
                    + "LEFT JOIN propriedade p ON c.id = p.id_clientes "
                    + "LEFT JOIN veiculos v ON p.id_veiculos = v.placa "
                    + "LEFT JOIN modelo m ON v.id_modelo = m.id "
                    + "LEFT JOIN marca ma ON m.id_marca = ma.id "
                    + "WHERE COALESCE(pf.cpf, pj.cnpj) LIKE ? "
                    + "ORDER BY COALESCE(pf.cpf, pj.cnpj) LIMIT 1 OFFSET ?";

            try {
                // Estabelecendo a conexão com o banco de dados
                Connection conexao = ConexaoBD.getConexao();

                PreparedStatement preparedStatement = conexao.prepareStatement(sqlCliente);
                preparedStatement.setString(1, textocpfcnpj.getText() + "%"); // CPF ou CNPJ com wildcard
                preparedStatement.setInt(2, linha); // Offset baseado na linha selecionada

                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {
                    // Preenchendo os campos com os dados do cliente
                    ScrollLista.setVisible(false);
                    textocpfcnpj.setText(rs.getString("cpf") != null ? rs.getString("cpf") : rs.getString("cnpj"));
                    textEmail.setText(rs.getString("email"));
                    textEndereco.setText(rs.getString("endereco"));
                    textTelefones.setText(rs.getString("telefone"));

                    // Nome do cliente
                    textoNome.setText(rs.getString("nome"));

                    // Dados específicos de pessoa jurídica
                    textContato.setText(rs.getString("contato") != null ? rs.getString("contato") : "");
                    textInsEst.setText(rs.getString("insc_estadual") != null ? rs.getString("insc_estadual") : "");

                    // Dados do veículo
                    String placa = rs.getString("placa");
                    if (placa != null) {
                        textPlaca.setText(placa);
                        textChassi.setText(rs.getString("n_chassi"));
                        textKM.setText(rs.getString("kilometragem"));
                        textPatrimonio.setText(rs.getString("n_patrimonio"));
                        textAccs.setText(rs.getString("acessorios"));
                        textModelo.setText(rs.getString("modelo"));
                        textMarca.setText(rs.getString("marca"));
                    } else {
                        // Caso não haja veículo vinculado, você pode limpar ou mostrar uma mensagem
                        JOptionPane.showMessageDialog(null, "Cliente não possui veículo vinculado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }

                rs.close();
                preparedStatement.close();
            } catch (Exception e) {
                System.out.println("Erro ao buscar cliente: " + e);
            }
        }
    }

    //================================================================================================================================
//Iniciar listarPeças e buscarPeças
    private void listarPecas() {
        DefaultListModel<String> model = new DefaultListModel<>();
        listaPecas.setModel(model);

        String readListaPecas = "SELECT id, nome, descricao, quantidade, preco_unit FROM produto WHERE nome LIKE ? ORDER BY nome";

        try {
            Connection conexao = ConexaoBD.getConexao();
            PreparedStatement preparedStatement = conexao.prepareStatement(readListaPecas);
            preparedStatement.setString(1, textPecas.getText() + "%");

            ResultSet rs = preparedStatement.executeQuery();
            model.clear();

            double valorTotal = 0; // Variável para acumular o valor total

            while (rs.next()) {
                int idPeca = rs.getInt("id");
                String nomePeca = rs.getString("nome");
                String descricaoPeca = rs.getString("descricao");
                int quantidadePeca = rs.getInt("quantidade");
                double precoPeca = rs.getDouble("preco_unit");
                String pecaInfo = nomePeca + " - " + descricaoPeca + " - Quantidade: " + quantidadePeca + " - R$ " + precoPeca;

                model.addElement(pecaInfo);

                // Acumula o valor total com base na quantidade e preço
                valorTotal += precoPeca * quantidadePeca;
            }

            // Exibe o valor total somado
            textValorTotal.setText(String.format("R$ %.2f", valorTotal)); // Atualize o campo de texto conforme necessário

            rs.close();
            preparedStatement.close();

            if (!model.isEmpty()) {
                ScrollPecas.setVisible(true);
                listaPecas.setVisible(true);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar peças: " + e.getMessage());
        }
    }

    private void buscarPecas() throws Exception {
        String nomeSelecionado = listaPecas.getSelectedValue();
        if (nomeSelecionado != null) {
            try {
                String sqlPreco = "SELECT preco_unit FROM produto WHERE nome = ?";
                Connection conexao = ConexaoBD.getConexao();
                PreparedStatement stmtPreco = conexao.prepareStatement(sqlPreco);
                stmtPreco.setString(1, nomeSelecionado.split(" - ")[0]);
                ResultSet rsPreco = stmtPreco.executeQuery();

                if (rsPreco.next()) {
                    double preco = rsPreco.getDouble("preco_unit");

                    textPecas.setText(nomeSelecionado.split(" - ")[0]);
                    ScrollPecas.setVisible(false);
                    listaPecas.setVisible(false);
                    rsPreco.close();
                    stmtPreco.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao buscar preço da peça: " + e.getMessage());
            }
        }
    }

    private String coletarServicosDaTabela() {
        // Coleta os serviços, colaboradores e preços da tabela e retorna em formato String
        StringBuilder servicos = new StringBuilder();
        for (int i = 0; i < tableServicoexecutar.getRowCount(); i++) {
            // Coleta as informações de cada linha: colaborador, serviço e preço
            String colaborador = tableServicoexecutar.getValueAt(i, 0).toString();
            String nomeServico = tableServicoexecutar.getValueAt(i, 1).toString();
            String precoServico = tableServicoexecutar.getValueAt(i, 2).toString();

            // Adiciona na string com o formato "Colaborador - Serviço - Preço"
            servicos.append(colaborador).append(" - ").append(nomeServico).append(" - ").append(precoServico).append("\n");
        }
        return servicos.toString();
    }

    private void atualizarValorTotal() {
        double total = 0.0;

        DefaultTableModel modelPecas = (DefaultTableModel) tablePecassub.getModel();
        for (int i = 0; i < modelPecas.getRowCount(); i++) {
            total += Double.parseDouble(modelPecas.getValueAt(i, 4).toString().replace("R$ ", "").replace(",", "."));
        }

        DefaultTableModel modelServicos = (DefaultTableModel) tableServicoexecutar.getModel();
        for (int i = 0; i < modelServicos.getRowCount(); i++) {
            total += Double.parseDouble(modelServicos.getValueAt(i, 2).toString().replace("R$ ", "").replace(",", "."));
        }

        textValorTotal.setText(String.format("R$ %.2f", total));
    }

    public String coletarPecasDaTabela() {
        DefaultTableModel model = (DefaultTableModel) tablePecassub.getModel();
        StringBuilder pecas = new StringBuilder();

        for (int i = 0; i < model.getRowCount(); i++) {
            String id = model.getValueAt(i, 0).toString();
            String nomePeca = model.getValueAt(i, 1).toString();
            String qtd = model.getValueAt(i, 2).toString();
            String valorUnit = model.getValueAt(i, 3).toString();
            String total = model.getValueAt(i, 4).toString();

            pecas.append(id).append(" - ")
                    .append(nomePeca).append(" - ")
                    .append(qtd).append(" - ")
                    .append(valorUnit).append(" - ")
                    .append(total).append("\n");
        }

        return pecas.toString();
    }

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Principal principal = new Principal();
            principal.setVisible(true);

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCodigoOs;
    private javax.swing.JList<String> ListasNomes;
    private javax.swing.JPanel Pecas;
    private javax.swing.JScrollPane ScrollLista;
    private javax.swing.JScrollPane ScrollPecas;
    private javax.swing.JScrollPane ScrollServicos;
    private javax.swing.JPanel Servico;
    private javax.swing.JButton adicionarPecas;
    private javax.swing.JButton adicionarServico;
    private javax.swing.JButton gerarOspdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labalEndereco;
    private javax.swing.JLabel labelAcess;
    private javax.swing.JLabel labelChassi;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelIdentificador;
    private javax.swing.JLabel labelInsEst;
    private javax.swing.JLabel labelKM;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPecas;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelServico;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelValor;
    private javax.swing.JList<String> listServicos;
    private javax.swing.JList<String> listaColaborador;
    private javax.swing.JList<String> listaPecas;
    private javax.swing.JPanel ordemServico;
    private javax.swing.JPanel painelFinal;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelNome;
    private javax.swing.JPanel panelScroll;
    private javax.swing.JPanel panelVeiculos;
    private javax.swing.JButton removerServico;
    private javax.swing.JScrollPane scrollColaborador;
    private javax.swing.JSpinner spinnerPecas;
    private javax.swing.JComboBox<String> statusCombox;
    private javax.swing.JTable tablePecassub;
    private javax.swing.JTable tableServicoexecutar;
    private javax.swing.JTextField textAccs;
    private javax.swing.JTextField textChassi;
    private javax.swing.JTextField textColaborador;
    private javax.swing.JTextField textContato;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textInsEst;
    private javax.swing.JTextField textKM;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    private javax.swing.JTextField textPatrimonio;
    private javax.swing.JTextField textPecas;
    private javax.swing.JTextField textPlaca;
    private javax.swing.JTextField textServicos;
    private javax.swing.JTextField textTelefones;
    private javax.swing.JTextField textValorServico;
    private javax.swing.JTextField textValorTotal;
    private javax.swing.JTextField textcodOS;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textocpfcnpj;
    // End of variables declaration//GEN-END:variables
}
