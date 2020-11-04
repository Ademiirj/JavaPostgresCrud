/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import controller.FinanceiroController;
import controller.FornecedorController;
import controller.PagarController;
import controller.ReceberController;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ClienteModel;
import model.EnderecoModel;
import model.FinanceiroModel;
import model.FornecedorModel;
import model.PagarModel;
import model.ReceberModel;
import util.ConsultasComplexas;

/**
 *
 * @author ademir
 */
public class CadastraBoletoView extends javax.swing.JFrame {

    HomeView home;
    FinanceiroModel financeiro;
    EnderecoModel endereco;

    double valorFinal;
    double valor = 0;
    double juros = 0;
    double multa = 0;
    double desconto = 0;
    boolean despesa;
    static boolean semFoco;
    static boolean cadastrou;

    public CadastraBoletoView() {
        initComponents();
        setVisible(true);
    }

    public CadastraBoletoView(String escolha, HomeView teste) {
        initComponents();
        this.home = teste;

        if (escolha.equals("despesa")) {
            despesa = true;
            txtTitulo.setForeground(new java.awt.Color(213, 1, 1));
            txtTitulo.setText("CADASTRAR BOLETO DE DESPESA");
            montaFornecedores();
        } else {
            despesa = false;
            txtTitulo.setForeground(new java.awt.Color(44, 140, 38));
            txtTitulo.setText("CADASTRAR BOLETO A RECEBER");
            montaClientes();
        }

        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumBoleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataEmissao = new javax.swing.JTextField();
        txtDataVencimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDataPagamento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtJuros = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        txtValorFinal = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbPessoas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtNotaFiscal = new javax.swing.JTextField();

        jLabel5.setText("Vencimento");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(213, 1, 1));
        txtTitulo.setText("CADASTRAR BOLETO DE DESPESA");

        jLabel2.setText("Numero do boleto");

        jLabel3.setText("Data Emissao");

        jLabel4.setText("Data Vencimento");

        jLabel6.setText("Data Pagamento");

        jLabel7.setText("Valor");

        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFocusLost(evt);
            }
        });

        jLabel8.setText("Juros");

        txtJuros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJurosFocusLost(evt);
            }
        });

        jLabel9.setText("Multa");

        txtMulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMultaFocusLost(evt);
            }
        });

        jLabel10.setText("Desconto");

        txtDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescontoFocusLost(evt);
            }
        });

        txtValorFinal.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        txtValorFinal.setText("VALOR TOTAL:");

        btnCadastrar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Escolher fornecedor:");

        cbPessoas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Fornecedor" }));

        jLabel11.setText("Nota fiscal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDataEmissao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtNumBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtDataPagamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addComponent(jLabel1)
                                    .addComponent(cbPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtNotaFiscal)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(395, 395, 395)))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(btnCadastrar)
                            .addComponent(txtValorFinal))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try{
            
        String pessoa = (String) cbPessoas.getSelectedItem();
        
        if (pessoa.equals("Adicionar novo Fornecedor") || pessoa.equals("Adicionar novo Cliente")) {
            CadastroPessoaView cadastro = new CadastroPessoaView(despesa, this);
            setVisible(false);
        }
            financeiro = new FinanceiroModel();
            int fin_id = 0;
            FinanceiroController financeirocontroller = new FinanceiroController();
            PagarController pagarcontroller = new PagarController();
            ReceberController recebercontroller = new ReceberController();
            ConsultasComplexas consulta = new ConsultasComplexas();
            PagarModel pagar = new PagarModel();
            ReceberModel receber = new ReceberModel();

            montaFinal();
            int numeroBoleto = Integer.parseInt(txtNumBoleto.getText());
            String notaFiscal = txtNotaFiscal.getText();
            Date dataEmissao = Date.valueOf(txtDataEmissao.getText());
            Date dataVencimento = Date.valueOf(txtDataVencimento.getText());

            String[] pessoaIDArray = pessoa.split(" /");
            int pessoaId = Integer.parseInt(pessoaIDArray[0]);

            financeiro.setFIN_NUMERO(numeroBoleto);
            financeiro.setFIN_EMISSAO(dataEmissao);
            financeiro.setFIN_VENCIMENTO(dataVencimento);
            if(!txtDataPagamento.getText().equals("")){
               Date dataPagamento = Date.valueOf(txtDataPagamento.getText());
               financeiro.setFIN_PAGAMENTO(dataPagamento);
            }
            financeiro.setFIN_VALOR(valor);
            financeiro.setFIN_JUROS(juros);
            financeiro.setFIN_MULTA(multa);
            financeiro.setFIN_DESCONTO(desconto);
            financeiro.setFIN_TOTAL(valorFinal);

            try {
                financeirocontroller.adicionar(financeiro);
                fin_id = consulta.ultimaAdicao("fin_id", "financeiro");

                System.out.println(fin_id);
                if (despesa) {
                    pagar.setFinanceiroInfo(financeiro);
                    pagar.setFIN_ID(fin_id);
                    pagar.setFOR_ID(pessoaId);
                    pagar.setNota_fiscal(notaFiscal);
                    
                    pagarcontroller.adicionar(pagar);
                    JOptionPane.showMessageDialog(null, "Despesa cadastrada com sucesso");
                }else{
                    receber.setFinanceiroInfo(financeiro);
                    receber.setFIN_ID(fin_id);
                    receber.setCLI_ID(pessoaId);
                    receber.setNota_fiscal(notaFiscal);
                    
                    recebercontroller.adicionar(receber);
                    JOptionPane.showMessageDialog(null, "Boleto cadastrado com sucesso");
                }

                home.setVisible(true);
                home.montaLayout();
                dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar essa despesa, tente novamente mais tarde");
                Logger.getLogger(CadastraBoletoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "Existem campos obrigatórios que não foram preenchidos");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost
        montaFinal();
    }//GEN-LAST:event_txtValorFocusLost

    private void txtJurosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJurosFocusLost
        montaFinal();
    }//GEN-LAST:event_txtJurosFocusLost

    private void txtDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusLost
        montaFinal();
    }//GEN-LAST:event_txtDescontoFocusLost

    private void txtMultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMultaFocusLost
        montaFinal();
    }//GEN-LAST:event_txtMultaFocusLost

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
            java.util.logging.Logger.getLogger(CadastraBoletoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraBoletoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraBoletoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraBoletoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraBoletoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cbPessoas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtDataEmissao;
    private javax.swing.JTextField txtDataPagamento;
    private javax.swing.JTextField txtDataVencimento;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtJuros;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txtNotaFiscal;
    private javax.swing.JTextField txtNumBoleto;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JTextField txtValor;
    private javax.swing.JLabel txtValorFinal;
    // End of variables declaration//GEN-END:variables

    public void montaFinal() {
        if (!txtValor.getText().equals("")) {
            valor = Double.parseDouble(txtValor.getText());
        }else{
            valor = 0;
        }
        if (!txtJuros.getText().equals("")) {
            juros = Double.parseDouble(txtJuros.getText());
        }else{
            juros = 0;
        }
        if (!txtMulta.getText().equals("")) {
            multa = Double.parseDouble(txtMulta.getText());
        }else{
            multa = 0;
        }
        if (!txtDesconto.getText().equals("")) {
            desconto = Double.parseDouble(txtDesconto.getText());
        }else{
            desconto = 0;
        }

        valorFinal = valor + juros + multa - desconto;
        txtValorFinal.setText("VALOR TOTAL: R$" + valorFinal);
    }

    public void montaFornecedores() {
        cbPessoas.removeAllItems();

        FornecedorController fornecedor = new FornecedorController();
        ArrayList<FornecedorModel> fornecedores;
        String fornecedorTexto = "";
        cbPessoas.addItem("Adicionar novo Fornecedor");

        try {
            fornecedores = fornecedor.consultar("");
            for (int i = 0; i < fornecedores.size(); i++) {
                fornecedorTexto = fornecedores.get(i).getFOR_ID() + " / " + fornecedores.get(i).getFOR_NOME() + " / " + fornecedores.get(i).getFOR_CNPJ();
                cbPessoas.addItem(fornecedorTexto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastraBoletoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void montaClientes() {
        cbPessoas.removeAllItems();

        ClienteController cliente = new ClienteController();
        ArrayList<ClienteModel> clientes;
        String clienteTexto = "";
        cbPessoas.addItem("Adicionar novo Cliente");

        try {
            clientes = cliente.consultar("");
            for (int i = 0; i < clientes.size(); i++) {
                clienteTexto = clientes.get(i).getCLI_ID() + " / " + clientes.get(i).getCLI_NOME() + " / " + clientes.get(i).getCLI_CPF();
                cbPessoas.addItem(clienteTexto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastraBoletoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
