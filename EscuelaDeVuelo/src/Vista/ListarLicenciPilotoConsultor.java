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
 * @author jordans
 */
public class ListarLicenciPilotoConsultor extends javax.swing.JFrame {

    /**
     * Creates new form ListarLicenciPilotoConsultor
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
    public ListarLicenciPilotoConsultor(String dato) {
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

            ListarLicenciPilotoConsultor.ComboItem select = null;
            for (int i = 0; i < listaPiloto.size(); i++) {
                if (listaPiloto.get(i).getRut().equals(dato)) {
                    select = new ListarLicenciPilotoConsultor.ComboItem(listaPiloto.get(i).getRut() + " : " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), listaPiloto.get(i).getRut());
                }
                this.cbRut.addItem(new ListarLicenciPilotoConsultor.ComboItem(listaPiloto.get(i).getRut() + " : " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), listaPiloto.get(i).getRut()));
            }

            

            
            cbRut.getModel().setSelectedItem(select);
            listarPiloto(dato);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al listar");
        }
    }

    public ListarLicenciPilotoConsultor() {

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
                this.cbRut.addItem(new ListarLicenciPilotoConsultor.ComboItem(listaPiloto.get(i).getRut() + " : " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), listaPiloto.get(i).getRut()));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbRut = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Visualizar Licencias de Pilotos");

        jLabel2.setText("Rut del Piloto");

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

        jScrollPane2.setViewportView(jTable1);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(cbRut, 0, 197, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(btnMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
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
        MenuConsultor menu = new MenuConsultor();
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
            java.util.logging.Logger.getLogger(ListarLicenciPilotoConsultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarLicenciPilotoConsultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarLicenciPilotoConsultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarLicenciPilotoConsultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarLicenciPilotoConsultor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    public javax.swing.JComboBox cbRut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
