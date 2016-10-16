package Controlador;

import Database.Conexion;
import Modelo.Aerodromo;
import Modelo.Vuelo;
import Vista.ListarVuelo;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;

public class Administrar_Vuelo implements administrar_horas_vuelo {

    public void ingresarVuelo(Vuelo vuelo) {

        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            dbconn.escribir("INSERT INTO vuelos VALUES ((select (max(id)+1)from vuelos),'" + vuelo.getAerodromo_origen() + "','" + vuelo.getAerodromo_destino() + "','" + vuelo.getHoras_vuelo() + "','" + vuelo.getCondicion_vuelo() + "','" + vuelo.getMision_vuelo() + "','" + vuelo.getFecha_vuelo() + "','" + vuelo.getAeronave() + "')");
            dbconn.escribir("INSERT INTO tripulacion VALUES (select (max(id)) from vuelos)");
        } catch (Exception e) {

        }

    }

    public void modificarVuelo() {
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

    //Metodo para llenar la tabla de vuelos.
    public ArrayList<Vuelo> listarVuelo() {
        ArrayList listaVuelo = new ArrayList();
        Vuelo vuelo;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM vuelos JOIN aerodromos ON vuelos.aerodromos_id_origen = aerodromos.id JOIN aerodromos ON vuelos.aerodromos_id_destino = aerodromos.id JOIN aeronaves ON vuelos.aeronaves_id = aeronaves.id");
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

    public static void main(String[] args) {
        ArrayList listaAerodromo = new ArrayList();
        Aerodromo aerodromo;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM aerodromos");
            while (rs.next()) {
                aerodromo = new Aerodromo();
                System.out.print(rs.getInt("id"));
                System.out.print(rs.getString("descripcion"));
                System.out.println(rs.getString("ciudad"));
            }

        } catch (Exception e) {

        }
    }
}
