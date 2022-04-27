package modelos;

public class pessoaJuridica extends pessoa {

    protected String cnpj = "";
    protected String razaoSocial = "";

    public pessoaJuridica() {
    }

    public pessoaJuridica(String cnpj, String razaoSocial, String nome, String endereco, String email, float rendaBruta) throws Exception {
        super(nome, endereco, email, rendaBruta);

        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;

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
    public float impostoRenda() {
        return (float) (rendaBruta * 0.2);

    }
}
