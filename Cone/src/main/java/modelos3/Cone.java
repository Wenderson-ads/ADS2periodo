package modelos3;

public class Cone {

    private float raio = 0;
    private float altura = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if (raio <= 0) {
            throw new Exception("O valor do Raio não pode ser <=0 ");
        }
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("O valor da altura não pode ser <=0 ");
        }
        this.altura = altura;
    }

    public float calculoGeratriz() {

        return (float) Math.sqrt((Math.pow(raio, 2) + Math.pow(altura, 2)));

    }

    public float areaLateral() {

        return (float) (3.1415 * raio * calculoGeratriz());

    }

    public float volume() {

        return (float) ((1.0 / 3.0) * 3.1415 * Math.pow(raio, 2) * altura);

    }

    public float areaTotal() {

        return (float) (3.1415 * raio * (calculoGeratriz() + raio));

    }

}
