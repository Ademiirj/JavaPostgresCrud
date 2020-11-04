package controller;

import dao.UsuarioDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.UsuarioModel;

public class LoginController {
    private List<UsuarioModel> listausuarios;
    
    public ArrayList<UsuarioModel> consultar(String filtro) throws SQLException {
        listausuarios = new UsuarioDao().consultar(filtro);
        return (ArrayList<UsuarioModel>) listausuarios;
    }
    public void adicionar(UsuarioModel cliente) throws SQLException {
        UsuarioDao dao = new UsuarioDao();
        dao.adicionar(cliente);
    }
}
