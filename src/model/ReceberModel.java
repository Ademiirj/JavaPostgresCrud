package model;
public class ReceberModel extends FinanceiroModel {
    
    ClienteModel cliente;
    String nota_fiscal;

    public ReceberModel() {
        cliente = new ClienteModel();
    }

    public ReceberModel(ClienteModel cliente, String nota_fiscal) {
        this.cliente = cliente;
        this.nota_fiscal = nota_fiscal;
    }
    
    public int getCLI_ID() {
        return cliente.getCLI_ID();
    }

    public void setCLI_ID(int CLI_ID) {
        cliente.setCLI_ID(CLI_ID);
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

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }
    
    
}
