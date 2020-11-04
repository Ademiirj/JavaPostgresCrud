/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import conexao.Conexao;
import view.LoginView;

/**
 *
 * @author celio
 */
public class principal {
    Conexao objconexao;
    LoginView login;

    public principal() {
        objconexao = new Conexao();
        login = new LoginView();
        
    }

    public static void main(String[] args) {
        principal mvc_dao = new principal();
    }

}
