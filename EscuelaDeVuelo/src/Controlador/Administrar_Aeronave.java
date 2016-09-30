package Controlador;
import Modelo.Aeronave;

import java.util.Date;
import java.util.LinkedList;

public class Administrar_Aeronave implements administrar_horas_vuelo {

    
        public void ingresarAeronave(int id, String matricula, char estado, Date fecha_aeronavegavilidad, Date fecha_ultima_inspeccion_anual, Float horas_vuelo, int dias_vuelo) {
        Aeronave.id = id;
        Aeronave.matricula = matricula;
        Aeronave.estado = estado;
        Aeronave.fecha_aeronavegavilidad = fecha_aeronavegavilidad;
        Aeronave.fecha_ultima_inspeccion_anual = fecha_ultima_inspeccion_anual;
        Aeronave.horas_vuelo = horas_vuelo;
        Aeronave.dias_vuelo = dias_vuelo;
        
    }
        
    

    public void configurarAeronave() {
    }

    public void asociarComponentes() {
    }

    public void alertarAeronave() {
    }

    @Override
    public void sumarHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
