/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Database.Conexion;
import Modelo.Aeronave;
import javax.swing.JOptionPane;
import Controlador.Administrar_Aeronave;
/**
 *
 * @author jordans
 */
public class ModificarAeronave extends javax.swing.JFrame {

    /**
     * Creates new form ModificarAeronave
     */
    public ModificarAeronave() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboMes1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lbltiponave = new javax.swing.JLabel();
        lblmatricula = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmatricula = new javax.swing.JTextPane();
        lblestado = new javax.swing.JLabel();
        cmbestado = new javax.swing.JComboBox<>();
        cboMes = new javax.swing.JComboBox<>();
        txtaero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblhorasvuelo = new javax.swing.JLabel();
        cboDia = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbldiasvuelo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txthorasvuelo = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtdiasvuelo = new javax.swing.JTextPane();
        cboDia1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtanual = new javax.swing.JTextField();
        btningresar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cmbtiponave = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        btncargar = new javax.swing.JButton();
        lblusuario = new javax.swing.JLabel();
        lblhorasvuelito = new javax.swing.JLabel();
        lbldiasvuelito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboMes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Modificar Aeronave");

        lbltiponave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbltiponave.setText("Tipo Aeronave");

        lblmatricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblmatricula.setText("Matrícula");

        txtmatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmatriculaFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtmatricula);

        lblestado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblestado.setText("Estado");

        cmbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Disponible", "No Disponible" }));
        cmbestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbestadoActionPerformed(evt);
            }
        });

        cboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        txtaero.setText("2016");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Fecha Aeronavegabilidad");

        lblhorasvuelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblhorasvuelo.setText("Horas de Vuelo");

        cboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Fecha de Inspeccion Anual");

        jLabel13.setText("Día");

        lbldiasvuelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbldiasvuelo.setText("Días de Vuelo");

        jLabel14.setText("Mes");

        txthorasvuelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txthorasvueloFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txthorasvuelo);

        jLabel15.setText("Año");

        txtdiasvuelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdiasvueloFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(txtdiasvuelo);

        cboDia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel16.setText("Día");

        txtanual.setText("2016");

        btningresar.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        btningresar.setText("Actualizar Aeronave");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        jLabel17.setText("Mes");

        cmbtiponave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Helicoptero", "Aeronave" }));
        cmbtiponave.setToolTipText("");
        cmbtiponave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtiponaveActionPerformed(evt);
            }
        });

        jLabel18.setText("Año");

        btncargar.setText("Cargar Datos");
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });

        lblusuario.setText("*");

        lblhorasvuelito.setText("*");

        lbldiasvuelito.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbltiponave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbldiasvuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblhorasvuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel13)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel14)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cboDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboMes1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel16)
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel17)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtanual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtaero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblhorasvuelito))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbldiasvuelito)
                                        .addGap(30, 30, 30)
                                        .addComponent(btningresar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbestado, 0, 131, Short.MAX_VALUE)
                                    .addComponent(cmbtiponave, 0, 131, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addGap(10, 10, 10)
                                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btncargar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btncargar)
                        .addComponent(lblusuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltiponave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbtiponave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtanual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblhorasvuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblhorasvuelito)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbldiasvuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btningresar)
                                .addComponent(lbldiasvuelito))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int idCompteMod=0;


    private void cmbestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbestadoActionPerformed

    private void txthorasvueloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthorasvueloFocusLost
        if(txthorasvuelo.getText().equals("")){
            //JOptionPane.showMessageDialog(null, "Las horas vuelo no puede estar vacio");
            // lblhorasvuelo.setVisible(true);
            lblhorasvuelito.setEnabled(true);

        }else{lblhorasvuelito.setEnabled(false);

    }//GEN-LAST:event_txthorasvueloFocusLost
    }
    private void txtdiasvueloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdiasvueloFocusLost
        if(txtdiasvuelo.getText().equals("")){
            //JOptionPane.showMessageDialog(null, "Los dias de vuelo no puede estar vacio");
            lbldiasvuelito.setEnabled(true);
        }else{lbldiasvuelito.setEnabled(false);}// TODO add your handling code here:
    }//GEN-LAST:event_txtdiasvueloFocusLost

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed

        Conexion con = new Conexion();
        con.conectar();
        Administrar_Aeronave ingresar = new Administrar_Aeronave();
         String id_persona = lblusuario.getText();
        String matricula = txtmatricula.getText();
        String horasvuelo = txthorasvuelo.getText();
        String diasvuelo = txtdiasvuelo.getText();
        String tiponave = ""+cmbtiponave.getSelectedItem();
        String estado = ""+cmbestado.getSelectedItem();
        String fechaaero = cboDia.getSelectedItem()+"/"+(cboMes.getSelectedIndex()+1)+"/"+txtaero.getText();
        String fechainsp = cboDia1.getSelectedItem()+"/"+(cboMes1.getSelectedIndex()+1)+"/"+txtanual.getText();

        if (tiponave.equals("Helicoptero")) {
            tiponave="1";

        }else {
            tiponave="2";

        }

        switch (estado) {
            case "Seleccione:":

            JOptionPane.showMessageDialog(null, "Seleccione estado!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
            break;
            case "Disponible":
            estado="V";
            break;
            default:
            estado="M";
            break;
        }

        if (lblusuario.isEnabled()||lbldiasvuelito.isEnabled()||lblhorasvuelito.isEnabled()) {
            JOptionPane.showMessageDialog(null, "debe llenar todos los campos ");
        }else {
            Aeronave nueva = new Aeronave(id_persona,matricula,tiponave,estado,fechaaero,fechainsp,horasvuelo,diasvuelo);

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios?", "confirmacion", dialogButton);
            if(dialogResult == 0) {
                      

                if (ingresar.modificarAeronave(nueva)) {
                        JOptionPane.showMessageDialog(null, "Aeronave Actualizada");
                    }
            } else {
              JOptionPane.showMessageDialog(null, "no se guardaron los cambios");
            }
            
             
            

        }

        //        // TODO add your handling code here:
    }//GEN-LAST:event_btningresarActionPerformed

    private void cmbtiponaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtiponaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtiponaveActionPerformed

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
        // TODO add your handling code here:

        Administrar_Aeronave admper = new Administrar_Aeronave();
        Aeronave person = admper.cargarAeronave(idCompteMod);

        if (person==null) {
            JOptionPane.showMessageDialog(null, "No se encontró la aeronave matricula:"+txtmatricula.getText());
        } else {
            txtmatricula.setText(person.getMatricula());
            lblusuario.setVisible(false);
            lblusuario.setText(person.getId());
            txthorasvuelo.setText(person.getHoras_vuelo());
            lblhorasvuelito.setVisible(false);

            txtdiasvuelo.setText(person.getDias_vuelo());
            lbldiasvuelito.setVisible(false);

            
        if(person.getTiponave().equals("1")){
         cmbtiponave.setSelectedItem("Helicoptero");
        }else{
         cmbtiponave.setSelectedItem("Aeronave");
        }
        if(person.getEstado().equals("V")){
             cmbestado.setSelectedItem("Disponible");
        }else{
             cmbestado.setSelectedItem("No Disponible");
        }
           
             


            String añoaero = person.getFecha_aeronavegavilidad().substring(0, 4);
            String mesaero = person.getFecha_aeronavegavilidad().substring(5, 7);
            String diaaero = person.getFecha_aeronavegavilidad().substring(8, 10);

            String añoinspe = person.getFecha_ultima_inspeccion_anual().substring(0, 4);
            String mesinspe = person.getFecha_ultima_inspeccion_anual().substring(5, 7);
            String diainspe = person.getFecha_ultima_inspeccion_anual().substring(8, 10);

            txtaero.setText(añoaero);
            cboMes.setSelectedIndex(Integer.parseInt(mesaero)-1);
            cboDia.setSelectedItem(diaaero);
            
             txtanual.setText(añoinspe);
            cboMes1.setSelectedIndex(Integer.parseInt(mesinspe)-1);
            cboDia1.setSelectedItem(diainspe);
            
            
        }

    }//GEN-LAST:event_btncargarActionPerformed

    private void txtmatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmatriculaFocusLost
        if(txtmatricula.getText().equals("")){
            //JOptionPane.showMessageDialog(null, "La matricula no puede estar vacia");
            lblusuario.setEnabled(true);

        }else{lblusuario.setEnabled(false);
        }

    }//GEN-LAST:event_txtmatriculaFocusLost

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
            java.util.logging.Logger.getLogger(ModificarAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarAeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarAeronave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargar;
    private javax.swing.JButton btningresar;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JComboBox<String> cboDia1;
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JComboBox<String> cboMes1;
    private javax.swing.JComboBox<String> cmbestado;
    private javax.swing.JComboBox<String> cmbtiponave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbldiasvuelito;
    private javax.swing.JLabel lbldiasvuelo;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblhorasvuelito;
    private javax.swing.JLabel lblhorasvuelo;
    private javax.swing.JLabel lblmatricula;
    private javax.swing.JLabel lbltiponave;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtaero;
    private javax.swing.JTextField txtanual;
    private javax.swing.JTextPane txtdiasvuelo;
    private javax.swing.JTextPane txthorasvuelo;
    private javax.swing.JTextPane txtmatricula;
    // End of variables declaration//GEN-END:variables
}
