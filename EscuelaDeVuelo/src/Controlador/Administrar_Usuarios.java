/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Database.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Administrar_Usuarios {
    
    private Usuario usuario;

    public Administrar_Usuarios() {
        
    }
    
    
    public boolean ingresarUsuario(Usuario nuevoUsuario) {
        try {
            //int id = nuevoUsuario.getId_usuario();
            String nombreUsuario = nuevoUsuario.getUsuario();
            String pass = nuevoUsuario.getPass();
            int idtipo = nuevoUsuario.getId_tipo();
            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO usuarios  VALUES ((select (max(id)+1)from usuarios),'"+nombreUsuario+"','"+pass+"','"+idtipo+"')";
            
            
           
            
            conec.escribir(sql);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    public static boolean buscarUsuario(int id) {
//        int id = buscadoUsuario.getId_usuario();
//        String nombreUsuario = buscadoUsuario.getUsuario();
//        String pass = buscadoUsuario.getPass();
//        int idtipo = buscadoUsuario.getId_tipo();
       
        
        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM usuarios where id = "+id);
            ResultSet rs = myStatement.executeQuery();
            int fila = 0;
            while(rs.next()){
                fila = 1;
            }
        
            if (fila==1) {
                return true;
            } else {
                return false;
            }
                
            
            
        } catch (Exception e) {
            return false;
        }
         
        
    }
    public boolean autenticarUsuario() {
        return false;
    }

    public boolean modificarUsuario() {
        return false;
    }

   

    public boolean eliminarUsuario() {
        return false;
    }

    public boolean darDeBaja() {
        return false;
    }
    
    public boolean darDeAlta() {
        return false;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public static void main(String[] args) {
        System.out.println(buscarUsuario(99999));
    }
    
    
}
