package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona extends Usuario {

    private int id_persona;

    private String rut;

    private String nombre;

    private String apellidos;

    private char sexo;

    private String fecha_nacimiento;

    private String telefono;

    private String correo;

    private String nacionalidad;

    public Persona() {
    }

    public Persona(int id_persona, String rut, String nombre, String apellidos, char sexo, String fecha_nacimiento, String telefono, String correo, String nacionalidad) {
        this.id_persona = id_persona;
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
    }

    public Persona(int id_persona, String rut, String nombre, String apellidos, char sexo, String fecha_nacimiento, String telefono, String correo, String nacionalidad, int id_usuario, String usuario, String pass, int id_tipo, String estado_usuario) {
        super(id_usuario, usuario, pass, id_tipo, estado_usuario);
        this.id_persona = id_persona;
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
    }

    

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    

    
    
}
