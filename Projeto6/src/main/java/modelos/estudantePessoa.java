package modelos;

public class estudantePessoa extends pessoaPrincipal {
// atributos
    protected int matricula = 0;
    protected String curso = "";
    protected String campus = "";
//métodos
    public estudantePessoa() {
    }
    public estudantePessoa(int matricula, String curso, String campus, int telefone, String endereco, String email, String nome) throws Exception {

        super(telefone, endereco, email, nome);

        if (matricula <= 0) {
            throw new Exception("Digite uma matricula > 0");
        }
        this.matricula = matricula;
        this.campus = campus;
        this.curso = curso;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCampus() {
        return campus;
    }
    public void setCampus(String campus) {
        this.campus = campus;
    }
    @Override
    public String toString() {
        return super.toString()+ " matricula = "+matricula+"\n curso = "+curso+"\n campus = "+campus+'\n';
    }
}
