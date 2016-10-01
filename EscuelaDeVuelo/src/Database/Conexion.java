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
    } catch (Exception e) { 
        e.printStackTrace(); 
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
        try { 
            Statement sentencia; 
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql); 
             
        } catch (SQLException e) { 
            e.printStackTrace(); 
            return null; 
        }        
        return resultado; 
    } 

    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.conectar();
        con.escribir("insert into alumnos values('20.300.566-3','jorda perez 2',18)");
    }

}

