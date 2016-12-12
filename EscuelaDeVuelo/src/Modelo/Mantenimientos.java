package Modelo;

import java.util.Date;

public class Mantenimientos {

    private int id;
    private String fecha_inicio;
    private String fecha_termino;
    
    public Mantenimientos() {
        
    }

    public Mantenimientos(int id, String fecha_inicio, String fecha_termino) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
    }

    public String getFecha_termino() {
        return fecha_termino;
    }

    public void setFecha_termino(String fecha_termino) {
        this.fecha_termino = fecha_termino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    
}
