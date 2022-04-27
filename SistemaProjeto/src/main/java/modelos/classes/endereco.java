package modelos.classes;
import modelos.enumeracoes.tiposEndereco;

public class endereco {

    private String logradouro;
    private String numero = "";
    private int CEP = 0;
    private tiposEndereco tipo;

    public endereco() {
    }
    public endereco(String logradouro, String numero, int CEP, tiposEndereco tipo) {

        this.CEP = CEP;
        this.logradouro = logradouro;
        this.numero = numero;
        this.tipo = tipo;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getCEP() {
        return CEP;
    }
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }
    public tiposEndereco getTipo() {
        return tipo;
    }
    public void setTipo(tiposEndereco tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        String str = "";
        str += logradouro;
        str += numero;
        str += CEP;
        str += tipo.toString();

        return str;
    }
}
