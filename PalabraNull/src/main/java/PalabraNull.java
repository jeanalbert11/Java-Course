
/**
 *
 * @author Jean Albert Cortes Ortiz
 */
public class PalabraNull {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Albert");
        System.out.println("Obteniendo el nombre del obj persona1: " + persona1.getNombre());

        Persona persona2 = persona1;
        System.out.println("Obteniendo el nombre del obj persona2: " + persona2.getNombre());

        persona1 = null;//auscencia de valor
        if (persona1 != null) {
            System.out.println("Obteniendo el nombre del obj persona1: " + persona1.getNombre());
        } else {
            System.out.println("El obj persona1 no apunta a ningun objeto");
        }

        System.gc();//Garbage collector

    }
}
