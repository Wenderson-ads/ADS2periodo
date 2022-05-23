package classes;

import enumeradores.tipoLogradouro;
import javax.swing.JTextField;

public class endereco {

    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private tipoLogradouro tipo;

    public endereco() {

    }
    public endereco(String logradouro, int numero, String complemento, String bairro, String cidade, String estado, int cep, tipoLogradouro tipo) {

        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
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
        if (CEP.length() != 8) {
            throw new Exception("O CEP deve conter 7 dígitos");
        }
        this.cep = cep;
    }

    public tipoLogradouro getTipo() {
        return tipo;
    }

    public void setTipo(tipoLogradouro tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return logradouro + "," + numero + "," + complemento + "," + bairro + "," + estado + "," + cidade + "," + cep + "," + tipo;
    }

}
