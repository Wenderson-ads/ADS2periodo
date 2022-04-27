package modelos;

import javax.swing.JTextField;

public class triangulos {

    private float ladoA = 1f;
    private float ladoB = 1f;
    private float ladoC = 1f;
   

    public void setTodosLados(float ladoA, float ladoB, float ladoC) throws Exception {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            throw new Exception("Os lados não podem ser negativos ou iguais a 0!");
        }

        if (ladoA >= ladoB + ladoC || ladoB >= ladoA + ladoC || ladoC >= ladoB + ladoA) {
            throw new Exception("Não Forma um Triângulo!");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public float getLadoA() {
        return ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    public float areaTotal() {

        float t = (ladoA + ladoB + ladoC) / 2;

        return (float) Math.sqrt(t * (t - ladoA) * (t - ladoB) * (t - ladoC));

    }

    public String ladosTriangulos() {

        String saida = "Forma um Trângulo ESCALENO";

        if (ladoA == ladoB && ladoB == ladoC) {

            saida = "EQUILATERO";

        } else if (ladoA == ladoB || ladoA == ladoC || ladoC == ladoB) {

            saida = "Forma um Trângulo ISÓSCELES";

        }
        return saida;
    }

    public String angulosTriangulos() {
        String saida = "";

        if (Math.pow(ladoA, 2) < Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {

            saida += "Quanto aos Ângulos\n";
            saida += "Forma um Trângulo ACUTÂNGULO!";

        } else if (Math.pow(ladoA, 2) > Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {

            saida += "Quanto aos Ângulos\n";
            saida += "Forma um Trângulo OBTUSÂNGULO!";

        } else if (Math.pow(ladoA, 2) == Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {

            saida += "Quanto aos Ângulos\n";
            saida += "Forma um Trângulo RETÂNGULO!";

        }

        return saida;
    }

}
