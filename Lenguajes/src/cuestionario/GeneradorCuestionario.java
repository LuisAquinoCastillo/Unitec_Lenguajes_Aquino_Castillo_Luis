/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author luis
 */
public class GeneradorCuestionario {
    
    public ArrayList<Pregunta> generar(){
        //Primero generaremos el arreglo que contrendra las preguntas
        ArrayList<Pregunta> preg= new ArrayList<Pregunta>();
        //Despues generaremos cada opcion de la primer pregunta
        Opcion opc1=new Opcion("Moscu",false);
        Opcion opc2=new Opcion("Kiev",false);
        Opcion opc3=new Opcion("Helsinki",true);
        
        ArrayList<Opcion> opcion1=new ArrayList<Opcion>();
        opcion1.add(opc1);
        opcion1.add(opc2);
        
        Pregunta preg1=new Pregunta("Capital de Finlandia",opcion1);
        preg.add(preg1);
        
        
        return preg;
    }
    
}
