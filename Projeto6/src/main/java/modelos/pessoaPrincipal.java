package modelos;

public class pessoaPrincipal {
//atributos
    protected String nome = "Wenderson";
    protected String endereco = "Rua 10";
    protected String email = "Asterty15@gmail.com";
    protected int telefone = 985738612;
//métodos

    public pessoaPrincipal() {
    }

    public pessoaPrincipal(int telefone, String endereco, String email, String nome) throws Exception {
        if (telefone <= 0) {
            throw new Exception("Digite um telefone > 0");
        }
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.nome = nome;
    }

    public void setTelefone(int telefone) throws Exception {
        if (telefone <= 0) {
            throw new Exception("Digite um telefone > 0");
        }
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return " nome = "+nome+"\n endereco = "+endereco+"\n email = "+email+"\n telefone = "+telefone+'\n';
    }

}
