/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofigurageometricash;
//import modelos.Esfera;
//import modelos.Cilindro;
//import modelos.Cone;
import modelos.*;
/**
 *
 * @author ejmcc
 */
public class ProjetoFiguraGeometricaSH {

    private static void imprimirEsfera(Esfera objeto, String dado){
        String saida = dado + "\n";
        saida += "Tipo da Figura: " + objeto.getTipoDaFigura() + "\n";
        saida += "Raio: " + objeto.getRaio() + "\n";
        saida += "Area Total: " + objeto.calcularAreaTotal() + "\n";
        saida += "Volume: " + objeto.calcularVolume() + "\n";
        System.out.println(saida);
    }
    private static void imprimirCilindro(Cilindro objeto, String dado){
        String saida = dado + "\n";
        saida += "Tipo da Figura: " + objeto.getTipoDaFigura() + "\n";
        saida += "Raio: " + objeto.getRaio() + "\n";
        saida += "Area Total: " + objeto.calcularAreaTotal() + "\n";
        saida += "Volume: " + objeto.calcularVolume() + "\n";
        saida += "Area Lateral: " + objeto.calcularAreaLateral() + "\n";
        System.out.println(saida);
    }
    private static void imprimirCone(Cone objeto, String dado){
        String saida = dado + "\n";
        saida += "Tipo da Figura: " + objeto.getTipoDaFigura() + "\n";
        saida += "Raio: " + objeto.getRaio() + "\n";
        saida += "Area Total: " + objeto.calcularAreaTotal() + "\n";
        saida += "Volume: " + objeto.calcularVolume() + "\n";
        saida += "Area Lateral: " + objeto.calcularAreaLateral() + "\n";
        saida += "Geratriz: " + objeto.calcularGeratriz() + "\n";
        System.out.println(saida);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        //instancia ou  objeto
            Esfera bolaA = new Esfera();
            bolaA.setRaio(5);
            
            Cilindro tuboA = new Cilindro();
            tuboA.setRaio(5);
            tuboA.setAltura(3);
        
            Cone pinoA =new Cone();
            pinoA.setRaio(5);
            pinoA.setAltura(5);
            
            Esfera bolaB = new Esfera(10);
            
            Cilindro tuboB = new Cilindro(10, 8);

            Cone pinoB = new Cone(10, 9);
            
            Esfera bolaC = new Esfera(30);
            
            Cilindro tuboC = new Cilindro(30,40);
            
            Cone pinoC = new Cone(30,45);
            
            imprimirEsfera(bolaA,"Dados da Bola A");
            imprimirEsfera(bolaB,"Dados da Bola B");
            imprimirEsfera(bolaC,"Dados da Bola C");
            
            imprimirCilindro(tuboA,"Dados do Tudo A");
            imprimirCilindro(tuboB,"Dados do Tudo B");
            imprimirCilindro(tuboC,"Dados do Tudo C");
            
            imprimirCone(pinoA,"Dados do Pino A");
            imprimirCone(pinoB,"Dados do Pino B");
            imprimirCone(pinoC,"Dados do Pino C");

        //    
                        
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
    
}
