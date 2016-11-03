package Controlador;

import Database.Conexion;
import Modelo.Aeronave;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Administrar_Aeronave implements administrar_horas_vuelo {

    public boolean ingresarAeronave(Aeronave nuevoAeronave) {
        try {
            //int id = nuevoUsuario.getId_usuario();
            String nombreMatricula = nuevoAeronave.getMatricula();
            String tiponave = nuevoAeronave.getTiponave();
            String estado = nuevoAeronave.getEstado();
            String fecha_aero = nuevoAeronave.getFecha_aeronavegavilidad();
            String fecha_insp = nuevoAeronave.getFecha_ultima_inspeccion_anual();
            String horasvuelo = nuevoAeronave.getHoras_vuelo();
            String diasvuelo = nuevoAeronave.getDias_vuelo();

            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO aeronaves  VALUES ((select (max(id)+1)from aeronaves),'" + nombreMatricula + "','" + tiponave + "','" + estado + "','" + fecha_aero + "','" + fecha_insp + "','" + horasvuelo + "','" + diasvuelo + "')";

            conec.escribir(sql);

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean buscarAeronave(String matricula) {

        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM aeronaves where matricula like '" + matricula + "'");
            ResultSet rs = myStatement.executeQuery();
            int fila = 0;
            while (rs.next()) {
                fila = 1;
            }

            if (fila == 1) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }

    }

    public boolean eliminarAeronave(String id) {
        try {

            Conexion con = new Conexion();
            con.conectar();
            //cambiar el 32 por el id del user
            String sql1 = "update componentes set AERONAVES_ID=null where AERONAVES_ID= '" + id + "'";
            con.escribir(sql1);

            String sql = "delete from aeronaves where id = '" + id + "'";

            System.out.println(sql);
            con.escribir(sql);
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            return true;

        } catch (HeadlessException e) {
            return false;
        }

    }

    public void asociarComponentes() {
    }

    public void alertarAeronave() {
    }

    public Aeronave cargarAeronave(int matricula) {

        Aeronave aeronavesita = new Aeronave();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM aeronaves where id like '" + matricula + "'");
            ResultSet rs = myStatement.executeQuery();
            int fila = 0;
            while (rs.next()) {
                fila = +1;
                aeronavesita.setId(rs.getString(1));
                aeronavesita.setMatricula(rs.getString(2));
                aeronavesita.setTiponave(rs.getString(3));
                aeronavesita.setEstado(rs.getString(4));
                aeronavesita.setFecha_aeronavegavilidad(df.format(rs.getDate(5)));
                aeronavesita.setFecha_ultima_inspeccion_anual(df.format(rs.getDate(6)));
                aeronavesita.setHoras_vuelo(rs.getString(7));
                aeronavesita.setDias_vuelo(rs.getString(8));

            }
            if (fila == 0) {
                return null;
            } else {
                return aeronavesita;
            }

        } catch (Exception e) {
            return null;
        }

    }

    public boolean modificarAeronave(Aeronave nuevoAeronave) {
        try {
            String id = nuevoAeronave.getId();

            String tiponave = nuevoAeronave.getTiponave();
            String estado = nuevoAeronave.getEstado();
            String fecha_aero = nuevoAeronave.getFecha_aeronavegavilidad();
            String fecha_insp = nuevoAeronave.getFecha_ultima_inspeccion_anual();
            String horasvuelo = nuevoAeronave.getHoras_vuelo();
            String diasvuelo = nuevoAeronave.getDias_vuelo();

            Conexion conec = new Conexion();
            conec.conectar();
            // String sql = "update aeronaves set tipo_aeronaves_id = "+tiponave+"', estado = "+estado+"', fecha_aeronavegabilidad = "+fecha_aero+"', fecha_inspeccion_anual = "+fecha_insp+"', horas_vuelo = "+horasvuelo+"', dias_vuelo = "+diasvuelo+" where id = "+id;
            String sql = "update aeronaves set tipo_aeronaves_id = '" + tiponave + "', estado = '" + estado + "', fecha_aeronavegabilidad = '" + fecha_aero + "', fecha_inspeccion_anual = '" + fecha_insp + "', horas_vuelo = '" + horasvuelo + "', dias_vuelo = '" + diasvuelo + "' where id = '" + id + "'";

            conec.escribir(sql);

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public ArrayList<Aeronave> listarAeronave() {

        ArrayList listaComponentes = new ArrayList();
        Aeronave lista;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("select * from aeronaves ");
            while (rs.next()) {

                lista = new Aeronave();
                lista.setId(rs.getString(1));
                lista.setMatricula(rs.getString(2));
                lista.setTiponave(rs.getString(3));
                lista.setEstado(rs.getString(4));
                lista.setFecha_aeronavegavilidad(df.format(rs.getDate(5)));
                lista.setFecha_ultima_inspeccion_anual(df.format(rs.getDate(6)));
                lista.setHoras_vuelo(rs.getString(7));
                lista.setDias_vuelo(rs.getString(8));
                listaComponentes.add(lista);
            }

        } catch (Exception e) {

        }
        return listaComponentes;

    }

    public ArrayList<Aeronave> listarPorMatricula(String matri) {

        ArrayList listaNave = new ArrayList();
        Aeronave lista;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("select * from aeronaves where matricula like '"+matri+"'");
            while (rs.next()) {

                lista = new Aeronave();
                lista.setId(rs.getString(1));
                lista.setMatricula(rs.getString(2));
                lista.setTiponave(rs.getString(3));
                lista.setEstado(rs.getString(4));
                lista.setFecha_aeronavegavilidad(df.format(rs.getDate(5)));
                lista.setFecha_ultima_inspeccion_anual(df.format(rs.getDate(6)));
                lista.setHoras_vuelo(rs.getString(7));
                lista.setDias_vuelo(rs.getString(8));
                listaNave.add(lista);
            }

        } catch (Exception e) {

        }
        return listaNave;

    }

    @Override
    public void sumarHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
