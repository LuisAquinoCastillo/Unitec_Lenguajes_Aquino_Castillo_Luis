/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;
import java.sql.*;
/**
 *
 * @author Luis Abraham Aquino
 */
public class Conexion {
    public static Connection conectarse(String login,String password)throws SQLException, ClassNotFoundException{
        //Direccion del servidor
        String url="jdbc:mysql://localhost:3306/mysql";
        //Driver jdbc
        Class.forName("com.jdbc.mysql.Driver");
        Connection con=DriverManager.getConnection(url,login,password);
        return con;
    }
}
