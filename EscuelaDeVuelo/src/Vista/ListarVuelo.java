package Vista;

import Controlador.Administrar_Vuelo;
import Modelo.Licencia;
import Modelo.Piloto;
import Modelo.Vuelo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class ListarVuelo extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    class ComboItem {

        private String key;
        private String value;

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
        modelo.addColumn("ESTADO");

        TableColumnModel columnModel = jTableVuelos.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(160);
        columnModel.getColumn(2).setPreferredWidth(160);
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
            fila[8] = listaVuelo.get(i).getEstado();
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
        setResizable(false);

        jButtonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/listar.png"))); // NOI18N
        jButtonListar.setBorder(null);
        jButtonListar.setBorderPainted(false);
        jButtonListar.setContentAreaFilled(false);
        jButtonListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/regresar.png"))); // NOI18N
        jButtonVolver.setBorder(null);
        jButtonVolver.setBorderPainted(false);
        jButtonVolver.setContentAreaFilled(false);
        jButtonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/eliminar.png"))); // NOI18N
        jButtonEliminar.setBorder(null);
        jButtonEliminar.setBorderPainted(false);
        jButtonEliminar.setContentAreaFilled(false);
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jCheckBoxTerminado.setText("Vuelos no terminados");
        jCheckBoxTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTerminadoActionPerformed(evt);
            }
        });

        jButtonTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/terminar.png"))); // NOI18N
        jButtonTerminar.setBorder(null);
        jButtonTerminar.setBorderPainted(false);
        jButtonTerminar.setContentAreaFilled(false);
        jButtonTerminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminarActionPerformed(evt);
            }
        });

        jButtonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/vertripulacion.png"))); // NOI18N
        jButtonVer.setBorder(null);
        jButtonVer.setBorderPainted(false);
        jButtonVer.setContentAreaFilled(false);
        jButtonVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
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
                        .addComponent(jButtonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxTerminado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonListar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonVer)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonTerminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCheckBoxTerminado)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonListar)
                        .addComponent(jButtonVolver)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTerminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEliminar)
                        .addComponent(jButtonVer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        Clear_Table();
        CargarTabla(this.jCheckBoxTerminado.isSelected());
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        new MenuPrincipalOperador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Administrar_Vuelo av = new Administrar_Vuelo();

        if (this.jTableVuelos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un vuelo de la lista.");
        } else {
            if (Double.parseDouble(String.valueOf(jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 3))) != 0.0) {
                JOptionPane.showMessageDialog(null, "No puedes eliminar un vuelo ya terminado.");
            } else {
                int R = JOptionPane.showConfirmDialog(null, "¿Seguro?", "¡Alerta!", JOptionPane.YES_NO_OPTION, 0, null);
                if (R == 0) {
                    jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 0).toString();
                    av.eliminarVuelo(Integer.parseInt(jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 0).toString()));
                    Clear_Table();
                    CargarTabla(this.jCheckBoxTerminado.isSelected());
                }

            }
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
                Administrar_Vuelo av = new Administrar_Vuelo();
                ArrayList<Piloto> pilotoUnico = av.listarPilotoUnico(Integer.parseInt(String.valueOf(jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 0))));

                this.setEnabled(false);
                VentanaTerminarVuelo.setVisible(true);
                VentanaTerminarVuelo.setVuelo(vuelo);
                VentanaTerminarVuelo.jLabelMatricula.setText(vuelo.getAeronave());
                VentanaTerminarVuelo.jLabelFechaInicio.setText(df.format(date));
                VentanaTerminarVuelo.jLabelID.setText(String.valueOf(pilotoUnico.get(0).getId()));

                ArrayList<Licencia> listaLicencias = av.listarLicencias(pilotoUnico.get(0).getId());
                for (int i = 0; i < listaLicencias.size(); i++) {
                    VentanaTerminarVuelo.jComboBoxLicencia.addItem(new ComboItem(String.valueOf(listaLicencias.get(i).getNumero()), String.valueOf(listaLicencias.get(i).getId_licencia())));
                }

                VentanaTerminarVuelo.jLabelPiloto.setText(pilotoUnico.get(0).getRut() + " | " + pilotoUnico.get(0).getNombre() + " " + pilotoUnico.get(0).getApellidos());
                VentanaTerminarVuelo.setVentanaListarVuelo(this);
            } else {
                JOptionPane.showMessageDialog(null, "El vuelo seleccionado ya está terminado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un vuelo de la lista.");
        }
    }//GEN-LAST:event_jButtonTerminarActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        if (jTableVuelos.getSelectedRow() != -1) {
            ListarTripulacion VentanaListarPasajeros = new ListarTripulacion();
            //-----------
            Administrar_Vuelo av = new Administrar_Vuelo();
            ArrayList<Piloto> listaPilotos = av.listarPilotoID(Integer.parseInt(String.valueOf(jTableVuelos.getValueAt(jTableVuelos.getSelectedRow(), 0))));
            Object[] fila = new Object[4];
            int num = listaPilotos.size();
            for (int i = 0; i < num; i++) {
                fila[0] = listaPilotos.get(i).getId();
                fila[1] = listaPilotos.get(i).getRut();
                fila[2] = listaPilotos.get(i).getNombre() + " " + listaPilotos.get(i).getApellidos();
                fila[3] = listaPilotos.get(i).getTipo();
                VentanaListarPasajeros.modelo.addRow(fila);
            }

            this.setEnabled(false);
            VentanaListarPasajeros.setVentanaListarVuelo(this);
            VentanaListarPasajeros.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un vuelo de la lista.");
        }
    }//GEN-LAST:event_jButtonVerActionPerformed

    private void jCheckBoxTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTerminadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxTerminadoActionPerformed

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
