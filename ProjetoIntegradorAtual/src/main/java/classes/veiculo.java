/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enumeradores.tipoModeloVeiculo;

/**
 *
 * @author ALUNO
 */
public class veiculo {

    private int ID;
    private String placa;
    private String renavam;
    private tipoModeloVeiculo tipo;

    public veiculo() {
    }
    public veiculo(int ID, String placa, String renavam, tipoModeloVeiculo tipo) {
        this.ID = ID;
        this.placa = placa;
        this.renavam = renavam;
        this.tipo = tipo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public tipoModeloVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(tipoModeloVeiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return ID + "," + placa + "," + renavam + "," + tipo;
    }

}
