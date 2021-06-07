
public class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;//This apunta a un obj de tipo persona
        System.out.println("Impresion del operador this dentro la clase persona:" + this);//This apunta a un obj de tipo persona en este momento
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);//Contiene una referencia al obj Persona

    }

}
