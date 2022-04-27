package modelos;

/**
 *
 * @author ALUNO
 */
public class cooperado {

    private String nome = "";
    private String profissao = "";
    private float horastrabalhadas = 0;
    private float valorHorasTrabalhadas = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public float getHorastrabalhadas() {
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(float horastrabalhadas) throws Exception {
        if (horastrabalhadas < 160) {
            throw new Exception("Horas não podem ser < 160");
        }

        this.horastrabalhadas = horastrabalhadas;
    }

    public float getValorHorasTrabalhadas() {
        return valorHorasTrabalhadas;
    }

    public void setValorHorasTrabalhadas(float valorHorasTrabalhadas) throws Exception {
        if (valorHorasTrabalhadas < 0) {
            throw new Exception("Valor das Horas não  podem ser < 0");
        }
        this.valorHorasTrabalhadas = valorHorasTrabalhadas;
    }

    public float bonificacao() {

        float saida = 0;

        if (profissao.equalsIgnoreCase("Advogado")) {

            if (horastrabalhadas < 300) {

                saida = 0;
            }

            if (horastrabalhadas >= 300 || horastrabalhadas < 500) {

                saida = (float) ((horastrabalhadas * valorHorasTrabalhadas) * 0.2);

            }
            if (horastrabalhadas >= 500) {

                saida = (float) ((horastrabalhadas * valorHorasTrabalhadas) * 0.25);

            }

        } else if (profissao.equalsIgnoreCase("Medico")) {

            if (horastrabalhadas < 300) {

                saida = 0;
            }

            if (horastrabalhadas >= 300 || horastrabalhadas < 500) {

                saida = (float) ((horastrabalhadas * valorHorasTrabalhadas) * 0.2);

            }
            if (horastrabalhadas >= 500) {

                saida = (float) ((horastrabalhadas * valorHorasTrabalhadas) * 0.25);

            }

        } else if (profissao.equalsIgnoreCase("Engenheiro")) {

            if (horastrabalhadas < 300) {

                saida = 0;
            }

            if (horastrabalhadas >= 300 || horastrabalhadas < 500) {

                saida = (float) ((horastrabalhadas * valorHorasTrabalhadas) * 0.2);

            }
            if (horastrabalhadas >= 500) {

                saida = (float) ((horastrabalhadas * valorHorasTrabalhadas) * 0.25);

            }

        } else if (profissao.equalsIgnoreCase("Enfermeiro")) {

            if (horastrabalhadas < 250) {

                saida = 0;
            }

            if (horastrabalhadas >= 250 || horastrabalhadas < 400) {

                saida = (float) ((horastrabalhadas * valorHorasTrabalhadas) * 0.19);

            }
            if (horastrabalhadas >= 400) {

                saida = (float) ((horastrabalhadas * valorHorasTrabalhadas) * 0.23);

            }

        } else if (profissao.equalsIgnoreCase("Dentista")) {
            if (horastrabalhadas < 250) {
                saida = 0;
            }

            if (horastrabalhadas >= 250 || horastrabalhadas < 400) {

                saida = (float) ((horastrabalhadas * valorHorasTrabalhadas) * 0.19);

            }
            if (horastrabalhadas >= 400) {

                saida = (float) ((horastrabalhadas * valorHorasTrabalhadas) * 0.23);

            }

        }
        return saida;
    }

    public float salarioLiquido() {

        return (horastrabalhadas * valorHorasTrabalhadas) + bonificacao();

    }

    public float contribuicao() {

        float saida = 0;

        if (profissao.equalsIgnoreCase("Advogado")) {

            saida += salarioLiquido() * 0.1;

        } else if (profissao.equalsIgnoreCase("Medico")) {

            saida += salarioLiquido() * 0.11;
        } else if (profissao.equalsIgnoreCase("Engenheiro")) {

            saida += salarioLiquido() * 0.09;
        } else if (profissao.equalsIgnoreCase("Enfermeiro")) {

            saida += salarioLiquido() * 0.07;
        } else if (profissao.equalsIgnoreCase("Dentista")) {

            saida += salarioLiquido() * 0.08;
        }

        return saida;
    }

    public float salarioFinal() {

        return salarioLiquido() - contribuicao();

    }
}
