package Controlador;

import Database.Conexion;
import Modelo.Piloto;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Administrar_Pilotos implements administrar_horas_vuelo {

    private Piloto piloto;
    
    public void ingresarPiloto(Piloto npiloto) {
         try {
            Float horas_vuelo = npiloto.getHoras_vuelo();
            int dias_vuelo = npiloto.getDias_vuelo();
            String vencimiento_medicina = npiloto.getVencimiento_medicina();
            String fecha_ultimo_vuelo = npiloto.getFecha_ultimo_vuelo();
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
            String vencimiento_medicina = npiloto.getVencimiento_medicina();
            String fecha_ultimo_vuelo = npiloto.getFecha_ultimo_vuelo();
             
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
    
    public int buscarIdPiloto(String rut){
        Piloto piloto;
        piloto = new Piloto();
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT pilotos.ID FROM pilotos  join personas on personas.id = pilotos.PERSONAS_ID where rut = '"+rut+"'");
            while (rs.next()) {
                
                piloto.setId_persona(rs.getInt(1));
            }

        } catch (Exception e) {
        }
        return piloto.getId_persona();
    }
    
    public ArrayList<Piloto> listarPiloto() {
        ArrayList lista = new ArrayList();
        Piloto piloto;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM pilotos join personas on personas.id = personas_id ");
            int cantidad =0;
            
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
                while (rs.next()) {
                    piloto = new Piloto();
                    piloto.setId(rs.getInt("id"));
                    piloto.setDias_vuelo(rs.getInt("dias_vuelo"));
                    piloto.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                    try {
                        piloto.setVencimiento_medicina(df.format(rs.getDate("vencimiento_medicina")));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    try {
                        piloto.setFecha_ultimo_vuelo(df.format(rs.getDate("ultimo_vuelo_realizado")));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    piloto.setRut(rs.getString("rut"));
                    piloto.setId_persona(rs.getInt("personas_id"));
                    piloto.setNombre(rs.getString("nombre"));
                    piloto.setApellidos(rs.getString("apellidos"));
                    lista.add(piloto);
                }

            } catch (Exception e) {
            }
            return lista;
        }
}
