
import org.openjdk.jol.info.GraphLayout;
import org.openjdk.jol.vm.VM;
import org.openjdk.jol.vm.VirtualMachine;

/**
 *
 * @author Jean Albert Cortes Ortiz
 */
public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jean Albert", 3000000);
        System.out.println("Datos empleado1 :" + empleado1);

        Empleado empleado2 = new Empleado("Jean Albert", 7000000);
        System.out.println("Datos empleado2 :" + empleado2);

        //Comprobando que no es la misma direccionde memoria
        //Osea que son distintos
        System.out.println("Objetos iguales: " + (empleado1 == empleado2));//preguntamos por la referencia de los obj. No por el contenido

        System.out.println("Direccionde memoria del empleado1 : " + VM.current().addressOf(empleado1));
        System.out.println("Direccionde memoria del empleado2 : " + VM.current().addressOf(empleado2));

        System.out.println("Detalle del empleado1: " + GraphLayout.parseInstance(empleado1).toPrintable());
        System.out.println("Detalle del empleado2: " + GraphLayout.parseInstance(empleado2).toPrintable());

        compararObjetos(empleado1, empleado2);

    }

    public static void compararObjetos(Empleado empleado1, Empleado empleado2) {
        System.out.println("Datos empleado1 :" + empleado1);
        System.out.println("Datos empleado2 :" + empleado2);
        if (empleado1 == empleado2) {
            System.out.println("Los objetos tienen la misma direccion en memoria");
        } else {
            System.out.println("Los objetos tienen distinta direccion en memoria");
        }

        //Revision del metodo Equals pafra saber si contienen los mismos valores en los atributoss
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos tienen el mismo contenido");
        } else {
            System.out.println("Los objetos tienen diferente contenido");
        }

        //Revision del metodo hashCode
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("Los objetos tienen el mismo codigo hash");
            System.out.println("Cod hash empleado1 :" + empleado1.hashCode());
            System.out.println("Cod hash empleado2 :" + empleado2.hashCode());
        } else {
            System.out.println("Los objestos tienen difeente codigo hash");
            System.out.println("Cod hash empleado1 :" + empleado1.hashCode());
            System.out.println("Cod hash empleado2 :" + empleado2.hashCode());
        }
    }

}
