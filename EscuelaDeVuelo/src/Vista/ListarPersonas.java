/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Administrar_Personas;
import Controlador.Administrar_Vuelo;
import Modelo.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        jTable1.updateUI();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTable1);

        jButton2.setText("< Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
            fila[4] = listaPersonas.get(i).getSexo();
            fila[5] = listaPersonas.get(i).getFecha_nacimiento();
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new MenuPrincipalAdministrador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarPersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
