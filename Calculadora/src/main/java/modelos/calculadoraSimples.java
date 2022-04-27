package modelos;

import javax.swing.JButton;

public class calculadoraSimples {

    private float numero1 = 0;
    private float numero2 = 0;

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float somar() {

        return (numero1 + numero2);

    }

    public float subtrair() {

        return (numero1 - numero2);

    }

    public float dividir() throws Exception {
        if (numero2 == 0) {
            throw new Exception("Não existe divisão por 0!");
        }

        return (numero1 / numero2);

    }

    public float multiplicar() {

        return (numero1 * numero2);

    }

    public float potencia() throws Exception {
        if (numero1 == 0) {
            throw new Exception("Não existe potência de 0");
        }
        if (numero2 <= 0) {
            throw new Exception("Digite um numero elevado >0");
        }
        return (float) Math.pow(numero1, numero2);
    }

    public float raiz() throws Exception {
        float saida = 0;
        if (numero1 > 0 && numero2 == 1) {
            throw new Exception("Não existe raiz quadrada de 1!");
        }
        if (numero1 > 0 && numero2 > 3) {
            throw new Exception("Calculo de raiz somente até a cúbica!");
        }
        if (numero1 > 0 && numero2 == 0) {
            throw new Exception("Não existe raiz de 0!");
        }
        if (numero1 == 0 && numero2 > 0) {
            throw new Exception("Não existe raiz de 0!");
        }
        if (numero1 > 0 && numero2 == 3) {
            saida = (float) Math.cbrt(numero1);
        } else if (numero1 > 0 && numero2 == 2) {
            saida = (float) Math.sqrt(numero1);
        }

        return saida;

    }

}
