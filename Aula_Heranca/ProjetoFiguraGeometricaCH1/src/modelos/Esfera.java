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
public class Esfera extends FiguraGeometrica{

    public Esfera() {
        //aqui já tem o super
    }
    //O atributo raio veio da heranca

    public Esfera(float raio) throws Exception {
        super(raio);
    }

    @Override
    public float calcularAreaTotal() {
        return (float) (4.0 * Math.PI * raio * raio);    
    }

    @Override
    public float calcularVolume() {
        return (float)((4.0/3.0) * Math.PI * raio * raio * raio);
    }

    @Override
    public String getTipoDaFigura() {
        return "ESFERA";
    }
    
    
}
