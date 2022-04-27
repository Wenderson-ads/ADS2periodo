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
public class Cilindro extends FiguraGeometrica{
    //Atributos
    protected float altura = 0;
    //Metodos
    public Cilindro() {
    }
    public Cilindro(float raio, float altura) throws Exception {
        super(raio);
        if(altura <= 0) throw new Exception( "Altua não pode ser <= 0");
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    @Override
    public float calcularAreaTotal() {
        return (float)(2.0 * Math.PI * raio * (altura + raio));
    }
    @Override
    public float calcularVolume() {
        return (float)(Math.PI * raio * raio * altura);
    }
    @Override
    public String getTipoDaFigura() {
        return "CILINDRO";

    }
    public float calcularAreaLateral(){
        return (float)(2.0 * Math.PI * raio * altura);
    }
    
}
