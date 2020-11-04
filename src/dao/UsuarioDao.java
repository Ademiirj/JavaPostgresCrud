package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.UsuarioModel;

public class UsuarioDao {
    private Connection conexao = null;

    public UsuarioDao() {
        this.conexao = Conexao.getConexao();
    }
    
    public void adicionar (UsuarioModel usuario) throws SQLException{
        String sql = "insert into usuario (usu_nome,usu_email,usu_login,usu_senha)"
                + " VALUES ( ?, ?, ?, ?)";
        
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, usuario.getUSU_NOME());
        stm.setString(2, usuario.getUSU_EMAIL());
        stm.setString(3, usuario.getUSU_LOGIN());
        stm.setString(4, usuario.getUSU_SENHA());
        stm.execute();
        stm.close();
    }
    
    public ArrayList<UsuarioModel> consultar (String condicao) throws SQLException{
        ArrayList<UsuarioModel> lista = null;
        
        PreparedStatement stm;
        ResultSet rs;
        String sql = "select * from usuario";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();
        
        while (rs.next()) {
            UsuarioModel objusu = new UsuarioModel();
            objusu.setUSU_ID(rs.getInt("USU_ID"));
            objusu.setUSU_NOME(rs.getString("USU_NOME"));
            objusu.setUSU_EMAIL(rs.getString("USU_EMAIL"));
            objusu.setUSU_LOGIN(rs.getString("USU_LOGIN"));
            objusu.setUSU_SENHA(rs.getString("USU_SENHA"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        
        return lista;
    }
    
    
    
}
