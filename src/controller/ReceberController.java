package controller;

import dao.ReceberDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ReceberModel;

public class ReceberController {
    
    

    private List<ReceberModel> listaReceber;

    public ArrayList<ReceberModel> consultar(String filtro) throws SQLException {
        listaReceber = new ReceberDao().consultar(filtro);
        return (ArrayList<ReceberModel>) listaReceber;
    }

    public void adicionar(ReceberModel receber) throws SQLException {
        ReceberDao dao = new ReceberDao();
        dao.adicionar(receber);
    }

    public void alterar(ReceberModel receber) throws SQLException {
        ReceberDao dao = new ReceberDao();
        dao.alterar(receber);
    }

    public void excluir(ReceberModel receber) throws SQLException {
        ReceberDao dao = new ReceberDao();
        dao.excluir(receber);
    }

    public void gravar(String operacao, ReceberModel receber) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(receber);
        } else if (operacao.equals("alterar")) {
            alterar(receber);
        }
    }
    
}
