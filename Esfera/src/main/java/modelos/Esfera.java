package modelos;

public class Esfera {

    private float raio = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio)  throws Exception {
        if(raio <= 0 ) throw new Exception ("Valor do Raio não pode ser <=0");
        this.raio = raio;
    }

    public float areaTotal() {

        return ((float) (4 * 3.1415) * raio * raio);

    }

    public float volumeTotal() {

        return (float) ((4 / 3) * 3.1415) * raio * raio * raio;

    }

}
