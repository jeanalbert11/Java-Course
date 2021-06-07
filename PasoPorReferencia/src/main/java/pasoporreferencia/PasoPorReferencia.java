package pasoporreferencia;
import pasoporreferencia.Persona;
/**
 *
 * @author Jean Albert Cortes Ortiz
 */
public class PasoPorReferencia {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();

        persona1.cambiarNombre("Albert");
        System.out.println("Valor original del nombre: " + persona1.getNombre());

        //PASO POR REFERENCIA: Que desde otros metodos podremos cambiar el valor de los objetos
        modificarPersona(persona1);
        System.out.println("Valor de nombre (1ra Modificación): " + persona1.getNombre());
        
        //PASO POR REFERENCIA: Que desde otros metodos podremos cambiar el valor de los objetos
        modificarPersona2(persona1);
        System.out.println("Valor de nombre (2da Modificación): " + persona1.getNombre());
    }

    private static void modificarPersona(Persona arg1) {
        arg1.cambiarNombre("Ian"); //PASO POR REFERENCIA 1
    }

    private static void modificarPersona2(Persona arg2) {
        arg2.cambiarNombre("Jean"); //PASO POR REFERENCIA 2
    }

}
