package modelo5;

public class tv extends produto {
    
    protected String modelo = "";
    protected String marca = "";
    protected String sO = "";
    protected String tamanhoTela = "";
    public static final String TIPO_PRODUTO = "TV";

    public tv() {
    }
    public tv(String modelo, String marca, String sO, String tamanhoTela, int codigo, float precoVenda) throws Exception {
        super(codigo, precoVenda);

        this.marca = marca;
        this.modelo = modelo;
        this.sO = sO;
        this.tamanhoTela = tamanhoTela;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getsO() {
        return sO;
    }
    public void setsO(String sO) {
        this.sO = sO;
    }
    public String getTela() {
        return tamanhoTela;
    }
    public void setTela(String tela) {
        this.tamanhoTela = tela;
    }
    @Override
    public String getdescricaoCompleta() {

        String saida = produtos.TV.toString();
        saida += modelo;
        saida += marca;
        saida += sO;
        return saida;
    }
}
