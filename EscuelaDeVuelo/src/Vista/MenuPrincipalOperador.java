/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Administrar_Personas;
import Modelo.Persona;
import java.awt.Image;
import java.util.ArrayList;
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
        btnAlertas.setVisible(false);
        btnAlertas.setEnabled(false);
        alertas();
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
        btnListarAeronave = new javax.swing.JButton();
        btnIngresarCompoenente = new javax.swing.JButton();
        btnAlertas = new javax.swing.JButton();
        btnMantenimientos = new javax.swing.JButton();

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

        btnIngresarCompoenente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IngresarComponentes.png"))); // NOI18N
        btnIngresarCompoenente.setBorder(null);
        btnIngresarCompoenente.setBorderPainted(false);
        btnIngresarCompoenente.setContentAreaFilled(false);
        btnIngresarCompoenente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarCompoenente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarCompoenenteActionPerformed(evt);
            }
        });

        btnAlertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/not1.png"))); // NOI18N
        btnAlertas.setBorder(null);
        btnAlertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertasActionPerformed(evt);
            }
        });

        btnMantenimientos.setText("Mantenimientos");
        btnMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnIngresarVuelos)
                                            .addComponent(btnListarVuelos)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(btnMantenimientos)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnListarPiloto)
                                    .addComponent(btnIngresarPiloto)
                                    .addComponent(btnListarLicencias))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnListarComponentes)
                                    .addComponent(btnListarAeronave)
                                    .addComponent(btnIngresarCompoenente)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlertas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngresarCompoenente)
                            .addComponent(btnListarLicencias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(btnAlertas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnMantenimientos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
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

    private void btnListarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAeronaveActionPerformed
        // TODO add your handling code here:
        ListarAeronave btn = new ListarAeronave();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListarAeronaveActionPerformed

    private void btnIngresarCompoenenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarCompoenenteActionPerformed
        // TODO add your handling code here:
        IngresarComponente btn = new IngresarComponente();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarCompoenenteActionPerformed

    private void btnAlertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertasActionPerformed
        // TODO add your handling code here:
        AlertasLicencias btn = new AlertasLicencias();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnAlertasActionPerformed

    private void btnMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientosActionPerformed
        // TODO add your handling code here:
        SubmenuMantenimientos btn = new SubmenuMantenimientos();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMantenimientosActionPerformed

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
    
    private void alertas (){
        
        Administrar_Personas persona = new Administrar_Personas();
         ArrayList<Persona> listaPersonas = persona.alertaLicencias();
        if(listaPersonas.size()>=1){
            btnAlertas.setVisible(true);
        btnAlertas.setEnabled(true);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlertas;
    private javax.swing.JButton btnIngresarCompoenente;
    private javax.swing.JButton btnIngresarPiloto;
    private javax.swing.JButton btnIngresarVuelos;
    private javax.swing.JButton btnListarAeronave;
    private javax.swing.JButton btnListarComponentes;
    private javax.swing.JButton btnListarLicencias;
    private javax.swing.JButton btnListarPiloto;
    private javax.swing.JButton btnListarVuelos;
    private javax.swing.JButton btnMantenimientos;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
