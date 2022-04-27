package modelos;

public class paralelepipedo {

    private float altura = 0;
    private float largura = 0;
    private float comprimento = 0;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("Altura não pode ser <= 0");
        }
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws Exception {
        if (largura <= 0) {
            throw new Exception("Largura não pode ser <= 0");
        }
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception{
        if(comprimento<=0) throw new Exception ("Comprimento não pode ser <= 0");
        this.comprimento = comprimento;
    }

    public float calcularVolume() {

        return  (altura * comprimento * largura);

    }

    public float calcularArea() {

        return 2 * ((altura * largura) + (altura * comprimento) + (largura * comprimento));

    }

}
