/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;

import modelos.enumeracoes.tipoTelefone;

public class telefone {

    //atributos
    private int ddi = 0;
    private int ddd = 0;
    private int numero = 0;
    private tipoTelefone tipo;

    //metodos
    public telefone() {
    }
    public telefone(int ddi, int ddd, int numero, tipoTelefone tipo) {

        this.ddd = ddd;
        this.ddi = ddi;
        this.numero = numero;
        this.tipo = tipo;

    }
    public int getDdi() {
        return ddi;
    }
    public void setDdi(int ddi) {
        this.ddi = ddi;
    }
    public int getDdd() {
        return ddd;
    }
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public tipoTelefone getTipo() {
        return tipo;
    }
    public void setTipo(tipoTelefone tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {

        String str = "";
        str += ddi + ";";
        str += ddd + ";";
        str += numero + ";";
        str += tipo.toString();
        return str;
    }
}
