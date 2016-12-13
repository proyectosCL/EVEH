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
            String fecha_ini = mante.getFecha_inicio();
            String fecha_termi = mante.getFecha_termino();

            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO mantenimientos  VALUES ((select (max(id)+1)from mantenimientos),'" + fecha_ini + "','" + fecha_termi + "')";
            conec.escribir(sql);

        } catch (Exception e) {

        }

    }

    public void ingresarDetalleMantenimiento(Detalle_Mantenimiento detalle) {
        try {
            int idmante = detalle.getId_mante();
            int idcompo = detalle.getId_compo();
            int idplanes = detalle.getId_planes();
            String estado = detalle.getEstado();
            String tareas = detalle.getTareas_seleccionadas();
            Conexion conec = new Conexion();
            conec.conectar();
            //
            String sql = "INSERT INTO detalles_mantenimientos  VALUES ((select (max(mantenimientos_id)+1)from detalles_mantenimientos),'" + idcompo + "','" + idplanes + "','" + estado + "','" + tareas + "')";
            conec.escribir(sql);
            String sql1 = "update aeronaves set estado = 'V' where id= '" + idcompo + "'";
            conec.escribir(sql1);
        } catch (Exception e) {

        }
    }

    public ArrayList<Detalle_Mantenimiento> listarMantenimientosMatricula(String tipo_aeronave) {
        ArrayList listaMantenimientos = new ArrayList();
        Detalle_Mantenimiento mantenimiento;
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM detalles_mantenimientos JOIN mantenimientos ON mantenimientos.id = detalles_mantenimientos.mantenimientos_id JOIN aeronaves ON detalles_mantenimientos.aeronaves_id = aeronaves.id JOIN tipos_aeronaves ON aeronaves.tipo_aeronaves_id = tipos_aeronaves.id WHERE tipos_aeronaves.descripcion = '"+tipo_aeronave+"'");
            while (rs.next()) {
                mantenimiento = new Detalle_Mantenimiento();
                mantenimiento.setId(rs.getInt(1));
                mantenimiento.setMatricula(rs.getString(10));
                mantenimiento.setEstado(rs.getString(4));
                mantenimiento.setTareas_seleccionadas(rs.getString(5));
                mantenimiento.setFecha_inicio(DateFormat.format(rs.getDate(7)));
                mantenimiento.setFecha_termino(DateFormat.format(rs.getDate(8)));
                listaMantenimientos.add(mantenimiento);
            }

        } catch (Exception ex) {

        }
        return listaMantenimientos;
    }

}
