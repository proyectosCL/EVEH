package Controlador;

import Modelo.*;
import Database.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Administrar_Personas {

    private Persona persona;

    public boolean ingresarPersona(Persona npersona) {
        try {

            String rut = npersona.getRut();
            String nombre = npersona.getNombre();
            String apellidos = npersona.getApellidos();
            char sexo = npersona.getSexo();
            String fecha_nacimiento = npersona.getFecha_nacimiento();
            String telefono = npersona.getTelefono();
            String correo = npersona.getCorreo();
            String nacionalidad = npersona.getNacionalidad();

            Conexion con = new Conexion();
            con.conectar();
            //cambiar el 32 por el id del user
            String sql = "INSERT INTO personas VALUES ((select (max(id)+1) from personas),'" + rut + "','" + nombre + "','" + apellidos + "','" + sexo + "','" + fecha_nacimiento + "','" + telefono + "','" + correo + "','" + nacionalidad + "', (select max(id) from usuarios))";
            //JOptionPane.showMessageDialog(null, "intentando insertar: "+sql);
            //System.out.println(sql);
            con.escribir(sql);
            //JOptionPane.showMessageDialog(null, "Insertado correctamente");
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public boolean buscarPersona(String rut) {
//        int id = buscadoUsuario.getId_usuario();
//        String nombreUsuario = buscadoUsuario.getUsuario();
//        String pass = buscadoUsuario.getPass();
//        int idtipo = buscadoUsuario.getId_tipo();

        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM personas where rut like '" + rut + "'");
            ResultSet rs = myStatement.executeQuery();
            int fila = 0;
            while (rs.next()) {
                fila = 1;
            }

            if (fila == 1) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("error:" + e);
            return false;
        }

    }

    public Persona cargarPersona(String rut) {

        Persona persona = new Persona();

        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM personas where rut like '" + rut + "'");
            ResultSet rs = myStatement.executeQuery();
            int fila = 0;
            while (rs.next()) {
                fila = +1;
                persona.setId_persona(rs.getInt(1));
                persona.setRut(rs.getString(2));
                persona.setNombre(rs.getString(3));
                persona.setApellidos(rs.getString(4));
                persona.setSexo(rs.getString(5).charAt(0));
                persona.setFecha_nacimiento(rs.getString(6));
                persona.setTelefono(rs.getString(7));
                persona.setCorreo(rs.getString(8));
                persona.setNacionalidad(rs.getString(9));
                persona.setId_usuario(rs.getInt(10));
            }
            if (fila == 0) {
                return null;
            } else {
                return persona;
            }

        } catch (Exception e) {
            return null;
        }

    }

    public void asignarRol() {
    }

    public boolean modificarPersona(Persona persona) {
        try {
            String rut = persona.getRut();
            String nombre = persona.getNombre();
            String apellidos = persona.getApellidos();
            String nacionalidad = persona.getNacionalidad();
            String fechanac = persona.getFecha_nacimiento();
            String telefono = persona.getTelefono();
            String correo = persona.getCorreo();
            char sexo = persona.getSexo();
            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "update personas set nombre = '" + nombre + "', apellidos = '" + apellidos + "', sexo = '" + sexo + "', fecha_nacimiento = '" + fechanac + "', telefono = '" + telefono + "', correo = '" + correo + "', nacionalidad = '" + nacionalidad + "' where rut = '" + rut + "'";
            System.out.println(sql);
            conec.escribir(sql);

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void darDeAlta() {
    }

    public void darDeBaja() {
    }

    public boolean eliminarPersona(String rut) {
        try {
            Conexion con = new Conexion();
            con.conectar();
            //cambiar el 32 por el id del user
            String sql = "delete from Personas where rut = '" + rut + "'";
            //JOptionPane.showMessageDialog(null, "intentando insertar: "+sql);
            System.out.println(sql);
            con.escribir(sql);
            //JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            return true;

        } catch (HeadlessException e) {
            return false;
        }

    }

    public int buscaridpersona(String rut) {

        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM personas where rut like '" + rut + "'");
            ResultSet rs = myStatement.executeQuery();
            while (rs.next()) {
                persona = new Persona();
                persona.setId_persona(rs.getInt(1));
            }

        } catch (Exception e) {
        }
        return persona.getId_persona();
    }

    public ArrayList<Persona> listarPersonas() {
        ArrayList listaPersonas = new ArrayList();
        Persona persona;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM personas INNER JOIN usuarios ON personas.usuarios_id = usuarios.id order by personas.usuarios_id");
            while (rs.next()) {
                persona = new Persona();
                persona.setId_persona(rs.getInt("id"));
                persona.setRut(rs.getString("rut"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellidos(rs.getString("apellidos"));
                persona.setSexo(rs.getString("sexo").charAt(0));
                persona.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setCorreo(rs.getString("correo"));
                persona.setNacionalidad(rs.getString("nacionalidad"));
                persona.setId_usuario(rs.getInt("usuarios_id"));
                persona.setUsuario(rs.getString("cuenta"));
                persona.setPass(rs.getString("pass"));
                persona.setId_tipo(rs.getInt("perfiles_usuarios_id"));
                persona.setEstado_usuario(rs.getString("estado_cuenta"));

                listaPersonas.add(persona);
            }

        } catch (Exception e) {

        }
        return listaPersonas;
    }

    public ArrayList<Persona> alertaLicencias() {
        ArrayList listaPersonas = new ArrayList();
        Persona persona;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("select * from PERSONAS inner join pilotos on personas.ID = pilotos.PERSONAS_ID where pilotos.ID IN (select PILOTOS_ID from LICENCIAS where (trunc(to_date(FECHA_VENCIMIENTO,'DD/MM/YYYY'))- trunc(to_date(SYSDATE,'DD/MM/YYYY'))) <10)");
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) {
                persona = new Persona();
                persona.setId_persona(rs.getInt("id"));
                persona.setRut(rs.getString("rut"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellidos(rs.getString("apellidos"));
                persona.setSexo(rs.getString("sexo").charAt(0));
                persona.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setCorreo(rs.getString("correo"));
                persona.setNacionalidad(rs.getString("nacionalidad"));
                persona.setId_usuario(rs.getInt("usuarios_id"));

                listaPersonas.add(persona);
            }

        } catch (Exception e) {

        }
        return listaPersonas;

    }

    
}
