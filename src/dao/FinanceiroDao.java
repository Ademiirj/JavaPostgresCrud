package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FinanceiroModel;

public class FinanceiroDao {
    private Connection conexao = null;

    public FinanceiroDao() {
        this.conexao = Conexao.getConexao();
    }
    public void adicionar (FinanceiroModel financeiro) throws SQLException{
        String sql = "insert into financeiro (fin_numero, fin_emissao, fin_vencimento, fin_pagamento, fin_valor, fin_juros, fin_multa, fin_desconto, fin_total)"
                + " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, financeiro.getFIN_NUMERO());
        stm.setDate(2, financeiro.getFIN_EMISSAO());
        stm.setDate(3, financeiro.getFIN_VENCIMENTO());
        stm.setDate(4, financeiro.getFIN_PAGAMENTO());
        stm.setDouble(5, financeiro.getFIN_VALOR());
        stm.setDouble(6, financeiro.getFIN_JUROS());
        stm.setDouble(7, financeiro.getFIN_MULTA());
        stm.setDouble(8, financeiro.getFIN_DESCONTO());
        stm.setDouble(9, financeiro.getFIN_TOTAL());
        
        stm.execute();
        stm.close();
    }
    public void alterar(FinanceiroModel financeiro) throws SQLException {
        String sql = "UPDATE financeiro SET fin_numero = ?, fin_emissao = ?, "
                + "fin_vencimento = ?, fin_pagamento = ?, fin_valor = ?, fin_juros = ?, "
                + "fin_multa = ?, fin_desconto = ?, fin_total = ?  WHERE fin_id = ?";
        
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, financeiro.getFIN_NUMERO());
        stm.setDate(2, financeiro.getFIN_EMISSAO());
        stm.setDate(3, financeiro.getFIN_VENCIMENTO());
        stm.setDate(4, financeiro.getFIN_PAGAMENTO());
        stm.setDouble(5, financeiro.getFIN_VALOR());
        stm.setDouble(6, financeiro.getFIN_JUROS());
        stm.setDouble(7, financeiro.getFIN_MULTA());
        stm.setDouble(8, financeiro.getFIN_DESCONTO());
        stm.setDouble(9, financeiro.getFIN_TOTAL());
        stm.setInt(10, financeiro.getFIN_ID());
        stm.execute();
        stm.close();
    }
    public void excluir(FinanceiroModel financeiro) throws SQLException {
        String sql = "DELETE FROM financeiro WHERE FIN_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, financeiro.getFIN_ID());
        stm.execute();
        stm.close();
    }
    
    public ArrayList<FinanceiroModel> consultar (String condicao) throws SQLException{
        ArrayList<FinanceiroModel> lista = null;
        
        PreparedStatement stm;
        ResultSet rs;
        String sql = "select * from financeiro";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();
        
        while (rs.next()) {
            FinanceiroModel objfor = new FinanceiroModel();
            
            objfor.setFIN_ID(rs.getInt("FIN_ID"));
            objfor.setFIN_NUMERO(rs.getInt("FIN_NUMERO"));
            objfor.setFIN_EMISSAO(rs.getDate("FIN_EMISSAO"));
            objfor.setFIN_VENCIMENTO(rs.getDate("FIN_VENCIMENTO"));
            objfor.setFIN_PAGAMENTO(rs.getDate("FIN_PAGAMENTO"));
            objfor.setFIN_VALOR(rs.getDouble("FIN_VALOR"));
            objfor.setFIN_JUROS(rs.getDouble("FIN_JUROS"));
            objfor.setFIN_MULTA(rs.getDouble("FIN_MULTA"));
            objfor.setFIN_DESCONTO(rs.getDouble("FIN_DESCONTO"));
            objfor.setFIN_TOTAL(rs.getDouble("FIN_TOTAL"));
            lista.add(objfor);
        }
        rs.close();
        stm.close();
        
        return lista;
    }
}
