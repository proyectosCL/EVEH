package Modelo;

public class Componente {

    private int id;

    private String descripcion;

    private String fabricante;

    private Float horas_vuelo;

    private int dias_vuelo;
    
    private int tipo_componente_id;
            
    private int componente_id;
            
    private int aeronave_id;

    public Componente() {
    }

    public Componente(int id, String descripcion, String fabricante, Float horas_vuelo, int dias_vuelo) {
        this.id = id;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.horas_vuelo = horas_vuelo;
        this.dias_vuelo = dias_vuelo;
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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

    public int getTipo_componente_id() {
        return tipo_componente_id;
    }

    public void setTipo_componente_id(int tipo_componente_id) {
        this.tipo_componente_id = tipo_componente_id;
    }

    public int getComponente_id() {
        return componente_id;
    }

    public void setComponente_id(int componente_id) {
        this.componente_id = componente_id;
    }

    public int getAeronave_id() {
        return aeronave_id;
    }

    public void setAeronave_id(int aeronave_id) {
        this.aeronave_id = aeronave_id;
    }
    
    
}
