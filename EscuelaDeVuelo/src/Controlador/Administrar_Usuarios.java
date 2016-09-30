/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Database.Conexion;

/**
 *
 * @author Diego
 */
public class Administrar_Usuarios {
    
    private Usuario usuario;

    public Administrar_Usuarios(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    public boolean ingresarUsuario(Usuario nuevoUsuario) {
        try {
            int id = nuevoUsuario.getId();
            String nombreUsuario = nuevoUsuario.getUsuario();
            String pass = nuevoUsuario.getPass();
            String idtipo = nuevoUsuario.getId_tipo();
            Conexion con = new Conexion();
            String sql = "INSERT INTO usuarios  VALUES ("+id+",'"+nombreUsuario+"','"+pass+"','"+idtipo+"')";
            con.escribir(sql);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    public boolean buscarUsuario(Usuario buscadoUsuario) {
        int id = buscadoUsuario.getId();
        String nombreUsuario = buscadoUsuario.getUsuario();
        String pass = buscadoUsuario.getPass();
        String idtipo = buscadoUsuario.getId_tipo();
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
    
}
