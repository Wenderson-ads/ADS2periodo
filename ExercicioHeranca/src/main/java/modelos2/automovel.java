package modelos2;
import modelos2.veiculo;

public class automovel implements veiculo {

    protected int quantidadeRodas = 0;
    protected int tamanhoAro;
    protected String fabricante = "";

    public automovel() {
    }
    public automovel(int quantidadeRodas, int tamanhoAro, String fabricante) throws Exception {
        if (quantidadeRodas <= 1) {
            throw new Exception("Digite uma quantidade > 1");
        }if (tamanhoAro <= 16 || tamanhoAro >=30) {
            throw new Exception("Digite uma quantidade > 16 e < 30");
        }
    this.fabricante = fabricante;
    this.quantidadeRodas = quantidadeRodas;
    this.tamanhoAro = tamanhoAro;
    }
    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }
    public void setQuantidadeRodas(int quantidadeRodas) throws Exception {
        if (quantidadeRodas <= 1) {
            throw new Exception("Digite uma quantidade > 1");
        }
        this.quantidadeRodas = quantidadeRodas;
    }
    public int getTamanhoAro() {
        return tamanhoAro;
    }
    public void setTamanhoAro(int tamanhoAro)throws Exception {
           if (tamanhoAro <= 16 || tamanhoAro >=30) {
            throw new Exception("Digite uma quantidade > 16 e <= 30");
        }
        this.tamanhoAro = tamanhoAro;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String Fabricante) {
        this.fabricante = Fabricante;
    }
    @Override
    public String virar() {
        return "Girar volante ou Guidão";
    }
    @Override
    public String estacionar() {
        return "Parar o Automóvel e desliga-lo";
    }
    @Override
    public String freiar() {
        return "Reduzir velocidade e apertar o freio";
    }
}
