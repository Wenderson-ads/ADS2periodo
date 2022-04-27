package modelo5;

public class livroProduto extends produto {

    protected String titulo = "";
    protected String autor = "";
    protected String tradutor = "";
    protected String editora = "";
    protected int anoPublicacao = 0;
    public static final String TIPO_PRODUTO = "LIVRO";

    public livroProduto() {
    }
    public livroProduto(String titulo, String autor, String tradutor, String editora, int anoPublicacao, int codigo, int precoVenda) throws Exception {
        super(codigo, precoVenda);

        this.titulo = titulo;
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;

    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTradutor() {
        return tradutor;
    }
    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    @Override
    public String getdescricaoCompleta() {
       
        String saida = TIPO_PRODUTO;
        saida += titulo;
        saida += autor;
        saida += tradutor;
        saida += editora;
        saida += anoPublicacao;
       
        return saida;
    }

    @Override
    public String toString() {
        return "livroProduto{" + "titulo=" + titulo + ", autor=" + autor + ", tradutor=" + tradutor + ", editora=" + editora + ", anoPublicacao=" + anoPublicacao + '}';
    }
    
}
