package productos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private Connection con;

    public static Connection getConnection() {
        try {
            
            
            String url = "jdbc:mysql://192.168.1.5:3306/productos?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8";
            String user = "usuario_remoto";
            String password = "Natzu1:)";

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        } 
       
    }
}
