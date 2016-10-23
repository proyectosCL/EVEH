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
        btnEliminarCompte.setEnabled(false);
        btnModificarCompte.setEnabled(false);

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

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnEliminarCompte = new javax.swing.JButton();
        btnModificarCompte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jButton2.setText("< Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnEliminarCompte.setText("Eliminar Persona");
        btnEliminarCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCompteActionPerformed(evt);
            }
        });

        btnModificarCompte.setText("Modificar Persona");
        btnModificarCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCompteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Listar Personas");

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
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(btnEliminarCompte)
                .addGap(230, 230, 230)
                .addComponent(btnModificarCompte)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCompte)
                    .addComponent(btnModificarCompte))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        btnEliminarCompte.setEnabled(false);
        btnModificarCompte.setEnabled(false);
        cargarTablaComponentes();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new MenuPrincipalAdministrador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEliminarCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCompteActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el componente seleccionado?");
        if (JOptionPane.OK_OPTION == resp) {
            Administrar_Personas admp = new Administrar_Personas();
            Administrar_Usuarios usr = new Administrar_Usuarios();
            
            String rut = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String cuenta = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
           
            admp.eliminarPersona(rut);
            usr.eliminarUsuario(cuenta);
            JOptionPane.showMessageDialog(null, "se elimino correctamente");
            cargarTablaComponentes();
            
        } else {
            cargarTablaComponentes();
        }

    }//GEN-LAST:event_btnEliminarCompteActionPerformed

    private void btnModificarCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCompteActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Seguro que desea modificar el componente seleccionado?");
        if (JOptionPane.OK_OPTION == resp) {
            String rut = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();// aqui vot
            ModificarPersona modCompte= new ModificarPersona(rut);
//            modCompte.setVarRut(rut);
//            System.out.println("rut de listar"+rut);
            modCompte.setVisible(true);
            //modCompte.cargar();
            this.dispose();
        } else {
            cargarTablaComponentes();
        }
    }//GEN-LAST:event_btnModificarCompteActionPerformed

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1FocusLost

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        // TODO add your handling code here:
        btnEliminarCompte.setEnabled(true);
        btnModificarCompte.setEnabled(true);
    }//GEN-LAST:event_jTable1FocusGained

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
            fila[11] = listaPersonas.get(i).getPass();
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
               

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarCompte;
    private javax.swing.JButton btnModificarCompte;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
