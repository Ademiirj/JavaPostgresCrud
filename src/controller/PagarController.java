package controller;

import dao.PagarDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.PagarModel;

public class PagarController {
    

    private List<PagarModel> listaFornecedores;

    public ArrayList<PagarModel> consultar(String filtro) throws SQLException {
        listaFornecedores = new PagarDao().consultar(filtro);
        return (ArrayList<PagarModel>) listaFornecedores;
    }

    public void adicionar(PagarModel pagar) throws SQLException {
        PagarDao dao = new PagarDao();
        dao.adicionar(pagar);
    }

    public void alterar(PagarModel pagar) throws SQLException {
        PagarDao dao = new PagarDao();
        dao.alterar(pagar);
    }

    public void excluir(PagarModel pagar) throws SQLException {
        PagarDao dao = new PagarDao();
        dao.excluir(pagar);
    }

    public void gravar(String operacao, PagarModel pagar) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(pagar);
        } else if (operacao.equals("alterar")) {
            alterar(pagar);
        }
    }
    
}
