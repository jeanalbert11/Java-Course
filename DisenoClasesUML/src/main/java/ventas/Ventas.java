package ventas;

import ventas.*;

/**
 *
 * @author Jean Albert Cortes Ortiz
 */
public class Ventas {

    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Pasta", 3000);
        Producto producto2 = new Producto(2, "Arroz", 2500);
        Producto producto3 = new Producto(3, "Lenteja", 2000);
        Producto producto4 = new Producto(4, "Papa", 2500);
        Producto producto5 = new Producto(5, "Carne", 5000);

        Orden orden1 = new Orden();

        //Agregamos los productos con la clase orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto5);

        //Imprimimos la orden
        orden1.mostrarOrden();

    }

}
