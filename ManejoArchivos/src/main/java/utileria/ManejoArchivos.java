package utileria;

import static utileria.Archivo.*;

/**
 *
 * @author User001
 */
public class ManejoArchivos {

    public static void main(String[] args) {

        //ruta donde se creara el archivo
        String nombreArchivo = "C:\\Users\\User001\\Documents\\Course Java\\Programas\\ManejoArchivos\\archivo.txt";

        //creamos archivo
        crearArchivo(nombreArchivo);

        //escribir a archivo
        escribirArchivo(nombreArchivo);
        
        //anexamos informacion al archivo
        anexarArchivo(nombreArchivo);

        //sleer informacion del archivo
        leerArchivo(nombreArchivo);

    }

}
