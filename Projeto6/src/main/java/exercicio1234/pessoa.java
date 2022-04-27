package exercicio1234;

import javax.swing.JOptionPane;
import modelos.*;
import java.util.Scanner;

public class pessoa {

    private static void imprimirEstudante(estudantePessoa objeto, String dado) {
 
        String saida = dado + "\n";
        System.out.println(objeto.toString());
    }
    private static void imprimirtrabalhador(trabalhadorPessoa obj, String dado) {
       
        String saida = dado + "\n";
        System.out.println(obj.toString());
    }
    private static void imprimirGraduado(graduadoEstudante ob, String dado) {
        
        String saida = dado + "\n";
        System.out.println(ob.toString());
    }
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            
            estudantePessoa ep = new estudantePessoa();
            System.out.println("Digite sua matricula");
            ep.setMatricula(leitor.nextInt());
            System.out.println("Digite seu Curso");
            ep.setCurso(leitor.next());
            System.out.println("Digite seu Campus");
            ep.setCampus(leitor.next());

            trabalhadorPessoa tp = new trabalhadorPessoa();
            System.out.println("Digite seu departamento");
            tp.setDepartemanto(leitor.next());
            System.out.println("Digite sua função");
            tp.setFuncao(leitor.next());
            System.out.println("Digite seu Salario");
            tp.setSalario(leitor.nextInt());

            graduadoEstudante ge = new graduadoEstudante();
            System.out.println("Digite seu ano de conclusão");
            ge.setAnoConclusao(leitor.nextInt());
            System.out.println("Digite seu ano de colação");
            ge.setAnoColacaoGrau(leitor.nextInt());
            System.out.println("Digite seu numero de diploma");
            ge.setNumeroDiploma(leitor.nextInt());

            imprimirEstudante(ep, "Estudante");
            imprimirtrabalhador(tp, "Trabalhador");
            imprimirGraduado(ge, "graduando");

        } catch (Exception erro) {
            
            System.out.println(erro.getMessage());
        }
    }
}
