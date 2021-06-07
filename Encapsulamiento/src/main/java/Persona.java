
/**
 *
 * @author User01
 */
public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona() {
    }

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //Prefijo is: Para tipo Boolean 
    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override//String.format("%d", sueldo)
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }

}
