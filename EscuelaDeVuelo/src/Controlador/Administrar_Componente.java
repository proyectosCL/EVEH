package Controlador;

import Database.Conexion;
import Modelo.Componente;

public class Administrar_Componente implements administrar_horas_vuelo {

    public boolean ingresarComponente(Componente nuevoComponente) {
        try {
            String desc = nuevoComponente.getDescripcion();
            String fabricte = nuevoComponente.getFabricante();
            Float horasVuelo = nuevoComponente.getHoras_vuelo();
            int diasVuelo = nuevoComponente.getDias_vuelo();
            int tpoCompteId = nuevoComponente.getTipo_componente_id();
            int compteId = nuevoComponente.getComponente_id();
            int naveId = nuevoComponente.getAeronave_id();

            Conexion conec = new Conexion();
            conec.conectar();
            String sql= "INSERT INTO componentes  VALUES ((select (max(id)+1)from componentes),"
                    + "'" + desc + "','" + fabricte + "','" + horasVuelo + "','" + diasVuelo + "',"
                    + "'" + tpoCompteId + "','" + compteId + "','" + naveId + "')";
            conec.escribir(sql);

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void asociarAeronave() {
    }

    public void asociarSubcomponente() {
    }

   

    @Override
    public void sumarHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
