package Controlador;
import Database.Conexion;
import Modelo.Aeronave;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Administrar_Aeronave implements administrar_horas_vuelo {

    
         public boolean ingresarAeronave(Aeronave nuevoAeronave) {
        try {
            //int id = nuevoUsuario.getId_usuario();
            String nombreMatricula = nuevoAeronave.getMatricula();
            String tiponave = nuevoAeronave.getTiponave();
            String estado = nuevoAeronave.getEstado();
           String fecha_aero = nuevoAeronave.getFecha_aeronavegavilidad();
           String fecha_insp = nuevoAeronave.getFecha_ultima_inspeccion_anual();
           String horasvuelo =nuevoAeronave.getHoras_vuelo();
           String diasvuelo = nuevoAeronave.getDias_vuelo();
           
           Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO aeronaves  VALUES ((select (max(id)+1)from aeronaves),'"+nombreMatricula+"','"+tiponave+"','"+estado+"','"+fecha_aero+"','"+fecha_insp+"','"+horasvuelo+"','"+diasvuelo+"')";
            
            
           
            
            conec.escribir(sql);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
         }
        
    

      public boolean buscarAeronave(String matricula) {
     
        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM aeronaves where matricula like '"+matricula+"'");
            ResultSet rs = myStatement.executeQuery();
            int fila = 0;
            while(rs.next()){
                fila = 1;
            }
        
            if (fila==1) {
                return true;
            } else {
                return false;
            }
                
            
            
        } catch (Exception e) {
            return false;
        }
         
        
    }

    public void asociarComponentes() {
    }

    public void alertarAeronave() {
    }
    
       public Aeronave cargarAeronave(String matricula) {
      
         Aeronave aeronavesita = new Aeronave();
        
        
        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM aeronaves where matricula like '"+matricula+"'");
            ResultSet rs = myStatement.executeQuery();
            int fila = 0;
            while(rs.next()){
                fila = +1;
                aeronavesita.setId(rs.getString(1));
                aeronavesita.setMatricula(rs.getString(2));
                aeronavesita.setTiponave(rs.getString(3));
                aeronavesita.setEstado(rs.getString(4));
               aeronavesita.setFecha_aeronavegavilidad(rs.getString(5));
                aeronavesita.setFecha_ultima_inspeccion_anual(rs.getString(6));
              aeronavesita.setHoras_vuelo(rs.getString(7));
              aeronavesita.setDias_vuelo(rs.getString(8));
               
            }
            if (fila==0) {
                return null;
            } else {
                return aeronavesita;
            }
            
        
           
                
            
            
        } catch (Exception e) {
            return null;
        }
         
        
    }
    
 public boolean modificarAeronave(Aeronave nuevoAeronave) {
        try {
            String id= nuevoAeronave.getId();
            
            String tiponave = nuevoAeronave.getTiponave();
            String estado = nuevoAeronave.getEstado();
           String fecha_aero = nuevoAeronave.getFecha_aeronavegavilidad();
           String fecha_insp = nuevoAeronave.getFecha_ultima_inspeccion_anual();
           String horasvuelo =nuevoAeronave.getHoras_vuelo();
           String diasvuelo = nuevoAeronave.getDias_vuelo();
           
            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "update aeronaves set tipo_aeronaves_id = "+tiponave+"', estado = "+estado+"', fecha_aeronavegabilidad = "+fecha_aero+"', fecha_inspeccion_anual = "+fecha_insp+"', horas_vuelo = "+horasvuelo+"', dias_vuelo = "+diasvuelo+" where id = "+id;
            
            
           
            
            conec.escribir(sql);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

    @Override
    public void sumarHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
