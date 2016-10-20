package Modelo;





public class Licencia extends Tipo_licencia{

    private int id_licencia;

    private int numero;

    private int dias_vuelo;
    
    private float horas_vuelo;

    private String fecha_vencimiento;
    
    private int id_piloto;

    public Licencia(int id_licencia, int numero, int dias_vuelo,float horas_vuelo,String fecha_vencimiento, int id,int id_piloto) {
        super(id);
        this.id_licencia = id_licencia;
        this.numero = numero;
        this.dias_vuelo = dias_vuelo;
        this.horas_vuelo = horas_vuelo;
        this.fecha_vencimiento = fecha_vencimiento;
        this.id_piloto = id_piloto;
    }

    public Licencia() {
    }
    
    

    public int getId_piloto() {
        return id_piloto;
    }

    public void setId_piloto(int id_piloto) {
        this.id_piloto = id_piloto;
    }

    
    public float getHoras_vuelo() {
        return horas_vuelo;
    }

    public void setHoras_vuelo(float horas_vuelo) {
        this.horas_vuelo = horas_vuelo;
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

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    
    
}
