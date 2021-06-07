
/**
 *
 * @author Jean Albert Cortes Ortiz
 */
public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Albert");
        System.out.println(persona1);

        Persona persona2 = new Persona("Ian");
        System.out.println(persona2);

        System.out.println("contador personas" + Persona.getContadorPersonas());
    }
}
