package modelo5;

public class cdMusicasProduto extends produto {

    protected String nomeAlbum = "";
    protected String banda = "";
    protected String cantor = "";
    protected String generoMusical = "";

    public cdMusicasProduto() {
    }
    public cdMusicasProduto(String nomeAlbum, String banda, String cantor, String generoMusical, int codigo, int precoVenda) throws Exception {
        super(codigo, precoVenda);

        this.nomeAlbum = nomeAlbum;
        this.cantor = cantor;
        this.banda = banda;
        this.generoMusical = generoMusical;

    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public String getdescricaoCompleta() {
        
        String saida = TIPO_PRODUTO;
        saida += nomeAlbum;
        saida += banda;
        saida += cantor;
        saida += generoMusical;
        
        return saida;
    }

    @Override
    public String toString() {
        return "cdMusicasProduto{" + "nomeAlbum=" + nomeAlbum + ", banda=" + banda + ", cantor=" + cantor + ", generoMusical=" + generoMusical + '}';
    }
    
}
