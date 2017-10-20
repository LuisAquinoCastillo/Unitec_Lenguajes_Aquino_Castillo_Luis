/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author luis
 */
public class Usuario {
    private float peso;
    private float altura;
    
    public static void main(String[] args) {
        Usuario usu=new Usuario();
        //Valores predeterminados de peso y altura
        System.out.println("Peso: "+usu.peso + " Altura: "+usu.altura);
        Usuario usu2=new Usuario(3);
        
    }
    Usuario(){
        peso=10;
        altura=1.20f;
    }
    Usuario(int b){
        
        for (int i=0;i<b;i++)
        {
           peso=15;
        altura=1.20f; 
            System.out.println("Peso: "+peso + " Altura: "+altura);
        }
    }

    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    

}
