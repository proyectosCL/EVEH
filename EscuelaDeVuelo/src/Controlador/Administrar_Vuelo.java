package Controlador;

import Database.Conexion;
import Modelo.Vuelo;
import Vista.ListarVuelo;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Administrar_Vuelo implements administrar_horas_vuelo {

    public void ingresarVuelo() {
    }

    public void modificarVuelo() {
    }

    @Override
    public void sumarHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ListarVuelo vistaListarVuelo = new ListarVuelo();
    JTable tabla = null;

    public ArrayList<Vuelo> listarVuelo() {
        ArrayList listaVuelo = new ArrayList();
        Vuelo vuelo;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            Connection myconnection = dbconn.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM vuelos");
            ResultSet rs = myStatement.executeQuery();
            while (rs.next()) {
                vuelo = new Vuelo();
                vuelo.setId(Integer.parseInt(rs.getString("id")));
                vuelo.setHoras_vuelo(Float.parseFloat(rs.getString("horas_vuelo")));
                vuelo.setCondicion_vuelo(rs.getString("condicion_vuelo").charAt(0));
                vuelo.setMision_vuelo(rs.getString("mision_vuelo"));
                vuelo.setFecha_vuelo(new Date());
                listaVuelo.add(vuelo);
            }

        } catch (Exception e) {

        }
        return listaVuelo;
    }

}
