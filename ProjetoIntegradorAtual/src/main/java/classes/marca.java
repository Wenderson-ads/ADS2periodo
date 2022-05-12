package classes;

public class marca {

    private String descricao;
    private String logo;
    private int id;

    public marca() {
    }

    public marca(String descricao, String logo, int id) {
        this.descricao = descricao;
        this.logo = logo;
        this.id = id;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "marca{" + "descricao=" + descricao + ", logo=" + logo + ", id=" + id + '}';
    }

}
