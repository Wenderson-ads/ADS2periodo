package modelo5;

abstract public class produto {
   
   protected int codigo = 0;
   protected float precoVenda = 0;
   public static final String TIPO_PRODUTO = "";

    public produto() {
    }
    public produto(int codigo, float precoVenda) throws Exception {
        if (codigo <= 0) {
            throw new Exception("Digite um Código > 0");
        }
        if (precoVenda <= 0) {
            throw new Exception("Digite um preço > 0");
        }
        this.precoVenda = precoVenda;
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) throws Exception {
        if (codigo <= 0) {
            throw new Exception("Digite um Código > 0");
        }
        this.codigo = codigo;
    }
    public float getPrecoVenda() {
        return  precoVenda;
    }
    public void setPrecoVenda(int precoVenda) throws Exception {
        if (precoVenda <= 0) {
            throw new Exception("Digite um preço > 0");
        }
        this.precoVenda = precoVenda;
    }
    abstract public String getdescricaoCompleta();

}
