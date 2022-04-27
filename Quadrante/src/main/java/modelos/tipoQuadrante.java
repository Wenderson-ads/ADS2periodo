/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class tipoQuadrante {

    private float coordenadaX = 0;
    private float coordenadaY = 0;

    public float getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public float getCoordenadaY() {
        return coordenadaY;
    }

    public String quadrantes() {

        String saida = "Ponto Localizado no Quadrante 1";

        if (coordenadaX < 0 && coordenadaY > 0) {

            saida = "Ponto Localizado no Quadrante 2";

        } else if (coordenadaX < 0 && coordenadaY < 0) {

            saida = "Ponto Localizado no Quadrante 3";

        } else if (coordenadaX > 0 && coordenadaY < 0) {

            saida = "Ponto Localizado no Quadrante 4";

        } else if (coordenadaX == 0 && coordenadaY < 0 || coordenadaX == 0 && coordenadaY > 0) {

            saida = ("Ponto sobre Eixo Y!");

        } else if (coordenadaX < 0 && coordenadaY == 0 || coordenadaX > 0 && coordenadaY == 0) {

            saida = ("Ponto sobre Eixo X!");

        } else if (coordenadaX == 0 && coordenadaY == 0) {
            
            saida = ("Ponto sobre Origem!");
        }

        return saida;
    }

}
