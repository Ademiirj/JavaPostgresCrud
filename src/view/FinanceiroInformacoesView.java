package view;

import model.PagarModel;
import model.ReceberModel;

public class FinanceiroInformacoesView extends javax.swing.JFrame {
    HomeView home;
    public FinanceiroInformacoesView() {
        initComponents();
    }

    public FinanceiroInformacoesView(ReceberModel objreceber) {
        initComponents();
        lblPessoa.setText("Cliente");

        txtNotaFiscal.setText(objreceber.getNota_fiscal());
        txtNumero.setText("" + objreceber.getFIN_NUMERO());
        txtEmissao.setText("" + objreceber.getFIN_EMISSAO());
        txtVencimento.setText("" + objreceber.getFIN_VENCIMENTO());
        if (objreceber.getFIN_PAGAMENTO() == null) {
            txtPagamento.setText("AGUARDANDO");
        } else {
            txtPagamento.setText("" + objreceber.getFIN_PAGAMENTO());
        }
        txtFornecedor.setText("" + objreceber.getCliente().getCLI_NOME() + "/ Doc: " + objreceber.getCliente().getCLI_CPF());
        txtFornecedorContato.setText("Email:" + objreceber.getCliente().getCLI_EMAIL() + "/ Tel: (" + objreceber.getCliente().getCLI_DDD() +")"+ objreceber.getCliente().getCLI_TELEFONE());
        txtValor.setText("" + objreceber.getFIN_VALOR());
        txtJuros.setText("" + objreceber.getFIN_JUROS());
        txtMulta.setText("" + objreceber.getFIN_MULTA());
        txtDesconto.setText("" + objreceber.getFIN_DESCONTO());
        lblFinal.setText("VALOR: R$" + objreceber.getFIN_TOTAL());

        setVisible(true);
    }

    public FinanceiroInformacoesView(PagarModel objreceber) {
        initComponents();
        
        txtNotaFiscal.setText(objreceber.getNota_fiscal());
        txtNumero.setText("" + objreceber.getFIN_NUMERO());
        txtEmissao.setText("" + objreceber.getFIN_EMISSAO());
        txtVencimento.setText("" + objreceber.getFIN_VENCIMENTO());
        if (objreceber.getFIN_PAGAMENTO() == null) {
            txtPagamento.setText("AGUARDANDO");
        } else {
            txtPagamento.setText("" + objreceber.getFIN_PAGAMENTO());
        }
        txtFornecedor.setText("" + objreceber.getFornecedor().getFOR_NOME() + "/ Doc: " + objreceber.getFornecedor().getFOR_CNPJ());
        txtFornecedorContato.setText("Email:" + objreceber.getFornecedor().getFOR_EMAIL() + "/ Tel: (" + objreceber.getFornecedor().getFOR_DDD() +")"+ objreceber.getFornecedor().getFOR_TELEFONE());
        txtValor.setText("" + objreceber.getFIN_VALOR());
        txtJuros.setText("" + objreceber.getFIN_JUROS());
        txtMulta.setText("" + objreceber.getFIN_MULTA());
        txtDesconto.setText("" + objreceber.getFIN_DESCONTO());
        lblFinal.setText("VALOR: R$" + objreceber.getFIN_TOTAL());

        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        lblPessoa = new javax.swing.JLabel();
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
        lblUSU_LOGIN7 = new javax.swing.JLabel();
        txtFornecedorContato = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUSU_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_ID.setText("Nota fiscal");

        lblUSU_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME.setText("Numero Boleto");

        lblUSU_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN.setText("Emissão");

        txtNotaFiscal.setEditable(false);
        txtNotaFiscal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNumero.setEditable(false);
        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtPagamento.setEditable(false);
        txtPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN1.setText("Vencimento");

        txtEmissao.setEditable(false);
        txtEmissao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUSU_LOGIN2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN2.setText("Pagamento");

        txtVencimento.setEditable(false);
        txtVencimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPessoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPessoa.setText("Fornecedor");

        txtFornecedor.setEditable(false);
        txtFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblFinal.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblFinal.setText("Valor");

        txtValor.setEditable(false);
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

        txtJuros.setEditable(false);
        txtJuros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtJuros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJurosFocusLost(evt);
            }
        });

        lblUSU_LOGIN4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN4.setText("Juros");

        txtMulta.setEditable(false);
        txtMulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMultaFocusLost(evt);
            }
        });

        lblUSU_LOGIN5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN5.setText("Multa");

        txtDesconto.setEditable(false);
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

        lblUSU_LOGIN7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN7.setText("Contato:");

        txtFornecedorContato.setEditable(false);
        txtFornecedorContato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDADOSLayout = new javax.swing.GroupLayout(painelDADOS);
        painelDADOS.setLayout(painelDADOSLayout);
        painelDADOSLayout.setHorizontalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDADOSLayout.createSequentialGroup()
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
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDADOSLayout.createSequentialGroup()
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUSU_LOGIN1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUSU_LOGIN, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUSU_LOGIN2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelDADOSLayout.createSequentialGroup()
                                .addComponent(lblUSU_LOGIN4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblUSU_NOME2)
                                        .addGroup(painelDADOSLayout.createSequentialGroup()
                                            .addComponent(lblUSU_LOGIN5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(painelDADOSLayout.createSequentialGroup()
                                            .addComponent(lblUSU_LOGIN6)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(63, 63, 63))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPessoa)
                            .addComponent(lblUSU_LOGIN7))
                        .addGap(18, 18, 18)
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFornecedor)
                            .addComponent(txtFornecedorContato, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelDADOSLayout.setVerticalGroup(
            painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUSU_ID, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(11, 11, 11)
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
                            .addComponent(txtVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(lblUSU_LOGIN6)))
                    .addGroup(painelDADOSLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUSU_NOME2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_LOGIN2)
                    .addComponent(txtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinal))
                .addGap(32, 32, 32)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPessoa)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_LOGIN7)
                    .addComponent(txtFornecedorContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelDADOS, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDADOS, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost

    }//GEN-LAST:event_txtValorFocusLost

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtJurosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJurosFocusLost

    }//GEN-LAST:event_txtJurosFocusLost

    private void txtMultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMultaFocusLost

    }//GEN-LAST:event_txtMultaFocusLost

    private void txtDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusLost

    }//GEN-LAST:event_txtDescontoFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinanceiroInformacoesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblPessoa;
    private javax.swing.JLabel lblUSU_ID;
    private javax.swing.JLabel lblUSU_LOGIN;
    private javax.swing.JLabel lblUSU_LOGIN1;
    private javax.swing.JLabel lblUSU_LOGIN2;
    private javax.swing.JLabel lblUSU_LOGIN4;
    private javax.swing.JLabel lblUSU_LOGIN5;
    private javax.swing.JLabel lblUSU_LOGIN6;
    private javax.swing.JLabel lblUSU_LOGIN7;
    private javax.swing.JLabel lblUSU_NOME;
    private javax.swing.JLabel lblUSU_NOME2;
    private javax.swing.JPanel painelDADOS;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtEmissao;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtFornecedorContato;
    private javax.swing.JTextField txtJuros;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txtNotaFiscal;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPagamento;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtVencimento;
    // End of variables declaration//GEN-END:variables
}
