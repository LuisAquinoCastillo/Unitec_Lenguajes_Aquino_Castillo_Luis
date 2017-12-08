/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.Calendar;

/**
 *
 * @author luisaquino
 */
public class RelojitoChafa implements Runnable {
    public static void main(String[] args) {
        //Creamos el thread con esta interfas
        Runnable r=new RelojitoChafa();
        Thread t1=new Thread(r);
        t1.start();
    }
    public void run(){
        while(true){
            try{
        Calendar c=Calendar.getInstance();
        Thread.sleep(1000);
        //sacamos la hora del sistema
        int hora=c.get(Calendar.HOUR);
        int minutes=c.get(Calendar.MINUTE);
        int segundos=c.get(Calendar.SECOND);
        System.out.println("La hora es: "+hora+":"+minutes+":"+segundos);
            }catch(InterruptedException e){ 
             }
            }
    }
}
