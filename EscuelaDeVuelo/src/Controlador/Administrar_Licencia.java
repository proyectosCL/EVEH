/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Database.Conexion;
import Modelo.Licencia;
import Modelo.Tipo_licencia;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Celso
 */
public class Administrar_Licencia {
    
    private Licencia licencia;
    
    public void ingresarLicencia(Licencia nlicencia){
        try{
           int numero =  nlicencia.getNumero();
           int tipo_licencia = nlicencia.getId();
           String fecha_vencimiento = nlicencia.getFecha_vencimiento();
           int dias_vuelo = nlicencia.getDias_vuelo();
           float horas_vuelo = nlicencia.getHoras_vuelo();
           int id_piloto = nlicencia.getId_piloto();
           
           Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO licencias  VALUES ((select (max(id)+1)from licencias),"+numero+","+tipo_licencia+",'"+fecha_vencimiento+"',"+dias_vuelo+","+horas_vuelo+","+id_piloto+")";
            conec.escribir(sql);
            JOptionPane.showMessageDialog(null, "Ingresado Correctamente");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public void modificarLicencia(Licencia nlicencia){
        try{
         int numero =  nlicencia.getNumero();
           int tipo_licencia = nlicencia.getId_licencia();
           String fecha_vencimiento = nlicencia.getFecha_vencimiento();
           int dias_vuelo = nlicencia.getDias_vuelo();
           int id = nlicencia.getId();
           
           Conexion conec = new Conexion();
            conec.conectar();
            String sql = "update licencias set numero= "+numero+","
                    + " tipo_licencia = "+tipo_licencia+","
                    + " fecha_vencimiento= "+fecha_vencimiento+","
                    + "dias_vuelo = "+dias_vuelo
                    + "where id = "+id;
            conec.escribir(sql);
            JOptionPane.showMessageDialog(null, "Modificado correctamente");
            
        }catch(Exception ex){
            
        }   
    }
    
    public void eliminarLicencia(int id){
        try {
            Conexion con = new Conexion();
            con.conectar();
            
            String sql = "delete from licencias where id = '"+id+"'";
            System.out.println(sql);
            con.escribir(sql);
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            
        } catch (HeadlessException e) {
            
        }
    }
    
     public ArrayList<Tipo_licencia> listarTipoLicencia() {
        ArrayList lista = new ArrayList();
        Tipo_licencia tipoLicencia;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM tipos_licencias");
            while (rs.next()) {
                tipoLicencia = new Tipo_licencia();
                tipoLicencia.setId(rs.getInt("id"));
                tipoLicencia.setDescripcion(rs.getString("descripcion"));;
                lista.add(tipoLicencia);
            }

        } catch (Exception e) {
        }
        return lista;
    }
     public ArrayList<Licencia> listarLicencia(){
         ArrayList lista = new ArrayList();
         Licencia licencia;
         DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         
         
         try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM licencias join tipos_licencias on tipos_licencias_id = tipos_licencias.id order by licencias.numero");
            while (rs.next()) {
                licencia = new Licencia();
                licencia.setId_licencia(rs.getInt("id"));
                licencia.setNumero(rs.getInt("numero"));
                try {
                        licencia.setFecha_vencimiento(df.format(rs.getDate("fecha_vencimiento")));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                
                licencia.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                licencia.setDias_vuelo(rs.getInt("dias_vuelo"));
                licencia.setDescripcion(rs.getString("descripcion"));
                licencia.setId_piloto(rs.getInt("pilotos_id"));
                lista.add(licencia);
            }

        } catch (Exception e) {
             System.out.println(e);
        }
         
         return lista;
     }
     
      public ArrayList<Licencia> listarLicencia2(String rut){
         ArrayList lista = new ArrayList();
         Licencia licencia;
         DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         
         
         try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM licencias join tipos_licencias on tipos_licencias_id = tipos_licencias.id join pilotos on pilotos.id = licencias.pilotos_id join personas on personas.id = pilotos.personas_id where personas.rut = '"+rut+"'");
            while (rs.next()) {
                licencia = new Licencia();
                licencia.setId_licencia(rs.getInt("id"));
                licencia.setNumero(rs.getInt("numero"));
                try {
                        licencia.setFecha_vencimiento(df.format(rs.getDate("fecha_vencimiento")));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                
                licencia.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                licencia.setDias_vuelo(rs.getInt("dias_vuelo"));
                licencia.setDescripcion(rs.getString("descripcion"));
                licencia.setId_piloto(rs.getInt("pilotos_id"));
                lista.add(licencia);
            }

        } catch (Exception e) {
             System.out.println(e);
        }
         
         return lista;
     }
      
      public boolean buscarNumeroLicencia(int numero){
          boolean valido = false;
          
            try {
                Conexion dbconn = new Conexion();
                dbconn.conectar();
                ResultSet rs = dbconn.consultar("SELECT * FROM licencias where numero = "+numero);
                while (rs.next()) {
                    valido = true;
                }

            } catch (Exception e) {
            }
          
          return valido;
      }
      
      public ArrayList<Licencia> listarLicenciaID(int id){
         ArrayList lista = new ArrayList();
         Licencia licencia;
         DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         
         
         try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM licencias join tipos_licencias on tipos_licencias_id = tipos_licencias.id  where licencias.id = "+id+ " order by licencias.numero");
            while (rs.next()) {
                licencia = new Licencia();
                licencia.setId_licencia(rs.getInt("id"));
                licencia.setId(rs.getInt("tipos_licencias_id"));
                licencia.setNumero(rs.getInt("numero"));
                try {
                        licencia.setFecha_vencimiento(df.format(rs.getDate("fecha_vencimiento")));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                
                licencia.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                licencia.setDias_vuelo(rs.getInt("dias_vuelo"));
                licencia.setDescripcion(rs.getString("descripcion"));
                licencia.setId_piloto(rs.getInt("pilotos_id"));
                lista.add(licencia);
            }

        } catch (Exception e) {
             System.out.println(e);
        }
         
         return lista;
     } 
}
