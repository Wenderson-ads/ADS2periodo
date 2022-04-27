package modelos.classes;

import modelos.Interface.Inatural;

public class INatural implements Inatural {

    //Atributos
    private int numero = 0;

    //metodos
    public INatural() {
    }
    public INatural(int numero) throws Exception {
        if (numero < 0) {
            throw new Exception("Numero deve ser maior que 0");
        }
        this.numero = numero;
    }
    public INatural(INatural objeto) {

        numero = objeto.numero;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public void setNumero(int numero) throws Exception {
        if (numero < 0) {
            throw new Exception("Numero Deve ser maior que 0");
        }
        this.numero = numero;
    }

    @Override
    public void setNumero(INatural objeto) {
        this.numero = objeto.numero;
    }

    @Override
    public boolean eNumeroQuadradoPerfeito() {
        int aux = (int) Math.sqrt(numero);

        if (aux * aux == numero) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public INatural calcularFatorial() throws Exception {
        int n = numero;
        int fatorial = 1;
        while (n > 1) {
            fatorial *= n;
            n--;
        }
        if (fatorial < 0) {
            fatorial = 0;
        }
        return new INatural(fatorial);
    }
    @Override
    public boolean calcularNumeroPerfeito() {
        int perfeito = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                perfeito += i;
            }
        }
        if (numero == perfeito) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean eprimo() {
        int primo = 0;
        int n = numero;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                primo += i;
            }
        }
        if (primo == 0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean capicua() {
        int n = numero;
        int nNumero = 0;
        while (n > 0) {
            nNumero = (nNumero * 10) + (n % 10);

            n /= 10;
        }
        if (nNumero == numero) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public long base10para2() throws Exception {
        int n = numero;
        long novoNumero = 0;
        int j = 0;
        while (n > 0) {

            novoNumero += (n % 2) * Math.pow(10, j);
            j++;

            n /= 2;
        }
        return novoNumero;
    }
    @Override
    public long base10para8() throws Exception {
        int n = numero;
        long novoNumero = 0;
        int j = 0;
        while (n > 0) {

            novoNumero += (n % 8) * Math.pow(10, j);

            n /= 8;
            j++;
        }
        return novoNumero;
    }
    public String base10para16() throws Exception {
        String str = "0123456789ABCDEF";
        int n = numero;
        String novoNumero = "";
        while (n > 0) {

            novoNumero = str.charAt(n % 16) + novoNumero;
            
            n /= 16;
        }
        return novoNumero;
    }
    @Override
    public INatural calcularMDC(int segundo) throws Exception {
        int n1 = numero;
        int n2 = segundo;
        int aux;
        int resto = 0;
        if (n1 < n2) {
            resto = n1 % n2;
            n1 = n2;
            n2 = resto;
            while (resto != 0) {
                resto = n1 % n2;
                n1 = n2;
                n2 = resto;
            }
            return new INatural(n1);
        } else {
            resto = n2 % n1;
            n2 = n1;
            n1 = resto;
            while (resto != 0) {
                resto = n2 % n1;
                n2 = n1;
                n1 = resto;
            }
            return new INatural(n2);
        }
    }
    @Override
    public INatural calcularMMC(int segundo) throws Exception {
        int n1 = numero;
        int n2 = segundo;
        int resultado = 0;
        resultado = (n1 * n2) / calcularMDC(n2).numero;
        return new INatural(resultado);
    }
    @Override
    public boolean primosEntreSi(int segundo) throws Exception {
        int n1 = numero;
        int n2 = segundo;

        if (calcularMDC(segundo).numero == 1) {
            return true;
        } else {
            return false;
        }
    }
}
