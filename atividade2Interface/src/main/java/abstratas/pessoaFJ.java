package abstratas;

public abstract  class pessoaFJ {

    protected String nome = "";
    protected String endereco = "";
    protected int telefone = 0;
    protected String email = "";
    protected float rendaBruta = 0;

    public pessoaFJ() {
    }
    public pessoaFJ(String nome, String endereco, int telefone, String email, float rendaBruta) throws Exception {
        if (telefone <= 0) {
            throw new Exception("Digite um Numero > 0");
        }if (rendaBruta <= 0) {
            throw new Exception("Digite uma Renda > 0");
        }
        this.rendaBruta = rendaBruta;
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
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
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) throws Exception {
        if (telefone <= 0) {
            throw new Exception("Digite um Numero > 0");
        }
        this.telefone = telefone;
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
            throw new Exception("Digite uma Renda > 0");
        }
        this.rendaBruta = rendaBruta;
    }
    abstract public float calcularImpostoRenda();
}
