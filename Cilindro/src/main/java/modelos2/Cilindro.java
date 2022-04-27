
package modelos2;


public class Cilindro {
    
    private float raio = 0;
    private float altura = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception{
        if(raio <= 0) throw new Exception ("O valor do Raio não pode ser <=0 ");
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception{
        if(altura <= 0) throw new Exception ("O valor da altura não pode ser <=0 ");
        this.altura = altura;
    }
    
    
    
    public float areaTotal(){
    
    return (float)((2*3.1415)*raio*(altura+raio));
    
    }
    public float areaLateral(){
    
    return (float)((2*3.1415) * raio * altura);
    
    }
    public float volume(){
    
    return (float)(3.1415*(raio*raio)*(altura));
    
    }
    
}
