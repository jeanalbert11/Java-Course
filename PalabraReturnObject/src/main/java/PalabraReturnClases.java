
/**
 *
 * @author Jean  Albert Cortes Ortiz
 */
public class PalabraReturnClases {

    public static void main(String[] args) {
        Suma suma1 = crearObjSuma();//RECIBE LA REFERENCIA DEL OBJETO DEL METODO: "crearObjSuma"
        System.out.println("Resultado de llamar el metodo sumar: " + suma1.sumar());

    }

    private static Suma crearObjSuma() {
        Suma suma = new Suma(7, 7);
        return suma;//REFERENCIA DE OBJ
    }

}
