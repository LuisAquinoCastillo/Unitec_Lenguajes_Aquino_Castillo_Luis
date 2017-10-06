/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciados;
/**
 *
 * @author luis
 */
import abstraccion.Usuario;

public class Prueba2 {
    
    public static void main(String[] args) {
        
        /*Todos los referenciados pertenecen a una clase
        Se necesita uno o mas priitivos para definirlo*/
        String nombre="Luis Abraham";
        String otro=new String("omega"); //Constructor
        Usuario u=new Usuario();
        u.setAltura(1.7f);
        u.setPeso(80);
    }
    
}
