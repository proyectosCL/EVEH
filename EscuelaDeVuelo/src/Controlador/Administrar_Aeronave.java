package Controlador;
import Database.Conexion;
import Modelo.Aeronave;


import java.util.Date;

public class Administrar_Aeronave implements administrar_horas_vuelo {

    
         public boolean ingresarAeronave(Aeronave nuevoAeronave) {
        try {
            //int id = nuevoUsuario.getId_usuario();
            String nombreMatricula = nuevoAeronave.getMatricula();
            char estado = nuevoAeronave.getEstado();
           Date fecha_aero = nuevoAeronave.getFecha_aeronavegavilidad();
           Date fecha_insp = nuevoAeronave.getFecha_ultima_inspeccion_anual();
           Float horasvuelo =nuevoAeronave.getHoras_vuelo();
           int diasvuelo = nuevoAeronave.getDias_vuelo();
           
           Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO aeronaves  VALUES ((select (max(id)+1)from aeronaves),'"+nombreMatricula+"','"+estado+"','"+fecha_aero+"','"+fecha_insp+"','"+horasvuelo+"','"+diasvuelo+"')";
            
            
           
            
            conec.escribir(sql);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
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
