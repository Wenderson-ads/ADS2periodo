package modelos3;

public class contaCorrenteBasica extends conta {

    public contaCorrenteBasica() {
    }
    public contaCorrenteBasica(int agencia, int conta, float saldo, String nome) throws Exception {
        super(agencia, conta, saldo, nome);
    }

    public float emprestimo(int valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Digite um valor > 0");
        }
        saldo += valor;
        return valor;
    }

   

    @Override
    public float sacar(int valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor não pode ser <= 0");
        }
        if (valor > saldo) {
            throw new Exception("Saldo Insuficiente");
        }
        saldo -= valor;
        return valor;
    }

    @Override
    public float depositar(int valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Deposito deve ser > 0");
        }
        saldo += valor;
        return valor;
    }
}
