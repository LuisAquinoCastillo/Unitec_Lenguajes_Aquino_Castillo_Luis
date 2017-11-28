/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author luisaquino
 */
public class ProbarConexion {
    public static void main(String[] args) {
        Connection con=null;
        try{
        con=Conexion.conectarse("root", "root");
            System.out.println("Conctado");
            // Aqui se incluye codigo de SQL querys
            
        }catch(ClassNotFoundException e){
            System.out.println("No se cargo el Driver");
            }catch(SQLException e){
                System.out.println("Conexion no completada");
            }finally{
            try {
                if (con!=null)con.close();
                System.out.println("Servicio terminado");
            } catch (SQLException ex) {
                
            }
        }
    }
}
