/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Database.Conexion;
import Modelo.Licencia;
import java.awt.HeadlessException;
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
           int tipo_licencia = nlicencia.getId_licencia();
           Date fecha_vencimiento = nlicencia.getFecha_vencimiento();
           int dias_vuelo = nlicencia.getDias_vuelo();
           
           Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO licencias  VALUES ((select (max(id)+1)from licencias),"+numero+","+tipo_licencia+",'"+fecha_vencimiento+"',"+dias_vuelo+")";
            conec.escribir(sql);
            
        }catch(Exception ex){
            
        }
    }
    
    public void modeificarLicencia(Licencia nlicencia){
        try{
         int numero =  nlicencia.getNumero();
           int tipo_licencia = nlicencia.getId_licencia();
           Date fecha_vencimiento = nlicencia.getFecha_vencimiento();
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
}
