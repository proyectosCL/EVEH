/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Administrar_Componente;
import Controlador.Administrar_Personas;
import Controlador.Administrar_Usuarios;
import Controlador.Administrar_Vuelo;
import Modelo.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Diego S.
 */
public class ListarPersonas extends javax.swing.JFrame {
    
    public class Render extends DefaultTableCellRenderer{
            
        }

    public ListarPersonas() {

        initComponents();
        cargarTablaComponentes();
        btnDesactivar.setEnabled(false);
        btnModificarCompte.setEnabled(false);
        btnactivar.setEnabled(false);

//        DefaultTableModel modelo = new DefaultTableModel() {
//            public boolean isCellEditable(int row, int column) {
//                return false;
//            }
//        };
//        jTable1.setModel(modelo);
//        //.:Nombres de columnas:.
//        modelo.addColumn("ID");
//        modelo.addColumn("RUT");
//        modelo.addColumn("NOMBRE");
//        modelo.addColumn("APELLIDOS");
//        modelo.addColumn("SEXO");
//        modelo.addColumn("FECHA NACIMIENTO");
//        modelo.addColumn("TELEFONO");
//        modelo.addColumn("CORREO");
//        modelo.addColumn("NACIONALIDAD");
//        modelo.addColumn("ID USUARIO");
//        modelo.addColumn("CUENTA");
//        modelo.addColumn("PASS");
//        
//        modelo.addColumn("PERFIL");
//        modelo.addColumn("ESTADO CUENTA");
//        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        TableColumnModel columnModel = jTable1.getColumnModel();
//        //.:Tamaño de columnas:.
////        columnModel.getColumn(0).setPreferredWidth(40);
////        columnModel.getColumn(1).setPreferredWidth(140);
////        columnModel.getColumn(2).setPreferredWidth(140);
////        columnModel.getColumn(3).setPreferredWidth(55);
////        columnModel.getColumn(4).setPreferredWidth(90);
////        columnModel.getColumn(5).setPreferredWidth(120);
////        columnModel.getColumn(6).setPreferredWidth(60);
////        columnModel.getColumn(7).setPreferredWidth(80);
////        columnModel.getColumn(8).setPreferredWidth(80);
//        jTable1.updateUI();

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        btnModificarCompte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnactivar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listar Personas");

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/actualizar.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/regresar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/Desactivar.png"))); // NOI18N
        btnDesactivar.setBorder(null);
        btnDesactivar.setBorderPainted(false);
        btnDesactivar.setContentAreaFilled(false);
        btnDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        btnModificarCompte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/editar.png"))); // NOI18N
        btnModificarCompte.setBorder(null);
        btnModificarCompte.setBorderPainted(false);
        btnModificarCompte.setContentAreaFilled(false);
        btnModificarCompte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCompteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Listar Personas");

        btnactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/aceptar_1.png"))); // NOI18N
        btnactivar.setBorder(null);
        btnactivar.setBorderPainted(false);
        btnactivar.setContentAreaFilled(false);
        btnactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnDesactivar)
                .addGap(75, 75, 75)
                .addComponent(btnactivar)
                .addGap(85, 85, 85)
                .addComponent(btnModificarCompte)
                .addContainerGap(571, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(jButton2))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDesactivar)
                    .addComponent(btnactivar)
                    .addComponent(btnModificarCompte))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        btnActualizar.setText("En curso...");
        btnActualizar.setEnabled(false);
        btnDesactivar.setEnabled(false);
        btnModificarCompte.setEnabled(false);
        
        cargarTablaComponentes();
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(true);
        btnDesactivar.setEnabled(false);
        btnModificarCompte.setEnabled(false);
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new MenuPrincipalAdministrador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        // TODO add your handling code here:
        
        btnDesactivar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnactivar.setEnabled(false);
        btnModificarCompte.setEnabled(false);
        btnDesactivar.setText("en curso...");
        try{
        String rut = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String cuenta = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea desactivar la cuenta seleccionada?");
        
        if (JOptionPane.OK_OPTION == resp) {
            
            
            
             
                 Administrar_Personas admp = new Administrar_Personas();
                 Administrar_Usuarios usr = new Administrar_Usuarios();

                

                //admp.eliminarPersona(rut);
                usr.eliminarUsuario(cuenta);

                cargarTablaComponentes();
                JOptionPane.showMessageDialog(null, "se desactivó correctamente");
                btnDesactivar.setText("Desactivar Cuenta");
                btnActualizar.setEnabled(true);
                
           
   
             
                
            
            
            
        } else {
           JOptionPane.showMessageDialog(null, "no se realizaron cambios");
            btnDesactivar.setText("Desactivar Cuenta");
            btnActualizar.setEnabled(true);
        }
        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "primero seleccione una cuenta");
                btnDesactivar.setText("Desactivar Cuenta");
                btnActualizar.setEnabled(true);
        }
        
        //btnEliminarCompte.setEnabled(true);
        //btnModificarCompte.setEnabled(true);

    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void btnModificarCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCompteActionPerformed
        // TODO add your handling code here:
        btnDesactivar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnactivar.setEnabled(false);
        btnModificarCompte.setEnabled(false);
        btnModificarCompte.setText("en curso...");
        btnActualizar.setEnabled(false);
        
        try{
        String rut = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();// aqui vot
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea modificar el Usuario seleccionado?");
        if (JOptionPane.OK_OPTION == resp) {
            
                
                ModificarPersona modCompte= new ModificarPersona(rut);
    //            modCompte.setVarRut(rut);
    //            System.out.println("rut de listar"+rut);
                modCompte.setVisible(true);
                //modCompte.cargar();
                this.dispose();
                
            }else {
                JOptionPane.showMessageDialog(null, "no se realizaron cambios");
                btnModificarCompte.setText("Modificar Cuenta");
                btnActualizar.setEnabled(true);
                
            }
        
        
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "primero seleccione una cuenta");
                btnModificarCompte.setText("Modificar Cuenta");
                btnActualizar.setEnabled(true);
        }
    }//GEN-LAST:event_btnModificarCompteActionPerformed

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1FocusLost

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        // TODO add your handling code here:
        btnDesactivar.setEnabled(true);
        btnModificarCompte.setEnabled(true);
        btnactivar.setEnabled(true);
    }//GEN-LAST:event_jTable1FocusGained

    private void btnactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactivarActionPerformed
       
        btnDesactivar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnactivar.setEnabled(false);
        btnModificarCompte.setEnabled(false);
        btnactivar.setText("en curso...");
        
        try{
            String rut = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String cuenta = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea activar la cuenta seleccionada?");
        if (JOptionPane.OK_OPTION == resp) {
            
            
                Administrar_Personas admp = new Administrar_Personas();
                Administrar_Usuarios usr = new Administrar_Usuarios();

                

                //admp.eliminarPersona(rut);
                usr.darDeAlta(cuenta);

                cargarTablaComponentes();
                JOptionPane.showMessageDialog(null, "se activó correctamente");
                btnactivar.setText("Activar Cuenta");
                btnActualizar.setEnabled(true);
            } 
        else {
               JOptionPane.showMessageDialog(null, "no se realizaron cambios");
               btnactivar.setText("Activar Cuenta");
                btnActualizar.setEnabled(true);
            }
    } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "primero seleccione una cuenta");
                btnactivar.setText("Activar Cuenta");
                btnActualizar.setEnabled(true);
    }
    
        
    }//GEN-LAST:event_btnactivarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarPersonas().setVisible(true);
            }
        });
    }
    
     private void cargarTablaComponentes() {
        //Definición de nombres y tamaño de las columnas al iniciar la ventana.
        Administrar_Personas per = new Administrar_Personas();
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1.setModel(modelo);
        //.:Nombres de columnas:.
        modelo.addColumn("ID");
        modelo.addColumn("RUT");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDOS");
        modelo.addColumn("SEXO");
        modelo.addColumn("FECHA NACIMIENTO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("CORREO");
        modelo.addColumn("NACIONALIDAD");
        modelo.addColumn("ID USUARIO");
        modelo.addColumn("CUENTA");
        modelo.addColumn("PASS");
        
        modelo.addColumn("PERFIL");
        modelo.addColumn("ESTADO CUENTA");
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = jTable1.getColumnModel();
        //.:Tamaño de columnas:.
//        columnModel.getColumn(0).setPreferredWidth(40);
//        columnModel.getColumn(1).setPreferredWidth(140);
//        columnModel.getColumn(2).setPreferredWidth(140);
//        columnModel.getColumn(3).setPreferredWidth(55);
//        columnModel.getColumn(4).setPreferredWidth(90);
//        columnModel.getColumn(5).setPreferredWidth(120);
//        columnModel.getColumn(6).setPreferredWidth(60);
//        columnModel.getColumn(7).setPreferredWidth(80);
//        columnModel.getColumn(8).setPreferredWidth(80);

        ArrayList<Persona> listaPersonas = per.listarPersonas();
       
        Object[] fila = new Object[14];
        int num = listaPersonas.size();
        for (int i = 0; i < num; i++) {
            
            fila[0] = listaPersonas.get(i).getId_persona();
            fila[1] = listaPersonas.get(i).getRut();
            fila[2] = listaPersonas.get(i).getNombre();
            fila[3] = listaPersonas.get(i).getApellidos();
            
            
            char sex = listaPersonas.get(i).getSexo();
            String sexo = ""+sex;
            if (sexo.equals("F")) {
                fila[4] = "Femenino";
            } else {
                fila[4] = "Masculino";
            }
            
            
            //cortar fecha 
            String fecha = listaPersonas.get(i).getFecha_nacimiento();
            
            fila[5] = fecha.substring(0, 10);
            
            
            fila[6] = listaPersonas.get(i).getTelefono();
            fila[7] = listaPersonas.get(i).getCorreo();
            fila[8] = listaPersonas.get(i).getNacionalidad();
            fila[9] = listaPersonas.get(i).getId_usuario();
            fila[10] = listaPersonas.get(i).getUsuario();
            //fila[11] = listaPersonas.get(i).getPass();
            //no mostra pass
            fila[11] = "***********";
            switch(listaPersonas.get(i).getId_tipo()){
                case 1 :  fila[12] = "administrador";
                break;

                case 2 :  fila[12] = "operador";
                break;

                case 3 : fila[12] = "piloto";
                break;

                case 4 :  fila[12] ="inspector";
                break;

            }
            
            fila[13] = listaPersonas.get(i).getEstado_usuario();
            
            modelo.addRow(fila);
        }
        jTable1.updateUI();
        btnDesactivar.setEnabled(false);
        btnModificarCompte.setEnabled(false);
        btnactivar.setEnabled(false);
               

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnModificarCompte;
    private javax.swing.JButton btnactivar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
