package modelos;

public class Funcionario {

    private String nome = "";
    private int numeroFilhos = 0;
    private float salario = 0;
    private int aumento = 0;

    public int getAumento() {
        return aumento;
    }

    public void setAumento(int aumento) throws Exception {
        if (aumento < 0) {
            throw new Exception("Aumento não pode ser < 0");
        }

        this.aumento = aumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFilhos() {
        return numeroFilhos;
    }

    public void setNumeroFilhos(int numeroFilhos) throws Exception {
        if (numeroFilhos < 0) {
            throw new Exception("Digite uma quantidade de filhos >= 0");
        }
        this.numeroFilhos = numeroFilhos;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) throws Exception {
        if (salario < 0) {
            throw new Exception("Digite um salário >= 0");
        }
        this.salario = salario;
    }

    public float novoSalario() {

        float au = (salario * aumento) / 100;

        return (float) (salario + au);

    }

    public float calcularInss() {
        float saida = 0;

        if (novoSalario() <= 3545.00) {
            saida = (float) (novoSalario() * 0.06);
        } else {
            saida = (float) (novoSalario() * 0.1);
        }
        return saida;
    }

    public float calcularIR() {
        float saida = 0;
        if (novoSalario() <= 2903.98) {

            saida = 0;

        } else if (novoSalario() >= 2903.99 || novoSalario() <= 3826.65) {

            saida = (float) (novoSalario() * 0.075);

        } else if (novoSalario() >= 3826.66 || novoSalario() <= 4751.05) {

            saida = (float) (novoSalario() * 0.15);

        } else if (novoSalario() >= 4751.06 || novoSalario() <= 5664.68) {

            saida = (float) (novoSalario() * 0.225);

        } else {
            saida = (float) (novoSalario() * 0.275);
        }
        return saida;
    }

    public Float calcularIRPF() {
        float saida = 0;
        float irpf = (float) calcularIR() - (145 * numeroFilhos);
        if (irpf < 0) {

            saida += 0;

        } else if (irpf > 0) {

            saida += irpf;

        }
        return saida;
    }

}
