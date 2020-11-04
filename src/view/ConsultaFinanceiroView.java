/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FinanceiroController;
import controller.PagarController;
import controller.ReceberController;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.FinanceiroModel;
import model.FinanceiroTableModel;
import model.PagarModel;
import model.ReceberModel;

/**
 *
 * @author ademir
 */
public class ConsultaFinanceiroView extends javax.swing.JFrame {

    private String operacao;
    private String colunas[] = {"Nota fiscal", "Responsável", "Documento", "Vencimento", "Valor"};
    private ArrayList<ReceberModel> listaReceber;
    private ArrayList<PagarModel> listaPagar;
    private boolean despesa;
    HomeView home;
    private boolean alterouNota = false;
    private int financeiroId;
    private double valorFinal;

    private FinanceiroTableModel tabela;

    public ConsultaFinanceiroView() {
        initComponents();

        buscaFinanceiros("");
        setVisible(true);
    }

    public ConsultaFinanceiroView(boolean despesa, HomeView home) {
        initComponents();
        this.despesa = despesa;
        this.home = home;

        buscaFinanceiros("");
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
        txtNotaFiscal = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtPagamento = new javax.swing.JTextField();
        lblUSU_LOGIN1 = new javax.swing.JLabel();
        txtEmissao = new javax.swing.JTextField();
        lblUSU_LOGIN2 = new javax.swing.JLabel();
        txtVencimento = new javax.swing.JTextField();
        lblUSU_LOGIN3 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        lblFinal = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtJuros = new javax.swing.JTextField();
        lblUSU_LOGIN4 = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        lblUSU_LOGIN5 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        lblUSU_LOGIN6 = new javax.swing.JLabel();
        lblUSU_NOME2 = new javax.swing.JLabel();
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
        txtNota_consulta = new javax.swing.JTextField();
        lblCONS_LOGIN = new javax.swing.JLabel();
        txtValor_consulta = new javax.swing.JTextField();
        lblCodigo3 = new javax.swing.JLabel();
        txtValorFinal_consulta = new javax.swing.JTextField();
        lblCONS_NOME1 = new javax.swing.JLabel();
        txtDocumento_consulta = new javax.swing.JTextField();
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
        lblUSU_ID.setText("Nota fiscal");

        lblUSU_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME.setText("Numero Boleto");

        lblUSU_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN.setText("Emissão");

        txtNotaFiscal.setEditable(false);
        txtNotaFiscal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN1.setText("Vencimento");

        txtEmissao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN2.setText("Pagamento");

        txtVencimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN3.setText("Fornecedor");

        txtFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblFinal.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblFinal.setText("Valor");

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFocusLost(evt);
            }
        });
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        txtJuros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtJuros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJurosFocusLost(evt);
            }
        });

        lblUSU_LOGIN4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN4.setText("Juros");

        txtMulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMultaFocusLost(evt);
            }
        });

        lblUSU_LOGIN5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN5.setText("Multa");

        txtDesconto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescontoFocusLost(evt);
            }
        });

        lblUSU_LOGIN6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN6.setText("Desconto");

        lblUSU_NOME2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME2.setText("Valor");

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_NOME)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_ID)
                                .addGap(46, 46, 46)))
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNotaFiscal, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtPagamento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVencimento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmissao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUSU_LOGIN1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUSU_LOGIN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUSU_LOGIN2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_LOGIN3)
                                .addGap(18, 18, 18)
                                .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addComponent(lblUSU_LOGIN4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUSU_NOME2)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_LOGIN5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_LOGIN6)
                                .addGap(18, 18, 18)
                                .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_ID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUSU_NOME)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUSU_LOGIN)
                                    .addComponent(txtEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUSU_LOGIN1)
                                    .addComponent(txtVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUSU_LOGIN2)
                                    .addComponent(txtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUSU_LOGIN4)
                                    .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUSU_LOGIN5)
                                    .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUSU_LOGIN6)))))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblUSU_NOME2)))
                .addGap(11, 11, 11)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_LOGIN3)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        lblCONS_NOME.setText("Nota Fiscal");

        txtNota_consulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_LOGIN.setText("Valor");

        txtValor_consulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo3.setText("à");

        txtValorFinal_consulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCONS_NOME1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOME1.setText("CPF/CNPJ");

        txtDocumento_consulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_NOME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNota_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdFinal_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCONS_LOGIN)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtValor_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCodigo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorFinal_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCONS_NOME1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDocumento_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                    .addComponent(txtValor_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_LOGIN)
                    .addComponent(lblCodigo3)
                    .addComponent(txtValorFinal_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDocumento_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCONS_NOME1))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNota_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCONS_NOME)
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        painelCONSULTALayout.setVerticalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
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
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Dados do Financeiro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        if (financeiroId == 0) {
            JOptionPane.showMessageDialog(null, "Para excluir, é necessário selecionar um Boleto");
        } else {
            if (despesa) {
                FinanceiroModel financeiro = new FinanceiroModel();
                FinanceiroController financeirocontroller = new FinanceiroController();
                PagarModel pagar = new PagarModel();
                PagarController pagarcontroller = new PagarController();

                financeiro.setFIN_ID(financeiroId);
                pagar.setFIN_ID(financeiroId);

                try {
                    pagarcontroller.excluir(pagar);
                    financeirocontroller.excluir(financeiro);
                    JOptionPane.showMessageDialog(null, "Exclusão feita com sucesso");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro inesperado, não foi possivel excluir o boleto");
                    Logger.getLogger(ConsultaFinanceiroView.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                FinanceiroModel financeiro = new FinanceiroModel();
                FinanceiroController financeirocontroller = new FinanceiroController();
                ReceberModel receber = new ReceberModel();
                ReceberController pagarcontroller = new ReceberController();

                financeiro.setFIN_ID(financeiroId);
                receber.setFIN_ID(financeiroId);

                try {
                    pagarcontroller.excluir(receber);
                    financeirocontroller.excluir(financeiro);
                    JOptionPane.showMessageDialog(null, "Exclusão feita com sucesso");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro inesperado, não foi possivel excluir o boleto");
                    Logger.getLogger(ConsultaFinanceiroView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        buscaFinanceiros("");
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        if (financeiroId == 0) {
            JOptionPane.showMessageDialog(null, "Para alterar, é necessário selecionar um Boleto");
        } else {
            FinanceiroModel financeiro = new FinanceiroModel();
            FinanceiroController financeirocontroller = new FinanceiroController();

            int numero = Integer.parseInt(txtNumero.getText());
            Date emissao = Date.valueOf(txtEmissao.getText());
            Date vencimento = Date.valueOf(txtVencimento.getText());
            Date pagamento = Date.valueOf(txtPagamento.getText());
            double valor = Double.parseDouble(txtValor.getText());
            double juros = Double.parseDouble(txtJuros.getText());
            double multa = Double.parseDouble(txtMulta.getText());
            double desconto = Double.parseDouble(txtDesconto.getText());
            montaFinal();

            financeiro.setFIN_ID(financeiroId);
            financeiro.setFIN_NUMERO(numero);
            financeiro.setFIN_EMISSAO(emissao);
            financeiro.setFIN_VENCIMENTO(vencimento);
            financeiro.setFIN_PAGAMENTO(pagamento);
            financeiro.setFIN_VALOR(valor);
            financeiro.setFIN_JUROS(juros);
            financeiro.setFIN_MULTA(multa);
            financeiro.setFIN_DESCONTO(desconto);
            financeiro.setFIN_TOTAL(valorFinal);

            try {
                financeirocontroller.alterar(financeiro);
                JOptionPane.showMessageDialog(null, "Boleto alterado com sucesso");
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaFinanceiroView.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Erro desconhecido, não foi possivel alterar");
            }
        }
        buscaFinanceiros("");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
//        System.exit(0);
        dispose();
        home.montaLayout();
        home.setVisible(true);
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        String condicao = "";
        if (despesa) {
            if (!txtId_consulta.getText().trim().equals("")) {
                condicao += "(financeiro.FIN_ID >= " + txtId_consulta.getText() + ")";
                if (!txtIdFinal_consulta.getText().trim().equals("")) {
                    if (!condicao.isEmpty()) {
                        condicao += " AND ";
                    }
                    condicao += "(financeiro.FIN_ID <= " + txtIdFinal_consulta.getText() + ")";
                } else {
                    condicao = "(financeiro.FIN_ID = " + txtId_consulta.getText() + ")";
                }
            }
            if (!txtValor_consulta.getText().trim().equals("")) {
                condicao += "(financeiro.FIN_TOTAL >= " + txtValor_consulta.getText() + ")";
                if (!txtValorFinal_consulta.getText().trim().equals("")) {
                    if (!condicao.isEmpty()) {
                        condicao += " AND ";
                    }
                    condicao += "(financeiro.FIN_TOTAL <= " + txtValorFinal_consulta.getText() + ")";
                } else {
                    condicao = "(financeiro.FIN_TOTAL = " + txtValor_consulta.getText() + ")";
                }
            }
            if (!txtNota_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(contas_pagar.nota_fiscal = '" + txtNota_consulta.getText().trim() + "')";
            }
            if (!txtDocumento_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(fornecedor.FOR_CNPJ = '" + txtDocumento_consulta.getText().trim() + "')";
            }
        } else {
            if (!txtId_consulta.getText().trim().equals("")) {
                condicao += "(financeiro.FIN_ID >= " + txtId_consulta.getText() + ")";
                if (!txtIdFinal_consulta.getText().trim().equals("")) {
                    if (!condicao.isEmpty()) {
                        condicao += " AND ";
                    }
                    condicao += "(financeiro.FIN_ID <= " + txtIdFinal_consulta.getText() + ")";
                } else {
                    condicao = "(financeiro.FIN_ID = " + txtId_consulta.getText() + ")";
                }
            }
            if (!txtValor_consulta.getText().trim().equals("")) {
                condicao += "(financeiro.FIN_TOTAL >= " + txtValor_consulta.getText() + ")";
                if (!txtValorFinal_consulta.getText().trim().equals("")) {
                    if (!condicao.isEmpty()) {
                        condicao += " AND ";
                    }
                    condicao += "(financeiro.FIN_TOTAL <= " + txtValorFinal_consulta.getText() + ")";
                } else {
                    condicao = "(financeiro.FIN_TOTAL = " + txtValor_consulta.getText() + ")";
                }
            }
            if (!txtNota_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(contas_receber.nota_fiscal = '" + txtNota_consulta.getText().trim() + "')";
            }
            if (!txtDocumento_consulta.getText().trim().equals("")) {
                if (!condicao.isEmpty()) {
                    condicao += " AND ";
                }
                condicao += "(cliente.CLI_CPF= '" + txtDocumento_consulta.getText().trim() + "')";
            }
        }
        buscaFinanceiros(condicao);

    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        financeiroId = 0;


        txtNotaFiscal.setText("");
        txtNumero.setText("");
        txtEmissao.setText("");
        txtVencimento.setText("");
        txtPagamento.setText("");
        txtFornecedor.setText("");
        txtValor.setText("");
        txtJuros.setText("");
        txtMulta.setText("");
        txtDesconto.setText("");
        lblFinal.setText("VALOR: R$0.00");
        
        txtValor_consulta.setText("");
        txtValorFinal_consulta.setText("");
        txtId_consulta.setText("");
        txtIdFinal_consulta.setText("");
        txtNota_consulta.setText("");
        txtDocumento_consulta.setText("");
        
        buscaFinanceiros("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void tblFinanceirosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFinanceirosMouseClicked
        if (despesa) {
            PagarModel objpagar = listaPagar.get(tblFinanceiros.getSelectedRow());

            financeiroId = objpagar.getFIN_ID();

            txtNotaFiscal.setText(objpagar.getNota_fiscal());
            txtNumero.setText("" + objpagar.getFIN_NUMERO());
            txtEmissao.setText("" + objpagar.getFIN_EMISSAO());
            txtVencimento.setText("" + objpagar.getFIN_VENCIMENTO());
            txtPagamento.setText("" + objpagar.getFIN_PAGAMENTO());
            txtFornecedor.setText("" + objpagar.getFornecedor().getFOR_NOME() + "/ Doc: " + objpagar.getFornecedor().getFOR_CNPJ());
            txtValor.setText("" + objpagar.getFIN_VALOR());
            txtJuros.setText("" + objpagar.getFIN_JUROS());

            txtMulta.setText("" + objpagar.getFIN_MULTA());
            txtDesconto.setText("" + objpagar.getFIN_DESCONTO());
            lblFinal.setText("VALOR: R$" + objpagar.getFIN_TOTAL());
        } else {
            ReceberModel objreceber = listaReceber.get(tblFinanceiros.getSelectedRow());

            financeiroId = objreceber.getFIN_ID();

            txtNotaFiscal.setText(objreceber.getNota_fiscal());
            txtNumero.setText("" + objreceber.getFIN_NUMERO());
            txtEmissao.setText("" + objreceber.getFIN_EMISSAO());
            txtVencimento.setText("" + objreceber.getFIN_VENCIMENTO());
            txtPagamento.setText("" + objreceber.getFIN_PAGAMENTO());
            txtFornecedor.setText("" + objreceber.getCliente().getCLI_NOME() + "/ Doc: " + objreceber.getCliente().getCLI_CPF());
            txtValor.setText("" + objreceber.getFIN_VALOR());
            txtJuros.setText("" + objreceber.getFIN_JUROS());

            txtMulta.setText("" + objreceber.getFIN_MULTA());
            txtDesconto.setText("" + objreceber.getFIN_DESCONTO());
            lblFinal.setText("VALOR: R$" + objreceber.getFIN_TOTAL());
        }
    }//GEN-LAST:event_tblFinanceirosMouseClicked

    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost
        montaFinal();
    }//GEN-LAST:event_txtValorFocusLost

    private void txtJurosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJurosFocusLost
        montaFinal();
    }//GEN-LAST:event_txtJurosFocusLost

    private void txtMultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMultaFocusLost
        montaFinal();
    }//GEN-LAST:event_txtMultaFocusLost

    private void txtDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusLost
        montaFinal();
    }//GEN-LAST:event_txtDescontoFocusLost
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFinanceiroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSAIR;
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
    private javax.swing.JLabel lblCodigo3;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUSU_ID;
    private javax.swing.JLabel lblUSU_LOGIN;
    private javax.swing.JLabel lblUSU_LOGIN1;
    private javax.swing.JLabel lblUSU_LOGIN2;
    private javax.swing.JLabel lblUSU_LOGIN3;
    private javax.swing.JLabel lblUSU_LOGIN4;
    private javax.swing.JLabel lblUSU_LOGIN5;
    private javax.swing.JLabel lblUSU_LOGIN6;
    private javax.swing.JLabel lblUSU_NOME;
    private javax.swing.JLabel lblUSU_NOME2;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTable tblFinanceiros;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtDocumento_consulta;
    private javax.swing.JTextField txtEmissao;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtIdFinal_consulta;
    private javax.swing.JTextField txtId_consulta;
    private javax.swing.JTextField txtJuros;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txtNotaFiscal;
    private javax.swing.JTextField txtNota_consulta;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPagamento;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorFinal_consulta;
    private javax.swing.JTextField txtValor_consulta;
    private javax.swing.JTextField txtVencimento;
    // End of variables declaration//GEN-END:variables

    private void buscaFinanceiros(String condicao) {
        if (despesa) {
            try {
                PagarController pagarcontroller = new PagarController();
                listaPagar = null;
                listaPagar = pagarcontroller.consultar(condicao);
                if (listaPagar.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
                } else {
//                
                    tabela = new FinanceiroTableModel(listaPagar, colunas);
                    tblFinanceiros.setModel(tabela);
                    tblFinanceiros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na Consulta do Usuário \n" + ex.getMessage());
            };

        } else {

            try {
                ReceberController recebercontroller = new ReceberController();
                listaReceber = null;
                listaReceber = recebercontroller.consultar(condicao);
                if (listaReceber.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
                } else {
                    tabela = new FinanceiroTableModel(listaReceber, colunas);
                    tblFinanceiros.setModel(tabela);
                    tblFinanceiros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na Consulta do Usuário \n" + ex.getMessage());
            };
        }
    }

    private void montaFinal() {
        double valor = 0, juros = 0, multa = 0, desconto = 0;
        if (!txtValor.getText().equals("")) {
            valor = Double.parseDouble(txtValor.getText());
        }
        if (!txtJuros.getText().equals("")) {
            juros = Double.parseDouble(txtJuros.getText());
        }
        if (!txtMulta.getText().equals("")) {
            multa = Double.parseDouble(txtMulta.getText());
        }
        if (!txtDesconto.getText().equals("")) {
            desconto = Double.parseDouble(txtDesconto.getText());
        }

        valorFinal = valor + juros + multa - desconto;
        lblFinal.setText("VALOR: R$" + valorFinal);
    }
}
