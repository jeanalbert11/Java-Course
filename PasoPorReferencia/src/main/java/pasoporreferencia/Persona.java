package pasoporreferencia;

/**
 *
 * @author Jean Albert Cortes Ortiz
 */
public class Persona {

    //Atributo
    private String nombre;

    public String getNombre() {
        return this.nombre;//Regresamos el atributo de nuestra clase persona
    }

    public void cambiarNombre(String nuevoNombre) {
        // this.nombre  va a recibir el valor que le asignemos  al nuevoNombre
        this.nombre = nuevoNombre;
    }
}
