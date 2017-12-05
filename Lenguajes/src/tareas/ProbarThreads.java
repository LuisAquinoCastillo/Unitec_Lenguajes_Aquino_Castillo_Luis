/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

/**
 *
 * @author luisaquino
 */
public class ProbarThreads {
    public static void main(String[] args) {
        //Thread creado
        Primero p=new Primero();
        Segundo s=new Segundo();
        //Thread en estado de ejecucion
        p.start();
        s.start();
    }
    
}
