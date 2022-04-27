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
public class Cone {
    //Atributos
    private float raio = 0;
    private float altura = 0;
    //Metodos

    public Cone() {
    }
    public Cone(float valorRaio, float valorAltura) throws Exception {
        if(valorRaio <= 0) throw new Exception("Raio não pode ser <= 0");
        if(valorAltura <= 0) throw new Exception("Altura não pode ser <= 0");
        this.raio = valorRaio;
        this.altura = valorAltura;
    }
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) throws Exception {
        if(raio <= 0) throw new Exception("Raio não pode ser <= 0");
        this.raio = raio;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) throws Exception{
        if(altura <= 0) throw new Exception("Altura não pode ser <= 0");
        this.altura = altura;
    }
    public String getTipoDaFigura(){
        return "CONE";
    }
    public float calcularAreaTotal(){
        return (float)(Math.PI * raio * (calcularGeratriz() + raio));    
    }
    public float calcularVolume(){
        return (float)(1.0/3.0 * Math.PI * raio * raio * altura);
    }
    public float calcularAreaLateral(){
        return (float)(Math.PI * raio * calcularGeratriz());
    }    
    public float calcularGeratriz(){
        return (float)(Math.sqrt((altura * altura)+(raio * raio)));
    }
}
