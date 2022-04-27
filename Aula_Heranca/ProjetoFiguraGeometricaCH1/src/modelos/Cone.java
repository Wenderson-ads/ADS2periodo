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
public class Cone extends Cilindro{

    public Cone() {
    }
    public Cone(float raio, float altura) throws Exception {
        super(raio, altura);
    }
    public float calcularGeratriz(){
        return (float)(Math.sqrt((altura * altura)+(raio * raio)));
    }
    @Override
    public String getTipoDaFigura(){
        return "CONE";
    }
    @Override
    public float calcularAreaTotal(){
        return (float)(Math.PI * raio * (calcularGeratriz() + raio));    
    }
    @Override
    public float calcularVolume(){
        return (float)(1.0/3.0 * Math.PI * raio * raio * altura);
    }
    @Override
    public float calcularAreaLateral(){
        return (float)(Math.PI * raio * calcularGeratriz());
    }    
}
