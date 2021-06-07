
public class Persona {

    private int id;//Se asocia con una instancia
    private String nombre;//Se asocia con una instancia
    private static int contadorPersonas;//Se asocia con la clase y no con los objs

    public Persona() {
    }

    public Persona(String nombre) {
        this.id = ++contadorPersonas;//Pre incremento
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", contadorPersona=" + contadorPersonas + '}';
    }

}
