/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;

import modelos.enumeracoes.situacaoProjeto;

/**
 *
 * @author ALUNO
 */
public class Projeto {

    private int ID = 0;
    private String titulo = "";
    private String descricao = "";
    private float valor = 0;
    private situacaoProjeto situacao;

    public Projeto() {
    }

    public Projeto(int ID, String titulo, String descricao, float valor, situacaoProjeto situacao) {

        this.ID = ID;
        this.descricao = descricao;
        this.titulo = titulo;
        this.valor = valor;
        this.situacao = situacao;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public situacaoProjeto getSituacao() {
        return situacao;
    }
    public void setSituacao(situacaoProjeto situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
       String str = "";
       str += titulo;
       str += descricao;
       str += valor;
       str += situacao.toString();
       return str;
    }
    
    
    
}
