
package Interface;
import Interface.pessoainterface;

public class pessoaJuridica implements pessoainterface{
    protected String nome = "";
    protected String endereco = "";
    protected String email = "";
    protected float rendaBruta = 0;
    protected String cnpj = "";
    protected String razaoSocial = "";
    pessoaJuridica(){
    }
    pessoaJuridica(String nome, String endereco, String email, float rendaBruta, String cnpj, String razaoSocial) throws Exception {
        if (rendaBruta <= 0) {
            throw new Exception("Digite uma renda > 0");
        }
    this.nome = nome;
    this.endereco = endereco;
    this.email = email;
    this.rendaBruta = rendaBruta;
    this.cnpj = cnpj;
    this.razaoSocial = razaoSocial;
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
    public void setRendaBruta(float rendaBruta)throws Exception {
        if (rendaBruta <= 0) {
            throw new Exception("Digite uma renda > 0");
        }
        this.rendaBruta = rendaBruta;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

@Override
 public float calcularImpostoRenda(){
return (float) (rendaBruta * 0.2);
}  
}
