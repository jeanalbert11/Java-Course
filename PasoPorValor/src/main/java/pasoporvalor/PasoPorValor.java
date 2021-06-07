package pasoporvalor;

/**
 *
 * @author Jean Albert
 */
public class PasoPorValor {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);//Imprimer 10
        cambiarValor(x);
        System.out.println("x = " + x);//Sigue imprimiendo 10
    }
    //Llega el valor 10 al parametro del método
    //int arg = x;
    private static void cambiarValor(int arg) {
        System.out.println(arg);
        System.out.println("arg = " + arg);
        arg = 20; //arg=20;
    }
}
