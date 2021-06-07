package test;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Autoboxing (envolvemos tipos primitivos en clases wrapper)
        Integer enteroObj = 10;
        System.out.println("enteroObj = " + enteroObj);
        
        //Unboxing (extraemos el tipo primitivo del objeto envolvente)
        int entero = enteroObj;
        System.out.println("entero = " + entero);
        
        Float floatObj = 15.4F;
        System.out.println("floatObj = " + floatObj);
        float flotante = floatObj;
        System.out.println("flotante = " + flotante);
        System.out.println("int a partir del float = " + floatObj.intValue());
        
        //Listado de clases envolventes
        //boolean - Boolean
        //byte - Byte
        //char - Character
        //short - Short
        //int - Integer
        //long - Long
        //float - Float
        //double - Double
        
    }
}
