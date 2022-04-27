package Interface;
import Interface.pessoainterface;

public class pessoaFisica implements pessoainterface {

    protected String nome = "";
    protected String endereco = "";
    protected String email = "";
    protected float rendaBruta = 0;
    protected String cpf = "";
    protected String sexo = "";

    public pessoaFisica() {
    }
    public pessoaFisica(String nome, String endereco, String email, float rendaBruta, String cpf, String sexo) throws Exception {
        if (rendaBruta <= 0) {
            throw new Exception("Digite uma renda > 0");
        }
    this.nome = nome;
    this.endereco = endereco;
    this.email = email;
    this.rendaBruta = rendaBruta;
    this.cpf = cpf;
    this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getRendaBruta() {
        return rendaBruta;
    }
    public void setRendaBruta(float rendaBruta) throws Exception {
        if (rendaBruta <= 0) {
            throw new Exception("Digite uma renda > 0");
        }
        this.rendaBruta = rendaBruta;
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
        if (rendaBruta >= 1400.01 || rendaBruta >= 2100.00) {
            saida = (float) (rendaBruta * 0.1);
        } else if (rendaBruta >= 2100.00 || rendaBruta <= 2800.00) {
            saida = (float) (rendaBruta * 0.15);
        } else if (rendaBruta >= 2800.01 || rendaBruta <= 3600.00) {
            saida = (float) (rendaBruta * 0.25);
        } else if (rendaBruta >= 3600.01) {
            saida = (float) (rendaBruta * 0.30);
        }
        return saida;

    }
}
