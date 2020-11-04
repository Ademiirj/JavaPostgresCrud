package dao;

import conexao.Conexao;
import controller.ClienteController;
import controller.FinanceiroController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteModel;
import model.FinanceiroModel;
import model.ReceberModel;

public class ReceberDao {
    
    private Connection conexao = null;

    public ReceberDao() {
        this.conexao = Conexao.getConexao();
    }
    public void adicionar (ReceberModel receber) throws SQLException{
        String sql = "insert into contas_receber (cli_id, fin_id, nota_fiscal)"
                + " VALUES ( ?, ?, ?)";
        
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, receber.getCliente().getCLI_ID());
        stm.setInt(2, receber.getFIN_ID());
        stm.setString(3, receber.getNota_fiscal());
        stm.execute();
        stm.close();
    }
    public void alterar(ReceberModel receber) throws SQLException {
        String sql = "UPDATE contas_receber SET cli_id = ? ,nota_fiscal = ? WHERE fin_id = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, receber.getFIN_ID());
        stm.setString(2, receber.getNota_fiscal());
        stm.setInt(3, receber.getCliente().getCLI_ID());
        stm.execute();
        stm.close();
    }
    public void excluir(ReceberModel receber) throws SQLException {
        String sql = "DELETE FROM contas_receber WHERE fin_id = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, receber.getFIN_ID());
        stm.execute();
        stm.close();
    }
    
    public ArrayList<ReceberModel> consultar (String condicao) throws SQLException{
        ArrayList<ReceberModel> lista = null;
        ClienteModel cliente;
        
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM contas_receber inner JOIN financeiro on contas_receber.fin_id = financeiro.fin_id inner JOIN cliente on contas_receber.cli_id = cliente.cli_id ";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        
        System.out.println(sql);
        
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();
        
        
        while (rs.next()) {
            ReceberModel objreceber= new ReceberModel();
            cliente = new ClienteModel(); 
            
            objreceber.setFIN_ID(rs.getInt("FIN_ID"));
            objreceber.setFIN_NUMERO(rs.getInt("FIN_NUMERO"));
            objreceber.setFIN_EMISSAO(rs.getDate("FIN_EMISSAO"));
            objreceber.setFIN_VENCIMENTO(rs.getDate("FIN_VENCIMENTO"));
            objreceber.setFIN_PAGAMENTO(rs.getDate("FIN_PAGAMENTO"));
            objreceber.setFIN_VALOR(rs.getDouble("FIN_VALOR"));
            objreceber.setFIN_JUROS(rs.getDouble("FIN_JUROS"));
            objreceber.setFIN_MULTA(rs.getDouble("FIN_MULTA"));
            objreceber.setFIN_DESCONTO(rs.getDouble("FIN_DESCONTO"));
            objreceber.setFIN_TOTAL(rs.getDouble("FIN_TOTAL"));
            
            cliente.setCLI_ID(rs.getInt("CLI_ID"));
            cliente.setCLI_NOME(rs.getString("CLI_NOME"));
            cliente.setCLI_TELEFONE(rs.getInt("CLI_TELEFONE"));
            cliente.setCLI_EMAIL(rs.getString("CLI_EMAIL"));
            cliente.setCLI_CPF(rs.getInt("CLI_CPF"));
            cliente.setCLI_DDD(rs.getInt("CLI_DDD"));
            
            objreceber.setCliente(cliente);
            objreceber.setNota_fiscal(rs.getString("nota_fiscal"));
            
            
            lista.add(objreceber);
        }
        rs.close();
        stm.close();
        
        return lista;
    }
    
}
