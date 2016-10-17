package Modelo;

public class Tipo_licencia {

    private int id;

    private String descripcion;

    public Tipo_licencia(int id) {
        this.id = id;
    }

    public Tipo_licencia() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  
}
