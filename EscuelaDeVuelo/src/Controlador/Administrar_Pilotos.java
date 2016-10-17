package Controlador;

import Database.Conexion;
import Modelo.Piloto;
import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Administrar_Pilotos implements administrar_horas_vuelo {

    private Piloto piloto;
    
    public void ingresarPiloto(Piloto npiloto) {
         try {
            Float horas_vuelo = npiloto.getHoras_vuelo();
            int dias_vuelo = npiloto.getDias_vuelo();
            Date vencimiento_medicina = npiloto.getVencimiento_medicina();
            Date fecha_ultimo_vuelo = npiloto.getFecha_ultimo_vuelo();
            int persona = npiloto.getId_persona();
             
            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO pilotos  VALUES ((select (max(id)+1)from pilotos),"+horas_vuelo+","+dias_vuelo+",'"+vencimiento_medicina+"','"+fecha_ultimo_vuelo+"',"+persona+")";
            conec.escribir(sql);
            
            
        } catch (Exception e) {
        }
    }

    public void modificarPiloto(Piloto npiloto) {
        
         try {
            Float horas_vuelo = npiloto.getHoras_vuelo();
            int dias_vuelo = npiloto.getDias_vuelo();
            Date vencimiento_medicina = npiloto.getVencimiento_medicina();
            Date fecha_ultimo_vuelo = npiloto.getFecha_ultimo_vuelo();
             
            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "update piloto set horas_vuelo= "+horas_vuelo+","
                    + " dias_vuelo = "+dias_vuelo+","
                    + " vencimiento_medicina= "+vencimiento_medicina+" ,"
                    + "ultimo_vuelo_realizado"+fecha_ultimo_vuelo;
            conec.escribir(sql);
            
            
        } catch (Exception e) {
        }  
    }

    public void asignarLicencia() {
    }

    public void eliminarPiloto(int id) {
         try {
            Conexion con = new Conexion();
            con.conectar();
            
            String sql = "delete from pilotos where id = '"+id+"'";
            System.out.println(sql);
            con.escribir(sql);
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            
        } catch (HeadlessException e) {
            
        }
    }

    public void alertarPiloto() {
    }

    public void sumarHoras() {
    }
}
