package Modelo;

import java.util.Date;
import java.util.LinkedList;

public class Aeronave {

  

    private  String id;
    private String matricula;
private String tiponave;
   private String estado;

   private String fecha_aeronavegavilidad;

    private String fecha_ultima_inspeccion_anual;
    private String horas_vuelo;

   private String dias_vuelo;

    public Aeronave() {
    }

    
  public Aeronave(String id, String matricula, String tiponave, String estado, String fecha_aeronavegavilidad, String fecha_ultima_inspeccion_anual, String horas_vuelo, String dias_vuelo) {
        this.id = id;
        this.matricula = matricula;
        this.tiponave = tiponave;
        this.estado = estado;
        this.fecha_aeronavegavilidad = fecha_aeronavegavilidad;
        this.fecha_ultima_inspeccion_anual = fecha_ultima_inspeccion_anual;
        this.horas_vuelo = horas_vuelo;
        this.dias_vuelo = dias_vuelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTiponave() {
        return tiponave;
    }

    public void setTiponave(String tiponave) {
        this.tiponave = tiponave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_aeronavegavilidad() {
        return fecha_aeronavegavilidad;
    }

    public void setFecha_aeronavegavilidad(String fecha_aeronavegavilidad) {
        this.fecha_aeronavegavilidad = fecha_aeronavegavilidad;
    }

    public String getFecha_ultima_inspeccion_anual() {
        return fecha_ultima_inspeccion_anual;
    }

    public void setFecha_ultima_inspeccion_anual(String fecha_ultima_inspeccion_anual) {
        this.fecha_ultima_inspeccion_anual = fecha_ultima_inspeccion_anual;
    }

    public String getHoras_vuelo() {
        return horas_vuelo;
    }

    public void setHoras_vuelo(String horas_vuelo) {
        this.horas_vuelo = horas_vuelo;
    }

    public String getDias_vuelo() {
        return dias_vuelo;
    }

    public void setDias_vuelo(String dias_vuelo) {
        this.dias_vuelo = dias_vuelo;
    }
    
}
