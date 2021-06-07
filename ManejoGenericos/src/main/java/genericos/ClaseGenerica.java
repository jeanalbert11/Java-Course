package genericos;

/**
 *
 * @author Jean Albert
 */
public class ClaseGenerica<T> {

    //Definimos variable de tipo generico
    T objeto;

    //Constructor que inicialia l tipo a utilizar
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    //metodo para obtener tipo de clase
    public void obtenerTipo() {
        System.out.println("El tipo T es:" + objeto.getClass().getSimpleName());
    }

}
