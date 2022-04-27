package visao;

import javax.swing.JOptionPane;
import modelos.classes.INatural;
import javax.swing.table.DefaultTableModel;
import modelos.Interface.Inatural;

public class telagrid extends javax.swing.JFrame {

    public telagrid() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1numero1 = new javax.swing.JTextField();
        jTextField2numero2 = new javax.swing.JTextField();
        resultado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("PRIMEIRO NÚMERO:");

        jLabel2.setText("SEGUNDO NÚMERO:");

        resultado.setText("EXECUTAR");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Primeiro Numero", "Segundo Numero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1numero1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2numero2)))
                .addGap(33, 33, 33)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        try {
            int numero1 = Integer.parseInt(jTextField1numero1.getText());
            int numero2 = Integer.parseInt(jTextField2numero2.getText());

            Inatural primeiro = new INatural();
            primeiro.setNumero(numero1);

            Inatural segundo = new INatural();
            segundo.setNumero(numero2);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            String[] vetString = new String[3];
            vetString[0] = "Quadrado Perfeito";
            if (primeiro.eNumeroQuadradoPerfeito()) {
                vetString[1] = "Sim";
            } else {
                vetString[1] = "Não";
            }
            if (segundo.eNumeroQuadradoPerfeito()) {
                vetString[2] = "Sim";
            } else {
                vetString[2] = "Não";
            }
            model.addRow(vetString);
            vetString = new String[3];
            vetString[0] = "Fatorial";
            vetString[1] = primeiro.calcularFatorial().getNumero() + "";
            vetString[2] = segundo.calcularFatorial().getNumero() + "";
            model.addRow(vetString);
            vetString = new String[3];
            vetString[0] = "È numero perfeito";
            if (primeiro.calcularNumeroPerfeito()) {
                vetString[1] = "Sim";
            } else {
                vetString[1] = "Não";
            }
            if (segundo.calcularNumeroPerfeito()) {
                vetString[2] = "Sim";
            } else {
                vetString[2] = "Não";
            }
            model.addRow(vetString);
            vetString = new String[3];
            vetString[0] = "È primo";
            if (primeiro.eprimo()) {
                vetString[1] = "Sim";
            } else {
                vetString[1] = "Não";
            }
            if (segundo.eprimo()) {
                vetString[2] = "Sim";
            } else {
                vetString[2] = "Não";
            }
            model.addRow(vetString);
            vetString = new String[3];
            vetString[0] = "È capicua";
            if (primeiro.capicua()) {
                vetString[1] = "Sim";
            } else {
                vetString[1] = "Não";
            }
            if (segundo.capicua()) {
                vetString[2] = "Sim";
            } else {
                vetString[2] = "Não";
            }
            model.addRow(vetString);
            vetString = new String[3];
            vetString[0] = "base 10 para 2";
            vetString[1] = primeiro.base10para2() + "";
            vetString[2] = segundo.base10para2() + "";
            model.addRow(vetString);
            vetString = new String[3];
            vetString[0] = "base 10 para 8";
            vetString[1] = primeiro.base10para8() + "";
            vetString[2] = segundo.base10para8() + "";
            model.addRow(vetString);
            vetString = new String[3];
            vetString[0] = "base 10 para 16";
            vetString[1] = primeiro.base10para16() + "";
            vetString[2] = segundo.base10para16() + "";
            model.addRow(vetString);
            vetString = new String[3];
            vetString[0] = "Calcular MDC:";
            vetString[1] = primeiro.calcularMDC(numero2).getNumero() + "";
            vetString[2] = segundo.calcularMDC(numero1).getNumero() + "";
            model.addRow(vetString);
            vetString = new String[3];
            vetString[0] = "Calcular MMC:";
            vetString[1] = primeiro.calcularMMC(numero2).getNumero() + "";
            vetString[2] = segundo.calcularMMC(numero1).getNumero() + "";
            model.addRow(vetString);
            vetString = new String[3];
            vetString[0] = "Primos entre si";
            if (primeiro.primosEntreSi(numero2)) {
                vetString[1] = "Sim";
            } else {
                vetString[1] = "Não";
            }
            if (segundo.primosEntreSi(numero1)) {
                vetString[2] = "Sim";
            } else {
                vetString[2] = "Não";
            }
            model.addRow(vetString);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }


    }//GEN-LAST:event_resultadoActionPerformed

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
            java.util.logging.Logger.getLogger(telagrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telagrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telagrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telagrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telagrid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1numero1;
    private javax.swing.JTextField jTextField2numero2;
    private javax.swing.JButton resultado;
    // End of variables declaration//GEN-END:variables
}
