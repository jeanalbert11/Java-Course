
/**
 *
 * @author Jean Albert Cortes Ortiz
 */
public class Main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Albert", 3000000);
        System.out.println("Detalles: " + empleado.obtenerDetalles());

        Gerente gerente = new Gerente("IT", "Albert", 14000000);
        System.out.println("Detalles: " + gerente.obtenerDetalles() );
    }
}
