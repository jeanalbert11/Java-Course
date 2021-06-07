package exepciones;

/**
 *
 * @author Jean Albert Cortes Ortiz
 */
public class AccesoDatosEx extends Exception {

    private final  String mensaje;

    public AccesoDatosEx(String mensaje) {
        this.mensaje = mensaje;
    }

}
