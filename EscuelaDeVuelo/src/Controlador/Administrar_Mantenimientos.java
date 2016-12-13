/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Mantenimientos;
import Database.Conexion;
import Modelo.Componente;
import Modelo.Detalle_Mantenimiento;


import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author jordans
 */
public class Administrar_Mantenimientos {
    
      public void ingresarMantenimiento(Mantenimientos mante) {
        try {
           String fecha_ini= mante.getFecha_inicio();
           String fecha_termi = mante.getFecha_termino();

            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO mantenimientos  VALUES ((select (max(id)+1)from mantenimientos),'" + fecha_ini + "','" + fecha_termi + "')";
            conec.escribir(sql);

         
        } catch (Exception e) {
           
        }

    }
    
    public void ingresarDetalleMantenimiento(Detalle_Mantenimiento detalle){
         try {
           int idmante= detalle.getId_mante();
         int idcompo= detalle.getId_compo();
             int idplanes= detalle.getId_planes();
            String estado= detalle.getEstado();
            String tareas= detalle.getTareas_seleccionadas();
            Conexion conec = new Conexion();
            conec.conectar();
            //
            String sql = "INSERT INTO detalles_mantenimientos  VALUES ((select (max(id)+1)from detalles_mantenimientos),'" + idcompo + "','" + idplanes +"','"+estado +"','"+tareas+ "')";
            conec.escribir(sql);
            String sql1 = "update aeronaves set estado = 'V' where AERONAVES_ID= '" + idcompo + "'";
            conec.escribir(sql1);
        } catch (Exception e) {
           
        }
        
    }
    
    
}
