
package modelos;


public class Piramide {
    //Atributos
    
    private float base = 0;
    private float altura = 0;
    
    
    //Metodos
    

    public float getBase() {
        return base;
    }

    public void setBase(float base) throws Exception{
        if(base <= 0) throw new Exception ("O valor da Base não pode ser <= 0");
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception  {
        if(altura <=0) throw new Exception ("O valor da Altura não pode ser <= 0");
        this.altura = altura;
    }
    
    public float calcularVolume(){
    
    return ((float)(1.0/3.0) * base * altura);
    
    }
    
}
