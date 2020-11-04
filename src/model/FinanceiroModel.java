package model;

import java.sql.Date;

public class FinanceiroModel {
    private int FIN_ID;
    private int FIN_NUMERO;
    private Date FIN_EMISSAO;
    private Date FIN_VENCIMENTO;
    private Date FIN_PAGAMENTO;
    private double FIN_VALOR;
    private double FIN_JUROS;
    private double FIN_MULTA;
    private double FIN_DESCONTO;
    private double FIN_TOTAL;

    public double getFIN_VALOR() {
        return FIN_VALOR;
    }

    public void setFIN_VALOR(double FIN_VALOR) {
        this.FIN_VALOR = FIN_VALOR;
    }

    public double getFIN_JUROS() {
        return FIN_JUROS;
    }

    public void setFIN_JUROS(double FIN_JUROS) {
        this.FIN_JUROS = FIN_JUROS;
    }

    public double getFIN_MULTA() {
        return FIN_MULTA;
    }

    public void setFIN_MULTA(double FIN_MULTA) {
        this.FIN_MULTA = FIN_MULTA;
    }

    public double getFIN_DESCONTO() {
        return FIN_DESCONTO;
    }

    public void setFIN_DESCONTO(double FIN_DESCONTO) {
        this.FIN_DESCONTO = FIN_DESCONTO;
    }

    public double getFIN_TOTAL() {
        return FIN_TOTAL;
    }

    public void setFIN_TOTAL(double FIN_TOTAL) {
        this.FIN_TOTAL = FIN_TOTAL;
    }

    public FinanceiroModel() {
    }

    public FinanceiroModel(int FIN_ID, int FIN_NUMERO, Date FIN_EMISSAO, Date FIN_VENCIMENTO, Date FIN_PAGAMENTO) {
        this.FIN_ID = FIN_ID;
        this.FIN_NUMERO = FIN_NUMERO;
        this.FIN_EMISSAO = FIN_EMISSAO;
        this.FIN_VENCIMENTO = FIN_VENCIMENTO;
        this.FIN_PAGAMENTO = FIN_PAGAMENTO;
    }

    public int getFIN_ID() {
        return FIN_ID;
    }

    public void setFIN_ID(int FIN_ID) {
        this.FIN_ID = FIN_ID;
    }

    public int getFIN_NUMERO() {
        return FIN_NUMERO;
    }

    public void setFIN_NUMERO(int FIN_NUMERO) {
        this.FIN_NUMERO = FIN_NUMERO;
    }

    public Date getFIN_EMISSAO() {
        return FIN_EMISSAO;
    }

    public void setFIN_EMISSAO(Date FIN_EMISSAO) {
        this.FIN_EMISSAO = FIN_EMISSAO;
    }

    public Date getFIN_VENCIMENTO() {
        return FIN_VENCIMENTO;
    }

    public void setFIN_VENCIMENTO(Date FIN_VENCIMENTO) {
        this.FIN_VENCIMENTO = FIN_VENCIMENTO;
    }

    public Date getFIN_PAGAMENTO() {
        return FIN_PAGAMENTO;
    }

    public void setFIN_PAGAMENTO(Date FIN_PAGAMENTO) {
        this.FIN_PAGAMENTO = FIN_PAGAMENTO;
    }

}
