package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class HomeReceberTableModel extends AbstractTableModel {

    private ArrayList<ReceberModel> linhas;
    String[] colunas;

    public HomeReceberTableModel(ArrayList<ReceberModel> arrayReceber, String[] colunas) {
        this.linhas = arrayReceber;
        this.colunas = colunas;
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        ReceberModel usuario = (ReceberModel) linhas.get(row);
        switch (col) {
            case 0:
                return usuario.getNota_fiscal();
            case 1:
                return usuario.getCliente().getCLI_NOME();
            case 2:
                return usuario.getFIN_TOTAL();
            case 3:
                return usuario.getFIN_PAGAMENTO();
            default:
                return null;
        }
    }

}
