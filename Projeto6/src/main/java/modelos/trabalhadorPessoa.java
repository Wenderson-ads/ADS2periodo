package modelos;

public class trabalhadorPessoa extends pessoaPrincipal {
//atributos
    protected String funcao = "";
    protected String departemanto = "";
    protected int salario = 0;
//métodos
    public trabalhadorPessoa() {
    }
    public trabalhadorPessoa(int telefone, String endereco, String email, String nome, String funcao, String departamento, int salario) throws Exception {

        super(telefone, endereco, email, nome);

        if (salario <= 0) {
            throw new Exception("Digite um salario > 0");
        }
        this.departemanto = departamento;
        this.salario = salario;
        this.funcao = funcao;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) throws Exception {
        if (salario < 0) {
            throw new Exception("Digite um salario > 0");
        }
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDepartemanto() {
        return departemanto;
    }

    public void setDepartemanto(String departemanto) {
        this.departemanto = departemanto;
    }

    @Override
    public String toString() {
        return super.toString()+" funcao = "+funcao+"\n departemanto = "+departemanto+ "\n salario = "+salario+ '\n';
    }
}
