/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.JFrame;

/**
 *
 * @author luis
 */
public class ProbarConstructores {
    
    public static void main(String[] args) {
        
        //Creamos un objeto de la clase Animal
        Animal algo=new Animal();
        //algo.setEdad(5);
        System.out.println(algo.getEdad());
        System.out.println(algo.getNombre());
        System.out.println(algo.isMuerde());
        
        Animal otro=new Animal(8);
        otro.setEdad(10);
        System.out.println(otro.getEdad());
        //Vamos a usar un constructor de una clase
        //que no hemos diseñado nosotros
        JFrame venta=new JFrame("Hola mundo");
        venta.setSize(300, 300);
        venta.setVisible(true);
    }
    
}
