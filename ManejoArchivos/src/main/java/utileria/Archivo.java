package utileria;

import java.io.*;

/**
 *
 * @author User001
 */
public class Archivo {

    public static void crearArchivo(String nombreArchivo) {
        //Creamos archivo
        File archivo = new File(nombreArchivo);

        try {
            //printWriter: para poder escribir informacion hacia el disco duro
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se ha creado correctamente");
        } catch (FileNotFoundException ex) {
            //Mandamos a llmar la pila de excepciones
            ex.printStackTrace(System.out);
        }

    }

    public static void escribirArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            //Para poder escribir en el archivo
            PrintWriter salida = new PrintWriter(archivo);
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("fin de escritura");
            System.out.println("Se ha escrito correctamente al archivo");
            salida.close();//para asegurarnos que guardo informacion
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);//En dado caso si tenemos un error
        }

    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            //BufferedReader: Para leer archivo
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //Solo podemos leer una sola linea
            String lectura = entrada.readLine();//Nos permite leer lineas completas
            //Con while podemos leer todo el archivo
            while (lectura != null) {
                System.out.println(lectura);//Imprimmimos informacion del archivo por consola hasta que finalice
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void anexarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "Anexando informacion";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
            System.out.println("Se ha anexado la informacion al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
