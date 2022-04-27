package modelos;

abstract public class pessoa {

    protected String nome = "";
    protected String endereco = "";
    protected String email = "";
    protected float rendaBruta = 0;

    public pessoa() {
    }
    public pessoa(String nome, String endereco, String email, float rendaBruta) throws Exception {
        if (rendaBruta <= 0) {
            throw new Exception("Digite uma renda >= 0");
        }
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.rendaBruta = rendaBruta;
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
    if(rendaBruta <= 0){
            throw new Exception("Digite uma renda >= 0");
        }
        this.rendaBruta = rendaBruta;
    }
abstract public float impostoRenda();
}
