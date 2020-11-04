package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
/****   CONEXÃO POSTGRESQL   */
    private final static String DRIVER = "org.postgresql.Driver";
    private final static String BANCO = "jdbc:postgresql://localhost/atividade_java";
    private final static String USUARIO = "postgres";
    private final static String SENHA = "senha";
    
    private static Connection conexao;

    public Conexao() {
        try {            
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(BANCO, USUARIO, SENHA);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Classe de Conexao do Banco. \n" + ex.getMessage());
            conexao = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco.\n" + ex.getMessage());
            conexao = null;
        }
    }

    public static Connection getConexao() {
        return conexao;
    }

    public void desconectar() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Falha ao fechar conexao.\n" + ex.getMessage());
        }
    }
}
