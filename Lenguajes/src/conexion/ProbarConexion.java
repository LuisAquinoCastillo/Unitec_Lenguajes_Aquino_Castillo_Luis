/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.ArrayList;
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
            //Paso1 generar una consulta
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM TABLITA");
            
            //Viene la traduccion
            ArrayList<Tablita> registros=new ArrayList<>();
            while(rs.next()){
                //Crear un objrto de tipo tablita
                Tablita t=new Tablita();
                t.setId(rs.getInt(1));
                t.setNombre(rs.getString(2));
                registros.add(t);
            }
            for(Tablita t:registros){
                System.out.println("id: "+t.getId()+" Nombre: "+t.getNombre());
            }
            st.close();
            
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
