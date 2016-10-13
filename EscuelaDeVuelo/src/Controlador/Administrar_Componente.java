package Controlador;
import Database.Conexion;
import Modelo.Componente;



public class Administrar_Componente implements administrar_horas_vuelo {

    public boolean ingresarComponente(Componente nuevoComponente) {
        
    //    String desc = nuevoComponente.getDescripcion();
      //  String fabricte = nuevoComponente.getFabricante();
        //Float horasVuelo = nuevoComponente.getHoras_vuelo();
        //int diasVuelo = nuevoComponente.getDias_vuelo();
        
        Conexion conec = new Conexion();
        conec.conectar();
       // String sql=
       //conec.escribir(sql);
            
            return true;
        //} catch (Exception e) {
        //    return false;
        //}
        
        
    }

    public void asociarAeronave() {
    }

    public void asociarSubcomponente() {
    }

    public void configurarComponente() {
    }

    @Override
    public void sumarHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
