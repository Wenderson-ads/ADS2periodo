package classes;

import enumeradores.*;

public class modelo {

    private int id;
    private String descricao;
    private int anoFabricacao;
    private int anoModelo;

    public modelo() {
    }
    public modelo(int id, String descricao, int anoFabricacao, int anoModelo) {
        this.id = id;
        this.descricao = descricao;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    @Override
    public String toString() {
        return id + "," + descricao + "," + anoFabricacao + "," + anoModelo;
    }

}
