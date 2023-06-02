import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaDBConnect {
     Connection con = null;
    private static final String URL = "jdbc:mysql://localhost:3306/gestionn";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public Connection getConnection() throws SQLException, ClassNotFoundException {
               
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connexion réussie !");            
        } catch (SQLException ex) {
            Logger.getLogger(JavaDBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } 
         return con;
    }

    void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
