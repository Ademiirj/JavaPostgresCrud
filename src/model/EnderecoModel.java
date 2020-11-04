package model;




public class EnderecoModel {
    private int END_ID;
    private String END_RUA;
    private int END_NUMERO;
    private String END_CIDADE;
    private String END_ESTADO;
    private int END_CEP;
    
    
   

    public EnderecoModel() {
    }

    public EnderecoModel(int END_ID, String END_RUA, int END_NUMERO, String END_CIDADE, String END_ESTADO, int END_CEP) {
        this.END_ID = END_ID;
        this.END_RUA = END_RUA;
        this.END_NUMERO = END_NUMERO;
        this.END_CIDADE = END_CIDADE;
        this.END_ESTADO = END_ESTADO;
        this.END_CEP = END_CEP;
    }
    
    public String buscaEndereco(){
        String enderecoCompleto = "Rua: " + END_RUA + " " + END_NUMERO +  "\nCidade: " + END_CIDADE  + " " + END_ESTADO +"\nCep: " + END_CEP;
        
        return enderecoCompleto;
    }

    /**
     * @return the END_ID
     */
    public int getEND_ID() {
        return END_ID;
    }

    /**
     * @param END_ID the END_ID to set
     */
    public void setEND_ID(int END_ID) {
        this.END_ID = END_ID;
    }

    /**
     * @return the END_RUA
     */
    public String getEND_RUA() {
        return END_RUA;
    }

    /**
     * @param END_RUA the END_RUA to set
     */
    public void setEND_RUA(String END_RUA) {
        this.END_RUA = END_RUA;
    }

    /**
     * @return the END_NUMERO
     */
    public int getEND_NUMERO() {
        return END_NUMERO;
    }

    /**
     * @param END_NUMERO the END_NUMERO to set
     */
    public void setEND_NUMERO(int END_NUMERO) {
        this.END_NUMERO = END_NUMERO;
    }

    /**
     * @return the END_CIDADE
     */
    public String getEND_CIDADE() {
        return END_CIDADE;
    }

    /**
     * @param END_CIDADE the END_CIDADE to set
     */
    public void setEND_CIDADE(String END_CIDADE) {
        this.END_CIDADE = END_CIDADE;
    }

    /**
     * @return the END_ESTADO
     */
    public String getEND_ESTADO() {
        return END_ESTADO;
    }

    /**
     * @param END_ESTADO the END_ESTADO to set
     */
    public void setEND_ESTADO(String END_ESTADO) {
        this.END_ESTADO = END_ESTADO;
    }

    /**
     * @return the END_CEP
     */
    public int getEND_CEP() {
        return END_CEP;
    }

    /**
     * @param END_CEP the END_CEP to set
     */
    public void setEND_CEP(int END_CEP) {
        this.END_CEP = END_CEP;
    }
    
}

    