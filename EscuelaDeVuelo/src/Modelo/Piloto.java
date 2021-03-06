package Modelo;

public class Piloto extends Persona {

    private int id;

    private Float horas_vuelo;

    private int dias_vuelo;

    private String vencimiento_medicina;

    private String fecha_ultimo_vuelo;

    private int id_persona;

    private String tipo;

    public Piloto() {
    }

    public Piloto(int id, Float horas_vuelo, int dias_vuelo, String vencimiento_medicina, String fecha_ultimo_vuelo, int id_persona) {
        this.id = id;
        this.horas_vuelo = horas_vuelo;
        this.dias_vuelo = dias_vuelo;
        this.vencimiento_medicina = vencimiento_medicina;
        this.fecha_ultimo_vuelo = fecha_ultimo_vuelo;
        this.id_persona = id_persona;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getVencimiento_medicina() {
        return vencimiento_medicina;
    }

    public void setVencimiento_medicina(String vencimiento_medicina) {
        this.vencimiento_medicina = vencimiento_medicina;
    }

    public String getFecha_ultimo_vuelo() {
        return fecha_ultimo_vuelo;
    }

    public void setFecha_ultimo_vuelo(String fecha_ultimo_vuelo) {
        this.fecha_ultimo_vuelo = fecha_ultimo_vuelo;
    }

}
