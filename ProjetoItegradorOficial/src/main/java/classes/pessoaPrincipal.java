/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author aster
 */
public class pessoaPrincipal {

    private String nomeCompleto;
    private String telefone;
    private String email;
    private String CPF;
    private long CEP;
    private String logradouro;
    private String bairro;
    private String quadra;
    private String lote;

    public pessoaPrincipal() {
    }

    public pessoaPrincipal(String nomeCompleto, String telefone, String email, String CPF, long CEP, String logradouro, String bairro, String quadra, String lote) throws Exception {

        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.CPF = CPF;
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.quadra = quadra;
        this.lote = lote;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) throws Exception {

        String auxiliar = telefone;
        
        int i = 0;

        if (telefone.charAt(i) == '0') {
            throw new Exception("Um numero não pode começar com 0! ");
        }
        if (telefone.charAt(2) != '9') {
            throw new Exception("O terceiro numero deve ser 9!");
        }
        if (telefone.charAt(3) == '0') {
            throw new Exception("Um numero não pode ser iniciado com 0!");
        }
        if (telefone.length() > 11) {
            throw new Exception("O numero não pode ter mais de 11 digitos!");

        }
        if (telefone.length() < 11) {
            throw new Exception("O numero não pode ter menos de 11 digitos!");

        }
        for (int j = 0; j < auxiliar.length(); j++) {

            if (auxiliar.charAt(j) < '0' || auxiliar.charAt(j) > '9') {
               
                throw new Exception("Erro");

            }

        }

        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public long getCEP() {
        return CEP;
    }

    public void setCEP(long CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

}
