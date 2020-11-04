package controller;

import dao.EnderecoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.EnderecoModel;

public class EnderecoController {

    private List<EnderecoModel> listaEnderecos;

    public ArrayList<EnderecoModel> consultar(String filtro) throws SQLException {
        listaEnderecos = new EnderecoDao().consultar(filtro);
        return (ArrayList<EnderecoModel>) listaEnderecos;
    }

    public void adicionar(EnderecoModel endereco) throws SQLException {
        EnderecoDao dao = new EnderecoDao();
        dao.adicionar(endereco);
    }

    public void alterar(EnderecoModel endereco) throws SQLException {
        EnderecoDao dao = new EnderecoDao();
        dao.alterar(endereco);
    }

    public void excluir(EnderecoModel endereco) throws SQLException {
        EnderecoDao dao = new EnderecoDao();
        dao.excluir(endereco);
    }

    public void gravar(String operacao, EnderecoModel endereco) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(endereco);
        } else if (operacao.equals("alterar")) {
            alterar(endereco);
        }
    }

}
