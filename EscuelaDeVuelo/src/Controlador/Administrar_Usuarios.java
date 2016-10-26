/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Database.Conexion;
import Modelo.Persona;
import java.awt.HeadlessException;
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
            String estado_cuenta = nuevoUsuario.getEstado_usuario();
            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO usuarios  VALUES ((select (max(id)+1)from usuarios),'"+nombreUsuario+"','"+pass+"','"+idtipo+"','"+estado_cuenta+"')";
            
            
           
            
            conec.escribir(sql);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public Usuario cargarPUsuario(int id) {
      
        Usuario usuario = new Usuario();
        
        
        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM usuarios where id = "+id);
            ResultSet rs = myStatement.executeQuery();
            int fila = 0;
            while(rs.next()){
                fila = +1;
                usuario.setId_usuario(rs.getInt(1));
                usuario.setUsuario(rs.getString(2));
                usuario.setPass(rs.getString(3));
                usuario.setId_tipo(rs.getInt(4));
                usuario.setEstado_usuario(rs.getString(5));
               
            }
            if (fila==0) {
                return null;
            } else {
                return usuario;
            }
            
        
           
                
            
            
        } catch (Exception e) {
            return null;
        }
         
        
    }
    
    
    public boolean buscarUsuario(String cuenta) {
     
        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM usuarios where cuenta like '"+cuenta+"'");
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
    public Usuario autenticarUsuario(String usuario,String pass) {
        Usuario nusuario = new Usuario();
        
        try{
            Conexion conec = new Conexion();
            conec.conectar();
             Connection myconnection = conec.getConexion();
              ResultSet rs = conec.consultar("select * from usuarios where cuenta like '"+usuario+"' and pass like '"+pass+"'");
            while (rs.next()) {
                nusuario.setEstado_usuario(rs.getString("estado_cuenta"));
                nusuario.setId_tipo(rs.getInt("perfiles_usuarios_id"));
                nusuario.setPass(rs.getString("pass"));
                nusuario.setUsuario(rs.getString("cuenta"));
            }
       
        }catch(Exception e){
            System.out.println(e);
        }
        
        return nusuario;
    }



    public boolean modificarUsuario(Usuario nuevoUsuario) {
        try {
            int id = nuevoUsuario.getId_usuario();
            String nombreUsuario = nuevoUsuario.getUsuario();
            String pass = nuevoUsuario.getPass();
            int idtipo = nuevoUsuario.getId_tipo();
            String estado_cuenta = nuevoUsuario.getEstado_usuario();
            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "update usuarios set pass = '"+pass+"', perfiles_usuarios_id = "+idtipo+", estado_cuenta = '"+estado_cuenta+"' where id = "+id;
            
            
           
            
            conec.escribir(sql);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

   

    public boolean eliminarUsuario(String cuenta) {
        try {
            Conexion con = new Conexion();
            con.conectar();
            //cambiar el 32 por el id del user
            String sql = "delete from usuarios where cuenta = '"+cuenta+"'";
            //JOptionPane.showMessageDialog(null, "intentando insertar: "+sql);
            System.out.println(sql);
            con.escribir(sql);
            //JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            return true;
            
        } catch (HeadlessException e) {
            return false;
        }
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
    
    
    
}
