package Modelo;

import java.util.Date;

public class Piloto extends Persona {

    private int id;

    private Float horas_vuelo;

    private int dias_vuelo;

    private Date vencimiento_medicina;

    private Date fecha_ultimo_vuelo;

    public Piloto() {
    }

    public Piloto(Float horas_vuelo, int dias_vuelo, Date vencimiento_medicina, Date fecha_ultimo_vuelo) {
        this.horas_vuelo = horas_vuelo;
        this.dias_vuelo = dias_vuelo;
        this.vencimiento_medicina = vencimiento_medicina;
        this.fecha_ultimo_vuelo = fecha_ultimo_vuelo;
    }

    public Piloto(Float horas_vuelo, int dias_vuelo, Date vencimiento_medicina, Date fecha_ultimo_vuelo, int id_persona, String rut, String nombre, String apellidos, char sexo, String fecha_nacimiento, String telefono, String correo, String nacionalidad, int id_usuario, String usuario, String pass, int id_tipo) {
        super(id_persona, rut, nombre, apellidos, sexo, fecha_nacimiento, telefono, correo, nacionalidad, id_usuario, usuario, pass, id_tipo);
        this.horas_vuelo = horas_vuelo;
        this.dias_vuelo = dias_vuelo;
        this.vencimiento_medicina = vencimiento_medicina;
        this.fecha_ultimo_vuelo = fecha_ultimo_vuelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getHoras_vuelo() {
        return horas_vuelo;
    }

    public void setHoras_vuelo(Float horas_vuelo) {
        this.horas_vuelo = horas_vuelo;
    }

    public int getDias_vuelo() {
        return dias_vuelo;
    }

    public void setDias_vuelo(int dias_vuelo) {
        this.dias_vuelo = dias_vuelo;
    }

    public Date getVencimiento_medicina() {
        return vencimiento_medicina;
    }

    public void setVencimiento_medicina(Date vencimiento_medicina) {
        this.vencimiento_medicina = vencimiento_medicina;
    }

    public Date getFecha_ultimo_vuelo() {
        return fecha_ultimo_vuelo;
    }

    public void setFecha_ultimo_vuelo(Date fecha_ultimo_vuelo) {
        this.fecha_ultimo_vuelo = fecha_ultimo_vuelo;
    }

}
