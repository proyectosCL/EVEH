package Controlador;

import Database.Conexion;
import Modelo.Componente;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Administrar_Componente implements administrar_horas_vuelo {

    public boolean ingresarNuevoComponente(Componente nuevoComponente) {
        try {
            String desc = nuevoComponente.getDescripcion();
            String fabricte = nuevoComponente.getFabricante();
            Float horasVuelo = nuevoComponente.getHoras_vuelo();
            int diasVuelo = nuevoComponente.getDias_vuelo();
            int tpoCompteId = nuevoComponente.getTipo_componente_id();

            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO componentes  VALUES ((select (max(id)+1)from componentes),'" + desc + "','" + fabricte + "'," + horasVuelo + "," + diasVuelo + "," + tpoCompteId + ", null,  null )";
            conec.escribir(sql);

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public ArrayList<Componente> listarFiltro(int tipoCompte) {

        ArrayList listaFiltro = new ArrayList();
        Componente filtro;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("SELECT * FROM componentes WHERE tipos_componentes_id = " + tipoCompte + " AND aeronaves_ID IS null ");
            while (rs.next()) {
                filtro = new Componente();
                filtro.setId(rs.getInt("id"));
                filtro.setDescripcion(rs.getString(2));
                filtro.setFabricante(rs.getString(3));
                filtro.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                filtro.setDias_vuelo(rs.getInt("dias_vuelo"));
                filtro.setTipo_componente_id(rs.getInt("tipos_componentes_id"));
                filtro.setComponente_id(rs.getInt("componentes_id"));
                filtro.setAeronave_id(rs.getInt("aeronaves_id"));
                listaFiltro.add(filtro);
            }

        } catch (Exception e) {

        }
        return listaFiltro;

    }

    public ArrayList<Componente> listarComponente() {

        ArrayList listaComponentes = new ArrayList();
        Componente lista;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("select * from COMPONENTES ");
            while (rs.next()) {
                lista = new Componente();
                lista.setId(rs.getInt("id"));
                lista.setDescripcion(rs.getString(2));
                lista.setFabricante(rs.getString(3));
                lista.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                lista.setDias_vuelo(rs.getInt("dias_vuelo"));
                lista.setTipo_componente_id(rs.getInt("tipos_componentes_id"));
                lista.setComponente_id(rs.getInt("componentes_id"));
                lista.setAeronave_id(rs.getInt("aeronaves_id"));
                listaComponentes.add(lista);
            }

        } catch (Exception e) {

        }
        return listaComponentes;

    }

    public String definirTipoCompte(int id_tipo) {

        String tipoCompte = "";

        switch (id_tipo) {
            case 1:
                tipoCompte = "Fuselaje";
                break;
            case 2:
                tipoCompte = "Alas";
                break;
            case 3:
                tipoCompte = "Empenaje";
                break;
            case 4:
                tipoCompte = "Controles y Frenos aerodinamicos";
                break;
            case 5:
                tipoCompte = "Tren de Aterrizaje";
                break;
            case 6:
                tipoCompte = "Equipos";
                break;
            case 7:
                tipoCompte = "Motor";
                break;
            case 8:
                tipoCompte = "Cabina";
                break;
        }

        return tipoCompte;

    }

    public void eliminarComponente(int id) {
        try {
            Conexion con = new Conexion();
            con.conectar();

            String sql = "delete from COMPONENTES where id = '" + id + "'";
            System.out.println(sql);
            con.escribir(sql);
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");

        } catch (HeadlessException e) {

        }
    }

    public void modificarComponente(Componente nuevoComponente) {
        try {
            int id = nuevoComponente.getId();
            String desc = nuevoComponente.getDescripcion();
            String fabricte = nuevoComponente.getFabricante();
            Float horasVuelo = nuevoComponente.getHoras_vuelo();
            int diasVuelo = nuevoComponente.getDias_vuelo();
            int tpoCompteId = nuevoComponente.getTipo_componente_id();

            Conexion conec = new Conexion();
            conec.conectar();
            String sql = " update COMPONENTES set DESCRIPCION= '" + desc + "',"
                    + " FABRICANTE = '" + fabricte + "',"
                    + "HORAS_VUELO = " + horasVuelo + ","
                    + "DIAS_VUELO =  " + diasVuelo + ","
                    + "TIPOS_COMPONENTES_ID = " + tpoCompteId + " where ID=" + id + "";
            conec.escribir(sql);
            System.out.println(sql);

        } catch (Exception ex) {

        }
    }

    public void asociarAeronave(int idCompte, String matriculaNave) {

        try {

            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "update componentes set aeronaves_id = (select AERONAVES.ID from AERONAVES where AERONAVES.MATRICULA='" + matriculaNave + "' ) where ID=" + idCompte + "";
            conec.escribir(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "actualizacion de id componente fallida");
        }

    }

    public boolean asociarSubcomponente(Componente nuevoComponente) {
        try {
            String desc = nuevoComponente.getDescripcion();
            String fabricte = nuevoComponente.getFabricante();
            Float horasVuelo = nuevoComponente.getHoras_vuelo();
            int diasVuelo = nuevoComponente.getDias_vuelo();
            int tpoCompteId = nuevoComponente.getTipo_componente_id();
            int compteId = nuevoComponente.getComponente_id();

            Conexion conec = new Conexion();
            conec.conectar();
            String sql = "INSERT INTO componentes  VALUES ((select (max(id)+1)from componentes),'" + desc + "','" + fabricte + "'," + horasVuelo + "," + diasVuelo + "," + tpoCompteId + "," + compteId + ",  null )";
            conec.escribir(sql);

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public int buscarIdSubComponente() {

        int idCompte = 0;

        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("select MAX(ID) as ID from COMPONENTES where COMPONENTES_ID is null");
            while (rs.next()) {
                idCompte = rs.getInt("id");
            }

        } catch (Exception e) {

        }
        JOptionPane.showMessageDialog(null, idCompte);
        return idCompte;

    }

    public ArrayList<Componente> listarCompteLibre() {

        ArrayList listaFiltro = new ArrayList();
        Componente filtro;
        try {
            Conexion dbconn = new Conexion();
            dbconn.conectar();
            ResultSet rs = dbconn.consultar("select * from COMPONENTES where COMPONENTES_ID is null");
            while (rs.next()) {
                filtro = new Componente();
                filtro.setId(rs.getInt("id"));
                filtro.setDescripcion(rs.getString(2));
                filtro.setFabricante(rs.getString(3));
                filtro.setHoras_vuelo(rs.getFloat("horas_vuelo"));
                filtro.setDias_vuelo(rs.getInt("dias_vuelo"));
                filtro.setTipo_componente_id(rs.getInt("tipos_componentes_id"));
                filtro.setComponente_id(rs.getInt("componentes_id"));
                filtro.setAeronave_id(rs.getInt("aeronaves_id"));
                listaFiltro.add(filtro);
            }

        } catch (Exception e) {

        }
        return listaFiltro;

    }

    @Override
    public void sumarHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
