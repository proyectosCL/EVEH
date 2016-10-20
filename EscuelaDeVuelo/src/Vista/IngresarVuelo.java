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

/**
 *
 * @author Pandemonium
 */
public class IngresarVuelo extends javax.swing.JFrame {

    class ComboItem {

        private String key;
        private String value;
        private String rut;

        public ComboItem(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public ComboItem(String key, String value, String rut) {
            this.key = key;
            this.value = value;
            this.rut = rut;
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

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    public IngresarVuelo() {

        initComponents();

        //Horas, Minutos, Segundos
        this.jComboBoxHora.removeAllItems();
        this.jComboBoxMinuto.removeAllItems();
        this.jComboBoxSegundo.removeAllItems();
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
        this.jComboBoxCondicion.addItem(new ComboItem("I", "I"));
        this.jComboBoxCondicion.addItem(new ComboItem("V", "V"));
        //Piloto
        ArrayList<Piloto> listaPiloto = av.listarPiloto();
        num = listaPiloto.size();
        for (int i = 0; i < num; i++) {
            this.jComboBoxPiloto.addItem(new ComboItem(listaPiloto.get(i).getRut() + " | " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), String.valueOf(listaPiloto.get(i).getId()), listaPiloto.get(i).getRut()));

        }
        DefaultListModel model = new DefaultListModel();
        Object[] items = new Object[20];
        for (int i = 0; i < items.length; i++) {
            items[i] = listaPiloto.get(i).getRut();
        }
        for (int i = 0; i < items.length; i++) {
            model.add(i, items[i]);
        }
        this.jListPasajeros.setModel(model);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxOrigen = new javax.swing.JComboBox();
        jComboBoxDestino = new javax.swing.JComboBox();
        jComboBoxCondicion = new javax.swing.JComboBox();
        jComboBoxPiloto = new javax.swing.JComboBox();
        jTextFieldMision = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAeronave = new javax.swing.JComboBox();
        jButtonVolver = new javax.swing.JButton();
        jButtonIngresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPasajeros = new javax.swing.JList();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jComboBoxHora = new javax.swing.JComboBox();
        jComboBoxMinuto = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxSegundo = new javax.swing.JComboBox();
        jLabelAvisoPasajeros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Origen");

        jLabel2.setText("Destino");

        jLabel3.setText("Condición");

        jLabel4.setText("Misión");

        jLabel5.setText("Fecha");

        jLabel6.setText("Aeronave");

        jComboBoxOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        jComboBoxDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        jComboBoxDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDestinoActionPerformed(evt);
            }
        });

        jComboBoxCondicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        jComboBoxPiloto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        jLabel7.setText("Piloto");

        jComboBoxAeronave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        jButtonVolver.setText("< Volver");
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

        jLabel8.setText("Pasajeros");

        jListPasajeros.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListPasajeros.setToolTipText("");
        jScrollPane1.setViewportView(jListPasajeros);

        jDateFecha.setDateFormatString("dd/mm/yyyy");

        jComboBoxHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxMinuto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Hora");

        jComboBoxSegundo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelAvisoPasajeros.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1))
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldMision)
                                    .addComponent(jComboBoxCondicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDestino, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jComboBoxPiloto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBoxAeronave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAvisoPasajeros)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIngresar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButtonVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(jButtonIngresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAvisoPasajeros))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDestinoActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        new MenuPrincipalAdministrador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        Administrar_Vuelo av = new Administrar_Vuelo();
        Vuelo vuelo = new Vuelo();
        
        //Validación de PILOTO y PASAJEROS (NO DUPLICADO)
        int count = 0;
        String rut_piloto = null;
        if (this.jComboBoxPiloto.getSelectedIndex() != 0) {
            ComboItem item_piloto_validacion = (ComboItem) this.jComboBoxPiloto.getSelectedItem();
            rut_piloto = item_piloto_validacion.getRut();

            for (int i = 0; i < this.jListPasajeros.getSelectedValues().length; i++) {
                if (String.valueOf(this.jListPasajeros.getSelectedValues()[i]).equals(rut_piloto)) {
                    count++;
                }
            }
        }

        if (count != 0) {
            this.jLabelAvisoPasajeros.setText("No puede seleccionar un pasajero que ya esta siendo de piloto.");
        } else {
            this.jLabelAvisoPasajeros.setText("");
        }
        
        //Validación de COMBOBOXs (NO SELECCIONE)
        if (this.jComboBoxOrigen.getSelectedIndex() != 0
                && this.jComboBoxDestino.getSelectedIndex() != 0
                && this.jComboBoxCondicion.getSelectedIndex() != 0
                && this.jComboBoxPiloto.getSelectedIndex() != 0
                && this.jComboBoxAeronave.getSelectedIndex() != 0
                && this.jDateFecha.getDate() != null
                && this.jTextFieldMision != null
                && count == 0) {

            count = 0;

            ComboItem item_aerodromo_origen = (ComboItem) this.jComboBoxOrigen.getSelectedItem();
            vuelo.setId_aerodromo_origen(Integer.parseInt(item_aerodromo_origen.getValue()));

            ComboItem item_aerodromo_destino = (ComboItem) this.jComboBoxDestino.getSelectedItem();
            vuelo.setId_aerodromo_destino(Integer.parseInt(item_aerodromo_destino.getValue()));

            ComboItem item_condicion_vuelo = (ComboItem) this.jComboBoxCondicion.getSelectedItem();
            vuelo.setCondicion_vuelo(item_condicion_vuelo.getValue().charAt(0));

            vuelo.setMision_vuelo(this.jTextFieldMision.getText());

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

            ComboItem item_piloto = (ComboItem) this.jComboBoxPiloto.getSelectedItem();
            int piloto = Integer.parseInt(item_piloto.getValue());

            ComboItem item_aeronave = (ComboItem) this.jComboBoxAeronave.getSelectedItem();
            vuelo.setId_aeronave(Integer.parseInt(item_aeronave.getValue()));

            String[] tripulacion = new String[this.jListPasajeros.getSelectedValues().length];
            for (int i = 0; i < this.jListPasajeros.getSelectedValues().length; i++) {
                tripulacion[i] = String.valueOf(this.jListPasajeros.getSelectedValues()[i]);
            }

            av.ingresarVuelo(vuelo, piloto, tripulacion);
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

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
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox jComboBoxAeronave;
    private javax.swing.JComboBox jComboBoxCondicion;
    private javax.swing.JComboBox jComboBoxDestino;
    private javax.swing.JComboBox jComboBoxHora;
    private javax.swing.JComboBox jComboBoxMinuto;
    private javax.swing.JComboBox jComboBoxOrigen;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAvisoPasajeros;
    private javax.swing.JList jListPasajeros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldMision;
    // End of variables declaration//GEN-END:variables
}
