package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Silva
 */
public class DB_Connection {

    public Connection Connection() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection myConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "TEST", "3200256");    //URL, DB, PASSWORD
            return myConnection;
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
