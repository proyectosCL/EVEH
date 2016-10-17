package Modelo;

import java.util.Date;

public class Licencia extends Tipo_licencia{

    private int id_licencia;

    private int numero;

    private int dias_vuelo;

    private Date fecha_vencimiento;

    public Licencia(int id_licencia, int numero, int dias_vuelo, Date fecha_vencimiento, int id) {
        super(id);
        this.id_licencia = id;
        this.numero = numero;
        this.dias_vuelo = dias_vuelo;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getId_licencia() {
        return id_licencia;
    }

    public void setId_licencia(int id_licencia) {
        this.id_licencia = id_licencia;
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
