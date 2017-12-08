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
public class UltimoReloj {

    public static void main(String[] args) {

        //Creando la clase interna anonima porque esta dentro deun constructor
        //porque es esperava la referencia a una clase
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Calendar c = Calendar.getInstance();
                        Thread.sleep(1000);
                        //sacamos la hora del sistema
                        int hora = c.get(Calendar.HOUR);
                        int minutes = c.get(Calendar.MINUTE);
                        int segundos = c.get(Calendar.SECOND);
                        System.out.println("La hora es: " + hora + ":" + minutes + ":" + segundos);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }); //estos son conocidos como background thread
        t1.start();
    }
}
