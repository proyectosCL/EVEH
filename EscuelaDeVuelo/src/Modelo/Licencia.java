package Modelo;

import java.util.Date;

public class Licencia {

    private int id;

    private int numero;

    private int dias_vuelo;

    private Date fecha_vencimiento;

    public Licencia(int id, int numero, int dias_vuelo, Date fecha_vencimiento) {
        this.id = id;
        this.numero = numero;
        this.dias_vuelo = dias_vuelo;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDias_vuelo() {
        return dias_vuelo;
    }

    public void setDias_vuelo(int dias_vuelo) {
        this.dias_vuelo = dias_vuelo;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    
    
}
