package modelos;

public class contaPoupanca {

    private String nomeCliente = "";
    private int numeroConta = 0;
    private int agencia = 0;
    private float saldo = 0;

    //metodos
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public float sacar(int valor) throws Exception {

        if (valor <= 0) {
            throw new Exception(" Não pode sacar valor <= 0");
        }
        if (valor > saldo) {
            throw new Exception("Sem fundo");
        }
        saldo -= valor;
        return valor;
    }

    public float depositar(int valor) throws Exception {

        if (valor <= 0) {
            throw new Exception("Deposito deve ser maior que 0");
        }

        saldo += valor;
        
        return valor;
    }

}
