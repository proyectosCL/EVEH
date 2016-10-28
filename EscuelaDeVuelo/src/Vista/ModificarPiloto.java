/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Administrar_Pilotos;
import Modelo.Piloto;
import static java.lang.String.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Celso
 */
public class ModificarPiloto extends javax.swing.JFrame {

    /**
     * Creates new form IngresarPiloto
     */
    class ComboItem {

            
         String key;
         String value;

        public ComboItem(String key, String value)
        {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString()
        {
            return key;
        }

        public String getKey()
        {
            return key;
        }

        public String getValue()
        {
            return value;
        }
    
}
 private int id_piloto;
    public ModificarPiloto(int id) {
        initComponents();
        
        id_piloto = id;
        Administrar_Pilotos ap = new Administrar_Pilotos();
        //piloto a modificra
        ArrayList<Piloto> piloto = ap.listarPilotoID(id);
        
        //combo
        ArrayList<Piloto> listaPiloto = ap.listarPiloto();
        
        ComboItem select = null;
        for (int i = 0; i < listaPiloto.size(); i++) {
            this.cbRut.addItem(new ComboItem(listaPiloto.get(i).getRut()+" : "+listaPiloto.get(i).getNombre()+" "+listaPiloto.get(i).getApellidos(),String.valueOf(listaPiloto.get(i).getId_persona())));
            if (listaPiloto.get(i).getId_persona() == piloto.get(0).getId_persona()) {
                select = new ComboItem(listaPiloto.get(i).getRut()+" : "+listaPiloto.get(i).getNombre()+" "+listaPiloto.get(i).getApellidos(),String.valueOf(listaPiloto.get(i).getId_persona()));
            }
        }

        //datos
        jTextFieldDias.setText(String.valueOf(piloto.get(0).getDias_vuelo()));
        jTextFieldHoras.setText(String.valueOf(piloto.get(0).getHoras_vuelo()));
        cbRut.getModel().setSelectedItem(select);
        cbRut.setEnabled(false);
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date medicina = null;
        Date ultimo_vuelo = null;
        
        try{
             medicina = df.parse(piloto.get(0).getVencimiento_medicina());
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        try{
            ultimo_vuelo = df.parse(piloto.get(0).getFecha_ultimo_vuelo());
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        JDateMedicina.setDate(medicina);
        JDateUltimoVuelo.setDate(ultimo_vuelo);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldHoras = new javax.swing.JTextField();
        jTextFieldDias = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        JDateMedicina = new com.toedter.calendar.JDateChooser();
        JDateUltimoVuelo = new com.toedter.calendar.JDateChooser();
        cbRut = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Modificar Piloto");
        jLabel1.setToolTipText("");

        jLabel2.setText("Horas de vuelo");

        jLabel3.setText("Usuario");

        jLabel4.setText("Dias de vuelo");

        jLabel5.setText("Vencimiento medicina");

        jLabel6.setText("Ultimo vuelo realizado");

        jTextFieldHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHorasKeyTyped(evt);
            }
        });

        jTextFieldDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDiasKeyTyped(evt);
            }
        });

        btnModificar.setText("Modificar Piloto");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        JDateMedicina.setDateFormatString("dd/MM/yyyy");

        JDateUltimoVuelo.setDateFormatString("dd/MM/yyyy");

        cbRut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        cbRut.setEnabled(false);
        cbRut.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldHoras)
                            .addComponent(JDateMedicina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbRut, 0, 261, Short.MAX_VALUE)
                            .addComponent(jTextFieldDias)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(40, 40, 40)
                                .addComponent(btnCancelar))
                            .addComponent(JDateUltimoVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addComponent(JDateMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(JDateUltimoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnModificar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed



        
        try{
            //vali combo
            if (cbRut.getSelectedItem().equals("Seleccione")) {
                JOptionPane.showMessageDialog(null, "Seleccione un Usuario");
                return;
            }
            
            //vali campos vacios
            if (jTextFieldHoras.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese las horas del piloto");
                return;
            }
            if (jTextFieldDias.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese los dias del piloto");
                return;
            }
            //vali fecha
            String fecha_medicina = null;
            String fecha_ultimo_vuelo = null;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            try{
                Date fecha = JDateMedicina.getDate();
                Date hoy = new Date();
                if (fecha.before(hoy)) {
                    JOptionPane.showMessageDialog(null, "La fecha del vencimiento de la medicina no puede ser antes a la de hoy");
                    return;
                }
                fecha_medicina = df.format(fecha);
            }catch(Exception ex){
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Fecha de la Medicina mal ingresada");
                return;
            }
            
            try{
                Date fecha_ultimo = JDateUltimoVuelo.getDate();
                Date hoy = new Date();
                if (fecha_ultimo.after(hoy)) {
                     JOptionPane.showMessageDialog(null, "La fecha delultimo vuelo realizado no puede ser mayor a la de hoy");
                    return;
                }
                fecha_ultimo_vuelo = df.format(fecha_ultimo);
            }catch(Exception ex){
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Fecha del ultimo vuelo mal ingresado");
                return;
            }
            //datos
            Object item2 = cbRut.getSelectedItem();
            int id_persona = Integer.parseInt(((ComboItem)item2).getValue());
            float horas = Float.parseFloat(jTextFieldHoras.getText());
            int dias = Integer.parseInt(jTextFieldDias.getText());
            
            Administrar_Pilotos ap = new Administrar_Pilotos();
            
            //ibgresar
            Piloto piloto = new Piloto(id_piloto, horas, dias, fecha_medicina, fecha_ultimo_vuelo, id_persona);
            ap.modificarPiloto(piloto);
            
        }catch(Exception ex){
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        MenuPrincipalAdministrador menu = new MenuPrincipalAdministrador();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTextFieldHorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHorasKeyTyped
       if (!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.') {
            evt.consume();
        }
        if (evt.getKeyChar()=='.'&&jTextFieldHoras.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldHorasKeyTyped

    private void jTextFieldDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDiasKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDiasKeyTyped

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
            java.util.logging.Logger.getLogger(ModificarPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarPiloto(3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateMedicina;
    private com.toedter.calendar.JDateChooser JDateUltimoVuelo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox cbRut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldDias;
    private javax.swing.JTextField jTextFieldHoras;
    // End of variables declaration//GEN-END:variables
}
