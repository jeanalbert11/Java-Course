package casteo;

/**
 *
 * @author Jean Albert Cortes Ortiz
 */
import casteo.*;

public class Main {

    public static void main(String[] args) {
        Empleado empleado;

        // empleado -> Escritor
        empleado = new Escritor("Albert", 7000000, TipoEscritura.CLASICO);//Valor por "referencia"
        System.out.println("empleado -> Escritor:" + empleado.obtenerDetalles());

        //Casteode tipo DOWN
        //Por medio de este casteo puedo acceder a los metodos de la clase hijas
        System.out.println("empleado -> Escritor:" + ((Escritor) empleado).getTipoEscrituraTexto());
   
        // empleado -> Gerente
        empleado = new Gerente(" Tele Comunicaciones", "Karen", 6000000);
         //Casteode tipo DOWN
        //Por medio de este casteo puedo acceder a los metodos de la clase hijas
        System.out.println("empleado -> Gerente" + ((Gerente)empleado).getDepartamento());
    }

}
