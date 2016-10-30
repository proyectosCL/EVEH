/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Administrar_Licencia;
import Controlador.Administrar_Pilotos;
import Modelo.Piloto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Celso
 */
public class ListarPiloto extends javax.swing.JFrame {

    /**
     * Creates new form ListarPiloto
     */
    private void Clear_Table(){
       for (int i = 0; i < jTable1.getRowCount(); i++) {
           modelo.removeRow(i);
           i-=1;
       }
   }
                           
    DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
  
    public ListarPiloto() {
        initComponents();
        jTable1.setModel(modelo);
        
        modelo.addColumn("ID");
        modelo.addColumn("RUT");
        modelo.addColumn("NOMBRE COMPLETO");
        modelo.addColumn("HORAS VUELO");
        modelo.addColumn("DIAS VUELO");
        modelo.addColumn("VENC. MEDICINA");
        modelo.addColumn("ULTIMO VUELO");
        modelo.addColumn("CANTIDAD DE LICENCIAS");
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(80);
        columnModel.getColumn(2).setPreferredWidth(140);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(80);
        columnModel.getColumn(5).setPreferredWidth(120);
        columnModel.getColumn(6).setPreferredWidth(100);
        columnModel.getColumn(7).setPreferredWidth(160);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        jTable1.updateUI();
        
        listarTodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEliminarPiloto = new javax.swing.JButton();
        btnModificarPiloto = new javax.swing.JButton();
        txtPilotoSeleccionado = new javax.swing.JLabel();
        btnVerLicencias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Listar Pilotos");

        btnEliminarPiloto.setText("Eliminar Piloto");
        btnEliminarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPilotoActionPerformed(evt);
            }
        });

        btnModificarPiloto.setText("Modificar Piloto");
        btnModificarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPilotoActionPerformed(evt);
            }
        });

        btnVerLicencias.setText("Ver las licencias del Piloto");
        btnVerLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerLicenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnEliminarPiloto)
                        .addGap(51, 51, 51)
                        .addComponent(btnModificarPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnVerLicencias)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(237, Short.MAX_VALUE)
                    .addComponent(txtPilotoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarPiloto)
                    .addComponent(btnModificarPiloto)
                    .addComponent(btnVerLicencias))
                .addGap(59, 59, 59))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(285, Short.MAX_VALUE)
                    .addComponent(txtPilotoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPilotoActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar el piloto seleccionado?");
        try{
            if (JOptionPane.OK_OPTION == resp) {
            int id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            Administrar_Pilotos ap = new Administrar_Pilotos();
            ap.eliminarPiloto(id);
        }
        }catch(Exception ex){
            System.out.println(ex);
        }
        listarTodo();
    }//GEN-LAST:event_btnEliminarPilotoActionPerformed

    private void btnModificarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPilotoActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Seguro que desea modificar el piloto seleccionado?");
        if (JOptionPane.OK_OPTION == resp) {
            int id  = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            
            ModificarPiloto modificar = new ModificarPiloto(id);
            modificar.setVisible(true);
           
            this.dispose();
        } else {
            listarTodo();
        }
    }//GEN-LAST:event_btnModificarPilotoActionPerformed

    private void btnVerLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerLicenciasActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Seguro que desea ver las licencias del piloto seleccionado?");
        if (JOptionPane.OK_OPTION == resp) {
            String rut = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            ListarLicenciaPiloto listLicencia = new ListarLicenciaPiloto(rut);
            listLicencia.setVisible(true);
           
            this.dispose();
        } else {
            listarTodo();
        }
    }//GEN-LAST:event_btnVerLicenciasActionPerformed

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
            java.util.logging.Logger.getLogger(ListarPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarPiloto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarPiloto;
    private javax.swing.JButton btnModificarPiloto;
    private javax.swing.JButton btnVerLicencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtPilotoSeleccionado;
    // End of variables declaration//GEN-END:variables

    private void listarTodo() {
        try{
            Administrar_Pilotos ap = new Administrar_Pilotos();

             ArrayList<Piloto> lista = ap.listarPilotoMasCantidadLicencia();
             Object[] fila = new Object[9];
             int num = lista.size();
             for (int i = 0; i < num; i++) {
                 fila[0] = lista.get(i).getId();
                 fila[1] = lista.get(i).getRut();
                 fila[2] = lista.get(i).getNombre()+" "+lista.get(i).getApellidos();
                 fila[3] = lista.get(i).getHoras_vuelo();
                 fila[4] = lista.get(i).getDias_vuelo();
                 fila[5] = lista.get(i).getVencimiento_medicina();
                 fila[6] = lista.get(i).getFecha_ultimo_vuelo();
                 fila[7] = lista.get(i).getId_persona();
                 modelo.addRow(fila);
             }
             jTable1.updateUI();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
