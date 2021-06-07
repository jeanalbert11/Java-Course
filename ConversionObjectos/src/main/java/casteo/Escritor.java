package casteo;

public class Escritor extends Empleado {

    //Composicion de la enum
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura escritura) {
        super(nombre, sueldo);
        //Hay que inicializar el atributo de tipo enum OBLIGATORIAMENTE
        this.tipoEscritura = escritura;

    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Tipo de escritura=" + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    //Para recuperar la descripcion de tipo de escritura seleccionado
    public String getTipoEscrituraTexto() {
        return tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return super.toString() + "Escritor{" + "tipoEscritura=" + tipoEscritura + '}';
    }

}
