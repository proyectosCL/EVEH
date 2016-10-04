package Modelo;

import java.util.Date;
import java.util.LinkedList;

public class Aeronave {

    private static int id;

    public static int getId() {
        return id;
    }

    public static void setId(int aId) {
        id = aId;
    }

     private String matricula;

   private char estado;

   private Date fecha_aeronavegavilidad;

    private Date fecha_ultima_inspeccion_anual;
private Float horas_vuelo;

   private int dias_vuelo;

    public Aeronave() {
    }

    public Aeronave(String matricula, char estado, Date fecha_aeronavegavilidad, Date fecha_ultima_inspeccion_anual, Float horas_vuelo, int dias_vuelo) {
        this.matricula = matricula;
        this.estado = estado;
        this.fecha_aeronavegavilidad = fecha_aeronavegavilidad;
        this.fecha_ultima_inspeccion_anual = fecha_ultima_inspeccion_anual;
        this.horas_vuelo = horas_vuelo;
        this.dias_vuelo = dias_vuelo;
    }

    public int getDias_vuelo() {
        return dias_vuelo;
    }

    public void setDias_vuelo(int dias_vuelo) {
        this.dias_vuelo = dias_vuelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Date getFecha_aeronavegavilidad() {
        return fecha_aeronavegavilidad;
    }

    public void setFecha_aeronavegavilidad(Date fecha_aeronavegavilidad) {
        this.fecha_aeronavegavilidad = fecha_aeronavegavilidad;
    }

    public Date getFecha_ultima_inspeccion_anual() {
        return fecha_ultima_inspeccion_anual;
    }

    public void setFecha_ultima_inspeccion_anual(Date fecha_ultima_inspeccion_anual) {
        this.fecha_ultima_inspeccion_anual = fecha_ultima_inspeccion_anual;
    }

    public Float getHoras_vuelo() {
        return horas_vuelo;
    }

    public void setHoras_vuelo(Float horas_vuelo) {
        this.horas_vuelo = horas_vuelo;
    }
    
    


    
}
