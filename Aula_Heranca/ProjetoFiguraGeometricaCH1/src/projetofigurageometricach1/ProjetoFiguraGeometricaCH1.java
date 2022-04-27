/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofigurageometricach1;
import modelos.*;
/**
 *
 * @author ejmcc
 */
public class ProjetoFiguraGeometricaCH1 {
    private static void imprimir(FiguraGeometrica objeto, String dado){
        String saida = dado + "\n";
        saida += "Tipo da Figura: " + objeto.getTipoDaFigura() + "\n";
        saida += "Raio: " + objeto.getRaio() + "\n";
        saida += "Area Total: " + objeto.calcularAreaTotal() + "\n";
        saida += "Volume: " + objeto.calcularVolume() + "\n";
        System.out.println(saida);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Esfera bola = new Esfera(7);
            Cilindro tubo = new Cilindro(7,5);
            Cone pino = new Cone(5,8);
            
            FiguraGeometrica obj_a = new Esfera(7);
            FiguraGeometrica obj_b = new Cilindro(3,4);
            FiguraGeometrica obj_c = new Cone(4,5);
            imprimir(bola, "Dados da Bola");
            imprimir(tubo, "Dados do Tubo");
            imprimir(pino, "Dados do Pino");
            
            
                    
            
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
        
    }
    
}
