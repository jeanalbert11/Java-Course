package negocio;

/**
 *
 * @author User01
 */
public interface CatalogoPeliculas {

    public void agregarPelicula(String nombrePelicula, String nombreArchivo);

    public void listarPeliculas(String nombreArchivo);

    public void buscarPelicula(String nombreArchivo, String buscar);

    public void iniciarPelicula( String nombreArchivo);
}
