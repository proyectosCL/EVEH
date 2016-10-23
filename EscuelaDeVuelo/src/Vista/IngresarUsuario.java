/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Atxy2k.CustomTextField.RestrictedTextField;
import Controlador.Administrar_Personas;
import Controlador.Administrar_Usuarios;
import Database.Conexion;
import Modelo.Persona;
import Modelo.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 *
 * @author Diego
 */
public class IngresarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form IngresarUsuario
     */
    public IngresarUsuario() {
        initComponents();

        RestrictedTextField rutlimite = new RestrictedTextField(txtRut);
        rutlimite.setLimit(9);

        //rutlimite.setOnlyNums(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        gruposexo = new javax.swing.ButtonGroup();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboNacionalidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboRol = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        rbnHombre = new javax.swing.JRadioButton();
        rbnMujer = new javax.swing.JRadioButton();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtConfirmarPass = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cboMes = new javax.swing.JComboBox<>();
        cboDia = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cboAnio = new javax.swing.JComboBox<>();
        lblusuario = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        lblconfirmar = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lblrut = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de usuario:");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Confirmar contraseña:");

        jLabel4.setText("Nombres:");

        jLabel5.setText("Apellidos:");

        jLabel6.setText("Rut (Sin DV):");

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });

        txtRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutFocusLost(evt);
            }
        });
        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        jLabel7.setText("Nacionalidad:");

        jLabel8.setText("Fecha de nacimiento:");

        cboNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chileno", "Argentino", "Boliviano", "Venezolarno", "Paraguayo", "Escuatoriano", "Peruano", "Uruguayo", " " }));

        jLabel9.setText("Telefono:");

        jLabel10.setText("Correo:");

        jLabel11.setText("Sexo:");

        jLabel12.setText("Rol:");

        cboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Operador", "Piloto", "Consultor" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        gruposexo.add(rbnHombre);
        rbnHombre.setSelected(true);
        rbnHombre.setText("Masculino");
        rbnHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnHombreActionPerformed(evt);
            }
        });

        gruposexo.add(rbnMujer);
        rbnMujer.setText("Femenino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbnMujer)
                    .addComponent(rbnHombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbnHombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbnMujer)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        txtConfirmarPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmarPassFocusLost(evt);
            }
        });
        txtConfirmarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarPassActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel13.setText("Día");

        jLabel14.setText("Mes");

        jLabel15.setText("Año");

        cboAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));

        lblusuario.setText("*");

        lblpass.setText("*");

        lblconfirmar.setText("*");

        lblnombre.setText("*");

        lblapellido.setText("*");

        lblrut.setText("*");

        jLabel16.setText("Estado de Cuenta:");

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activado", "desactivado" }));
        cboEstado.setFocusable(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Ingresar Persona");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtConfirmarPass, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRut, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboNacionalidad, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboRol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblrut, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnIngresar)
                        .addGap(55, 55, 55)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblusuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpass))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtConfirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblconfirmar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblnombre)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblapellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrut))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnCancelar))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbnHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnHombreActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        MenuPrincipalAdministrador menu = new MenuPrincipalAdministrador();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        //txtPass.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtConfirmarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarPassActionPerformed
        // TODO add your handling code here:
        //txtConfirmarPass.setText("");
    }//GEN-LAST:event_txtConfirmarPassActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // persona
        //validaciones

        btnIngresar.setEnabled(false);
        btnIngresar.setText("en curso...");

        int id_persona = 0;
        String rut = txtRut.getText();

        String nombre = txtNombre.getText();

        String apellidos = txtApellido.getText();

        char sexo;
        if (rbnHombre.isSelected()) {
            sexo = 'M';

        } else {
            sexo = 'F';
        }

        String fechaNac = cboDia.getSelectedItem() + "/" + (cboMes.getSelectedIndex() + 1) + "/" + cboAnio.getSelectedItem();

        String telefono = txtTelefono.getText();

        String correo = txtCorreo.getText();

        String nacionalidad = cboNacionalidad.getSelectedItem() + "";

        int tipo = cboRol.getSelectedIndex();
        //usuario
        int iduser = 0;
        String nombreusuario = txtUsuario.getText();

        String pass = txtPass.getText();

        int id_perfil = cboRol.getSelectedIndex() + 1;

        String estado_cuenta = cboEstado.getSelectedItem() + "";

//        if (lblconfirmar.isVisible()||lblnombre.isVisible()||lblapellido.isVisible()||lblpass.isVisible()||lblrut.isVisible()||lblusuario.isVisible()) {
//            JOptionPane.showMessageDialog(null, "debe llenar todos los campos con asteriscos");
//        }else{
//            
//            Usuario userr = new Usuario(iduser, nombreusuario, pass, id_perfil, estado_cuenta);
//            //Persona person = new Persona(id_persona,rut,nombre,apellidos,sexo,fechaNac,telefono,correo,nacionalidad,iduser,nombreusuario,pass,tipo);
//            Persona person = new Persona(id_persona,rut,nombre,apellidos,sexo,fechaNac,telefono,correo,nacionalidad,iduser,nombreusuario,pass,tipo,estado_cuenta);
//            
//            Administrar_Personas admp = new Administrar_Personas();
//            Administrar_Usuarios usr = new Administrar_Usuarios();
//            
//            if (usr.buscarUsuario(userr.getUsuario())) {
//                JOptionPane.showMessageDialog(null, "el nombre de usuario ya esta registrado, por favor seleccione otro");
//                txtUsuario.requestFocus();
//             
//            } else {
//                
//                if (admp.buscarPersona(person.getRut())) {
//                    JOptionPane.showMessageDialog(null, "El Rut Ya esta registrado");
//                    txtRut.requestFocus();
//                    
//                } else {
//                    
//                    
//                    
//                    int dialogButton = JOptionPane.YES_NO_OPTION;
//                    int dialogResult = JOptionPane.showConfirmDialog(this, "¿Desea ingresar al sistema?", "confirmacion", dialogButton);
//                    if(dialogResult == 0) {
//                        
//                      if (usr.ingresarUsuario(userr)&&admp.ingresarPersona(person)) {
//                                JOptionPane.showMessageDialog(null, "Se ingreso correctamente");
//                            }
//                    } else {
//                      JOptionPane.showMessageDialog(null, "no se puedo ingresar");
//                    }
//                    
//                    
//                    
//                }
//                
//                
//            }
//            
//            
//        }
        if (lblconfirmar.isVisible() || lblnombre.isVisible() || lblapellido.isVisible() || lblpass.isVisible() || lblrut.isVisible() || lblusuario.isVisible()) {
            JOptionPane.showMessageDialog(null, "debe llenar todos los campos con asteriscos");
        } else {

            Usuario userr = new Usuario(iduser, nombreusuario, pass, id_perfil, estado_cuenta);
            //Persona person = new Persona(id_persona,rut,nombre,apellidos,sexo,fechaNac,telefono,correo,nacionalidad,iduser,nombreusuario,pass,tipo);
            Persona person = new Persona(id_persona, rut, nombre, apellidos, sexo, fechaNac, telefono, correo, nacionalidad, iduser, nombreusuario, pass, tipo, estado_cuenta);

            Administrar_Personas admp = new Administrar_Personas();
            Administrar_Usuarios usr = new Administrar_Usuarios();
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "¿Desea ingresar al sistema?", "confirmacion", dialogButton);
            if (dialogResult == 0) {

                if (usr.ingresarUsuario(userr) && admp.ingresarPersona(person)) {
                    JOptionPane.showMessageDialog(null, "Se ingreso correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "no se puedo ingresar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "no se guardaron los cambios");
            }

            btnIngresar.setEnabled(true);
            btnIngresar.setText("Ingresar");

        }

        //JOptionPane.showMessageDialog(null, id_persona+rut+nombre+apellidos+sexo+fechaNac+telefono+correo+nacionalidad+iduser+nombreusuario+pass+tipo);

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtConfirmarPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarPassFocusLost
        if (!txtPass.getText().equals(txtConfirmarPass.getText())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            txtPass.setText("");
            txtConfirmarPass.setText("");
            lblconfirmar.setVisible(true);
            txtPass.requestFocus();

        } else {
            lblconfirmar.setVisible(false);
        }
    }//GEN-LAST:event_txtConfirmarPassFocusLost

    private void txtRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutFocusLost
        // TODO add your handling code here:
        if (txtRut.getText().equals("")) {
            lblrut.setVisible(true);
        } else {

            Administrar_Personas admp = new Administrar_Personas();
            if (admp.buscarPersona(txtRut.getText())) {
                JOptionPane.showMessageDialog(null, "El Rut Ya esta registrado");
                txtRut.requestFocus();

            } else {
                String rut = formatearRut(txtRut.getText());
                
                if (validarRut(rut)) {
                    txtRut.setText("");
                    JOptionPane.showMessageDialog(null, rut + " rut con formato");
                    txtRut.setText(rut);
                    txtRut.setEnabled(false);
                    lblrut.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un rut valido");
                    txtRut.requestFocus();
                }
            }
        }


    }//GEN-LAST:event_txtRutFocusLost

    public String formatearRut(String rut) {
        JOptionPane.showMessageDialog(null, rut + " rut sin formato");

        int cont = 0;
        String format;
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        format = "-" + rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            format = rut.substring(i, i + 1) + format;
            cont++;
            if (cont == 3 && i != 0) {
                format = "." + format;
                cont = 0;
            }
        }

        return format;
    }

    public static boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }


    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:

        if (txtUsuario.getText().equals("")) {
            //JOptionPane.showMessageDialog(null, "Usuario puede estar vacio");
            lblusuario.setVisible(true);

        } else {

            lblusuario.setVisible(false);

            //aqui
            Administrar_Usuarios usr = new Administrar_Usuarios();
            if (usr.buscarUsuario(txtUsuario.getText())) {
                JOptionPane.showMessageDialog(null, "el nombre de usuario ya esta registrado, por favor seleccione otro");
                txtUsuario.requestFocus();

            }

        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        // TODO add your handling code here:

        if (txtPass.getText().equals("")) {
            //JOptionPane.showMessageDialog(null, "Contraseña puede estar vacio");
            lblpass.setVisible(true);
        } else {
            lblpass.setVisible(false);
        }


    }//GEN-LAST:event_txtPassFocusLost

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        if (txtNombre.getText().equals("")) {
            //JOptionPane.showMessageDialog(null, "Nombre puede estar vacio");
            lblnombre.setVisible(true);
        } else {
            lblnombre.setVisible(false);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        if (txtApellido.getText().equals("")) {
            //JOptionPane.showMessageDialog(null, "Apellido puede estar vacio");
            lblapellido.setVisible(true);
        } else {
            lblapellido.setVisible(false);
        }
    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarUsuario().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> cboAnio;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JComboBox<String> cboNacionalidad;
    private javax.swing.JComboBox<String> cboRol;
    public static javax.swing.ButtonGroup gruposexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblconfirmar;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblrut;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JRadioButton rbnHombre;
    private javax.swing.JRadioButton rbnMujer;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtConfirmarPass;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
