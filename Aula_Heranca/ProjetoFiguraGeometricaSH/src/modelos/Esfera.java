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
public class Esfera {
    //Atributos
    private float raio = 0;
    //Metodos
    public Esfera() {
    }
    public Esfera(float raio) throws Exception{
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
    public float calcularAreaTotal(){
        return (float) (4.0 * Math.PI * raio * raio);
    }
    public float calcularVolume(){
        return (float)((4.0/3.0) * Math.PI * raio * raio * raio);
    }
    public String getTipoDaFigura(){
        return "ESFERA";
    }
}
