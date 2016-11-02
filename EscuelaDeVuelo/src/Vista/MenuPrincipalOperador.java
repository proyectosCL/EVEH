/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Diego
 */
public class MenuPrincipalOperador extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipalOperador() {
        initComponents();

        Image icon = new ImageIcon(getClass().getResource("../Imagenes/icono.jpg")).getImage();
        setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresarPiloto = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnListarVuelos = new javax.swing.JButton();
        btnListarPiloto = new javax.swing.JButton();
        btnListarLicencias = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnIngresarVuelos = new javax.swing.JButton();
        btnListarComponentes = new javax.swing.JButton();
        btnAgregarComponente = new javax.swing.JButton();
        btnListarAeronave = new javax.swing.JButton();
        btnAgregarSubcomponente = new javax.swing.JButton();
        btnListarTripulacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Operador");

        btnIngresarPiloto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IngresarPiloto.png"))); // NOI18N
        btnIngresarPiloto.setBorder(null);
        btnIngresarPiloto.setBorderPainted(false);
        btnIngresarPiloto.setContentAreaFilled(false);
        btnIngresarPiloto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPilotoActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/salir.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnListarVuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ListarVuelos.png"))); // NOI18N
        btnListarVuelos.setBorder(null);
        btnListarVuelos.setBorderPainted(false);
        btnListarVuelos.setContentAreaFilled(false);
        btnListarVuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVuelosActionPerformed(evt);
            }
        });

        btnListarPiloto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ListarPiloto.png"))); // NOI18N
        btnListarPiloto.setBorder(null);
        btnListarPiloto.setBorderPainted(false);
        btnListarPiloto.setContentAreaFilled(false);
        btnListarPiloto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPilotoActionPerformed(evt);
            }
        });

        btnListarLicencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ListarLicencias.png"))); // NOI18N
        btnListarLicencias.setBorder(null);
        btnListarLicencias.setBorderPainted(false);
        btnListarLicencias.setContentAreaFilled(false);
        btnListarLicencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarLicenciasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Menu Operador");

        btnIngresarVuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IngresarVuelos.png"))); // NOI18N
        btnIngresarVuelos.setBorder(null);
        btnIngresarVuelos.setBorderPainted(false);
        btnIngresarVuelos.setContentAreaFilled(false);
        btnIngresarVuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVuelosActionPerformed(evt);
            }
        });

        btnListarComponentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ListarComponentes.png"))); // NOI18N
        btnListarComponentes.setBorder(null);
        btnListarComponentes.setBorderPainted(false);
        btnListarComponentes.setContentAreaFilled(false);
        btnListarComponentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarComponentesActionPerformed(evt);
            }
        });

        btnAgregarComponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarComponente.png"))); // NOI18N
        btnAgregarComponente.setBorder(null);
        btnAgregarComponente.setBorderPainted(false);
        btnAgregarComponente.setContentAreaFilled(false);
        btnAgregarComponente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComponenteActionPerformed(evt);
            }
        });

        btnListarAeronave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdministrarAeronave.png"))); // NOI18N
        btnListarAeronave.setBorder(null);
        btnListarAeronave.setBorderPainted(false);
        btnListarAeronave.setContentAreaFilled(false);
        btnListarAeronave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAeronaveActionPerformed(evt);
            }
        });

        btnAgregarSubcomponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarSubComponente.png"))); // NOI18N
        btnAgregarSubcomponente.setBorder(null);
        btnAgregarSubcomponente.setBorderPainted(false);
        btnAgregarSubcomponente.setContentAreaFilled(false);
        btnAgregarSubcomponente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarSubcomponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSubcomponenteActionPerformed(evt);
            }
        });

        btnListarTripulacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ListarTripulacion.png"))); // NOI18N
        btnListarTripulacion.setBorder(null);
        btnListarTripulacion.setBorderPainted(false);
        btnListarTripulacion.setContentAreaFilled(false);
        btnListarTripulacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarTripulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTripulacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngresarVuelos)
                            .addComponent(btnListarVuelos)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton4)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListarPiloto)
                            .addComponent(btnIngresarPiloto)
                            .addComponent(btnListarLicencias)
                            .addComponent(btnListarTripulacion))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListarAeronave)
                            .addComponent(btnListarComponentes)
                            .addComponent(btnAgregarComponente)
                            .addComponent(btnAgregarSubcomponente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListarVuelos)
                    .addComponent(btnListarPiloto)
                    .addComponent(btnListarAeronave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresarPiloto)
                    .addComponent(btnIngresarVuelos)
                    .addComponent(btnListarComponentes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregarComponente)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarSubcomponente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnListarTripulacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarLicencias)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPilotoActionPerformed
        // TODO add your handling code here:
        IngresarPiloto ip = new IngresarPiloto();
        ip.setLocationRelativeTo(null);
        ip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarPilotoActionPerformed

    private void btnListarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVuelosActionPerformed
        // TODO add your handling code here:
        ListarVuelo lv = new ListarVuelo();
        lv.setLocationRelativeTo(null);
        lv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarVuelosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Inicio btn = new Inicio();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnListarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPilotoActionPerformed
        // TODO add your handling code here:
        ListarPiloto btn = new ListarPiloto();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarPilotoActionPerformed

    private void btnListarLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarLicenciasActionPerformed
        // TODO add your handling code here:
        ListarLicenciaPiloto btn = new ListarLicenciaPiloto();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarLicenciasActionPerformed

    private void btnIngresarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVuelosActionPerformed
        // TODO add your handling code here:
        IngresarVuelo btn = new IngresarVuelo();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarVuelosActionPerformed

    private void btnListarComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarComponentesActionPerformed
        // TODO add your handling code here:
        ListarComponente btn = new ListarComponente();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarComponentesActionPerformed

    private void btnAgregarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComponenteActionPerformed
        // TODO add your handling code here:
        AgregarComponente btn = new AgregarComponente();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarComponenteActionPerformed

    private void btnListarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAeronaveActionPerformed
        // TODO add your handling code here:
        ListarAeronave btn = new ListarAeronave();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarAeronaveActionPerformed

    private void btnAgregarSubcomponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSubcomponenteActionPerformed
        // TODO add your handling code here:
        IngresarSubComponente btn = new IngresarSubComponente();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarSubcomponenteActionPerformed

    private void btnListarTripulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTripulacionActionPerformed
        // TODO add your handling code here:
        ListarTripulacion btn = new ListarTripulacion();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarTripulacionActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuPrincipalAdministrador().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComponente;
    private javax.swing.JButton btnAgregarSubcomponente;
    private javax.swing.JButton btnIngresarPiloto;
    private javax.swing.JButton btnIngresarVuelos;
    private javax.swing.JButton btnListarAeronave;
    private javax.swing.JButton btnListarComponentes;
    private javax.swing.JButton btnListarLicencias;
    private javax.swing.JButton btnListarPiloto;
    private javax.swing.JButton btnListarTripulacion;
    private javax.swing.JButton btnListarVuelos;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
