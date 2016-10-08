/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Conexion {
    Connection conexion;
    
    public Connection getConexion() { 
        
        return conexion; 
    }    
    public void setConexion(Connection conexion) { 
        this.conexion = conexion; 
    }  



public Conexion conectar() { 
    try { 
        
        Class.forName("oracle.jdbc.OracleDriver"); 
        String BaseDeDatos = "jdbc:oracle:thin:@escuelavuelo.ccjs1vqr4hyu.us-west-2.rds.amazonaws.com:1521:orcl"; 
          
        conexion = DriverManager.getConnection(BaseDeDatos, "escuela","12345678");             
        if (conexion != null) { 
            System.out.println("Conexion exitosa!"); 
        } else { 
            System.out.println("Conexion fallida!"); 
        } 
    } catch (ClassNotFoundException | SQLException e) { 
        JOptionPane.showMessageDialog(null, e+"no conecta");
    }        return this; 
} 

public boolean escribir(String sql) { 
        try { 
            Statement sentencia; 
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            
            sentencia.executeUpdate(sql); 
            
            //getConexion().commit();             
      
            sentencia.close(); 
            JOptionPane.showMessageDialog(null,"insertado correctamente"+sql);
             
        } catch (SQLException e) { 
            e.printStackTrace(); 
            System.out.print("ERROR SQL"); 
            return false; 
        }         
        return true; 
    } 

public ResultSet consultar(String sql) { 
        ResultSet resultado = null;
        Conexion con = new Conexion();
        try {
            con.conectar();
            Connection myconnection = con.getConexion();
            PreparedStatement myStatement = myconnection.prepareStatement(sql);
            resultado = myStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }        
        return resultado;      
        
    } 

    public static void main(String[] args) {
//        Conexion con = new Conexion();
//        try {
//            con.conectar();
//            Connection myconnection = con.getConexion();
//            PreparedStatement myStatement = myconnection.prepareStatement("SELECT * FROM usuarios");
//            ResultSet rs = myStatement.executeQuery();
//        
//            while (rs.next()) {
//                System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
//            
//            }
//            
//        } catch (Exception e) {
//            
//        }
        
        
    }

}

