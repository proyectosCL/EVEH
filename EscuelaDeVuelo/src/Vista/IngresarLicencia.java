/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Administrar_Licencia;
import Controlador.Administrar_Personas;
import Controlador.Administrar_Pilotos;
import Modelo.Licencia;
import Modelo.Tipo_licencia;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Celso
 */
public class IngresarLicencia extends javax.swing.JFrame {

    /**
     * Creates new form IngresarLicencia
     */
    
     class ComboItem {

            
         String key;
         String value;

        public ComboItem(String key, String value)
        {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString()
        {
            return key;
        }

        public String getKey()
        {
            return key;
        }

        public String getValue()
        {
            return value;
        }
    
}
     
    public IngresarLicencia() {
    
        
        
       
            initComponents();
            
            
        Administrar_Licencia al = new Administrar_Licencia();
        ArrayList<Tipo_licencia> lista = al.listarTipoLicencia();
        
        int num = lista.size();
        for (int i = 0; i < num; i++) {
            this.jComboBoxTipoLicencia.addItem(new ComboItem(lista.get(i).getDescripcion(),String.valueOf(lista.get(i).getId())));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTipoLicencia = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNumeroLicencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldHoras = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDias = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        JDateVencimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar Licencia");

        jLabel3.setText("Numero de Licencia");

        jTextFieldRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRutActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de Licencia");

        jComboBoxTipoLicencia.setToolTipText("");
        jComboBoxTipoLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoLicenciaActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de Vencimiento");

        jLabel8.setText("Rut del Piloto");

        jTextFieldNumeroLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroLicenciaActionPerformed(evt);
            }
        });

        jLabel9.setText("Horas de vuelo");

        jTextFieldHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHorasActionPerformed(evt);
            }
        });

        jLabel10.setText("Dias de vuelo");

        jTextFieldDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiasActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        JDateVencimiento.setDateFormatString("dd/mm/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addGap(0, 165, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JDateVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRut)
                            .addComponent(jComboBoxTipoLicencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNumeroLicencia)
                            .addComponent(jTextFieldHoras)
                            .addComponent(jTextFieldDias))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNumeroLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(JDateVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRutActionPerformed

    private void jTextFieldNumeroLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroLicenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroLicenciaActionPerformed

    private void jTextFieldHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHorasActionPerformed

    private void jTextFieldDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiasActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // persona
        //validaciones

        
        Object item = jComboBoxTipoLicencia.getSelectedItem();
        int tipo_licencia = Integer.parseInt(((ComboItem)item).getValue());
        
        int id_licencia = 0;
        String rut = jTextFieldRut.getText();
        int numero_licencia = Integer.parseInt(jTextFieldNumeroLicencia.getText());
        
        Date fecha = JDateVencimiento.getDate();
        String fecha_vencimiento = null;
        DateFormat df = new SimpleDateFormat("dd/mm/yyyyy");
        try {
            fecha_vencimiento = df.format(fecha);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        int horas = Integer.parseInt(jTextFieldHoras.getText());
        int dias = Integer.parseInt(jTextFieldDias.getText());
        
        
        Administrar_Licencia al = new Administrar_Licencia();
        Administrar_Pilotos ap = new Administrar_Pilotos();
        int id_piloto = 0;
        id_piloto = ap.buscarIdPiloto(rut);
       
//        JOptionPane.showMessageDialog(null,"._."+id_piloto);
        

                Licencia userr = new Licencia(id_licencia,numero_licencia,dias, horas, fecha_vencimiento, tipo_licencia,id_piloto);

                
               al.ingresarLicencia(userr);

//                    if (usr.buscarUsuario(userr.getUsuario())) {
//                            JOptionPane.showMessageDialog(null, "el nombre de usuario ya esta registrado, por favor seleccione otro");
//                            txtUsuario.requestFocus();
//
//                        } else {
//            
//                            if (admp.buscarPersona(person.getRut())) {
//                                    JOptionPane.showMessageDialog(null, "El Rut Ya esta registrado");
//                                    txtRut.requestFocus();
//
//                                } else {
//                
//                                    int dialogButton = JOptionPane.YES_NO_OPTION;
//                                    int dialogResult = JOptionPane.showConfirmDialog(this, "¿Desea ingresar al sistema?", "confirmacion", dialogButton);
//                                    if(dialogResult == 0) {
//                    
//                                            if (usr.ingresarUsuario(userr)&&admp.ingresarPersona(person)) {
//                                                    JOptionPane.showMessageDialog(null, "Se ingreso correctamente");
//                                                }
//                                        } else {
//                                            JOptionPane.showMessageDialog(null, "no se puedo ingresar");
//                                        }
//
//                JOptionPane.showMessageDialog(null, id_persona+rut+nombre+apellidos+sexo+fechaNac+telefono+correo+nacionalidad+iduser+nombreusuario+pass+tipo);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        MenuPrincipalAdministrador menu = new MenuPrincipalAdministrador();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jComboBoxTipoLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoLicenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoLicenciaActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarLicencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateVencimiento;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox jComboBoxTipoLicencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldDias;
    private javax.swing.JTextField jTextFieldHoras;
    private javax.swing.JTextField jTextFieldNumeroLicencia;
    private javax.swing.JTextField jTextFieldRut;
    // End of variables declaration//GEN-END:variables
}
