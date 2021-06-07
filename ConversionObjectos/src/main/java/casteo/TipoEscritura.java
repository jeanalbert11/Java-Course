package casteo;


public enum TipoEscritura {
//   Constantes con sus  Valores
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");

    //Definimos un atributo para poder acceder los valores
    private final String descripcion;

    private TipoEscritura(String descripcion) {
        //Inicializamos el atributos de  la enum "Obligatorio"
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    
}
