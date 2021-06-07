package Test;

import genericos.ClaseGenerica;

/**
 *
 * @author Jean ALbert
 */
public class ManejoGenericos {

    public static void main(String[] args) {
        //Objetos de tipo enteros
        ClaseGenerica<Integer> objetosEnteros = new ClaseGenerica<Integer>(15);
        objetosEnteros.obtenerTipo();

        ClaseGenerica<String> objetosCadenas = new ClaseGenerica<String>("Prueba");
        objetosCadenas.obtenerTipo();
        
        
    
    }
}
