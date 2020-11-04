package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FinanceiroTableModel extends AbstractTableModel {

    private ArrayList<? extends FinanceiroModel> linhas;
    String[] colunas;
    private boolean despesa;

    public FinanceiroTableModel(ArrayList<? extends FinanceiroModel> arrayPagamentos, String[] colunas) {
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
        
        testeDespesa();
        if (despesa) {
            PagarModel pagar = (PagarModel) linhas.get(row);
            switch (col) {
                case 0:
                    return pagar.getNota_fiscal();
                case 1:
                    return pagar.getFornecedor().getFOR_NOME();
                case 2:
                    return pagar.getFornecedor().getFOR_CNPJ();
                case 3:
                    return pagar.getFIN_VENCIMENTO();
                case 4:
                    return pagar.getFIN_TOTAL();
                default:
                    return null;
            }
        } else {
            ReceberModel receber = (ReceberModel) linhas.get(row);
            switch (col) {
                case 0:
                    return receber.getNota_fiscal();
                case 1:
                    return receber.getCliente().getCLI_NOME();
                case 2:
                    return receber.getCliente().getCLI_CPF();
                case 3:
                    return receber.getFIN_VENCIMENTO();
                case 4:
                    return receber.getFIN_TOTAL();
                default:
                    return null;
            }
        }
    }

    private void testeDespesa() {
        String tipo = linhas.get(0).getClass().getSimpleName();
        if (tipo.equals("ReceberModel")) {
            despesa = false;
        } else {
            despesa = true;
        }

    }
}
