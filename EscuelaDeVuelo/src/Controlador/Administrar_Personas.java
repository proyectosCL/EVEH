package Controlador;
import Modelo.*;
import Database.Conexion;
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
                String sql = "INSERT INTO personas VALUES ((select (max(id)+1) from personas),'"+rut+"','"+nombre+"','"+apellidos+"','"+sexo+"','"+fecha_nacimiento+"','"+telefono+"','"+correo+"','"+nacionalidad+"',32)";
                JOptionPane.showMessageDialog(null, "intentando insertar: "+sql);
                System.out.println(sql);
                con.escribir(sql);
                return true;
           
            
            //Administrar_Usuarios adm = new Administrar_Usuarios(usuario);
            
            
//            if (adm.ingresarUsuario(usuario)) {
//                Conexion con = new Conexion();
//                String sql = "INSERT INTO personas VALUES ((select (max(id)+1)from personas),'"+rut+"','"+nombre+"','"+apellidos+"','"+sexo+"','"+fecha_nacimiento+"','"+telefono+"','"+correo+"','"+nacionalidad+"',"+usuario.getId_usuario()+")";
//                JOptionPane.showMessageDialog(null, "intentando insertar: "+sql);
//                con.escribir(sql);
//                return true;
//            }else{return false;}
            
            
            
        } catch (Exception e) {
            return false;
        }
        
        
    }

    public void asignarRol() {
    }

    public void modificarPersona() {
    }

    public void darDeAlta() {
    }

    public void darDeBaja() {
    }

    public void eliminarPersona() {
    }
}
