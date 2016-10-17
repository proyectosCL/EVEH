package Modelo;

public class Aerodromo {

    private int id;

    private String descripcion;

    private String ciudad;

    public Aerodromo() {
    }

    public Aerodromo(int id, String descripcion, String ciudad) {
        this.id = id;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
