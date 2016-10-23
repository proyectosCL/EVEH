/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Administrar_Aeronave;
import Controlador.Administrar_Vuelo;
import Modelo.Aerodromo;
import Modelo.Aeronave;
import Modelo.Piloto;
import Modelo.Vuelo;
import java.awt.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class IngresarVuelo extends javax.swing.JFrame {

    class ComboItem {

        private String key;
        private String value;
        private String rut;
        private String nombre;
        private String apellido;

        public ComboItem(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public ComboItem(String key, String value, String rut, String nombre, String apellido) {
            this.key = key;
            this.value = value;
            this.rut = rut;
            this.nombre = nombre;
            this.apellido = apellido;
        }

        @Override
        public String toString() {
            return key;
        }

        public String getRut() {
            return rut;
        }

        public void setRut(String rut) {
            this.rut = rut;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

    }

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    private void Clear_Table() {
        for (int i = 0; i < jTablePasajeros.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    public void Formato() {
        this.jTablePasajeros.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("RUT");
        modelo.addColumn("NOMBRE COMPLETO");
        TableColumnModel columnModel = jTablePasajeros.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(80);
        columnModel.getColumn(2).setPreferredWidth(140);
        this.jTablePasajeros.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        jTablePasajeros.updateUI();
    }

    public IngresarVuelo() {

        initComponents();
        Formato();

        //TABLA
        //COMBOBOXs
        //Horas, Minutos, Segundos
        //Limpiar
        this.jComboBoxHora.removeAllItems();
        this.jComboBoxMinuto.removeAllItems();
        this.jComboBoxSegundo.removeAllItems();
        //Llenar
        for (int i = 0; i < 24; i++) {
            this.jComboBoxHora.addItem(new ComboItem(String.format("%02d", i), String.valueOf(i)));
        }
        for (int i = 0; i < 60; i++) {
            this.jComboBoxMinuto.addItem(new ComboItem(String.format("%02d", i), String.valueOf(i)));
            this.jComboBoxSegundo.addItem(new ComboItem(String.format("%02d", i), String.valueOf(i)));
        }
        //Origen y Destino
        Administrar_Vuelo av = new Administrar_Vuelo();
        ArrayList<Aerodromo> listaAerodromo = av.listarAerodromo();
        int num = listaAerodromo.size();
        for (int i = 0; i < num; i++) {
            this.jComboBoxOrigen.addItem(new ComboItem(listaAerodromo.get(i).getDescripcion(), String.valueOf(listaAerodromo.get(i).getId())));
            this.jComboBoxDestino.addItem(new ComboItem(listaAerodromo.get(i).getDescripcion(), String.valueOf(listaAerodromo.get(i).getId())));
        }
        //Condición
        this.jComboBoxCondicion.addItem(new ComboItem("IFR", "IFR"));
        this.jComboBoxCondicion.addItem(new ComboItem("VFR", "VFR"));
        //Piloto
        ArrayList<Piloto> listaPiloto = av.listarPiloto();
        num = listaPiloto.size();
        for (int i = 0; i < num; i++) {
            this.jComboBoxPiloto.addItem(new ComboItem(listaPiloto.get(i).getRut() + " | " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), String.valueOf(listaPiloto.get(i).getId())));
            this.jComboBoxPasajero.addItem(new ComboItem(listaPiloto.get(i).getRut() + " | " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), String.valueOf(listaPiloto.get(i).getId()), listaPiloto.get(i).getRut(), listaPiloto.get(i).getNombre(), listaPiloto.get(i).getApellidos()));
        }
        //Aeronave
        ArrayList<Aeronave> listaAeronave = av.listarAeronave();
        num = listaAeronave.size();
        for (int i = 0; i < num; i++) {
            this.jComboBoxAeronave.addItem(new ComboItem(listaAeronave.get(i).getMatricula(), String.valueOf(listaAeronave.get(i).getId())));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxOrigen = new javax.swing.JComboBox();
        jComboBoxDestino = new javax.swing.JComboBox();
        jComboBoxCondicion = new javax.swing.JComboBox();
        jComboBoxPiloto = new javax.swing.JComboBox();
        jTextFieldMision = new javax.swing.JTextField();
        jComboBoxAeronave = new javax.swing.JComboBox();
        jButtonVolver = new javax.swing.JButton();
        jButtonIngresar = new javax.swing.JButton();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jComboBoxHora = new javax.swing.JComboBox();
        jComboBoxMinuto = new javax.swing.JComboBox();
        jComboBoxSegundo = new javax.swing.JComboBox();
        jComboBoxPasajero = new javax.swing.JComboBox();
        jButtonAñadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePasajeros = new javax.swing.JTable();
        jButtonCode = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jDateFecha.setDateFormatString("dd/MM/yyyy");

        jComboBoxHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00" }));

        jComboBoxMinuto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00" }));

        jComboBoxSegundo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00" }));

        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jLabel1.setText("Origen:");

        jLabel2.setText("Destino:");

        jLabel3.setText("Condición:");

        jLabel4.setText("Misión:");

        jLabel5.setText("Piloto:");

        jLabel6.setText("Aeronave:");

        jLabel7.setText("Pasajeros:");

        jLabel8.setText("Fecha:");

        jTablePasajeros.setModel(new javax.swing.table.DefaultTableModel(
        ));
        jScrollPane2.setViewportView(jTablePasajeros);

        jButtonCode.setText("Clear");
        jButtonCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCodeActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonIngresar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldMision)
                                    .addComponent(jComboBoxCondicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDestino, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxPiloto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jDateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBoxAeronave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jComboBoxPasajero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonAñadir)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVolver)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxPasajero)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jButtonAñadir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresar)
                    .addComponent(jButtonCode))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        new MenuPrincipalAdministrador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        Administrar_Vuelo av = new Administrar_Vuelo();
        Vuelo vuelo = new Vuelo();
        int count = 0;
        //GET COMBOXs
        //Origen
        ComboItem item_aerodromo_origen = (ComboItem) this.jComboBoxOrigen.getSelectedItem();
        vuelo.setId_aerodromo_origen(Integer.parseInt(item_aerodromo_origen.getValue()));
        //Destino
        ComboItem item_aerodromo_destino = (ComboItem) this.jComboBoxDestino.getSelectedItem();
        vuelo.setId_aerodromo_destino(Integer.parseInt(item_aerodromo_destino.getValue()));
        //Condición de vuelo
        ComboItem item_condicion_vuelo = (ComboItem) this.jComboBoxCondicion.getSelectedItem();
        vuelo.setCondicion_vuelo(item_condicion_vuelo.getValue().charAt(2));
        //Misión de vuelo
        if (this.jTextFieldMision.getText() != null) {
            vuelo.setMision_vuelo(this.jTextFieldMision.getText());
        } else {
            count++;
            JOptionPane.showMessageDialog(null, "No puedes dejar la misión en blanco.");
        }
        //Fecha de vuelo

        if (this.jDateFecha.getDate() != null) {
            DateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
            DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String date1 = df1.format(this.jDateFecha.getDate());
            Date date2 = null;
            try {
                date2 = df2.parse(date1 + " " + String.format("%02d", this.jComboBoxHora.getSelectedIndex()) + ":" + String.format("%02d", this.jComboBoxMinuto.getSelectedIndex()) + ":" + String.format("%02d", this.jComboBoxSegundo.getSelectedIndex()));
            } catch (Exception ex) {
                System.out.println(ex);
            }
            vuelo.setFecha_vuelo(date2);
        } else {
            count++;
            System.out.println("Debe seleccionar una fecha.");
        }

        //Piloto
        ComboItem item_piloto = (ComboItem) this.jComboBoxPiloto.getSelectedItem();
        int piloto = Integer.parseInt(item_piloto.getValue());
        //Aeronave
        ComboItem item_aeronave = (ComboItem) this.jComboBoxAeronave.getSelectedItem();
        vuelo.setId_aeronave(Integer.parseInt(item_aeronave.getValue()));
        //Pilotos
        String[] tripulacion = new String[this.jTablePasajeros.getRowCount()];
        for (int i = 0; i < this.jTablePasajeros.getRowCount(); i++) {
            tripulacion[i] = String.valueOf(this.jTablePasajeros.getValueAt(i, 0));
        }
        //Eliminar pasajero piloto
        for (int i = 0; i < this.jTablePasajeros.getRowCount(); i++) {
            if (item_piloto.getValue().equals(String.valueOf(this.jTablePasajeros.getValueAt(i, 0)))) {
                modelo.removeRow(i);
            }
        }

        if (count == 0) {
            av.ingresarVuelo(vuelo, piloto, tripulacion);
        }

    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jButtonCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCodeActionPerformed
        Clear_Table();
    }//GEN-LAST:event_jButtonCodeActionPerformed

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        ComboItem item_piloto = (ComboItem) this.jComboBoxPiloto.getSelectedItem();
        ComboItem item_pasajero = (ComboItem) this.jComboBoxPasajero.getSelectedItem();

        int count = 0;
        //Validación
        //PASAJERO NO IGUAL A PILOTO SELECCIONADO
        if (item_piloto.getValue().equals(item_pasajero.getValue())) {
            count++;
            System.out.println("El pasajero ya esta seleccionado como piloto.");
        }

        //NO PUEDEN REPETIRCE PASAJEROS
        for (int i = 0; i < this.jTablePasajeros.getRowCount(); i++) {
            if (this.jTablePasajeros.getValueAt(i, 0).equals(item_pasajero.getValue())) {
                count++;
                System.out.println("El pasajero ya se encuentra en la lista.");
            }
        }

        if (count == 0) {
            modelo.addRow(new Object[]{item_pasajero.getValue(), item_pasajero.getRut(), item_pasajero.getNombre() + " " + item_pasajero.getApellido()});
        }


    }//GEN-LAST:event_jButtonAñadirActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarVuelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonCode;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox jComboBoxAeronave;
    private javax.swing.JComboBox jComboBoxCondicion;
    private javax.swing.JComboBox jComboBoxDestino;
    private javax.swing.JComboBox jComboBoxHora;
    private javax.swing.JComboBox jComboBoxMinuto;
    private javax.swing.JComboBox jComboBoxOrigen;
    private javax.swing.JComboBox jComboBoxPasajero;
    private javax.swing.JComboBox jComboBoxPiloto;
    private javax.swing.JComboBox jComboBoxSegundo;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablePasajeros;
    private javax.swing.JTextField jTextFieldMision;
    // End of variables declaration//GEN-END:variables
}
