/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Administrar_Vuelo;
import Modelo.Vuelo;
import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego S.
 */
public class ListarVuelo extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    

    public void Formato() {
        jTableVuelos.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("ORIGEN");
        modelo.addColumn("DESTINO");
        modelo.addColumn("HORAS");
        modelo.addColumn("CONDICIÓN");
        modelo.addColumn("MISIÓN");
        modelo.addColumn("FECHA");
        modelo.addColumn("AERONAVE");
        modelo.addColumn("PILOTOS");

        TableColumnModel columnModel = jTableVuelos.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(140);
        columnModel.getColumn(2).setPreferredWidth(140);
        columnModel.getColumn(3).setPreferredWidth(55);
        columnModel.getColumn(4).setPreferredWidth(90);
        columnModel.getColumn(5).setPreferredWidth(160);
        columnModel.getColumn(6).setPreferredWidth(140);
        columnModel.getColumn(7).setPreferredWidth(80);
        columnModel.getColumn(8).setPreferredWidth(80);
        jTableVuelos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableVuelos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableVuelos.updateUI();
    }

    public void CargarTabla(boolean check) {
        Administrar_Vuelo av = new Administrar_Vuelo();

        ArrayList<Vuelo> listaVuelo = (!check) ? av.listarVuelo() : av.listarVueloNoTerminado();
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Object[] fila = new Object[9];
        int num = listaVuelo.size();
        for (int i = 0; i < num; i++) {
            fila[0] = listaVuelo.get(i).getId();
            fila[1] = listaVuelo.get(i).getAerodromo_origen();
            fila[2] = listaVuelo.get(i).getAerodromo_destino();
            fila[3] = listaVuelo.get(i).getHoras_vuelo();
            fila[4] = listaVuelo.get(i).getCondicion_vuelo();
            fila[5] = listaVuelo.get(i).getMision_vuelo();
            fila[6] = DateFormat.format(listaVuelo.get(i).getFecha_vuelo());
            fila[7] = listaVuelo.get(i).getAeronave();
            fila[8] = "aa";
            modelo.addRow(fila);
        }
    }

    public void Clear_Table() {
        for (int i = 0; i < this.jTableVuelos.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    public ListarVuelo() {

        initComponents();
        Formato();
        Clear_Table();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonListar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVuelos = new javax.swing.JTable();
        jButtonVolver = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jCheckBoxTerminado = new javax.swing.JCheckBox();
        jButtonTerminar = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jTableVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableVuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTableVuelos);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jCheckBoxTerminado.setText("Vuelos no terminados");

        jButtonTerminar.setText("Terminar");
        jButtonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminarActionPerformed(evt);
            }
        });

        jButtonVer.setText("Ver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxTerminado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonListar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonVer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonTerminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListar)
                    .addComponent(jButtonVolver)
                    .addComponent(jCheckBoxTerminado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonTerminar)
                    .addComponent(jButtonVer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        Clear_Table();
        CargarTabla(this.jCheckBoxTerminado.isSelected());
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        new MenuPrincipalAdministrador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Administrar_Vuelo av = new Administrar_Vuelo();
        int R = JOptionPane.showConfirmDialog(null, "¿Seguro?", "¡Alerta!", JOptionPane.YES_NO_OPTION, 0, null);
        if (this.jTableVuelos.getSelectedRow() != -1 && R == 0) {
            jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 0).toString();
            av.eliminarVuelo(Integer.parseInt(jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 0).toString()));
            Clear_Table();
            CargarTabla(this.jCheckBoxTerminado.isSelected());
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminarActionPerformed
        if (jTableVuelos.getSelectedRow() != -1) {
            if (Double.parseDouble(String.valueOf(jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 3))) == 0.0) {
                TerminarVuelo VentanaTerminarVuelo = new TerminarVuelo();
                Vuelo vuelo = new Vuelo();
                vuelo.setId(Integer.parseInt(String.valueOf(jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 0))));
                vuelo.setAeronave(String.valueOf(jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 7)));
                vuelo.setHoras_vuelo(0.0F);

                DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String dateString = null;
                dateString = String.valueOf(jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 6));
                Date date = null;
                try {
                    date = df.parse(dateString);
                } catch (ParseException ex) {
                    Logger.getLogger(ListarVuelo.class.getName()).log(Level.SEVERE, null, ex);
                }
                vuelo.setFecha_vuelo(date);
                
                this.setEnabled(false);
                VentanaTerminarVuelo.setVisible(true);
                VentanaTerminarVuelo.setVuelo(vuelo);
                VentanaTerminarVuelo.jLabelMatricula.setText(vuelo.getAeronave());
                VentanaTerminarVuelo.jLabelFechaInicio.setText(df.format(date));
                VentanaTerminarVuelo.setVentanaListarVuelo(this);
            } else {
                JOptionPane.showMessageDialog(null, "El vuelo seleccionado ya está terminado.");
            }
        }
    }//GEN-LAST:event_jButtonTerminarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarVuelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    public javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonTerminar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JButton jButtonVolver;
    public javax.swing.JCheckBox jCheckBoxTerminado;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableVuelos;
    // End of variables declaration//GEN-END:variables

}
