package modelos3;

public abstract class conta {

    protected String nome = "";
    protected int agencia = 0;
    protected int Conta = 0;
    protected float saldo = 0;

    public conta() {
    }

    public conta(int agencia, int conta, float saldo, String nome) throws Exception {
        if (conta <= 0) {
            throw new Exception("Digite uma Conta > 0");
        }
        if (agencia <= 0) {
            throw new Exception("Digite uma Agência > 0");
        }
        this.nome = nome;
        this.agencia = agencia;
        this.Conta = conta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) throws Exception {
        if (agencia <= 0) {
            throw new Exception("Digite uma Agência > 0");
        }
        this.agencia = agencia;
    }

    public int getConta() {
        return Conta;
    }

    public void setConta(int conta) throws Exception {
        if (conta <= 0) {
            throw new Exception("Digite uma Conta > 0");
        }
        this.Conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    abstract public float sacar(int valor) throws Exception;

    abstract public float depositar(int valor) throws Exception;

}
