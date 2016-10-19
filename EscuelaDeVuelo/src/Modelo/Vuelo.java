package Modelo;

import java.util.Date;

public class Vuelo {

    private int id;

    private int id_aerodromo_origen;

    private String aerodromo_origen;

    private int id_aerodromo_destino;

    private String aerodromo_destino;

    private Float horas_vuelo;

    private char condicion_vuelo;

    private String mision_vuelo;

    private Date fecha_vuelo;

    private int id_aeronave;

    private String aeronave;

    public Vuelo() {
    }

    public Vuelo(int id, int id_aerodromo_origen, String aerodromo_origen, int id_aerodromo_destino, String aerodromo_destino, Float horas_vuelo, char condicion_vuelo, String mision_vuelo, Date fecha_vuelo, int id_aeronave, String aeronave) {
        this.id = id;
        this.id_aerodromo_origen = id_aerodromo_origen;
        this.aerodromo_origen = aerodromo_origen;
        this.id_aerodromo_destino = id_aerodromo_destino;
        this.aerodromo_destino = aerodromo_destino;
        this.horas_vuelo = horas_vuelo;
        this.condicion_vuelo = condicion_vuelo;
        this.mision_vuelo = mision_vuelo;
        this.fecha_vuelo = fecha_vuelo;
        this.id_aeronave = id_aeronave;
        this.aeronave = aeronave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_aerodromo_origen() {
        return id_aerodromo_origen;
    }

    public void setId_aerodromo_origen(int id_aerodromo_origen) {
        this.id_aerodromo_origen = id_aerodromo_origen;
    }

    public String getAerodromo_origen() {
        return aerodromo_origen;
    }

    public void setAerodromo_origen(String aerodromo_origen) {
        this.aerodromo_origen = aerodromo_origen;
    }

    public int getId_aerodromo_destino() {
        return id_aerodromo_destino;
    }

    public void setId_aerodromo_destino(int id_aerodromo_destino) {
        this.id_aerodromo_destino = id_aerodromo_destino;
    }

    public String getAerodromo_destino() {
        return aerodromo_destino;
    }

    public void setAerodromo_destino(String aerodromo_destino) {
        this.aerodromo_destino = aerodromo_destino;
    }

    public Float getHoras_vuelo() {
        return horas_vuelo;
    }

    public void setHoras_vuelo(Float horas_vuelo) {
        this.horas_vuelo = horas_vuelo;
    }

    public char getCondicion_vuelo() {
        return condicion_vuelo;
    }

    public void setCondicion_vuelo(char condicion_vuelo) {
        this.condicion_vuelo = condicion_vuelo;
    }

    public String getMision_vuelo() {
        return mision_vuelo;
    }

    public void setMision_vuelo(String mision_vuelo) {
        this.mision_vuelo = mision_vuelo;
    }

    public Date getFecha_vuelo() {
        return fecha_vuelo;
    }

    public void setFecha_vuelo(Date fecha_vuelo) {
        this.fecha_vuelo = fecha_vuelo;
    }

    public int getId_aeronave() {
        return id_aeronave;
    }

    public void setId_aeronave(int id_aeronave) {
        this.id_aeronave = id_aeronave;
    }

    public String getAeronave() {
        return aeronave;
    }

    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }

}
