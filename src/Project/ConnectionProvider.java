package Project;

import java.sql.*;
/**
 *
 * @author Juliet
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try {
           //Class.forName(com.mysql.jdbc.Driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospitalmanagementdb","root","");
            return con;
    } 
        catch (Exception e) {
        return null;
        }      
    }    
}
