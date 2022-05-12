
package classes;

import enumeradores.tiposTelefone;


public class telefone {

    private int DDI;
    private int DDD;
    private int numero;
    private tiposTelefone tipo;

    public int getDDI() {
        return DDI;
    }

    public void setDDI(int DDI) throws Exception {
        int aux = DDI;
        String ddi = String.valueOf(aux);

        if (ddi.charAt(0) == 0) {
            throw new Exception("DDI inválido!");
        }
        if (ddi.length() > 3) {
            throw new Exception("DDI inválido!");
        }
        if (ddi.length() <= 0) {
            throw new Exception("DDI inválido!");
        }
        this.DDI = DDI;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) throws Exception {
        int aux = DDD;
        String ddd = String.valueOf(aux);

        if (ddd.length() > 2) {
            throw new Exception("DDD deve ter dois digitos");
        }
        if (ddd.charAt(0) == 0) {
            throw new Exception("O primeiro número deve ser maior que 0!");
        }
        if (ddd.length() <= 0) {
            throw new Exception("DDD deve ter dois digitos");
        }
        this.DDD = DDD;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws Exception {
        int aux = numero;

        String numerovalidacao = String.valueOf(aux);

        if (tipo == tipo.CELULAR) {
            if (numerovalidacao.length() > 9) {
                throw new Exception("Número deve conter 9 digitos!");
            }
            if (numerovalidacao.length() < 9) {
                throw new Exception("Número deve conter 9 digitos!");
            }
            if (numerovalidacao.charAt(0) != '9') {
                throw new Exception("Número deve ser iniciado com 9!");
            }
            if (numerovalidacao.charAt(1) == '0') {
                throw new Exception("Número Inválido!");
            } else if (tipo == tipo.RESIDENCIAL) {
                if (numerovalidacao.length() > 8) {
                    throw new Exception("Número deve conter 8 digitos!");
                }
                if (numerovalidacao.length() < 8) {
                    throw new Exception("Número deve conter 8 digitos!");
                }
                if (numerovalidacao.charAt(0) == '0') {
                    throw new Exception("Número deve ser iniciado com 9!");
                }

            }
        }

        this.numero = numero;
    }

    public tiposTelefone getTipo() {
        return tipo;
    }

    public void setTipo(tiposTelefone tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "telefone{" + "DDI=" + DDI + ", DDD=" + DDD + ", numero=" + numero + ", tipo=" + tipo + '}';
    }

}
