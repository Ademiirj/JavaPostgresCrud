package dao;

import conexao.Conexao;
import controller.EnderecoController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ClienteModel;
import model.EnderecoModel;

public class ClienteDao {

    private Connection conexao = null;

    public ClienteDao() {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(ClienteModel cliente) throws SQLException {
        String sql = "insert into cliente(cli_nome, cli_cpf,  cli_email, cli_ddd, cli_telefone, end_id) "
                + " VALUES ( ?, ?, ?, ?, ?, ?)";

        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, cliente.getCLI_NOME());
        stm.setInt(2, cliente.getCLI_CPF());
        stm.setString(3, cliente.getCLI_EMAIL());
        stm.setInt(4, cliente.getCLI_DDD());
        stm.setInt(5, cliente.getCLI_TELEFONE());
        stm.setInt(6, cliente.getCLI_ENDERECO().getEND_ID());
        stm.execute();
        stm.close();
    }

    public void alterar(ClienteModel cliente) throws SQLException {
        String sql = "UPDATE cliente SET CLI_NOME = ?, "
                + "CLI_TELEFONE = ?, CLI_EMAIL = ?, CLI_CPF = ?, CLI_DDD = ?,"
                + "END_ID = ? WHERE CLI_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, cliente.getCLI_NOME());
        stm.setInt(2, cliente.getCLI_TELEFONE());
        stm.setString(3, cliente.getCLI_EMAIL());
        stm.setInt(4, cliente.getCLI_CPF());
        stm.setInt(5, cliente.getCLI_DDD());
        stm.setInt(6, cliente.getCLI_ENDERECO().getEND_ID());
        stm.setInt(7, cliente.getCLI_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(ClienteModel cliente) throws SQLException {
        String sql = "DELETE FROM cliente WHERE CLI_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getCLI_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<ClienteModel> consultar(String condicao) throws SQLException {
        ArrayList<ClienteModel> lista = null;
        EnderecoModel objendereco;
        

        PreparedStatement stm;
        ResultSet rs;
        String sql = "select * from cliente inner join endereco on cliente.end_id = endereco.end_id";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }

        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            ClienteModel obcli = new ClienteModel();
            objendereco = new EnderecoModel();

            obcli.setCLI_ID(rs.getInt("CLI_ID"));
            obcli.setCLI_NOME(rs.getString("CLI_NOME"));
            obcli.setCLI_CPF(rs.getInt("CLI_CPF"));
            obcli.setCLI_EMAIL(rs.getString("CLI_EMAIL"));
            obcli.setCLI_DDD(rs.getInt("CLI_DDD"));
            obcli.setCLI_TELEFONE(rs.getInt("CLI_TELEFONE"));

            objendereco.setEND_ID(rs.getInt("END_ID"));
            objendereco.setEND_RUA(rs.getString("END_RUA"));
            objendereco.setEND_NUMERO(rs.getInt("END_NUMERO"));
            objendereco.setEND_CEP(rs.getInt("END_CEP"));
            objendereco.setEND_CIDADE(rs.getString("END_CIDADE"));
            objendereco.setEND_ESTADO(rs.getString("END_ESTADO"));
            
            obcli.setCLI_ENDERECO(objendereco);

            lista.add(obcli);
        }
        rs.close();
        stm.close();

        return lista;
    }
}
