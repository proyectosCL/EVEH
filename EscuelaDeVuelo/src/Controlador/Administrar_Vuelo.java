package Controlador;

import Database.Conexion;
import Modelo.Aerodromo;
import Modelo.Aeronave;
import Modelo.Piloto;
import Modelo.Vuelo;
import Vista.ListarVuelo;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;

public class Administrar_Vuelo implements administrar_horas_vuelo {

    public boolean ingresarVuelo(Vuelo vuelo, int piloto, String[] tripulacion) {
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
            DateFormat df2 = new SimpleDateFormat("HH:mm:ss");
            String date = df1.format(vuelo.getFecha_vuelo()) + ":" + df2.format(vuelo.getFecha_vuelo());
            dbconn.escribir("INSERT INTO vuelos VALUES ((SELECT (MAX(id)+1) FROM vuelos)," + vuelo.getId_aerodromo_origen() + "," + vuelo.getId_aerodromo_destino() + "," + null + ",'" + vuelo.getCondicion_vuelo() + "','" + vuelo.getMision_vuelo() + "',to_date('" + date + "','dd/MM/yyyy:hh24:mi:ss')," + vuelo.getId_aeronave() + ")");
            dbconn.escribir("INSERT INTO tripulacion VALUES ((SELECT (MAX(id)) FROM vuelos)," + piloto + ",'P')");
            for (int i = 0; i < tripulacion.length; i++) {
                dbconn.escribir("INSERT INTO tripulacion VALUES ((SELECT (MAX(id)) FROM vuelos)," + tripulacion[i] + ",'T')");
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void modificarVuelo() {
    }

    public boolean eliminarVuelo(int id) {
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            dbconn.escribir("DELETE FROM tripulacion WHERE vuelos_id = " + id);
            dbconn.escribir("DELETE FROM vuelos WHERE id = " + id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void sumarHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ListarVuelo vistaListarVuelo = new ListarVuelo();
    JTable tabla = null;

    //Metodo para llenar la lista de aerodromos.
    public ArrayList<Aerodromo> listarAerodromo() {
        ArrayList listaAerodromo = new ArrayList();
        Aerodromo aerodromo;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM aerodromos");
            while (rs.next()) {
                aerodromo = new Aerodromo();
                aerodromo.setId(rs.getInt("id"));
                aerodromo.setDescripcion(rs.getString("descripcion"));
                aerodromo.setCiudad(rs.getString("ciudad"));
                listaAerodromo.add(aerodromo);
            }

        } catch (Exception e) {
        }
        return listaAerodromo;
    }

    //Metodo para llenar la lista de aeronaves.
    public ArrayList<Aeronave> listarAeronave() {
        ArrayList listaAeronave = new ArrayList();
        Aeronave aeronave;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM aeronaves");
            while (rs.next()) {
                aeronave = new Aeronave();
                aeronave.setId(rs.getString("id"));
                aeronave.setMatricula(rs.getString("matricula"));
                listaAeronave.add(aeronave);
            }

        } catch (Exception e) {
        }
        return listaAeronave;
    }

    //Metodo para ingresar un piloto a la tripulacion
    public int buscarPiloto(String rut) {
        Piloto piloto = new Piloto();
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM pilotos JOIN personas ON pilotos.personas_id = personas.id WHERE rut = '" + rut + "'");
            while (rs.next()) {
                piloto.setId(rs.getInt("id"));
                piloto.setRut(rs.getString("rut"));
            }
        } catch (Exception e) {
        }
        return piloto.getId();
    }

    //Metodo para llenar el combobox y la lista de pilotos.
    public ArrayList<Piloto> listarPiloto() {
        ArrayList listaPiloto = new ArrayList();
        Piloto piloto;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM pilotos JOIN personas ON pilotos.personas_id = personas.id");
            while (rs.next()) {
                piloto = new Piloto();
                piloto.setId(rs.getInt("id"));
                piloto.setRut(rs.getString("rut"));
                piloto.setNombre(rs.getString("nombre"));
                piloto.setApellidos(rs.getString("apellidos"));
                listaPiloto.add(piloto);
            }

        } catch (Exception e) {
        }
        return listaPiloto;
    }

    //Metodo para llenar la tabla de vuelos.
    public ArrayList<Vuelo> listarVuelo() {
        ArrayList listaVuelo = new ArrayList();
        Vuelo vuelo;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM vuelos JOIN aerodromos ON vuelos.aerodromos_id_origen = aerodromos.id JOIN aerodromos ON vuelos.aerodromos_id_destino = aerodromos.id JOIN aeronaves ON vuelos.aeronaves_id = aeronaves.id ORDER BY vuelos.id");
            while (rs.next()) {
                vuelo = new Vuelo();
                vuelo.setId(rs.getInt("id"));
                vuelo.setAerodromo_origen(rs.getString(11)); //El 11 es el numero de la columna dentro de la BD.
                vuelo.setAerodromo_destino(rs.getString(14));
                vuelo.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                vuelo.setCondicion_vuelo(rs.getString("condicion_vuelo").charAt(0));
                vuelo.setMision_vuelo(rs.getString("mision_vuelo"));
                vuelo.setFecha_vuelo(rs.getDate("fecha_vuelo"));
                vuelo.setAeronave(rs.getString("matricula"));
                listaVuelo.add(vuelo);
            }

        } catch (Exception e) {

        }
        return listaVuelo;
    }

    public ArrayList<Vuelo> listarVueloNoTerminado() {
        ArrayList listaVuelo = new ArrayList();
        Vuelo vuelo;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM vuelos JOIN aerodromos ON vuelos.aerodromos_id_origen = aerodromos.id JOIN aerodromos ON vuelos.aerodromos_id_destino = aerodromos.id JOIN aeronaves ON vuelos.aeronaves_id = aeronaves.id WHERE vuelos.horas_vuelo IS NULL ORDER BY vuelos.id");
            while (rs.next()) {
                vuelo = new Vuelo();
                vuelo.setId(rs.getInt("id"));
                vuelo.setAerodromo_origen(rs.getString(11)); //El 11 es el numero de la columna dentro de la BD.
                vuelo.setAerodromo_destino(rs.getString(14));
                vuelo.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                vuelo.setCondicion_vuelo(rs.getString("condicion_vuelo").charAt(0));
                vuelo.setMision_vuelo(rs.getString("mision_vuelo"));
                vuelo.setFecha_vuelo(rs.getDate("fecha_vuelo"));
                vuelo.setAeronave(rs.getString("matricula"));
                listaVuelo.add(vuelo);
            }

        } catch (Exception e) {

        }
        return listaVuelo;
    }

}
