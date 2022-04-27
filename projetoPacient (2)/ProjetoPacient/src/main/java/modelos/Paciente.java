package modelos;

public class Paciente {

    //atributos
    private String nomeCompleto = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";
   

    //metodos
  public float calcularIMC() {

        return (peso / (altura * altura));

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) throws Exception{
        if(peso <= 0) throw new Exception ("O peso não pode ser <= 0");
        this.peso = peso;
    }

    public float getAltura() throws Exception{
        if(altura <= 0) throw new Exception ("A altura não pode ser <= 0");
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
