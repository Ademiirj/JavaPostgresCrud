package util;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FinanceiroModel;
import model.PagarModel;

public class ConsultasComplexas {
    private Connection conexao = null;

    public ConsultasComplexas() {
        this.conexao = Conexao.getConexao();
    }
    public int ultimaAdicao (String id, String tabela) throws SQLException{
        int nada = 0;
        String sql = "select max("+ id +") from "+ tabela +";";
        
        PreparedStatement stm;
        ResultSet rs;
        
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        
        
        while (rs.next()) {
            return(rs.getInt("max"));
        }
        rs.close();
        stm.close();
        
    return nada;
    }

    public double pagar_Soma (String sql) throws SQLException{
        
        ArrayList<String> lista;
        double nada = 0.0;
        
        PreparedStatement stm;
        ResultSet rs;
        
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();
        
        
        while (rs.next()) {
            return(rs.getFloat("sum"));
        }
        rs.close();
        stm.close();
        
    return nada;
    }
}
