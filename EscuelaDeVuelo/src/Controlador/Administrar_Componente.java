package Controlador;

import Database.Conexion;
import Modelo.Componente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Administrar_Componente implements administrar_horas_vuelo {

    public boolean ingresarNuevoComponente(Componente nuevoComponente) {
        try {
            String desc = nuevoComponente.getDescripcion();
            String fabricte = nuevoComponente.getFabricante();
            Float horasVuelo = nuevoComponente.getHoras_vuelo();
            int diasVuelo = nuevoComponente.getDias_vuelo();
            int tpoCompteId = nuevoComponente.getTipo_componente_id();
      

            Conexion conec = new Conexion();
            conec.conectar();
            String sql= "INSERT INTO componentes  VALUES ((select (max(id)+1)from componentes),'" + desc + "','" + fabricte + "',"+horasVuelo+"," + diasVuelo + "," + tpoCompteId + ", null,  null )";
            conec.escribir(sql);

            return true;
        } catch (Exception e) {
            return false;
        }

    }
    
     public ArrayList<Componente> listarFuselaje() {
         
          ArrayList listaFuselaje = new ArrayList();
        Componente compte;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM componentes WHERE tipos_componentes_id =1");
            while (rs.next()) {
                compte = new Componente();
                compte.setId(rs.getInt("id"));
                compte.setDescripcion(rs.getString(2));
                compte.setFabricante(rs.getString(3));
                compte.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                compte.setDias_vuelo(rs.getInt("dias_vuelo"));
                compte.setTipo_componente_id(rs.getInt("tipos_componentes_id"));
                compte.setComponente_id(rs.getInt("componentes_id"));
                compte.setAeronave_id(rs.getInt("aeronaves_id"));
                listaFuselaje.add(compte);
            }

        } catch (Exception e) {

        }
        return listaFuselaje;

    }
     
     public ArrayList<Componente> listarAlas() {
         
          ArrayList listaAlas = new ArrayList();
        Componente compte;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM componentes WHERE tipos_componentes_id =2");
            while (rs.next()) {
                compte = new Componente();
                compte.setId(rs.getInt("id"));
                compte.setDescripcion(rs.getString(2));
                compte.setFabricante(rs.getString(3));
                compte.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                compte.setDias_vuelo(rs.getInt("dias_vuelo"));
                compte.setTipo_componente_id(rs.getInt("tipos_componentes_id"));
                compte.setComponente_id(rs.getInt("componentes_id"));
                compte.setAeronave_id(rs.getInt("aeronaves_id"));
                listaAlas.add(compte);
            }

        } catch (Exception e) {

        }
        return listaAlas;

    }

    public void asociarAeronave() {
    }

    public void asociarSubcomponente() {
    }

   

    @Override
    public void sumarHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
