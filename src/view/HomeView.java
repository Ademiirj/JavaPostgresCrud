package view;

import controller.ClienteController;
import controller.FornecedorController;
import controller.LoginController;
import controller.PagarController;
import controller.ReceberController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.ClienteModel;
import model.FornecedorModel;
import model.HomePagarTableModel;
import model.HomeReceberTableModel;
import model.PagarModel;
import model.ReceberModel;
import model.UsuarioModel;
import util.ConsultasComplexas;

public class HomeView extends javax.swing.JFrame {

    UsuarioModel usuario = new UsuarioModel();
    private HomeReceberTableModel tabelaReceber;
    private HomePagarTableModel tabelaPagar;
    private String colunasReceber[] = {"Nota fiscal", "Cliente", "Valor total", "Pagamento"};
    private String colunasPagar[] = {"Nota fiscal", "Fornecedor", "Valor total", "Pagamento"};
    private ArrayList<ReceberModel> listaReceber;
    private ArrayList<PagarModel> listaPagar;

    public HomeView() {
        initComponents();
        setVisible(true);
    }

    public HomeView(UsuarioModel usuarioRecebido) {
        initComponents();

        this.usuario = usuarioRecebido;
        txtApresentacao.setText("Olá " + usuario.getUSU_NOME());
        txtEmail.setText(usuario.getUSU_EMAIL());
        montaLayout();

        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPagar = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReceber = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApresentacao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumReceber = new javax.swing.JLabel();
        txtValorReceber = new javax.swing.JLabel();
        txtNumPagar = new javax.swing.JLabel();
        txtValorPagar = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(500, 0), new java.awt.Dimension(500, 0), new java.awt.Dimension(500, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(500, 0), new java.awt.Dimension(500, 0), new java.awt.Dimension(500, 32767));
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPagarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPagar);

        tblReceber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReceberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblReceber);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 1, 1));
        jLabel1.setText("Valores das Despesas");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(44, 140, 38));
        jLabel2.setText("Valores a Receber");

        txtApresentacao.setText("Olá ");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 1, 1));
        jLabel3.setText("Total a pagar: ");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 140, 38));
        jLabel4.setText("Total a receber:");

        txtNumReceber.setText("0 boletos");

        txtValorReceber.setText("R$ 00,00");

        txtNumPagar.setText("0 boletos");

        txtValorPagar.setText("R$ 00,00");

        txtEmail.setText("email: ");

        jMenu3.setText("Financeiro");

        jMenu2.setText("Adicionar");

        jMenu11.setText("Despesa");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu11);

        jMenu12.setText("Recebimento");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu12);

        jMenu3.add(jMenu2);

        jMenu5.setText("Consultar");

        jMenu13.setText("Despesa");
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu13);

        jMenu14.setText("Recebimento");
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu14);

        jMenu3.add(jMenu5);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Pessoa");

        jMenu9.setText("Adicionar");

        jMenu15.setText("Cliente");
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        jMenu9.add(jMenu15);

        jMenu16.setText("Fornecedor");
        jMenu16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu16MouseClicked(evt);
            }
        });
        jMenu9.add(jMenu16);

        jMenu4.add(jMenu9);

        jMenu10.setText("Consultar");

        jMenu17.setText("Cliente");
        jMenu17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu17MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu17);

        jMenu18.setText("Fornecedor");
        jMenu18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu18MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu18);

        jMenu4.add(jMenu10);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApresentacao)
                            .addComponent(txtEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtNumReceber)
                            .addComponent(txtValorReceber)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNumPagar)
                                    .addComponent(txtValorPagar))
                                .addGap(181, 181, 181))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtApresentacao)
                        .addGap(29, 29, 29)
                        .addComponent(txtEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumReceber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorReceber))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumPagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorPagar)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
        new CadastraBoletoView("despesa", this);
        setVisible(false);
    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        new CadastraBoletoView("receber", this);
        setVisible(false);
    }//GEN-LAST:event_jMenu12MouseClicked

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        new ConsultaFinanceiroView(true, this);
        setVisible(false);
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
        new ConsultaFinanceiroView(false, this);
        setVisible(false);
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu16MouseClicked
        new CadastroPessoaView(true, this);
    }//GEN-LAST:event_jMenu16MouseClicked

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        new CadastroPessoaView(false, this);
    }//GEN-LAST:event_jMenu15MouseClicked

    private void jMenu17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu17MouseClicked
        new ConsultaPessoaView(false,this);
        setVisible(false);
    }//GEN-LAST:event_jMenu17MouseClicked

    private void jMenu18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu18MouseClicked
        new ConsultaPessoaView(true,this);
        setVisible(false);
    }//GEN-LAST:event_jMenu18MouseClicked

    private void tblReceberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReceberMouseClicked
       ReceberModel objreceber = listaReceber.get(tblReceber.getSelectedRow());
       new FinanceiroInformacoesView(objreceber);
    }//GEN-LAST:event_tblReceberMouseClicked

    private void tblPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPagarMouseClicked
        PagarModel objpagar = listaPagar.get(tblPagar.getSelectedRow());
       new FinanceiroInformacoesView(objpagar);
    }//GEN-LAST:event_tblPagarMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPagar;
    private javax.swing.JTable tblReceber;
    private javax.swing.JLabel txtApresentacao;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNumPagar;
    private javax.swing.JLabel txtNumReceber;
    private javax.swing.JLabel txtValorPagar;
    private javax.swing.JLabel txtValorReceber;
    // End of variables declaration//GEN-END:variables

    public void montaLayout() {
        ConsultasComplexas consultasComplexas = new ConsultasComplexas();

        try {
            ReceberController recebercontroller = new ReceberController();
            listaReceber = null;
            String apenasVencimentoDesteMes = "financeiro.fin_vencimento > (current_date-31)";
            listaReceber = recebercontroller.consultar(apenasVencimentoDesteMes);
            if (listaReceber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
            } else {
                txtValorReceber.setText("R$ "
                        + consultasComplexas.pagar_Soma(
                                "select sum(fin_total) from financeiro where fin_id in (select fin_id from contas_receber) and fin_vencimento > (current_date-31);"));
                txtNumReceber.setText(listaReceber.size() + " boletos");
                tabelaReceber = new HomeReceberTableModel(listaReceber, colunasReceber);
                tblReceber.setModel(tabelaReceber);
                tblReceber.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta do Usuário \n" + ex.getMessage());
        };

        try {
            PagarController pagarcontroller = new PagarController();
            listaPagar = null;
            String apenasVencimentoDesteMes = "financeiro.fin_vencimento > (current_date-31)";
            listaPagar = pagarcontroller.consultar(apenasVencimentoDesteMes);
            if (listaPagar.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
            } else {
                txtValorPagar.setText("R$ "
                        + consultasComplexas.pagar_Soma(
                                "select sum(fin_total) from financeiro where fin_id in (select fin_id from contas_pagar) and fin_vencimento > (current_date-31);"));
                txtNumPagar.setText(listaPagar.size() + " boletos");
                tabelaPagar = new HomePagarTableModel(listaPagar, colunasPagar);
                tblPagar.setModel(tabelaPagar);
                tblPagar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

                txtNumPagar.setText(listaPagar.size() + " boletos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta do Usuário \n" + ex.getMessage());
        };
    }
}
