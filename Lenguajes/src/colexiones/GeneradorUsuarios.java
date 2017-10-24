/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colexiones;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author luis
 */
public class GeneradorUsuarios {
    public static void main(String[] args) {
        //Vamos agenerar 5usuarios
        Usuario u1=new Usuario();
        u1.setNombre("luis");
        u1.setEdad(20);
        u1.setEmail("luis@gmail.com");
        
        Usuario u2=new Usuario();
        u2.setNombre("abraham");
        u2.setEdad(21);
        u2.setEmail("abraham@gmail.com");
        
        Usuario u3=new Usuario();
        u3.setNombre("carlos");
        u3.setEdad(22);
        u3.setEmail("carlos@gmail.com");
        
        Usuario u4=new Usuario();
        u4.setNombre("juan");
        u4.setEdad(16);
        u4.setEmail("juan@gmail.com");
        
        Usuario u5=new Usuario();
        u5.setNombre("loco");
        u5.setEdad(21);
        u5.setEmail("loco@gmail.com");
        
        //Generaremos un arreglo mutable
        //<Usuario> indica que este arreglo solamente va a aceptar objetos de la clase Usuario
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>(); //List y ArrayList estan dentro de un paquete llamado java.util
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        
        for (Usuario u: usuarios){
            System.out.println("Nombre: "+u.getNombre());
        }
    }
}
