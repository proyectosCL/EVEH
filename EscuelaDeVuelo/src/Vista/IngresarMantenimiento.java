package Vista;

import Controlador.Administrar_Correo;
import Controlador.Administrar_Mantenimientos;
import Controlador.Administrar_Vuelo;
import Modelo.Aeronave;
import Modelo.Detalle_Mantenimiento;
import Modelo.Mantenimientos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jordans
 */
public class IngresarMantenimiento extends javax.swing.JFrame {

 
    int idCompteMod = 0;
 public IngresarMantenimiento() {
        initComponents();
       
        
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JDateInicio = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        JDateTermino = new com.toedter.calendar.JDateChooser();
        txtmante = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbtipoplan = new javax.swing.JComboBox<>();
        btnIngresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        chkFuselaje = new javax.swing.JCheckBox();
        chkControl = new javax.swing.JCheckBox();
        chkEmpenaje = new javax.swing.JCheckBox();
        chkAlas = new javax.swing.JCheckBox();
        chkTren = new javax.swing.JCheckBox();
        chkEquipos = new javax.swing.JCheckBox();
        chkMotor = new javax.swing.JCheckBox();
        chkCabina = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtestado = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        btnMandarCorreo = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Ingrese Fecha de Inicio");

        JDateInicio.setDateFormatString("dd/MMMM/yyyy");

        jLabel3.setText("Ingrese Fecha de Termino");

        JDateTermino.setDateFormatString("dd/MMMM/yyyy");

        txtmante.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtmante.setText("Ingresar Mantenimiento");
        txtmante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setText("Seleccione Plan de Mantenimiento");

        cmbtipoplan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inspeccion diaria", "Plan de 50 horas", "Plan de 100 horas", "Plan de 1000 horas", " " }));
        cmbtipoplan.setToolTipText("");

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

        jLabel5.setText("Fuselaje");

        jLabel6.setText("Alas");

        jLabel7.setText("Empenaje");

        jLabel8.setText("Controles y Frenos Aerodinamicos");

        jLabel9.setText("Tren de aterrizaje");

        jLabel10.setText("Equipos");

        jLabel11.setText("Motor");

        jLabel12.setText("Cabina");

        jLabel13.setText("Componentes");

        chkFuselaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFuselajeActionPerformed(evt);
            }
        });

        chkControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControlActionPerformed(evt);
            }
        });

        chkAlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAlasActionPerformed(evt);
            }
        });

        jLabel14.setText("Estado de la revision");

        jScrollPane1.setViewportView(txtestado);

        jLabel15.setText("Comentarios de la revision");

        btnMandarCorreo.setText("probar envio de correo");
        btnMandarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMandarCorreoActionPerformed(evt);
            }
        });

        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/regresar.png"))); // NOI18N
        btnvolver.setBorder(null);
        btnvolver.setBorderPainted(false);
        btnvolver.setContentAreaFilled(false);
        btnvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbtipoplan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel13)
                                        .addGap(127, 127, 127)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JDateTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkTren)
                                    .addComponent(chkEquipos)
                                    .addComponent(chkMotor)
                                    .addComponent(chkCabina)
                                    .addComponent(chkControl)
                                    .addComponent(chkEmpenaje)
                                    .addComponent(chkAlas)))
                            .addComponent(jLabel5))))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtmante)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(chkFuselaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnvolver)
                                .addGap(18, 18, 18)
                                .addComponent(btnIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMandarCorreo)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtmante, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(JDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDateTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbtipoplan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(chkFuselaje)
                        .addGap(18, 18, 18)
                        .addComponent(chkAlas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(chkEmpenaje)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chkControl)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(chkTren)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkEquipos)))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(chkMotor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chkCabina, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnIngresar)
                                    .addComponent(btnMandarCorreo)
                                    .addComponent(btnvolver))))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        
        int idmante=0;
        //vali fecha
        String fecha_inicio = null;
        String fecha_termino = null;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fecha = JDateInicio.getDate();
            fecha_inicio = df.format(fecha);
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Fecha mal ingresada de inicio");
            return;
        }
        try {
            Date fecha1 = JDateTermino.getDate();
            fecha_termino = df.format(fecha1);
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Fecha mal ingresada de termino");
            return;
        }
        
       
        String validar="";
        int contrador = 0;
        int idtipoplanx=0;
        String tareas="";
     
        switch (cmbtipoplan.getSelectedIndex()) {
            case 0:
                idtipoplanx=1;
                tareas="FUSELAJE : A,B,C,D ALAS : A,B,C,D,E EMPENAJE : A,B,C,D,E CONTROLES Y FRENOS AERODINAMICOS : A, TREN DE ATERRIZAJE : A,B,C EQUIPOS : A,B,C";
                break;
            case 1:
                idtipoplanx=2;
                tareas="CABINA : A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P FUSELAJE : A,B,C,D,E,F ALAS : A,B,C,D,E EMPENAJE : A,B,C,D,E CONTROLES Y FRENOS AERODINAMICOS : A TREN DE ATERRIZAJE : A,B,C,D,E EQUIPOS : A,B,C";
                break;
            case 2:
                idtipoplanx=3;
                tareas="CABINA : A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P FUSELAJE : A,B,C,D,E,F ALAS : A,B,C,D,E EMPENAJE : A,B,C,D,E CONTROLES Y FRENOS AERODINAMICOS : A TREN DE ATERRIZAJE : A,B,C,D,E EQUIPOS : A,B,C NUMEROS : 1,2,3,4,5,6,7,8,9,10";
                break;
            case 3:
                idtipoplanx=4;
                tareas="CABINA : A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P FUSELAJE : A,B,C,D,E,F ALAS : A,B,C,D,E EMPENAJE : A,B,C,D,E CONTROLES Y FRENOS AERODINAMICOS : A TREN DE ATERRIZAJE : A,B,C,D,E EQUIPOS : A,B,C NUMEROS : 1,2,3,4,5,6,7,8,9,10 A,B,C,D,E,F,G,H,I,J,K,L";
                break;
        }
        if(chkFuselaje.isSelected()){
           contrador++;
        }else{
            contrador--;
        }
          if(chkAlas.isSelected()){
            
            contrador++;
        }else{
            contrador--;
        }
            if(chkEmpenaje.isSelected()){
       
            contrador++;
        }else{
            contrador--;
        }
        
         if(chkControl.isSelected()){
         
            contrador++;
        }else{
            contrador--;
        }
           if(chkTren.isSelected()){
           
            contrador++;
        }else{
            contrador--;
        }
             if(chkEquipos.isSelected()){
           
            contrador++;
        }else{
            contrador--;
        }
              if(chkMotor.isSelected()){
           
            contrador++;
        }else{
            contrador--;
        }  
        if(chkCabina.isSelected()){
           
            contrador++;
        }else{
            contrador--;
        }
        
          if (txtestado.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Debe ingresar un comentario en el estado de la revision");
               txtestado.requestFocus();
           }else{
        if(contrador==8){
         
            String estado= txtestado.getText();
           int idaeronave= idCompteMod;
          
            Mantenimientos man = new Mantenimientos(idmante,fecha_inicio,fecha_termino);
            Administrar_Mantenimientos adm = new Administrar_Mantenimientos();
            
            adm.ingresarMantenimiento(man);
            
           Detalle_Mantenimiento detalle = new Detalle_Mantenimiento(idmante,idaeronave,idtipoplanx,tareas,estado);
            adm.ingresarDetalleMantenimiento(detalle);
            JOptionPane.showMessageDialog(null, "SE HA INGRESADO EL MANTENIMIENTO");
        }else{
            
           JOptionPane.showMessageDialog(null, "DEBEN ESTAR TODAS LAS REVISIONES CORRECTAS"); 
            jLabel14.requestFocus();
        }
           
        
    }//GEN-LAST:event_btnIngresarActionPerformed
    }
    private void chkFuselajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFuselajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkFuselajeActionPerformed

    private void chkAlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAlasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAlasActionPerformed

    private void chkControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkControlActionPerformed

    private void btnMandarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMandarCorreoActionPerformed
        // TODO add your handling code here:
        Administrar_Correo correo = new Administrar_Correo();
        correo.enviarCorreo();
        
    }//GEN-LAST:event_btnMandarCorreoActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        btnvolver.setEnabled(false);
        btnvolver.setText("en curso...");
        IngresarMantenimiento2 btn = new IngresarMantenimiento2();
        btn.setLocationRelativeTo(null);
        btn.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolverActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarMantenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateInicio;
    private com.toedter.calendar.JDateChooser JDateTermino;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMandarCorreo;
    private javax.swing.JButton btnvolver;
    private javax.swing.JCheckBox chkAlas;
    private javax.swing.JCheckBox chkCabina;
    private javax.swing.JCheckBox chkControl;
    private javax.swing.JCheckBox chkEmpenaje;
    private javax.swing.JCheckBox chkEquipos;
    private javax.swing.JCheckBox chkFuselaje;
    private javax.swing.JCheckBox chkMotor;
    private javax.swing.JCheckBox chkTren;
    private javax.swing.JComboBox<String> cmbtipoplan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtestado;
    private javax.swing.JLabel txtmante;
    // End of variables declaration//GEN-END:variables
}
