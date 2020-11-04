package model;

public class ClienteModel {

    private int CLI_ID;
    private String CLI_NOME;
    private int CLI_CPF;
    private String CLI_EMAIL;
    private int CLI_DDD;
    private int CLI_TELEFONE;
    private EnderecoModel CLI_ENDERECO;

    public ClienteModel() {
    }

    public ClienteModel(int CLI_ID, String CLI_NOME, int CLI_CPF, String CLI_EMAIL, int CLI_DDD, int CLI_TELEFONE, EnderecoModel CLI_ENDERECO) {
        this.CLI_ID = CLI_ID;
        this.CLI_NOME = CLI_NOME;
        this.CLI_CPF = CLI_CPF;
        this.CLI_EMAIL = CLI_EMAIL;
        this.CLI_DDD = CLI_DDD;
        this.CLI_TELEFONE = CLI_TELEFONE;
        this.CLI_ENDERECO = CLI_ENDERECO;
    }

    public int getCLI_ID() {
        return CLI_ID;
    }

    public void setCLI_ID(int CLI_ID) {
        this.CLI_ID = CLI_ID;
    }

    public String getCLI_NOME() {
        return CLI_NOME;
    }

    public void setCLI_NOME(String CLI_NOME) {
        this.CLI_NOME = CLI_NOME;
    }

    public int getCLI_CPF() {
        return CLI_CPF;
    }

    public void setCLI_CPF(int CLI_CPF) {
        this.CLI_CPF = CLI_CPF;
    }

    public String getCLI_EMAIL() {
        return CLI_EMAIL;
    }

    public void setCLI_EMAIL(String CLI_EMAIL) {
        this.CLI_EMAIL = CLI_EMAIL;
    }

    public int getCLI_DDD() {
        return CLI_DDD;
    }

    public void setCLI_DDD(int CLI_DDD) {
        this.CLI_DDD = CLI_DDD;
    }

    public int getCLI_TELEFONE() {
        return CLI_TELEFONE;
    }

    public void setCLI_TELEFONE(int CLI_TELEFONE) {
        this.CLI_TELEFONE = CLI_TELEFONE;
    }

    public EnderecoModel getCLI_ENDERECO() {
        return CLI_ENDERECO;
    }

    public void setCLI_ENDERECO(EnderecoModel CLI_ENDERECO) {
        this.CLI_ENDERECO = CLI_ENDERECO;
    }

    public void setEND_ID(int enderecoId) {
        CLI_ENDERECO.setEND_ID(enderecoId);
    }

    public int getEND_ID() {
        return CLI_ENDERECO.getEND_ID();
    }
}
