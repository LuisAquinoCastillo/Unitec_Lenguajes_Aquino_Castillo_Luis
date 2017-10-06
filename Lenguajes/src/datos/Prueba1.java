/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author luis
 */
public class Prueba1 {
    
    public static void main(String[] args) {
        
        //Provaremos los tipos de datos integrales.
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        ///Las lineas de las sigiuientes lineas van a marcar herror
        b=(byte)s;
        s=b;
        i=s;
        s=(short)l;
        b=(byte)i;
        
        //Algo chistoso con los flotantes
        float f=2.0f;
        double d=2.0;
        
        boolean b1=true;
        boolean b2=false;
        
        //tipo caracter
        char algo='h';
        char otro=' ';
               
    }
    
}
