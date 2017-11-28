
package conexion;

//Este paquete es de java
import java.sql.*;

public class Conexion {
    public static Connection conectarse(String login, String password) throws SQLException, ClassNotFoundException{
        //Primero escribimos la URL del servidor de MySQL
        String url="jdbc:mysql://localhost:3306/mysql";
        //Cargado del driver con codigo
        //Cargamos el driver de MySQL para poder conectarnos a MySQL
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(url, login, password);
        return con;
    }
}
