package controller;

import dao.FinanceiroDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FinanceiroModel;

public class FinanceiroController {

    private List<FinanceiroModel> listaFinanceiros;

    public ArrayList<FinanceiroModel> consultar(String filtro) throws SQLException {
        listaFinanceiros = new FinanceiroDao().consultar(filtro);
        return (ArrayList<FinanceiroModel>) listaFinanceiros;
    }

    public void adicionar(FinanceiroModel financeiro) throws SQLException {
        FinanceiroDao dao = new FinanceiroDao();
        dao.adicionar(financeiro);
    }

    public void alterar(FinanceiroModel financeiro) throws SQLException {
        FinanceiroDao dao = new FinanceiroDao();
        dao.alterar(financeiro);
    }

    public void excluir(FinanceiroModel financeiro) throws SQLException {
        FinanceiroDao dao = new FinanceiroDao();
        dao.excluir(financeiro);
    }

    public void gravar(String operacao, FinanceiroModel financeiro) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(financeiro);
        } else if (operacao.equals("alterar")) {
            alterar(financeiro);
        }
    }
}
