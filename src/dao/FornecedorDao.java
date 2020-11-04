package dao;

import conexao.Conexao;
import controller.EnderecoController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.EnderecoModel;
import model.FornecedorModel;

public class FornecedorDao {
    
    private Connection conexao = null;

    public FornecedorDao() {
        this.conexao = Conexao.getConexao();
    }
    public void adicionar (FornecedorModel fornecedor) throws SQLException{
//        insert into fornecedor(for_nome, for_razao, for_telefone, for_email, for_cnpj, for_ddd, for_id) 
        String sql = "insert into fornecedor(for_nome, for_razao, for_telefone, for_email, for_cnpj, for_ddd, end_id) "
                + " VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, fornecedor.getFOR_NOME());
        stm.setString(2, fornecedor.getFOR_RAZAO());
        stm.setInt(3, fornecedor.getFOR_TELEFONE());
        stm.setString(4, fornecedor.getFOR_EMAIL());
        stm.setInt(5, fornecedor.getFOR_CNPJ());
        stm.setInt(6, fornecedor.getFOR_DDD());
        stm.setInt(7, fornecedor.getEND_ID());
        stm.execute();
        stm.close();
    }
    public void alterar(FornecedorModel fornecedor) throws SQLException {
        String sql = "UPDATE fornecedor SET FOR_NOME = ?, FOR_RAZAO = ?, "
                + "FOR_TELEFONE = ?, FOR_EMAIL = ?, FOR_CNPJ = ?, FOR_DDD = ?,"
                + "END_ID = ?  WHERE FOR_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, fornecedor.getFOR_NOME());
        stm.setString(2, fornecedor.getFOR_RAZAO());
        stm.setInt(3, fornecedor.getFOR_TELEFONE());
        stm.setString(4, fornecedor.getFOR_EMAIL());
        stm.setInt(5, fornecedor.getFOR_CNPJ());
        stm.setInt(6, fornecedor.getFOR_DDD());
        stm.setInt(7, fornecedor.getEND_ID());
        stm.setInt(8, fornecedor.getFOR_ID());
        stm.execute();
        stm.close();
    }
    public void excluir(FornecedorModel fornecedor) throws SQLException {
        String sql = "DELETE FROM fornecedor WHERE FOR_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, fornecedor.getFOR_ID());
        stm.execute();
        stm.close();
    }
    
    public ArrayList<FornecedorModel> consultar (String condicao) throws SQLException{
        ArrayList<FornecedorModel> lista = null;
        EnderecoModel objendereco;
        
        PreparedStatement stm;
        ResultSet rs;
        String sql = "select * from fornecedor inner join endereco on fornecedor.end_id = endereco.end_id";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();
        
        
        
        while (rs.next()) {
            FornecedorModel objfor = new FornecedorModel();
            objendereco = new EnderecoModel();
            
            objfor.setFOR_ID(rs.getInt("FOR_ID"));
            objfor.setFOR_NOME(rs.getString("FOR_NOME"));
            objfor.setFOR_RAZAO(rs.getString("FOR_RAZAO"));
            objfor.setFOR_TELEFONE(rs.getInt("FOR_TELEFONE"));
            objfor.setFOR_EMAIL(rs.getString("FOR_EMAIL"));
            objfor.setFOR_CNPJ(rs.getInt("FOR_CNPJ"));
            objfor.setFOR_DDD(rs.getInt("FOR_DDD"));
            
            objendereco.setEND_ID(rs.getInt("END_ID"));
            objendereco.setEND_RUA(rs.getString("END_RUA"));
            objendereco.setEND_NUMERO(rs.getInt("END_NUMERO"));
            objendereco.setEND_CEP(rs.getInt("END_CEP"));
            objendereco.setEND_CIDADE(rs.getString("END_CIDADE"));
            objendereco.setEND_ESTADO(rs.getString("END_ESTADO"));
            
            objfor.setFOR_ENDERECO(objendereco);
            
            
            lista.add(objfor);
        }
        rs.close();
        stm.close();
        
        return lista;
    }
}
