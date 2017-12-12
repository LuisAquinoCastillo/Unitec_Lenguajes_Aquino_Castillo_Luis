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
public class PersistenciaCliente {
    
    Cliente cli;
    Direccion dir;
    
    public void guardarCliente(Cliente c,Direccion d) throws SQLException{
        Connection con=null;
        try
        {    
            con=Conexion.conectarse("root", "");
            System.out.println("Conectado a mysql");
            Statement stdir=con.createStatement();
            ResultSet rsdirec=stdir.executeQuery("INSERT INTO DIRECCION VALUES("+d.getId()+","+d.getCp()+",'"+d.getCalle()+"','"+d.getMunicipio()+"');");
            System.out.println("Registro agregdo en DIRECCION");
            Statement stcli=con.createStatement();
            ResultSet rs=stcli.executeQuery("INSERT INTO CLIENTE VALUES("+c.getId()+",'"+c.getNombre()+"',"+c.getEdad()+","+d.getId()+");");
            System.out.println("Registro agregado en CLIENTE");
        }catch(ClassNotFoundException e){
            System.out.println("No se cargo el driver");
        }catch(SQLException e){
            System.out.println("Error al conectar");
        }finally{
            try{
                if (con!=null)con.close();
                System.out.println("Secion terminada");
            }catch(SQLException ex){
            }
        }
    }
}