/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author luisaquino
 */
public class NumeroNegativoException extends Exception{
    public NumeroNegativoException(){
        super("metiste un numero negativo!!");
    }
}
