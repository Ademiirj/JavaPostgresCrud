package model;

public class PagarModel extends FinanceiroModel {

    FornecedorModel fornecedor;
    String nota_fiscal;
    int FOR_ID;

    public PagarModel() {
        FornecedorModel fornecedor = new FornecedorModel();
    }
    
    public void setFinanceiroInfo(FinanceiroModel financeiro){
        setFIN_ID(financeiro.getFIN_ID()); 
        setFIN_NUMERO(financeiro.getFIN_NUMERO()); 
        setFIN_EMISSAO(financeiro.getFIN_EMISSAO()); 
        setFIN_VENCIMENTO(financeiro.getFIN_VENCIMENTO()); 
        setFIN_PAGAMENTO(financeiro.getFIN_PAGAMENTO()); 
        setFIN_VALOR(financeiro.getFIN_VALOR()); 
        setFIN_JUROS(financeiro.getFIN_JUROS()); 
        setFIN_MULTA(financeiro.getFIN_MULTA()); 
        setFIN_DESCONTO(financeiro.getFIN_DESCONTO()); 
        setFIN_TOTAL(financeiro.getFIN_TOTAL()); 
    }

    public int getFOR_ID() {
        return FOR_ID;
    }

    public void setFOR_ID(int FOR_ID) {
        this.FOR_ID = FOR_ID;
    }

    public PagarModel(FornecedorModel fornecedor, String nota_fiscal) {
        this.fornecedor = fornecedor;
        this.nota_fiscal = nota_fiscal;
    }

    public FornecedorModel getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

}
