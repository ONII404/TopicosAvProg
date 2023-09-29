/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import lib.libA1;

/**
 *
 * @author onnx
 */
public class MainA extends javax.swing.JFrame {

   libA1 a1 = new libA1();
    
    /**
     * Creates new form MainA
     */
    public MainA() {
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

        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputAge = new javax.swing.JTextField();
        calBtn = new javax.swing.JButton();
        clsBtn = new javax.swing.JButton();
        endBtn = new javax.swing.JButton();
        inputBtn = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setText("Nombre:");

        jLabel1.setText("Edad:");

        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        calBtn.setText("Calcular");
        calBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calBtnActionPerformed(evt);
            }
        });

        clsBtn.setText("Limpiar");
        clsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsBtnActionPerformed(evt);
            }
        });

        endBtn.setText("Terminar");
        endBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endBtnActionPerformed(evt);
            }
        });

        inputBtn.setText("Capturar");
        inputBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBtnActionPerformed(evt);
            }
        });

        resultado.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(calBtn)
                        .addGap(18, 18, 18)
                        .addComponent(clsBtn)
                        .addGap(18, 18, 18)
                        .addComponent(endBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputName)
                                    .addComponent(inputAge, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addComponent(inputBtn)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clsBtn)
                    .addComponent(calBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endBtn))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBtnActionPerformed
        
        a1.capturarDatos(inputName.getText(), inputAge.getText());

    }//GEN-LAST:event_inputBtnActionPerformed

    private void calBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calBtnActionPerformed

        resultado.setText("El Menor es: " + a1.mayorEdad());
    }//GEN-LAST:event_calBtnActionPerformed

    private void clsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsBtnActionPerformed
        a1.clearStack();
        inputAge.setText("");
        inputName.setText("");
        resultado.setText("...");
        
        System.out.print("-----------\nClear Data\n-----------\n");
    }//GEN-LAST:event_clsBtnActionPerformed

    private void endBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_endBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calBtn;
    private javax.swing.JButton clsBtn;
    private javax.swing.JButton endBtn;
    private javax.swing.JTextField inputAge;
    private javax.swing.JButton inputBtn;
    private javax.swing.JTextField inputName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
