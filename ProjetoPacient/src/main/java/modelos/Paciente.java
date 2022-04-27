package modelos;

public class Paciente {

    //atributos
    private String nomeCompleto = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";

    //metodos
    public float calcularIMC() {

        return (peso / (altura * altura));

    }

    public String tipoImc() {
        String saida = "";
        if (calcularIMC() < 20) {
            saida += "IMC: " + calcularIMC() + "\n";
            saida += "Abaixo do Peso ideal! \n";
        } else if (calcularIMC() >= 20 && calcularIMC() <= 25) {
            saida += "IMC: " + calcularIMC() + "\n";
            saida += "Peso normal! \n";
        } else if (calcularIMC() > 25 && calcularIMC() <= 30) {
            saida += "IMC: " + calcularIMC() + "\n";
            saida += "Excesso de peso! \n";
        } else if (calcularIMC() > 30 && calcularIMC() <= 35) {
            saida += "IMC: " + calcularIMC() + "\n";
            saida += "Obesidade! \n";
        } else if (calcularIMC() > 35) {
            saida += "IMC: " + calcularIMC() + "\n";
            saida += "Obesidade mórbida! \n";
        }
        return saida;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
