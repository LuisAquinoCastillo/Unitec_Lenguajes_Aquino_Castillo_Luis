/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author luis
 */
public class Animal {
    
    private String nombre;
    private int edad;
    private boolean muerde;
    
    public Animal(int edad)
    {
        this.edad=edad;
    }
    
    public Animal()
    {
        System.out.println("Soy el contructor");
        edad=5;
        nombre="omega";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }
    
}
