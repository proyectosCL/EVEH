/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Administrar_Componente;
import Modelo.Componente;
import java.util.ArrayList;
import javax.print.DocFlavor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author pcbla
 */
public class AgregarComponente extends javax.swing.JFrame {

    /**
     * Creates new form IngresarComponente
     */
    public AgregarComponente() {
        initComponents();
        cargarTablaFuselaje();
        cargarTablaAlas();
        cargarTablaEmpenaje();
        cargarTablaControlesFrenos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaAlas = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaEmpenaje = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaFuselaje = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaControlesFrenos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Agregar componentes");

        jLabel2.setText("Fuselaje");

        jLabel3.setText("Alas");

        tablaAlas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(tablaAlas);

        tablaEmpenaje.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(tablaEmpenaje);

        tablaFuselaje.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(tablaFuselaje);

        tablaControlesFrenos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(tablaControlesFrenos);

        jLabel4.setText("Empenaje");

        jLabel5.setText("Controles y Frenos Aerodinamicos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(688, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(179, 179, 179))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(335, 335, 335))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(626, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AgregarComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarComponente().setVisible(true);
            }
        });
    }

    private void cargarTablaFuselaje() {
        //Definición de nombres y tamaño de las columnas al iniciar la ventana.
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaFuselaje.setModel(modelo);
        tablaFuselaje.getTableHeader().setReorderingAllowed(false);
        //.:Nombres de columnas:.
        modelo.addColumn("ID");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("FABRICANTE");
        modelo.addColumn("HORAS DE VUELO");
        modelo.addColumn("DIAS DE VUELO");
        //.:Tamaño de columnas:.
        tablaFuselaje.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = tablaFuselaje.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(140);
        columnModel.getColumn(2).setPreferredWidth(125);
        columnModel.getColumn(3).setPreferredWidth(120);
        columnModel.getColumn(4).setPreferredWidth(100);
        Administrar_Componente ac = new Administrar_Componente();
        ArrayList<Componente> listaFuselaje = ac.listarFiltro(1);
        Object[] fila = new Object[8];
        int num = listaFuselaje.size();
        for (int i = 0; i < num; i++) {
            fila[0] = listaFuselaje.get(i).getId();
            fila[1] = listaFuselaje.get(i).getDescripcion();
            fila[2] = listaFuselaje.get(i).getFabricante();
            fila[3] = listaFuselaje.get(i).getHoras_vuelo();
            fila[4] = listaFuselaje.get(i).getDias_vuelo();
            modelo.addRow(fila);
        }
        tablaFuselaje.updateUI();

    }

    private void cargarTablaAlas() {
        //Definición de nombres y tamaño de las columnas al iniciar la ventana.
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaAlas.setModel(modelo);
        tablaAlas.getTableHeader().setReorderingAllowed(false);
        //.:Nombres de columnas:.
        modelo.addColumn("ID");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("FABRICANTE");
        modelo.addColumn("HORAS DE VUELO");
        modelo.addColumn("DIAS DE VUELO");
        //.:Tamaño de columnas:.
        tablaAlas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = tablaAlas.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(140);
        columnModel.getColumn(2).setPreferredWidth(125);
        columnModel.getColumn(3).setPreferredWidth(120);
        columnModel.getColumn(4).setPreferredWidth(100);
        Administrar_Componente ac = new Administrar_Componente();
        ArrayList<Componente> listaAlas = ac.listarFiltro(2);
        Object[] fila = new Object[8];
        int num = listaAlas.size();
        for (int i = 0; i < num; i++) {
            fila[0] = listaAlas.get(i).getId();
            fila[1] = listaAlas.get(i).getDescripcion();
            fila[2] = listaAlas.get(i).getFabricante();
            fila[3] = listaAlas.get(i).getHoras_vuelo();
            fila[4] = listaAlas.get(i).getDias_vuelo();
            modelo.addRow(fila);
        }
        tablaAlas.updateUI();

    }

    private void cargarTablaEmpenaje() {
        //Definición de nombres y tamaño de las columnas al iniciar la ventana.
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaEmpenaje.setModel(modelo);
        tablaEmpenaje.getTableHeader().setReorderingAllowed(false);
        //.:Nombres de columnas:.
        modelo.addColumn("ID");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("FABRICANTE");
        modelo.addColumn("HORAS DE VUELO");
        modelo.addColumn("DIAS DE VUELO");
        //.:Tamaño de columnas:.
        tablaEmpenaje.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = tablaEmpenaje.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(140);
        columnModel.getColumn(2).setPreferredWidth(125);
        columnModel.getColumn(3).setPreferredWidth(120);
        columnModel.getColumn(4).setPreferredWidth(100);
        Administrar_Componente ac = new Administrar_Componente();
        ArrayList<Componente> listaEmpenaje = ac.listarFiltro(3);
        Object[] fila = new Object[8];
        int num = listaEmpenaje.size();
        for (int i = 0; i < num; i++) {
            fila[0] = listaEmpenaje.get(i).getId();
            fila[1] = listaEmpenaje.get(i).getDescripcion();
            fila[2] = listaEmpenaje.get(i).getFabricante();
            fila[3] = listaEmpenaje.get(i).getHoras_vuelo();
            fila[4] = listaEmpenaje.get(i).getDias_vuelo();
            modelo.addRow(fila);
        }
        tablaEmpenaje.updateUI();

    }

    private void cargarTablaControlesFrenos() {
        //Definición de nombres y tamaño de las columnas al iniciar la ventana.
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaControlesFrenos.setModel(modelo);
        tablaControlesFrenos.getTableHeader().setReorderingAllowed(false);
        //.:Nombres de columnas:.
        modelo.addColumn("ID");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("FABRICANTE");
        modelo.addColumn("HORAS DE VUELO");
        modelo.addColumn("DIAS DE VUELO");
        //.:Tamaño de columnas:.
        tablaControlesFrenos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = tablaControlesFrenos.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(140);
        columnModel.getColumn(2).setPreferredWidth(125);
        columnModel.getColumn(3).setPreferredWidth(120);
        columnModel.getColumn(4).setPreferredWidth(100);
        Administrar_Componente ac = new Administrar_Componente();
        ArrayList<Componente> listaControlesFrenos = ac.listarFiltro(4);
        Object[] fila = new Object[8];
        int num = listaControlesFrenos.size();
        for (int i = 0; i < num; i++) {
            fila[0] = listaControlesFrenos.get(i).getId();
            fila[1] = listaControlesFrenos.get(i).getDescripcion();
            fila[2] = listaControlesFrenos.get(i).getFabricante();
            fila[3] = listaControlesFrenos.get(i).getHoras_vuelo();
            fila[4] = listaControlesFrenos.get(i).getDias_vuelo();
            modelo.addRow(fila);
        }
        tablaControlesFrenos.updateUI();

    }

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tablaAlas;
    private javax.swing.JTable tablaControlesFrenos;
    private javax.swing.JTable tablaEmpenaje;
    private javax.swing.JTable tablaFuselaje;
    // End of variables declaration//GEN-END:variables
}
