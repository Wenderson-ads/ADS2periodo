package modelos;

import javax.swing.JOptionPane;
import modelos.equacaoSegundoGrau;

public class telaEquacao extends javax.swing.JFrame {

    /**
     * Creates new form telaEquacao
     */
    public telaEquacao() {
        initComponents();
        jTextArea1tela.setEditable(false);
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1valorB = new javax.swing.JLabel();
        jLabel2valorA = new javax.swing.JLabel();
        jLabel3valorC = new javax.swing.JLabel();
        jTextField1valor1 = new javax.swing.JTextField();
        jTextField2valor2 = new javax.swing.JTextField();
        jTextField3valor3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1tela = new javax.swing.JTextArea();
        jButton1resultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EQUAÇÃO DO SEGUNDO GRAU");

        jInternalFrame1.setBackground(new java.awt.Color(0, 153, 102));
        jInternalFrame1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        jInternalFrame1.setVisible(true);

        jLabel1valorB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1valorB.setText("VALOR DE B:");

        jLabel2valorA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2valorA.setText("VALOR DE A:");

        jLabel3valorC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3valorC.setText("VALOR DE C:");

        jTextField3valor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3valor3ActionPerformed(evt);
            }
        });

        jTextArea1tela.setColumns(20);
        jTextArea1tela.setRows(5);
        jScrollPane1.setViewportView(jTextArea1tela);

        jButton1resultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1resultado.setText("RESULTADO");
        jButton1resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1resultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel2valorA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1valorB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3valorC, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3valor3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1valorB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3valorC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3valor3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2valorA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButton1resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1resultadoActionPerformed

        try {

            equacaoSegundoGrau eq = new equacaoSegundoGrau();
            eq.setA(Integer.parseInt(jTextField1valor1.getText()));
            eq.setB(Integer.parseInt(jTextField2valor2.getText()));
            eq.setC(Integer.parseInt(jTextField3valor3.getText()));

            String saida = "";

            saida += "Valor de A:" + eq.getA() + "\n";
            saida += "Valor de B:" + eq.getB() + "\n";
            saida += "Valor de C:" + eq.getC() + "\n";
            saida += "\n";
            saida += "Delta:" + eq.delta() + "\n";
            saida += "" + eq.raizesDaEquacao();
            jTextArea1tela.setText(saida);
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(this, erro.getMessage());

        }


    }//GEN-LAST:event_jButton1resultadoActionPerformed

    private void jTextField3valor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3valor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3valor3ActionPerformed

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
            java.util.logging.Logger.getLogger(telaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaEquacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1resultado;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1valorB;
    private javax.swing.JLabel jLabel2valorA;
    private javax.swing.JLabel jLabel3valorC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1tela;
    private javax.swing.JTextField jTextField1valor1;
    private javax.swing.JTextField jTextField2valor2;
    private javax.swing.JTextField jTextField3valor3;
    // End of variables declaration//GEN-END:variables

}