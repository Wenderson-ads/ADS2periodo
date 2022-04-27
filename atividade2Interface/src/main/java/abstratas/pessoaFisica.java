package abstratas;

public class pessoaFisica extends pessoaFJ {

    protected String cpf = "";
    protected String sexo = "";

    public pessoaFisica() {
    }
    public pessoaFisica(String cpf, String sexo, String nome, String endereco, int telefone, String email, float rendaBruta) throws Exception {
        super(nome, endereco, telefone, email, rendaBruta);

        this.cpf = cpf;
        this.sexo = sexo;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public float calcularImpostoRenda() {
        
        float saida = 0;
        
        if (rendaBruta >= 1400.01 || rendaBruta <= 2100.00) {
            saida = (float) (rendaBruta * 0.1);
        } else if (rendaBruta >= 2100.01 || rendaBruta <= 2800.00) {
            saida = (float) (rendaBruta * 0.15);
        } else if (rendaBruta >= 2800.01 || rendaBruta <= 3600.00) {
            saida = (float) (rendaBruta * 0.25);
        } else if (rendaBruta >= 3600.01) {
            saida = (float) (rendaBruta * 0.3);
        }
        
        return saida ;
    }

    
}


