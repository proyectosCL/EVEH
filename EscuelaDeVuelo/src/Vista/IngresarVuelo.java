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
import java.util.ArrayList;
import java.util.Date;
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

    public IngresarVuelo() {

        initComponents();

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
            this.jComboBoxPiloto.addItem(new ComboItem(listaPiloto.get(i).getRut() + " | " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), String.valueOf(listaPiloto.get(i).getId())));

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
        jTextField2 = new javax.swing.JTextField();
        jButtonIngresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPasajeros = new javax.swing.JList();

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
        jListPasajeros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListPasajeros.setToolTipText("");
        jScrollPane1.setViewportView(jListPasajeros);

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
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxOrigen, 0, 216, Short.MAX_VALUE)
                                    .addComponent(jTextFieldMision)
                                    .addComponent(jTextField2)
                                    .addComponent(jComboBoxCondicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxPiloto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxAeronave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDestino, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(155, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIngresar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        ComboItem item_aerodromo_origen = (ComboItem) this.jComboBoxOrigen.getSelectedItem();
        vuelo.setId_aerodromo_origen(Integer.parseInt(item_aerodromo_origen.getValue()));
        
        ComboItem item_aerodromo_destino = (ComboItem) this.jComboBoxDestino.getSelectedItem();
        vuelo.setId_aerodromo_destino(Integer.parseInt(item_aerodromo_destino.getValue()));
        
        ComboItem item_condicion_vuelo = (ComboItem) this.jComboBoxCondicion.getSelectedItem();
        vuelo.setCondicion_vuelo(item_condicion_vuelo.getValue().charAt(0));
        
        vuelo.setMision_vuelo(this.jTextFieldMision.getText());
        
        vuelo.setFecha_vuelo(new Date());
        
        ComboItem item_aeronave = (ComboItem) this.jComboBoxAeronave.getSelectedItem();
        vuelo.setId_aeronave(Integer.parseInt(item_aeronave.getValue()));

        
        av.ingresarVuelo(vuelo);
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
    private javax.swing.JComboBox jComboBoxOrigen;
    private javax.swing.JComboBox jComboBoxPiloto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jListPasajeros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldMision;
    // End of variables declaration//GEN-END:variables
}
