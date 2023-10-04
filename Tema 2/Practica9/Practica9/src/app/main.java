package app;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lib.libP9;

/**
 *
 * @author onnx
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrp = new javax.swing.ButtonGroup();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListEs = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        langEn = new javax.swing.JRadioButton();
        langAl = new javax.swing.JRadioButton();
        langIt = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        outTls = new javax.swing.JTextField();
        btnEnd = new javax.swing.JButton();
        btnCls = new javax.swing.JButton();
        btnTls = new javax.swing.JButton();
        btnTestIcon = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtListEs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Hola", "Adios", "Puerta", "Ventana", "Ratón", "Automovil", "Casa" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(txtListEs);

        jLabel1.setFont(new java.awt.Font("Literata", 0, 18)); // NOI18N
        jLabel1.setText("Traducción");

        btnGrp.add(langEn);
        langEn.setText("Ingles");
        langEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langEnActionPerformed(evt);
            }
        });

        btnGrp.add(langAl);
        langAl.setText("Aleman");
        langAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langAlActionPerformed(evt);
            }
        });

        btnGrp.add(langIt);
        langIt.setText("Italiano");
        langIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langItActionPerformed(evt);
            }
        });

        jLabel2.setText("Traducción");

        outTls.setEditable(false);

        btnEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons/outImage.png"))); // NOI18N
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        btnCls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons/clsImage.png"))); // NOI18N
        btnCls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClsActionPerformed(evt);
            }
        });

        btnTls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons/tlsImage.png"))); // NOI18N
        btnTls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTlsActionPerformed(evt);
            }
        });

        btnTestIcon.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(outTls, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTls)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCls))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(langAl)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(langEn)
                                        .addComponent(langIt)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnEnd)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTestIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEnd)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnTls)
                        .addComponent(btnCls)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(langEn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(langIt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(langAl)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(outTls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnTestIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        // Icono del boton btnTestIcon

        String imgPath = "/app/icons/bigImage.jpg";
        ImageIcon btnTestImage = new ImageIcon(getClass().getResource(imgPath));

        Image newImageSize = btnTestImage.getImage().getScaledInstance(24, 24, Image.SCALE_DEFAULT);

        btnTestIcon.setIcon(new ImageIcon(newImageSize));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void langEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langEnActionPerformed
        // Idioma Ingles
        JOptionPane.showMessageDialog(rootPane, "Ingles Seleccionado!");
        
        
        
    }//GEN-LAST:event_langEnActionPerformed

    private void langAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langAlActionPerformed
        // Idioma Italiano
        JOptionPane.showMessageDialog(rootPane, "Aleman Seleccionado!");
        
    }//GEN-LAST:event_langAlActionPerformed

    private void langItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langItActionPerformed
        // Idioma Aleman
        JOptionPane.showMessageDialog(rootPane, "Italiano Seleccionado!");
        
    }//GEN-LAST:event_langItActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEndActionPerformed

    private void btnClsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClsActionPerformed
        txtListEs.clearSelection();
        btnGrp.clearSelection();
        outTls.setText("");
    }//GEN-LAST:event_btnClsActionPerformed

    private void btnTlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTlsActionPerformed
        
        libP9 myLib = new libP9();
        
        String txt = txtListEs.getSelectedValue();
        
        if (langEn.isSelected()) {
            outTls.setText(myLib.getTlsTxt(txt, "En"));
        }
        else if (langIt.isSelected()) {
            outTls.setText(myLib.getTlsTxt(txt, "It"));
        }
        else if (langAl.isSelected()) {
            outTls.setText(myLib.getTlsTxt(txt, "Al"));
        }
        
    }//GEN-LAST:event_btnTlsActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCls;
    private javax.swing.JButton btnEnd;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JButton btnTestIcon;
    private javax.swing.JButton btnTls;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton langAl;
    private javax.swing.JRadioButton langEn;
    private javax.swing.JRadioButton langIt;
    private javax.swing.JTextField outTls;
    private javax.swing.JList<String> txtListEs;
    // End of variables declaration//GEN-END:variables
}