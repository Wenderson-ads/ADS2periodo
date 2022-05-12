package classes;

import enumeradores.tipoLogradouro;

public class endereco {

    private String logradouro;
    private tipoLogradouro tipo;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public endereco() {

    }
    public endereco(String logradouro, tipoLogradouro tipo, int numero, String complemento, String bairro, String cidade, String estado, int cep) {
        this.logradouro = logradouro;
        this.tipo = tipo;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public tipoLogradouro getTipo() {
        return tipo;
    }

    public void setTipo(tipoLogradouro tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws Exception {
        if (numero <= 0) {
            throw new Exception("informe um valor que seja maior que 0");
        }
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) throws Exception {
        int aux = cep;
        String CEP = String.valueOf(aux);
        if (CEP.length() != 7) {
            throw new Exception("O CEP deve conter 7 dígitos");
        }
        this.cep = cep;
    }
}
