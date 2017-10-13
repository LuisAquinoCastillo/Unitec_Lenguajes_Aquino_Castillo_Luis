/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadratica;

/**
 *
 * @author luis
 */
public class Calculo {
    
    Valores v;
    String resul,resul2;
    
    public String raiz1()
    {
        double x1;
        double r=Math.sqrt((v.getB()*v.getB())-4*v.getA()*v.getC());
        
        x1=((-1*(v.getB()))+r)/(2*v.getA());
       
        if (r<0)
        {
            resul=" hay raises imaginarias ";
            return resul;
        }
        else
        {
            resul=" "+x1;
            return resul;
        }
    }
    
     public String raiz2()
    {
        double x2;
        double r=Math.sqrt((v.getB()*v.getB())-4*v.getA()*v.getC());
        
        x2=((-1*(v.getB()))-r)/(2*v.getA());
       
        if (r<0)
        {
            resul2=" hay raises imaginarias ";
            return resul;
        }
        else
        {
            resul2=" "+x2;
            return resul2;
        }
    }
}
