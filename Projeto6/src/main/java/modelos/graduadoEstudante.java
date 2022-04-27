package modelos;
import modelos.estudantePessoa;
public class graduadoEstudante extends estudantePessoa {
//atributos         
    protected int anoConclusao = 0;
    protected int anoColacaoGrau = 0;
    protected int numeroDiploma = 0;
//métodos
    public graduadoEstudante() {
    }
    public graduadoEstudante(int anoConclusao, int anoColacaoGrau, int numeroDiploma, int matricula, String curso, String campus, int telefone, String endereco, String email, String nome) throws Exception {
        super(matricula, curso, campus, telefone, endereco, email, nome);
        if (anoColacaoGrau <= 0) {
            throw new Exception("Digite um ano > 0");
        }
        if (anoConclusao <= 0) {
            throw new Exception("Digite um ano > 0");
        }
        if (numeroDiploma <= 0) {
            throw new Exception("Digite um numero > 0");
        }
        this.anoColacaoGrau = anoColacaoGrau;
        this.anoConclusao = anoConclusao;
        this.numeroDiploma = numeroDiploma;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }
    public void setAnoConclusao(int anoConclusao) throws Exception {
        if (anoConclusao <= 0) {
            throw new Exception("Digite um ano > 0");
        }
        this.anoConclusao = anoConclusao;
    }
    public int getAnoColacaoGrau() {
        return anoColacaoGrau;
    }
    public void setAnoColacaoGrau(int anoColacaoGrau) throws Exception {
        if (anoColacaoGrau <= 0) {
            throw new Exception("Digite um ano > 0");
        }
        this.anoColacaoGrau = anoColacaoGrau;
    }
    public int getNumeroDiploma() {
        return numeroDiploma;
    }
    public void setNumeroDiploma(int numeroDiploma) throws Exception {
        if (numeroDiploma <= 0) {
            throw new Exception("Digite um numero > 0");
        }
        this.numeroDiploma = numeroDiploma;
    }
    @Override
    public String toString() {
        return super.toString()+ " anoConclusao= " + anoConclusao + "\n anoColacaoGrau=" + anoColacaoGrau + "\n numeroDiploma=" + numeroDiploma + '\n';
    }

}
