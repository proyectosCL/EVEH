/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Administrar_Licencia;
import Controlador.Administrar_Pilotos;
import Modelo.Licencia;
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
public class ListarLicenciaPiloto extends javax.swing.JFrame {

    /**
     * Creates new form ListarLicenciaPiloto
     */
    class ComboItem {

        String key;
        String value;

        public ComboItem(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

    }

    private void Clear_Table() {
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    private String dato;

    public ListarLicenciaPiloto(String dato) {
        initComponents();
        try {
            jTable1.setModel(modelo);

            modelo.addColumn("ID");
            modelo.addColumn("NUMERO");
            modelo.addColumn("TIPO DE LICENCIA");
            modelo.addColumn("FECHA VENCIMIENTO");
            modelo.addColumn("HORAS DE VUELO");
            modelo.addColumn("DIAS DE VUELO");
           
            TableColumnModel columnModel = jTable1.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(30);
            columnModel.getColumn(1).setPreferredWidth(75);
            columnModel.getColumn(2).setPreferredWidth(140);
            columnModel.getColumn(3).setPreferredWidth(140);
            columnModel.getColumn(4).setPreferredWidth(110);
            columnModel.getColumn(5).setPreferredWidth(110);
           
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

            jTable1.updateUI();

            Administrar_Pilotos ap = new Administrar_Pilotos();
            ArrayList<Piloto> listaPiloto = ap.listarPiloto();

            ComboItem select = null;
            for (int i = 0; i < listaPiloto.size(); i++) {
                if (listaPiloto.get(i).getRut().equals(dato)) {
                    select = new ComboItem(listaPiloto.get(i).getRut() + " : " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), listaPiloto.get(i).getRut());
                }
                this.cbRut.addItem(new ComboItem(listaPiloto.get(i).getRut() + " : " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), listaPiloto.get(i).getRut()));
            }

            
            cbRut.getModel().setSelectedItem(select);
            listarPiloto(dato);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al listar");
        }
    }

    public ListarLicenciaPiloto() {

        initComponents();
        try {
            jTable1.setModel(modelo);

            modelo.addColumn("ID");
            modelo.addColumn("NUMERO");
            modelo.addColumn("TIPO DE LICENCIA");
            modelo.addColumn("FECHA VENCIMIENTO");
            modelo.addColumn("HORAS DE VUELO");
            modelo.addColumn("DIAS DE VUELO");
      
            TableColumnModel columnModel = jTable1.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(30);
            columnModel.getColumn(1).setPreferredWidth(75);
            columnModel.getColumn(2).setPreferredWidth(140);
            columnModel.getColumn(3).setPreferredWidth(140);
            columnModel.getColumn(4).setPreferredWidth(110);
            columnModel.getColumn(5).setPreferredWidth(110);
           
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

            jTable1.updateUI();

            Administrar_Pilotos ap = new Administrar_Pilotos();
            ArrayList<Piloto> listaPiloto = ap.listarPiloto();

            for (int i = 0; i < listaPiloto.size(); i++) {
                this.cbRut.addItem(new ComboItem(listaPiloto.get(i).getRut() + " : " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), listaPiloto.get(i).getRut()));
            }
            listarTodo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al listar");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnModificarLicencia = new javax.swing.JButton();
        btnEliminarLicencia = new javax.swing.JButton();
        txtLicenciaSeleccionado = new javax.swing.JLabel();
        cbRut = new javax.swing.JComboBox();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Listar Licencia de Pilotos");

        jLabel2.setText("Rut del Piloto");

        btnModificarLicencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/editar.png"))); // NOI18N
        btnModificarLicencia.setBorder(null);
        btnModificarLicencia.setBorderPainted(false);
        btnModificarLicencia.setContentAreaFilled(false);
        btnModificarLicencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLicenciaActionPerformed(evt);
            }
        });

        btnEliminarLicencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/eliminar.png"))); // NOI18N
        btnEliminarLicencia.setBorder(null);
        btnEliminarLicencia.setBorderPainted(false);
        btnEliminarLicencia.setContentAreaFilled(false);
        btnEliminarLicencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLicenciaActionPerformed(evt);
            }
        });

        cbRut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        cbRut.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbRutItemStateChanged(evt);
            }
        });
        cbRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRutActionPerformed(evt);
            }
        });

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/regresar.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbRut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEliminarLicencia)
                                .addGap(52, 52, 52)
                                .addComponent(btnModificarLicencia)
                                .addGap(99, 99, 99)
                                .addComponent(btnMenu)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtLicenciaSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(txtLicenciaSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarLicencia)
                    .addComponent(btnEliminarLicencia)
                    .addComponent(btnMenu))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void listarPiloto(String rut) {
        try {
            Administrar_Licencia al = new Administrar_Licencia();

            ArrayList<Licencia> lista = al.listarLicencia2(rut);

            Object[] fila = new Object[9];
            int num = lista.size();
            for (int i = 0; i < num; i++) {
                fila[0] = lista.get(i).getId_licencia();
                fila[1] = lista.get(i).getNumero();
                fila[2] = lista.get(i).getDescripcion();
                fila[3] = lista.get(i).getFecha_vencimiento();
                fila[4] = lista.get(i).getHoras_vuelo();
                fila[5] = lista.get(i).getDias_vuelo();
                fila[6] = lista.get(i).getId_piloto();
                modelo.addRow(fila);
            }
            jTable1.updateUI();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al listar por rut");
        }
    }

    public void listarTodo() {
        try {
            Administrar_Licencia al = new Administrar_Licencia();

            ArrayList<Licencia> lista = al.listarLicencia();

            Object[] fila = new Object[9];
            int num = lista.size();
            for (int i = 0; i < num; i++) {
                fila[0] = lista.get(i).getId_licencia();
                fila[1] = lista.get(i).getNumero();
                fila[2] = lista.get(i).getDescripcion();
                fila[3] = lista.get(i).getFecha_vencimiento();
                fila[4] = lista.get(i).getHoras_vuelo();
                fila[5] = lista.get(i).getDias_vuelo();
                fila[6] = lista.get(i).getId_piloto();
                modelo.addRow(fila);
            }
            jTable1.updateUI();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al listar");
        }
    }

    private void btnModificarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLicenciaActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Seguro que desea modificar la licencia seleccionada?");
        if (JOptionPane.OK_OPTION == resp) {
            int id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            ModificarLicencia modLicencia = new ModificarLicencia(id);
            modLicencia.setVisible(true);
            this.dispose();
        } else {
            listarTodo();
        }
    }//GEN-LAST:event_btnModificarLicenciaActionPerformed

    private void btnEliminarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLicenciaActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar la licencia seleccionada?");
        if (JOptionPane.OK_OPTION == resp) {
            int id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            Administrar_Licencia al = new Administrar_Licencia();
            al.eliminarLicencia(id);
            listarTodo();
        } else {
            listarTodo();
        }

    }//GEN-LAST:event_btnEliminarLicenciaActionPerformed

    private void cbRutItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbRutItemStateChanged
        // TODO add your handling code here:
        try {
            
            Clear_Table();
            if (cbRut.getSelectedItem().equals("Seleccione")) {
                JOptionPane.showMessageDialog(null, "Seleccione un Piloto");
                listarTodo();
                return;
            }
            Object item2 = cbRut.getSelectedItem();
            String rut = ((ComboItem) item2).getValue();
            listarPiloto(rut);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al listar");
        }
    }//GEN-LAST:event_cbRutItemStateChanged

    private void cbRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRutActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MenuPrincipalOperador menu = new MenuPrincipalOperador();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(ListarLicenciaPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarLicenciaPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarLicenciaPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarLicenciaPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarLicenciaPiloto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarLicencia;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificarLicencia;
    public javax.swing.JComboBox cbRut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtLicenciaSeleccionado;
    // End of variables declaration//GEN-END:variables
}
