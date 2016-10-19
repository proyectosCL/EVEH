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
import java.util.ArrayList;
import java.util.Date;
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
           int horas_vuelo = nlicencia.getHoras_vuelo();
           int id_piloto = nlicencia.getId_piloto();
           
           Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO licencias  VALUES ((select (max(id)+1)from licencias),"+numero+","+tipo_licencia+",'"+fecha_vencimiento+"',"+dias_vuelo+","+horas_vuelo+","+id_piloto+")";
            System.out.println(sql);
            conec.escribir(sql);
            
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
           
           Conexion conec = new Conexion();
            conec.conectar();
            String sql = "update licencias set numero= "+numero+","
                    + " tipo_licencia = "+tipo_licencia+","
                    + " fecha_vencimiento= "+fecha_vencimiento+","
                    + "dias_vuelo = "+dias_vuelo;
            conec.escribir(sql);
            
            
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
}
