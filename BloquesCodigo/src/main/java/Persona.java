
public class Persona {

    private final int id;//Se debe inicializar por el fina
    private static int contadorPersonas;

     static {
        //Iniializamos el atributos "private static int contadorPersonas;"
        contadorPersonas = 10;
        System.out.println("Ejecucion del bloque estatico");
    }
    
    {
        //Inicializacmos la var "private final int id;"
        this.id = ++contadorPersonas;
        System.out.println("Ejecuacion del bloque no estatico");
    }

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + '}';
    }

}
