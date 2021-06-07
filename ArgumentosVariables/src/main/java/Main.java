
/**
 *
 * @author Jean Albert Cortes Ortiz
 */
public class Main {

    public static void main(String[] args) {

        variosParametros("Jean", true, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);//Tiene que ser de ultimo los argumentosVariabled
    }

    //Recibe varios parametros
    private static void variosParametros(String nombre, boolean valido, int... numeros) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Valido: " + valido);
        for (int numero : numeros) {
            System.out.println("El nnúmero es: " + numero);
        }
    }
}
