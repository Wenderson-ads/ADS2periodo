package modelo5;

public class notebookProduto extends produto {

    protected String marca = "";
    protected String modelo = "";
    protected String processador = "";
    protected String capacidadeHdSsd = "";
    protected String memoriaRam = "";
    public static final String TIPO_PRODUTO = "NOTEBOOK";

    public notebookProduto() {
    }
    public notebookProduto(String marca, String modelo, String processador, String capacidadeHdSsd, String memoriaRam, int codigo, int precoVenda) throws Exception {
        super(codigo, precoVenda);

        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.capacidadeHdSsd = capacidadeHdSsd;
        this.memoriaRam = memoriaRam;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public String getCapacidadeHdSsd() {
        return capacidadeHdSsd;
    }
    public void setCapacidadeHdSsd(String capacidadeHdSsd) {
        this.capacidadeHdSsd = capacidadeHdSsd;
    }
    public String getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    @Override
    public String getdescricaoCompleta() {
        
        String saida = TIPO_PRODUTO;
        saida += marca;
        saida += modelo;
        saida += processador;
        saida += capacidadeHdSsd;
        saida += memoriaRam;

        return saida;

    }
    @Override
    public String toString() {
        return "notebookProduto{" + "marca=" + marca + ", modelo=" + modelo + ", processador=" + processador + ", capacidadeHdSsd=" + capacidadeHdSsd + ", memoriaRam=" + memoriaRam + '}';
    }

}
