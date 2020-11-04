package model;
public class FornecedorModel{
    
    private int FOR_ID;
    private int FOR_DDD;
    private int FOR_TELEFONE;
    private int FOR_CNPJ;
    private String FOR_NOME;
    private String FOR_RAZAO;
    private String FOR_EMAIL;
    private EnderecoModel FOR_ENDERECO;
    

    public FornecedorModel() {
        this.FOR_ENDERECO = new EnderecoModel();
    }

    public FornecedorModel(int FOR_ID, String FOR_NOME, String FOR_RAZAO, int FOR_CNPJ, String FOR_EMAIL, int FOR_DDD, int FOR_TELEFONE) {
        this.FOR_ID = FOR_ID;
        this.FOR_NOME = FOR_NOME;
        this.FOR_RAZAO = FOR_RAZAO;
        this.FOR_CNPJ = FOR_CNPJ;
        this.FOR_EMAIL = FOR_EMAIL;
        this.FOR_DDD = FOR_DDD;
        this.FOR_TELEFONE = FOR_TELEFONE;
    }
    
    public int getFOR_ID() {
        return FOR_ID;
    }

    /**
     * @param FOR_ID the FOR_ID to set
     */
    public void setFOR_ID(int FOR_ID) {
        this.FOR_ID = FOR_ID;
    }
    
    public void setFOR_ENDERECO(EnderecoModel endereco) {
        FOR_ENDERECO = endereco;
    }
    
    public EnderecoModel getFOR_ENDERECO() {
        return FOR_ENDERECO;
    }
    
    public void setEND_ID(int END_ID) {
        FOR_ENDERECO.setEND_ID(END_ID);
    }
    
    public int getEND_ID() {
        return FOR_ENDERECO.getEND_ID();
    }

    /**
     * @return the FOR_NOME
     */
    public String getFOR_NOME() {
        return FOR_NOME;
    }

    /**
     * @param FOR_NOME the FOR_NOME to set
     */
    public void setFOR_NOME(String FOR_NOME) {
        this.FOR_NOME = FOR_NOME;
    }

    /**
     * @return the FOR_RAZAO
     */
    public String getFOR_RAZAO() {
        return FOR_RAZAO;
    }

    /**
     * @param FOR_RAZAO the FOR_RAZAO to set
     */
    public void setFOR_RAZAO(String FOR_RAZAO) {
        this.FOR_RAZAO = FOR_RAZAO;
    }

    /**
     * @return the FOR_CNPJ
     */
    public int getFOR_CNPJ() {
        return FOR_CNPJ;
    }

    /**
     * @param FOR_CNPJ the FOR_CNPJ to set
     */
    public void setFOR_CNPJ(int FOR_CNPJ) {
        this.FOR_CNPJ = FOR_CNPJ;
    }

    /**
     * @return the FOR_EMAIL
     */
    public String getFOR_EMAIL() {
        return FOR_EMAIL;
    }

    /**
     * @param FOR_EMAIL the FOR_EMAIL to set
     */
    public void setFOR_EMAIL(String FOR_EMAIL) {
        this.FOR_EMAIL = FOR_EMAIL;
    }

    /**
     * @return the FOR_DDD
     */
    public int getFOR_DDD() {
        return FOR_DDD;
    }

    /**
     * @param FOR_DDD the FOR_DDD to set
     */
    public void setFOR_DDD(int FOR_DDD) {
        this.FOR_DDD = FOR_DDD;
    }

    /**
     * @return the FOR_TELEFONE
     */
    public int getFOR_TELEFONE() {
        return FOR_TELEFONE;
    }

    /**
     * @param FOR_TELEFONE the FOR_TELEFONE to set
     */
    public void setFOR_TELEFONE(int FOR_TELEFONE) {
        this.FOR_TELEFONE = FOR_TELEFONE;
    }
}