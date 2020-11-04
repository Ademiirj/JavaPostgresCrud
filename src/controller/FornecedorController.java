package controller;

import dao.FornecedorDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FornecedorModel;


public class FornecedorController {

    private List<FornecedorModel> listaFornecedores;

    public ArrayList<FornecedorModel> consultar(String filtro) throws SQLException {
        listaFornecedores = new FornecedorDao().consultar(filtro);
        return (ArrayList<FornecedorModel>) listaFornecedores;
    }

    public void adicionar(FornecedorModel cliente) throws SQLException {
        FornecedorDao dao = new FornecedorDao();
        dao.adicionar(cliente);
    }

    public void alterar(FornecedorModel fornecedor) throws SQLException {
        FornecedorDao dao = new FornecedorDao();
        dao.alterar(fornecedor);
    }

    public void excluir(FornecedorModel cliente) throws SQLException {
        FornecedorDao dao = new FornecedorDao();
        dao.excluir(cliente);
    }

    public void gravar(String operacao, FornecedorModel cliente) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(cliente);
        } else if (operacao.equals("alterar")) {
            alterar(cliente);
        }
    }
    
}
