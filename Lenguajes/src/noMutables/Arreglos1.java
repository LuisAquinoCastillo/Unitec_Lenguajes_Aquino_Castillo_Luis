/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noMutables;

/**
 *
 * @author luis
 */
public class Arreglos1 {
    
    public static void main(String[] args) {
        //vamos a generar un arreglo simple
        int x[]={12,-4,7};
        System.out.println("El tamaño es "+x.length);
        //Para accesder a un elemento hacemos lo siguiente
        System.out.println("En el indice 0 esta "+x[2]);
        int []y={2,4,5};
        int []z=new int[3];
        z[0]=-12;
        z[1]=5;
        z[2]=4;
        //vamos a iterar el arreglo z usuando un ciclo for
        for (int i=0;i<z.length;i++)
        {
            System.out.println(z[i]);
        }
        //Aqui veremos el ciclofor mejorado
        for (int valor:z)
        {
            System.out.println("Mejorado: "+valor);
        }
        String mensaje="Hola como estas";
        byte []w=mensaje.getBytes();
        System.out.println("Tamaño: "+w.length);
        String codificado="";
        for (int valor2:w)
        {
            System.out.println(valor2);
            codificado=codificado+valor2;
        }
        System.out.println("El mensaje codificado es: ");
        System.out.println(codificado);
        
    }
    
}
