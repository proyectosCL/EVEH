package Modelo;

import java.util.Date;
import java.util.LinkedList;

public class Aeronave {

    private int id;

    private String matricula;

    private char estado;

    private Date fecha_aeronavegavilidad;

    private Date fecha_ultima_inspeccion_anual;

    private Float horas_vuelo;

    private int dias_vuelo;
    
    private LinkedList componentes;

    public Aeronave() {
    }
}
