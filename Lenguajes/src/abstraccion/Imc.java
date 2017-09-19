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
public class Imc {
    Usuario u; //Usuario es un atributo
    String resultado;
    
    public String calcular()
    {
        float mivalor=u.peso/(u.altura*u.altura);
        resultado="Tu imc es "+mivalor;
        return resultado;
    }
}
