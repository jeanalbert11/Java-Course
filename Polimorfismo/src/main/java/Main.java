
/**
 *
 * @author Jean Albert Cortes Ortiz
 */
public class Main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Albert", 3000000);
        imprimirDetalles(empleado);

        Gerente gerente = new Gerente("IT", "Albert", 14000000);
        //Aunque inicialmente el metodo recibe un obj de tipo empleado de la clase padre
        //en "ejecucion" lo que realmente ejecuta es el metodo de la clase hija, ya que es lo que toma como referencia
        imprimirDetalles(gerente);//Polimorfismo

    }

    //POLIMORFISMO:Multiple formas en tiempo de ejecucion
    public static void imprimirDetalles(Empleado empleado) {
        System.out.println("Detalles: " + empleado.obtenerDetalles());
    }
}
