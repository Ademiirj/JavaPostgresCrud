package dao;

import conexao.Conexao;
import controller.FinanceiroController;
import controller.FornecedorController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FinanceiroModel;
import model.FornecedorModel;
import model.PagarModel;

public class PagarDao {
    
    private Connection conexao = null;

    public PagarDao() {
        this.conexao = Conexao.getConexao();
    }
    public void adicionar (PagarModel pagar) throws SQLException{
        String sql = "insert into contas_pagar (for_id, fin_id, nota_fiscal)"
                + " VALUES ( ?, ?, ?)";
        
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, pagar.getFOR_ID());
        stm.setInt(2, pagar.getFIN_ID());
        stm.setString(3, pagar.getNota_fiscal());
        stm.execute();
        stm.close();
    }
    public void alterar(PagarModel pagar) throws SQLException {
        String sql = "UPDATE contas_pagar SET for_id = ? ,nota_fiscal = ? WHERE fin_id = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, pagar.getFOR_ID());
        stm.setString(2, pagar.getNota_fiscal());
        stm.setInt(3, pagar.getFIN_ID());
        stm.execute();
        stm.close();
    }
    public void excluir(PagarModel pagar) throws SQLException {
        String sql = "DELETE FROM contas_pagar WHERE fin_id = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, pagar.getFIN_ID());
        stm.execute();
        stm.close();
    }
    
    public ArrayList<PagarModel> consultar (String condicao) throws SQLException{
        ArrayList<PagarModel> lista = null;
        FornecedorModel fornecedor;
        
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM contas_pagar inner JOIN financeiro on contas_pagar.fin_id = financeiro.fin_id inner JOIN fornecedor on contas_pagar.for_id = fornecedor.for_id ";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();
        
        
        while (rs.next()) {
            PagarModel objpagar = new PagarModel();
            fornecedor = new FornecedorModel(); 
            
            objpagar.setFIN_ID(rs.getInt("FIN_ID"));
            objpagar.setFIN_NUMERO(rs.getInt("FIN_NUMERO"));
            objpagar.setFIN_EMISSAO(rs.getDate("FIN_EMISSAO"));
            objpagar.setFIN_VENCIMENTO(rs.getDate("FIN_VENCIMENTO"));
            objpagar.setFIN_PAGAMENTO(rs.getDate("FIN_PAGAMENTO"));
            objpagar.setFIN_VALOR(rs.getDouble("FIN_VALOR"));
            objpagar.setFIN_JUROS(rs.getDouble("FIN_JUROS"));
            objpagar.setFIN_MULTA(rs.getDouble("FIN_MULTA"));
            objpagar.setFIN_DESCONTO(rs.getDouble("FIN_DESCONTO"));
            objpagar.setFIN_TOTAL(rs.getDouble("FIN_TOTAL"));
            
            fornecedor.setFOR_ID(rs.getInt("FOR_ID"));
            fornecedor.setFOR_NOME(rs.getString("FOR_NOME"));
            fornecedor.setFOR_RAZAO(rs.getString("FOR_RAZAO"));
            fornecedor.setFOR_TELEFONE(rs.getInt("FOR_TELEFONE"));
            fornecedor.setFOR_EMAIL(rs.getString("FOR_EMAIL"));
            fornecedor.setFOR_CNPJ(rs.getInt("FOR_CNPJ"));
            fornecedor.setFOR_DDD(rs.getInt("FOR_DDD"));
            
            objpagar.setFornecedor(fornecedor);
            objpagar.setNota_fiscal(rs.getString("nota_fiscal"));
            
            
            lista.add(objpagar);
        }
        rs.close();
        stm.close();
        
        return lista;
    }
}
