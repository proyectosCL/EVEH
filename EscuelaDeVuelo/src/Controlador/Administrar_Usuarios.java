/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Database.Conexion;
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
    public boolean buscarUsuario(Usuario buscadoUsuario) {
        int id = buscadoUsuario.getId_usuario();
        String nombreUsuario = buscadoUsuario.getUsuario();
        String pass = buscadoUsuario.getPass();
        int idtipo = buscadoUsuario.getId_tipo();
        Conexion con = new Conexion();
         
        return false;
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
//        public static void main(String[] args) {
//        Conexion con = new Conexion();
//        con.conectar();
//        con.escribir("insert into usuarios values((select (max(id)+1)from usuarios),'jorddfgfdgperez 23','contraa',1)");
//    }
    
}
