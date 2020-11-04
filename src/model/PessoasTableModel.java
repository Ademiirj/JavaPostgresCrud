package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class PessoasTableModel extends AbstractTableModel {

    private ArrayList linhas;
    String[] colunas;
    private boolean fornecedor;

    public PessoasTableModel(ArrayList arrayPessoas, String[] colunas) {
        this.linhas = arrayPessoas;
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
        if (fornecedor) {
            FornecedorModel fornecedor = (FornecedorModel) linhas.get(row);
//            {"Identificação", "Nome", "Documento", "Email", "Telefone", "Cidade"}
            switch (col) {
                case 0:
                    return fornecedor.getFOR_ID();
                case 1:
                    return fornecedor.getFOR_NOME();
                case 2:
                    return fornecedor.getFOR_CNPJ();
                case 3:
                    return fornecedor.getFOR_EMAIL();
                case 4:
                    return "("+fornecedor.getFOR_DDD()+")" + fornecedor.getFOR_TELEFONE();
                case 5:
                    return fornecedor.getFOR_ENDERECO().getEND_CIDADE();
                default:
                    return null;
            }
        } else {
            ClienteModel cliente = (ClienteModel) linhas.get(row);
            switch (col) {
                case 0:
                    return cliente.getCLI_ID();
                case 1:
                    return cliente.getCLI_NOME();
                case 2:
                    return cliente.getCLI_CPF();
                case 3:
                    return cliente.getCLI_EMAIL();
                case 4:
                    return "("+cliente.getCLI_DDD()+")" + cliente.getCLI_TELEFONE();
                case 5:
                    return cliente.getCLI_ENDERECO().getEND_CIDADE();
                default:
                    return null;
            }
        }
    }

    private void testeDespesa() {
        String tipo = linhas.get(0).getClass().getSimpleName();
        if (tipo.equals("ClienteModel")) {
            fornecedor = false;
        } else {
            fornecedor = true;
        }

    }
}
