package modelos2;

import modelos2.veiculo;

public class aviao implements veiculo {

    protected String marca = "";
    protected int quantidadePoltronas = 0;

    public aviao() {
    }
    public aviao(String marca, int quantidadePoltronas) throws Exception {
        if (quantidadePoltronas <= 0) {
            throw new Exception("Digite uma quantidade > 0");
        }
    this.marca = marca;
    this.quantidadePoltronas = quantidadePoltronas;

    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getQuantidadePoltronas() {
        return quantidadePoltronas;
    }
    public void setQuantidadePoltronas(int quantidadePoltronas) throws Exception {
        if (quantidadePoltronas <= 0) {
            throw new Exception("Digite uma quantidade > 0");
        }
        this.quantidadePoltronas = quantidadePoltronas;
    }

    @Override
    public String virar() {
        return "Apertar o pedal para o lado direito ou esquerdo";
    }
    @Override
    public String estacionar() {
        return "Acionar o modo de pousar";
    }
    @Override
    public String freiar() {
        return "Depois de pousar iniciar o modo freio";
    }
}
