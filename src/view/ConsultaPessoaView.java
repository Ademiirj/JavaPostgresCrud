package view;

import controller.ClienteController;
import controller.EnderecoController;
import controller.FornecedorController;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.ClienteModel;
import model.EnderecoModel;
import model.FornecedorModel;
import model.PessoasTableModel;
import model.ReceberModel;

public class ConsultaPessoaView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"Identificação", "Nome", "Documento", "Email", "Telefone", "Cidade"};
    private ArrayList<ClienteModel> listaCliente;
    private ArrayList<FornecedorModel> listaFornecedor;
    private boolean fornecedor;
    HomeView home;
    private boolean alterouNota = false;
    private int pessoaId = 0;
    private int enderecoId;

    private PessoasTableModel tabela;

    public ConsultaPessoaView() {
        initComponents();

        buscaPessoas("");
        setVisible(true);
    }

    public ConsultaPessoaView(boolean fornecedor, HomeView home) {
        initComponents();
        this.fornecedor = fornecedor;
        this.home = home;

        if (!fornecedor) {
            txtRazaoSocial.setEnabled(false);
        }

        buscaPessoas("");
        setVisible(true);
    }

    @SuppressWarnings("unchecked")

    private void setOperacao(String operacao) {
//        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
//        btnGRAVAR.setEnabled(ativar);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnEXCLUIR = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        btnALTERAR = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(70, 0), new java.awt.Dimension(70, 0), new java.awt.Dimension(70, 32767));
        btnSAIR = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelDADOS = new javax.swing.JPanel();
        lblUSU_ID = new javax.swing.JLabel();
        lblUSU_NOME = new javax.swing.JLabel();
        lblUSU_LOGIN = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        lblUSU_LOGIN1 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblUSU_LOGIN3 = new javax.swing.JLabel();
        txtDdd = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        lblUSU_LOGIN4 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblUSU_LOGIN5 = new javax.swing.JLabel();
        lblUSU_LOGIN6 = new javax.swing.JLabel();
        lblUSU_NOME2 = new javax.swing.JLabel();
        lblUSU_LOGIN7 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        lblUSU_LOGIN8 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        painelCONSULTA = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        txtId_consulta = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        txtIdFinal_consulta = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCONS_NOME = new javax.swing.JLabel();
        txtNome_consulta = new javax.swing.JTextField();
        lblCONS_LOGIN = new javax.swing.JLabel();
        txtEmail_consulta = new javax.swing.JTextField();
        lblCONS_NOME1 = new javax.swing.JLabel();
        txtDocumento_consulta = new javax.swing.JTextField();
        txtCidade_consulta = new javax.swing.JTextField();
        lblUSU_LOGIN10 = new javax.swing.JLabel();
        lblUSU_LOGIN9 = new javax.swing.JLabel();
        cbEstado_consulta = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFinanceiros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setFocusable(false);
        btnEXCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEXCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEXCLUIR);
        jToolBar1.add(filler4);

        btnALTERAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        btnALTERAR.setText("Alterar");
        btnALTERAR.setFocusable(false);
        btnALTERAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnALTERAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnALTERAR);
        jToolBar1.add(filler1);
        jToolBar1.add(filler2);
        jToolBar1.add(filler5);

        btnSAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSAIR.setText("Voltar");
        btnSAIR.setFocusable(false);
        btnSAIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSAIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSAIR);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Consulta de Boletos");

        lblUSU_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_ID.setText("Identificação");

        lblUSU_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME.setText("Nome");

        lblUSU_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN.setText("Documento");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN1.setText("E-mail");

        txtDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN3.setText("Telefone");

        txtDdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN4.setText("Numero");

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN5.setText("Cidade");

        lblUSU_LOGIN6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN6.setText("Estado");

        lblUSU_NOME2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME2.setText("Rua");

        lblUSU_LOGIN7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN7.setText("Razão social");

        txtRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN8.setText("CEP");

        txtCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF", " " }));

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUSU_NOME)
                    .addComponent(lblUSU_LOGIN1)
                    .addComponent(lblUSU_LOGIN)
                    .addComponent(lblUSU_LOGIN3)
                    .addComponent(lblUSU_ID)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblUSU_LOGIN7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail)
                    .addComponent(txtDocumento)
                    .addComponent(txtRazaoSocial))
                .addGap(109, 109, 109)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(lblUSU_LOGIN4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUSU_NOME2)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_LOGIN5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_LOGIN6)
                                .addGap(18, 18, 18)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(painelDADOSLayout.createSequentialGroup()
                            .addComponent(lblUSU_LOGIN8)
                            .addGap(18, 18, 18)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(99, 99, 99))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_ID))
                        .addGap(11, 11, 11)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_LOGIN))
                        .addGap(6, 6, 6)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_LOGIN1))
                        .addGap(5, 5, 5)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_LOGIN3)))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblUSU_NOME))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUSU_LOGIN4)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUSU_LOGIN5)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUSU_LOGIN6)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblUSU_NOME2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSU_LOGIN7))
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSU_LOGIN8)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Usuário", painelDADOS);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCONS_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ID.setText("ID");

        txtId_consulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo2.setText("à");

        txtIdFinal_consulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpa");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOME.setText("Nome");

        txtNome_consulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_LOGIN.setText("Email");

        txtEmail_consulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_NOME1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOME1.setText("Documento");

        txtDocumento_consulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCidade_consulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN10.setText("Cidade");

        lblUSU_LOGIN9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN9.setText("Estado");

        cbEstado_consulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_NOME)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCONS_NOME1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDocumento_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblUSU_LOGIN9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodigo2)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdFinal_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCONS_LOGIN)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUSU_LOGIN10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbEstado_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID)
                    .addComponent(txtId_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2)
                    .addComponent(txtIdFinal_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta)
                    .addComponent(txtEmail_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_LOGIN)
                    .addComponent(lblUSU_LOGIN10)
                    .addComponent(txtCidade_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOME)
                    .addComponent(lblCONS_NOME1)
                    .addComponent(txtDocumento_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUSU_LOGIN9)
                        .addComponent(cbEstado_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpar)))
                .addContainerGap())
        );

        tblFinanceiros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFinanceiros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFinanceirosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFinanceiros);

        javax.swing.GroupLayout painelCONSULTALayout = new javax.swing.GroupLayout(painelCONSULTA);
        painelCONSULTA.setLayout(painelCONSULTALayout);
        painelCONSULTALayout.setHorizontalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addGroup(painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 771, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelCONSULTALayout.setVerticalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Consulta", painelCONSULTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Dados do Financeiro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        if (pessoaId == 0) {
            JOptionPane.showMessageDialog(null, "Para excluir, é necessário selecionar um Boleto");
        } else {
            if (fornecedor) {
                FornecedorModel fornecedor = new FornecedorModel();
                FornecedorController fornecedorcontroller = new FornecedorController();
                EnderecoModel endereco = new EnderecoModel();
                EnderecoController enderecocontroller = new EnderecoController();

                fornecedor.setFOR_ID(pessoaId);
                endereco.setEND_ID(enderecoId);

                try {
                    fornecedorcontroller.excluir(fornecedor);
                    enderecocontroller.excluir(endereco);
                    JOptionPane.showMessageDialog(null, "Exclusão feita com sucesso");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro inesperado, não foi possivel excluir o boleto");
                    Logger.getLogger(ConsultaPessoaView.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                ClienteModel cliente = new ClienteModel();
                ClienteController clientecontroller = new ClienteController();
                EnderecoModel endereco = new EnderecoModel();
                EnderecoController enderecocontroller = new EnderecoController();

                cliente.setCLI_ID(pessoaId);
                endereco.setEND_ID(enderecoId);

                try {
                    clientecontroller.excluir(cliente);
                    enderecocontroller.excluir(endereco);
                    JOptionPane.showMessageDialog(null, "Exclusão feita com sucesso");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro inesperado, não foi possivel excluir o boleto");
                    Logger.getLogger(ConsultaPessoaView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        buscaPessoas("");
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        if (pessoaId == 0) {
            JOptionPane.showMessageDialog(null, "Para alterar, é necessário selecionar um Boleto");
        } else {
            if (fornecedor) {
                FornecedorModel teste = new FornecedorModel();
                FornecedorController fornecedorcontroller = new FornecedorController();
                EnderecoModel endereco = new EnderecoModel();
                EnderecoController enderecocontroller = new EnderecoController();

                String nome = txtNome.getText();
                int cnpj = Integer.parseInt(txtDocumento.getText());
                String email = txtEmail.getText();
                int ddd = Integer.parseInt(txtDdd.getText());
                int telefone = Integer.parseInt(txtTelefone.getText());
                String razaoSocial = txtRazaoSocial.getText();

                String rua = txtRua.getText();
                int numero = Integer.parseInt(txtNumero.getText());
                String cidade = txtCidade.getText();
                int cep = Integer.parseInt(txtCep.getText());
                String estado = (String) cbEstado.getSelectedItem();

                endereco.setEND_ID(enderecoId);
                endereco.setEND_CEP(cep);
                endereco.setEND_CIDADE(cidade);
                endereco.setEND_ESTADO(estado);
                endereco.setEND_NUMERO(numero);
                endereco.setEND_RUA(rua);

                teste.setFOR_ID(pessoaId);
                teste.setFOR_CNPJ(cnpj);
                teste.setFOR_DDD(ddd);
                teste.setFOR_TELEFONE(telefone);
                teste.setFOR_EMAIL(email);
                teste.setFOR_ENDERECO(endereco);
                teste.setFOR_NOME(nome);
                teste.setFOR_RAZAO(razaoSocial);

                try {
                    fornecedorcontroller.alterar(teste);
                    enderecocontroller.alterar(endereco);
                    JOptionPane.showMessageDialog(null, "Boleto alterado com sucesso");
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaPessoaView.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Erro desconhecido, não foi possivel alterar");
                }
            } else {

                ClienteModel cliente = new ClienteModel();
                ClienteController clientecontroller = new ClienteController();

                EnderecoModel endereco = new EnderecoModel();
                EnderecoController enderecocontroller = new EnderecoController();

                String nome = txtNome.getText();
                int cnpj = Integer.parseInt(txtDocumento.getText());
                String email = txtEmail.getText();
                int ddd = Integer.parseInt(txtDdd.getText());
                int telefone = Integer.parseInt(txtTelefone.getText());

                String rua = txtRua.getText();
                int numero = Integer.parseInt(txtNumero.getText());
                String cidade = txtCidade.getText();
                int cep = Integer.parseInt(txtCep.getText());
                String estado = (String) cbEstado.getSelectedItem();

                endereco.setEND_ID(enderecoId);
                endereco.setEND_CEP(cep);
                endereco.setEND_CIDADE(cidade);
                endereco.setEND_ESTADO(estado);
                endereco.setEND_NUMERO(numero);
                endereco.setEND_RUA(rua);

                cliente.setCLI_ID(pessoaId);
                cliente.setCLI_CPF(cnpj);
                cliente.setCLI_DDD(ddd);
                cliente.setCLI_TELEFONE(telefone);
                cliente.setCLI_EMAIL(email);
                cliente.setCLI_ENDERECO(endereco);
                cliente.setCLI_NOME(nome);

                try {
                    clientecontroller.alterar(cliente);
                    enderecocontroller.alterar(endereco);
                    JOptionPane.showMessageDialog(null, "Boleto alterado com sucesso");
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaPessoaView.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Erro desconhecido, não foi possivel alterar");
                }
            }
        }
        buscaPessoas("");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
//        System.exit(0);
        dispose();
        home.setVisible(true);
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        String condicao = "";
        if (fornecedor) {
            if (!txtId_consulta.getText().trim().equals("")) {
                condicao += "(fornecedor.FOR_ID >= " + txtId_consulta.getText() + ")";
            }
            if (!txtIdFinal_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(fornecedor.FOR_ID <= " + txtIdFinal_consulta.getText() + ")";
            }else{
                condicao =  "(fornecedor.FOR_ID = " + txtId_consulta.getText() + ")";
            }
            if (!txtNome_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(fornecedor.FOR_NOME = '" + txtNome_consulta.getText().trim() + "')";
            }
            if (!cbEstado_consulta.getSelectedItem().equals("Selecionar")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(endereco.END_ESTADO = '" + (String) cbEstado_consulta.getSelectedItem() + "')";
            }
            if (!txtEmail_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(fornecedor.FOR_EMAIL = '" + txtEmail_consulta.getText().trim() + "')";
            }
            if (!txtDocumento_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(fornecedor.FOR_CNPJ = '" + txtDocumento_consulta.getText().trim() + "')";
            }
            if (!txtCidade_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(endereco.END_CIDADE = '" + txtCidade_consulta.getText().trim() + "')";
            }
        }else{
            if (!txtId_consulta.getText().trim().equals("")) {
                condicao += "(cliente.CLI_ID >= " + txtId_consulta.getText() + ")";
            }
            if (!txtIdFinal_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(cliente.CLI_ID <= " + txtIdFinal_consulta.getText() + ")";
            }else{
                condicao =  "(cliente.CLI_ID = " + txtId_consulta.getText() + ")";
            }
            if (!txtNome_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(cliente.CLI_NOME = '" + txtNome_consulta.getText().trim() + "')";
            }
            if (!cbEstado_consulta.getSelectedItem().equals("Selecionar")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(endereco.END_ESTADO = '" + (String) cbEstado_consulta.getSelectedItem() + "')";
            }
            if (!txtEmail_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(cliente.CLI_EMAIL = '" + txtEmail_consulta.getText().trim() + "')";
            }
            if (!txtDocumento_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(cliente.CLI_CPF = '" + txtDocumento_consulta.getText().trim() + "')";
            }
            if (!txtCidade_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(endereco.END_CIDADE = '" + txtCidade_consulta.getText().trim() + "')";
            }
        }
        buscaPessoas(condicao);

    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        pessoaId = 0;

        txtId.setText("");
        txtNome.setText("");
        txtDocumento.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtDdd.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        cbEstado.setSelectedItem("AC");
        txtRazaoSocial.setText("");
        
        txtId_consulta.setText("");
        txtIdFinal_consulta.setText("");
        txtNome_consulta.setText("");
        txtEmail_consulta.setText("");
        txtDocumento_consulta.setText("");
        txtCidade_consulta.setText("");
        cbEstado_consulta.setSelectedItem("Selecionar");
        
        buscaPessoas("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblFinanceirosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFinanceirosMouseClicked
        if (fornecedor) {
            FornecedorModel objfornecedor = listaFornecedor.get(tblFinanceiros.getSelectedRow());

            pessoaId = objfornecedor.getFOR_ID();
            enderecoId = objfornecedor.getFOR_ENDERECO().getEND_ID();

            txtId.setText("" + objfornecedor.getFOR_ID());
            txtNome.setText("" + objfornecedor.getFOR_NOME());
            txtDocumento.setText("" + objfornecedor.getFOR_CNPJ());
            txtEmail.setText("" + objfornecedor.getFOR_EMAIL());
            txtTelefone.setText("" + objfornecedor.getFOR_TELEFONE());
            txtDdd.setText("" + objfornecedor.getFOR_DDD());
            txtRazaoSocial.setText("" + objfornecedor.getFOR_RAZAO());

            txtRua.setText("" + objfornecedor.getFOR_ENDERECO().getEND_RUA());
            txtNumero.setText("" + objfornecedor.getFOR_ENDERECO().getEND_NUMERO());
            txtCidade.setText("" + objfornecedor.getFOR_ENDERECO().getEND_CIDADE());
            txtCep.setText("" + objfornecedor.getFOR_ENDERECO().getEND_CEP());
            cbEstado.setSelectedItem(objfornecedor.getFOR_ENDERECO().getEND_ESTADO());

        } else {
            ClienteModel objcliente = listaCliente.get(tblFinanceiros.getSelectedRow());

            pessoaId = objcliente.getCLI_ID();
            enderecoId = objcliente.getCLI_ENDERECO().getEND_ID();

            txtId.setText("" + objcliente.getCLI_ID());
            txtNome.setText("" + objcliente.getCLI_NOME());
            txtDocumento.setText("" + objcliente.getCLI_CPF());
            txtEmail.setText("" + objcliente.getCLI_EMAIL());
            txtTelefone.setText("" + objcliente.getCLI_TELEFONE());
            txtDdd.setText("" + objcliente.getCLI_DDD());

            txtRua.setText("" + objcliente.getCLI_ENDERECO().getEND_RUA());
            txtNumero.setText("" + objcliente.getCLI_ENDERECO().getEND_NUMERO());
            txtCidade.setText("" + objcliente.getCLI_ENDERECO().getEND_CIDADE());
            txtCep.setText("" + objcliente.getCLI_ENDERECO().getEND_CEP());
            cbEstado.setSelectedItem(objcliente.getCLI_ENDERECO().getEND_ESTADO());
        }
    }//GEN-LAST:event_tblFinanceirosMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPessoaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbEstado_consulta;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_LOGIN;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCONS_NOME1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUSU_ID;
    private javax.swing.JLabel lblUSU_LOGIN;
    private javax.swing.JLabel lblUSU_LOGIN1;
    private javax.swing.JLabel lblUSU_LOGIN10;
    private javax.swing.JLabel lblUSU_LOGIN3;
    private javax.swing.JLabel lblUSU_LOGIN4;
    private javax.swing.JLabel lblUSU_LOGIN5;
    private javax.swing.JLabel lblUSU_LOGIN6;
    private javax.swing.JLabel lblUSU_LOGIN7;
    private javax.swing.JLabel lblUSU_LOGIN8;
    private javax.swing.JLabel lblUSU_LOGIN9;
    private javax.swing.JLabel lblUSU_NOME;
    private javax.swing.JLabel lblUSU_NOME2;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblFinanceiros;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCidade_consulta;
    private javax.swing.JTextField txtDdd;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtDocumento_consulta;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail_consulta;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdFinal_consulta;
    private javax.swing.JTextField txtId_consulta;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome_consulta;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void buscaPessoas(String condicao) {
        if (fornecedor) {
            try {
                FornecedorController fornecedorcontroller = new FornecedorController();
                listaFornecedor = null;
                listaFornecedor = fornecedorcontroller.consultar(condicao);
                if (listaFornecedor.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum fornecedor !");
                } else {
//                
                    tabela = new PessoasTableModel(listaFornecedor, colunas);
                    tblFinanceiros.setModel(tabela);
                    tblFinanceiros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na Consulta do Fornecedor \n" + ex.getMessage());
            };

        } else {

            try {
                ClienteController recebercontroller = new ClienteController();
                listaCliente = null;
                listaCliente = recebercontroller.consultar(condicao);
                if (listaCliente.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum Clientes !");
                } else {
                    tabela = new PessoasTableModel(listaCliente, colunas);
                    tblFinanceiros.setModel(tabela);
                    tblFinanceiros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na Consulta do Cliente \n" + ex.getMessage());
            };
        }
    }
}
