/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import classes.pessoaPrincipal;

/**
 *
 * @author aster
 */
public class cliente extends pessoaPrincipal {

    private int id = 50000;

    public cliente() {
    }
    public cliente(String nomeCompleto, String telefone, String email, String CPF, long CEP, String logradouro, String bairro, String quadra, String lote) throws Exception {
        super(nomeCompleto, telefone, email, CPF, CEP, logradouro, bairro, quadra, lote);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}
