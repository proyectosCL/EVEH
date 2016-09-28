package Database;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Silva
 * Una pequeña clase con un SELEC para probar la conección a la base de datos.
 */
public class TestConnection {
    public static void main(String[] args) {
        try {
            DB_Connection dbconn = new DB_Connection();
            Connection myconnection = dbconn.Connection();

            String sqlString = "SELECT * FROM usuarios";
            Statement myStatement = myconnection.createStatement();
            ResultSet rs = myStatement.executeQuery(sqlString);

            LinkedList<String> result = new LinkedList();
            while(rs.next()){
                for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
                    result.add(rs.getString(i));
                }
            }
            System.out.println(result);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
