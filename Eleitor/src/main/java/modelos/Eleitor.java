package modelos;

import javax.swing.JTextField;

public class Eleitor {

    private int dia = 0;
    private int mes = 0;
    private int ano = 0;
    private String nomeCompleto = "";

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws Exception {
        if (dia <= 0 || dia > 31) {
            throw new Exception("insira um dia >= 1 e <= 31!");
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if (mes <= 0 || mes > 12) {
            throw new Exception("insira um mes >= 1 e <= 12!");
        }
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws Exception {
        if (ano <= 0 || ano > 2022) {
            throw new Exception("insira um ano maior que 0 e menor que 2022!");
        }

        this.ano = ano;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    void setNomeCompleto(JTextField jTextField1nomeCompleto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public float calcularEleitor() {

        return 2022 - ano;

    }

    public String tipoEleitor() {
        String saida = "";

        if (calcularEleitor() < 16) {
            saida += "Idade: " + calcularEleitor() + "\n";
            saida += "Não Eleitor!";
        } else if (calcularEleitor() >= 16 && calcularEleitor() < 18) {
            saida += "Idade: " + calcularEleitor() + "\n";
            saida += "Eleitor Facultativo!";
        } else if (calcularEleitor() >= 18 && calcularEleitor() < 65) {
            saida += "Idade: " + calcularEleitor() + "\n";
            saida += "Eleitor Obrigatório!";
        } else {
            saida += "Idade: " + calcularEleitor() + "\n";
            saida += "Eleitor Facultativo!";
        
        }
        
            

        return saida;

    }

}
