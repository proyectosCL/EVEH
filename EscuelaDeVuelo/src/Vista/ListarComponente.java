/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Administrar_Componente;
import Modelo.Componente;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author pcbla
 */
public class ListarComponente extends javax.swing.JFrame {

    /**
     * Creates new form ListarComponente
     */
    public ListarComponente() {
        initComponents();
        cargarTablaComponentes();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaComponentes = new javax.swing.JTable();
        btnEliminarCompte = new javax.swing.JButton();
        btnModificarCompte = new javax.swing.JButton();
        lblComponenteSeleccionado = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Listar Componentes");

        tablaComponentes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaComponentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaComponentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaComponentes);

        btnEliminarCompte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/eliminar.png"))); // NOI18N
        btnEliminarCompte.setBorder(null);
        btnEliminarCompte.setBorderPainted(false);
        btnEliminarCompte.setContentAreaFilled(false);
        btnEliminarCompte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCompteActionPerformed(evt);
            }
        });

        btnModificarCompte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/editar.png"))); // NOI18N
        btnModificarCompte.setBorder(null);
        btnModificarCompte.setBorderPainted(false);
        btnModificarCompte.setContentAreaFilled(false);
        btnModificarCompte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCompteActionPerformed(evt);
            }
        });

        lblComponenteSeleccionado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones/regresar.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblComponenteSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEliminarCompte)
                                        .addGap(77, 77, 77)
                                        .addComponent(btnModificarCompte)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMenu)))))
                        .addGap(0, 268, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComponenteSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnModificarCompte, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEliminarCompte))
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaComponentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaComponentesMouseClicked
        // TODO add your handling code here:

        btnEliminarCompte.setEnabled(true);
        btnModificarCompte.setEnabled(true);

        lblComponenteSeleccionado.setText("Componente seleccionado");
        lblComponenteSeleccionado.setForeground(Color.green);

    }//GEN-LAST:event_tablaComponentesMouseClicked

    private void btnEliminarCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCompteActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar el componente seleccionado?");
        if (JOptionPane.OK_OPTION == resp) {
            int idCompte = Integer.parseInt(tablaComponentes.getValueAt(tablaComponentes.getSelectedRow(), 0).toString());
            Administrar_Componente ac = new Administrar_Componente();
            ac.eliminarComponente(idCompte);
            cargarTablaComponentes();
        } else {
            cargarTablaComponentes();
        }


    }//GEN-LAST:event_btnEliminarCompteActionPerformed

    private void btnModificarCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCompteActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Seguro que desea modificar el componente seleccionado?");
        if (JOptionPane.OK_OPTION == resp) {
            int idCompte = Integer.parseInt(tablaComponentes.getValueAt(tablaComponentes.getSelectedRow(), 0).toString());
            ModificarComponente modCompte= new ModificarComponente();
            
            modCompte.idCompteMod = idCompte;
            modCompte.setLocationRelativeTo(null);
            modCompte.setVisible(true);
            this.dispose();
            
            
        } else {
            cargarTablaComponentes();
        }
    }//GEN-LAST:event_btnModificarCompteActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MenuPrincipalOperador menu = new MenuPrincipalOperador();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(ListarComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarComponente().setVisible(true);
            }
        });
    }

    private void cargarTablaComponentes() {
        //Definición de nombres y tamaño de las columnas al iniciar la ventana.
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        btnEliminarCompte.setEnabled(false);
        btnModificarCompte.setEnabled(false);
        lblComponenteSeleccionado.setText("Seleccione un componente para Eliminar/Modificar");
        lblComponenteSeleccionado.setForeground(Color.red);
        String tipo_componente, asociacionAeronave = "";
        int tipoCompte, tipoAsociacion = 0;
        tablaComponentes.setModel(modelo);
        tablaComponentes.getTableHeader().setReorderingAllowed(false);
        //.:Nombres de columnas:.
        modelo.addColumn("ID");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("FABRICANTE");
        modelo.addColumn("HORAS DE VUELO");
        modelo.addColumn("DIAS DE VUELO");
        modelo.addColumn("TIPO DE COMPONENTE");
        modelo.addColumn("COMPONENTE ASOCIADO");
        modelo.addColumn("AERONAVE ASOCIADA");
        //.:Tamaño de columnas:.
        tablaComponentes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = tablaComponentes.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(140);
        columnModel.getColumn(2).setPreferredWidth(125);
        columnModel.getColumn(3).setPreferredWidth(120);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(150);
        columnModel.getColumn(6).setPreferredWidth(140);
        columnModel.getColumn(7).setPreferredWidth(165);
        Administrar_Componente ac = new Administrar_Componente();
        ArrayList<Componente> listaComponente = ac.listarComponente();
        Object[] fila = new Object[8];
        int num = listaComponente.size();
        for (int i = 0; i < num; i++) {
            fila[0] = listaComponente.get(i).getId();
            fila[1] = listaComponente.get(i).getDescripcion();
            fila[2] = listaComponente.get(i).getFabricante();
            fila[3] = listaComponente.get(i).getHoras_vuelo();
            fila[4] = listaComponente.get(i).getDias_vuelo();
            tipoCompte = listaComponente.get(i).getTipo_componente_id();
            tipo_componente = ac.definirTipoCompte(tipoCompte);
            fila[5] = tipo_componente;
            fila[6] = listaComponente.get(i).getComponente_id();
            tipoAsociacion = listaComponente.get(i).getAeronave_id();
            if (tipoAsociacion == 0) {
                asociacionAeronave = "Componente libre";
                fila[7] = asociacionAeronave;
            } else {
                fila[7] = listaComponente.get(i).getAeronave_id();
            }

            modelo.addRow(fila);
        }
        tablaComponentes.updateUI();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarCompte;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificarCompte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComponenteSeleccionado;
    private javax.swing.JTable tablaComponentes;
    // End of variables declaration//GEN-END:variables
}
