package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.EnderecoModel;

public class EnderecoDao {

    private Connection conexao = null;

    public EnderecoDao() {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(EnderecoModel endereco) throws SQLException {
        String sql = "insert into endereco (end_rua, end_numero, end_cep, end_cidade, end_estado)"
                + " VALUES ( ?, ?, ?, ?, ?)";

        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, endereco.getEND_RUA());
        stm.setInt(2, endereco.getEND_NUMERO());
        stm.setInt(3, endereco.getEND_CEP());
        stm.setString(4, endereco.getEND_CIDADE());
        stm.setString(5, endereco.getEND_ESTADO());
        stm.execute();
        stm.close();
    }

    public void alterar(EnderecoModel endereco) throws SQLException {
        String sql = "UPDATE endereco SET end_rua = ?, end_numero = ?, "
                + "end_cep = ?, end_cidade = ?, end_estado = ? WHERE end_id = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, endereco.getEND_RUA());
        stm.setInt(2, endereco.getEND_NUMERO());
        stm.setInt(3, endereco.getEND_CEP());
        stm.setString(4, endereco.getEND_CIDADE());
        stm.setString(5, endereco.getEND_ESTADO());
        stm.setInt(6, endereco.getEND_ID());
        stm.execute();
        stm.close();
    }

    public void excluir(EnderecoModel endereco) throws SQLException {
        String sql = "DELETE FROM endereco WHERE END_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, endereco.getEND_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<EnderecoModel> consultar(String condicao) throws SQLException {
        ArrayList<EnderecoModel> lista = null;

        PreparedStatement stm;
        ResultSet rs;
        String sql = "select * from endereco";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }

        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            EnderecoModel objendereco = new EnderecoModel();

            objendereco.setEND_ID(rs.getInt("END_ID"));
            objendereco.setEND_RUA(rs.getString("END_RUA"));
            objendereco.setEND_NUMERO(rs.getInt("END_NUMERO"));
            objendereco.setEND_CEP(rs.getInt("END_CEP"));
            objendereco.setEND_CIDADE(rs.getString("END_CIDADE"));
            objendereco.setEND_ESTADO(rs.getString("END_ESTADO"));
            lista.add(objendereco);
        }
        rs.close();
        stm.close();

        return lista;
    }
    public ArrayList<EnderecoModel> consultarComPessoa(String condicao) throws SQLException {
        ArrayList<EnderecoModel> lista = null;

        PreparedStatement stm;
        ResultSet rs;
        String sql = "select * from endereco";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }

        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            EnderecoModel objendereco = new EnderecoModel();

            objendereco.setEND_ID(rs.getInt("END_ID"));
            objendereco.setEND_RUA(rs.getString("END_RUA"));
            objendereco.setEND_NUMERO(rs.getInt("END_NUMERO"));
            objendereco.setEND_CEP(rs.getInt("END_CEP"));
            objendereco.setEND_CIDADE(rs.getString("END_CIDADE"));
            objendereco.setEND_ESTADO(rs.getString("END_ESTADO"));
            lista.add(objendereco);
        }
        rs.close();
        stm.close();

        return lista;
    }
}
