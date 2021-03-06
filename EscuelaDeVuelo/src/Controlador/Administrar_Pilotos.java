package Controlador;

import Database.Conexion;
import Modelo.Piloto;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
            String sql = "INSERT INTO pilotos  VALUES ((select (max(id)+1)from pilotos)," + horas_vuelo + "," + dias_vuelo + ",'" + vencimiento_medicina + "','" + fecha_ultimo_vuelo + "'," + persona + ")";
            System.out.println(sql);
            conec.escribir(sql);
            JOptionPane.showMessageDialog(null, "Ingresado Correctamente");

        } catch (Exception e) {
        }
    }

    public void modificarPiloto(Piloto npiloto) {

        try {
            Float horas_vuelo = npiloto.getHoras_vuelo();
            int dias_vuelo = npiloto.getDias_vuelo();
            String vencimiento_medicina = npiloto.getVencimiento_medicina();
            String fecha_ultimo_vuelo = npiloto.getFecha_ultimo_vuelo();
            int id = npiloto.getId();

            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "update pilotos set horas_vuelo= " + horas_vuelo + ","
                    + " dias_vuelo = " + dias_vuelo + ","
                    + " vencimiento_medicina = '" + vencimiento_medicina + "' ,"
                    + "ultimo_vuelo_realizado = '" + fecha_ultimo_vuelo + "' "
                    + "where id = " + id;
            conec.escribir(sql);
            JOptionPane.showMessageDialog(null, "Modificado Correctamente");

        } catch (Exception e) {
        }
    }

    public void eliminarPiloto(int id) {
        try {
            Conexion con = new Conexion();
            con.conectar();

            String sqlLicencia = "delete from licencias where pilotos_id = " + id;
            con.escribir(sqlLicencia);

            String sql = "delete from pilotos where id = '" + id + "'";
            con.escribir(sql);

            JOptionPane.showMessageDialog(null, "Eliminado correctamente");

        } catch (HeadlessException e) {

        }
    }

    public void alertarPiloto() {
    }

    public void sumarHoras() {
    }

    public int buscarIdPiloto(String rut) {
        Piloto piloto;
        piloto = new Piloto();
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT pilotos.ID FROM pilotos  join personas on personas.id = pilotos.PERSONAS_ID where rut = '" + rut + "'");
            while (rs.next()) {

                piloto.setId_persona(rs.getInt(1));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return piloto.getId_persona();
    }

    public ArrayList<Piloto> listarPiloto() {
        ArrayList lista = new ArrayList();
        Piloto piloto;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM pilotos join personas on personas.id = personas_id order by rut");
            int cantidad = 0;

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

     public ArrayList<Piloto> listarPilotoIngresar() {
        ArrayList lista = new ArrayList();
        Piloto piloto;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM pilotos right join   personas on personas.id = personas_id order by rut");
            int cantidad = 0;

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) {
                piloto = new Piloto();
                if (rs.getDate("vencimiento_medicina") == null) {
                    piloto.setRut(rs.getString("rut"));
                    piloto.setId_persona(rs.getInt(7));
                    // o 7 ._.
                    piloto.setNombre(rs.getString("nombre"));
                    piloto.setApellidos(rs.getString("apellidos"));
                    lista.add(piloto);
                }
                
            }

        } catch (Exception e) {
        }
        return lista;
    }
    
    
    public String buscarRutPiloto(int id) {
        Piloto piloto;
        piloto = new Piloto();
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT personas.rut FROM personas  join pilotos on personas.id = pilotos.PERSONAS_ID where pilotos.id = " + id);
            while (rs.next()) {

                piloto.setFecha_ultimo_vuelo(rs.getString(1));
            }

        } catch (Exception e) {
        }
        return piloto.getFecha_ultimo_vuelo();
    }

    public boolean buscarPilotoR(int id_persona) {
        boolean valido = false;

        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM pilotos where personas_id = " + id_persona);
            while (rs.next()) {
                valido = true;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return valido;
    }

    public ArrayList<Piloto> listarPilotoMasCantidadLicencia() {
        ArrayList lista = new ArrayList();
        Piloto piloto;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("select pilotos.ID,pilotos.HORAS_VUELO,pilotos.DIAS_VUELO, "
                    + "pilotos.VENCIMIENTO_MEDICINA ,pilotos.ULTIMO_VUELO_REALIZADO,personas.rut,personas.nombre,"
                    + "personas.apellidos, count(*) as licencias "
                    + " from pilotos LEFT  join licencias  on pilotos.id = licencias.PILOTOS_ID "
                    + "join personas on pilotos.PERSONAS_ID = personas.id "
                    + "group by pilotos.ID,pilotos.HORAS_VUELO,pilotos.DIAS_VUELO,pilotos.VENCIMIENTO_MEDICINA, "
                    + "pilotos.ULTIMO_VUELO_REALIZADO,personas.rut,personas.nombre,personas.apellidos"
                    + " order by personas.rut");
            int cantidad = 0;

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) {
                piloto = new Piloto();
                piloto.setId(rs.getInt(1));
                piloto.setDias_vuelo(rs.getInt(3));
                piloto.setHoras_vuelo(rs.getFloat(2));
                try {
                    piloto.setVencimiento_medicina(df.format(rs.getDate(4)));
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                try {
                    piloto.setFecha_ultimo_vuelo(df.format(rs.getDate(5)));
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                piloto.setRut(rs.getString(6));
                piloto.setId_persona(rs.getInt(9));
                piloto.setNombre(rs.getString("nombre"));
                piloto.setApellidos(rs.getString("apellidos"));

                    piloto.setId_usuario(rs.getInt("licencias"));

                
                lista.add(piloto);
            }

        } catch (Exception e) {
        }
        return lista;
    }

    public ArrayList<Piloto> listarPilotoID(int id) {
        ArrayList lista = new ArrayList();
        Piloto piloto;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM pilotos join personas on personas.id = personas_id where pilotos.id = " + id + "  order by rut");
            int cantidad = 0;

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
