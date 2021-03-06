/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Atxy2k.CustomTextField.RestrictedTextField;
import Controlador.Administrar_Licencia;
import Controlador.Administrar_Personas;
import Controlador.Administrar_Pilotos;
import Modelo.Licencia;
import Modelo.Piloto;
import Modelo.Tipo_licencia;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Celso
 */
public class IngresarLicencia extends javax.swing.JFrame {

    /**
     * Creates new form IngresarLicencia
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
     
    public IngresarLicencia() {
    
        
        
       
        initComponents();
            
            
        Administrar_Licencia al = new Administrar_Licencia();
        Administrar_Pilotos ap = new Administrar_Pilotos();
        
        ArrayList<Tipo_licencia> lista = al.listarTipoLicencia();
        
        for (int i = 0; i < lista.size(); i++) {
            this.jComboBoxTipoLicencia.addItem(new ComboItem(lista.get(i).getDescripcion(),String.valueOf(lista.get(i).getId())));
        }
        
        ArrayList<Piloto> listaPiloto = ap.listarPiloto();
        
        for (int i = 0; i < listaPiloto.size(); i++) {
            this.cbRut.addItem(new ComboItem(listaPiloto.get(i).getRut()+" : "+listaPiloto.get(i).getNombre()+" "+listaPiloto.get(i).getApellidos(),String.valueOf(listaPiloto.get(i).getId())));
        }
        
        
    }
    
    public IngresarLicencia(Piloto piloto) {
    
        
        
       
        initComponents();
            
            
        Administrar_Licencia al = new Administrar_Licencia();
        Administrar_Pilotos ap = new Administrar_Pilotos();
        
        ArrayList<Tipo_licencia> lista = al.listarTipoLicencia();
        
        for (int i = 0; i < lista.size(); i++) {
            this.jComboBoxTipoLicencia.addItem(new ComboItem(lista.get(i).getDescripcion(),String.valueOf(lista.get(i).getId())));
        }
        
        ArrayList<Piloto> listaPiloto = ap.listarPiloto();
        
        ComboItem select = null;
            for (int i = 0; i < listaPiloto.size(); i++) {
                this.cbRut.addItem(new ComboItem(listaPiloto.get(i).getRut() + " : " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), String.valueOf(listaPiloto.get(i).getId())));
                if (listaPiloto.get(i).getId_persona() == piloto.getId_persona()) {
                    select = new ComboItem(listaPiloto.get(i).getRut() + " : " + listaPiloto.get(i).getNombre() + " " + listaPiloto.get(i).getApellidos(), String.valueOf(listaPiloto.get(i).getId()));
                }
            }
        
       this.cbRut.getModel().setSelectedItem(select);
       cbRut.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTipoLicencia = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNumeroLicencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldHoras = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDias = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        JDateVencimiento = new com.toedter.calendar.JDateChooser();
        cbRut = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar Licencia");

        jLabel3.setText("Numero de Licencia");

        jLabel4.setText("Tipo de Licencia");

        jComboBoxTipoLicencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        jComboBoxTipoLicencia.setToolTipText("");
        jComboBoxTipoLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoLicenciaActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de Vencimiento");

        jLabel8.setText("Piloto");

        jTextFieldNumeroLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroLicenciaActionPerformed(evt);
            }
        });
        jTextFieldNumeroLicencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroLicenciaKeyTyped(evt);
            }
        });

        jLabel9.setText("Horas de vuelo");

        jTextFieldHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHorasActionPerformed(evt);
            }
        });
        jTextFieldHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHorasKeyTyped(evt);
            }
        });

        jLabel10.setText("Dias de vuelo");

        jTextFieldDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiasActionPerformed(evt);
            }
        });
        jTextFieldDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDiasKeyTyped(evt);
            }
        });

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/agregar.png"))); // NOI18N
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/cancelar.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        JDateVencimiento.setDateFormatString("dd/MMMM/yyyy");

        cbRut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(15, 15, 15))
                    .addComponent(JDateVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbRut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxTipoLicencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNumeroLicencia)
                    .addComponent(jTextFieldHoras)
                    .addComponent(jTextFieldDias))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cbRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNumeroLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(JDateVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnIngresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroLicenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroLicenciaActionPerformed

    private void jTextFieldHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHorasActionPerformed

    private void jTextFieldDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiasActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // persona
        //validaciones

        try{
            //validacion combos
            if (jComboBoxTipoLicencia.getSelectedItem().equals("Seleccione")) {
                JOptionPane.showMessageDialog(null, "Seleccione un tipo de licencia");
                return;
            }
             if (cbRut.getSelectedItem().equals("Seleccione")) {
                JOptionPane.showMessageDialog(null, "Seleccione un Piloto");
                return;
            }
            //vali campos vacios
            if (jTextFieldNumeroLicencia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero de licencia");
                return;
            }
            if (jTextFieldHoras.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese las horas de la licencia");
                return;
            }
            if (jTextFieldDias.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese los dias de la licencia");
                return;
            }
             
            //vali fecha
            
            String fecha_vencimiento = null;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            try{
                Date fecha = JDateVencimiento.getDate();
                Date hoy = new Date();
                if (fecha.before(hoy)) {
                    JOptionPane.showMessageDialog(null, "La fecha del vencimiento de la licencia no puede ser antes a la de hoy");
                    return;
                }
                fecha_vencimiento = df.format(fecha);
            }catch(Exception ex){
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Fecha mal ingresada");
                return;
            }
            
            //datos
            Object item = jComboBoxTipoLicencia.getSelectedItem();
            int tipo_licencia = Integer.parseInt(((ComboItem)item).getValue());
            Object item2 = cbRut.getSelectedItem();
            int id_piloto = Integer.parseInt(((ComboItem)item2).getValue());
            
            int numero_licencia = Integer.parseInt(jTextFieldNumeroLicencia.getText());
            float horas = Float.parseFloat(jTextFieldHoras.getText());
            int dias = Integer.parseInt(jTextFieldDias.getText());
            int id_licencia=0;
               

            Administrar_Licencia al = new Administrar_Licencia();

            //vali numero licenci arepetido
            if (al.buscarNumeroLicencia(numero_licencia)) {
                JOptionPane.showMessageDialog(null, "Numero de licencia ya ingresado");
                return;
            }
            
            Licencia licencia = new Licencia(id_licencia,numero_licencia,dias, horas, fecha_vencimiento, tipo_licencia,id_piloto);


            al.ingresarLicencia(licencia);
            
            MenuPrincipalOperador menu = new MenuPrincipalOperador();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        MenuPrincipalOperador menu = new MenuPrincipalOperador();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jComboBoxTipoLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoLicenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoLicenciaActionPerformed

    private void jTextFieldHorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHorasKeyTyped
        if (!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.') {
            evt.consume();
        }
        if (evt.getKeyChar()=='.'&&jTextFieldHoras.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldHorasKeyTyped

    private void jTextFieldNumeroLicenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroLicenciaKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNumeroLicenciaKeyTyped

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
            java.util.logging.Logger.getLogger(IngresarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Piloto piloto = new Piloto();
                piloto.setId(3);
                new IngresarLicencia(piloto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateVencimiento;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox cbRut;
    private javax.swing.JComboBox jComboBoxTipoLicencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldDias;
    private javax.swing.JTextField jTextFieldHoras;
    private javax.swing.JTextField jTextFieldNumeroLicencia;
    // End of variables declaration//GEN-END:variables
}
