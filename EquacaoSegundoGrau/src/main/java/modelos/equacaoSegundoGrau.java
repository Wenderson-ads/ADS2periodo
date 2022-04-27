package modelos;

public class equacaoSegundoGrau {

    private int a = 0;
    private int b = 0;
    private int c = 0;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) throws Exception {
        if (a == 0) {
            throw new Exception("O valor de A não pode ser igual á 0");
        }
        this.a = a;
    }

    public float delta() {

        return (float) Math.pow(b, 2) - (4 * a * c);

    }

    public String raizesDaEquacao() {

        String saida = "";

        if (delta() == 0) {
            saida += "Raiz Ùnica! \n";
            saida += "\n";
            saida += (float) (-b + Math.sqrt(delta())) / 2 * a;

        } else if (delta() > 0) {
            saida += "Raizes Distintas! \n";
            saida += "\n";
            saida += "X':\t" + (float) ((-b + Math.sqrt(delta())) / 2 * a);
            saida += "\n";
            saida += "X'':\t" + (float) ((-b - Math.sqrt(delta())) / 2 * a);

        } else {
            saida += "\n";
            saida += "Não possui raizes!";
        }
        return saida;
    }

}
