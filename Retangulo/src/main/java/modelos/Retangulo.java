
package modelos;


public class Retangulo {

    private float comprimento = 0;
    private float largura = 0;

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception  {
        if(comprimento <= 0) throw new Exception("O valor do comprimento não pode ser <= 0");
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws Exception  {
        if(largura <= 0) throw new Exception("O valor do largura não pode ser <= 0");
        this.largura = largura;
    }

    public float calcularArea() {

        return (float)(largura * comprimento);

    }

    public float calcularPerimetro() {

        return (float)(largura + largura) + (comprimento + comprimento);

    }

}
