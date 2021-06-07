package calculadora;

import java.util.Scanner;
import static calculadora.Operaciones.*;

/**
 *
 * @author User001
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Proporciona el primer valor: ");
        Scanner entrada1 = new Scanner(System.in);
        int a = entrada1.nextInt();
        System.out.println("Proporciona el segundo valor: ");
        int b = entrada1.nextInt();

        int resultadoSuma = sumar(a, b);
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        //
        System.out.println("Proporciona el primer valor: ");
        Scanner entrada2 = new Scanner(System.in);
        int c = entrada2.nextInt();
        System.out.println("Proporciona el segundo valor: ");
        int d = entrada2.nextInt();
        
        int resultado2 = restar(a, b);
        System.out.println("El resultado de la resta es: " + resultado2);

    }

}
