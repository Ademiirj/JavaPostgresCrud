package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class HomePagarTableModel extends AbstractTableModel {
    

    private ArrayList<PagarModel> linhas;
    String[] colunas;

    public HomePagarTableModel(ArrayList<PagarModel> arrayPagamentos, String[] colunas) {
        this.linhas = arrayPagamentos;
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
        PagarModel pagar = (PagarModel) linhas.get(row);
        switch (col) {
            case 0:
                return pagar.getNota_fiscal();
            case 1:
                return pagar.getFornecedor().getFOR_NOME();
            case 2:
                return pagar.getFIN_TOTAL();
            case 3:
                return pagar.getFIN_PAGAMENTO();
            default:
                return null;
        }
    }

    
}
