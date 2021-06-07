package datos;

import dominio.Pelicula;
import exepciones.AccesoDatosEx;
import java.util.List;

/**
 *
 * @author User01
 */
public interface AccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    public List<Pelicula> listar(String nombreArchivo) throws AccesoDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws AccesoDatosEx;

    public String buscar(String nombreArchivo, String buscar) throws AccesoDatosEx;

    public void crear(String nombreArchivo) throws AccesoDatosEx;

    public void borrar(String nombreArchivo) throws AccesoDatosEx;

}
