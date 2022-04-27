/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author ejmcc
 */
abstract public class FiguraGeometrica {
    //Atributos
    protected float raio=0;
    //Metodos

    public FiguraGeometrica() {
    }
    public FiguraGeometrica(float raio) throws Exception {
        if(raio <= 0) throw new Exception("Raio não pode ser <= 0");
        this.raio = raio;
    }
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if(raio <= 0) throw new Exception("Raio não pode ser <= 0");
        this.raio = raio;
    }
    abstract public float calcularAreaTotal();
    abstract public float calcularVolume();
    abstract public String getTipoDaFigura();
}
