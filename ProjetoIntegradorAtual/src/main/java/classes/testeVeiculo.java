/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

import javax.swing.JOptionPane;
import classes.*;
import enumeradores.tipoCliente;
import enumeradores.tipoLogradouro;
import enumeradores.tipoModeloVeiculo;
import enumeradores.tiposTelefone;
import java.util.ArrayList;
import persistenciaVeiculo.*;

/**
 *
 * @author ALUNO
 */
public class testeVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form testeVeiculo
     */
    public testeVeiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1Teste = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1testeVeiculo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1Teste.setText("teste");
        jButton1Teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1TesteActionPerformed(evt);
            }
        });

        jTextArea1testeVeiculo.setColumns(20);
        jTextArea1testeVeiculo.setRows(5);
        jScrollPane1.setViewportView(jTextArea1testeVeiculo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jButton1Teste)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1Teste)
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1TesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1TesteActionPerformed

        try {
            veiculoDao teste = new veiculoDao();
            marca marca1 = new marca("FIAT", "fiat");
            modelo modelo1 = new modelo("uno", 2020, 2021);
            veiculo veiculo1 = new veiculo(WIDTH, WIDTH, marca1, modelo1, "pj3j54", "1234567", tipoModeloVeiculo.SUV);

//            endereco testeEndereco = new endereco("Rua 10 Q 20", 255, "Vila Nova", "casa 2", "Goiania", "GO", 74703010, tipoLogradouro.RUA);
//            telefone testeTelefone = new telefone("62985738612", tiposTelefone.CELULAR);
//            cliente a4 = new cliente(testeTelefone, 4, testeEndereco, "Lucas@", tipoCliente.PESSOAJURIDICA, "05911668166", "10/01/2005", "Razão");
            //teste.incluir(veiculo1);
            //teste.excluir(3);
//            String saida = "Lista veiculos";
//            ArrayList<veiculo> listaVeiculos = null;
//            
//            listaVeiculos = teste.obterVeiculo();
//            
//            for (int i = 0; i < listaVeiculos.size(); i++) {
//                
//                saida += "\n" +listaVeiculos.get(i).toString();
//                
//            }
//
//            jTextArea1testeVeiculo.setText(saida);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
            erro.printStackTrace();
        }


    }//GEN-LAST:event_jButton1TesteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testeVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testeVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Teste;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1testeVeiculo;
    // End of variables declaration//GEN-END:variables
}
