package ventas;

import java.util.ArrayList;

public class Orden {

    private int id;
    private Producto productos[];//Composicion
    private static int contadorOrdenes;
    private int contadorProductos;//Para saber cuantos productos se han agregado
    private static final int MAX_PRODUCTOS = 5;//CTE

    public Orden() {
        this.id = ++contadorOrdenes;
        //Inicializamos el arreglo de productos
        productos = new Producto[MAX_PRODUCTOS];

    }

    public Orden(int id, int contadorProductos) {
        this.id = id;
        this.contadorProductos = contadorProductos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public static int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public static void setContadorOrdenes(int contadorOrdenes) {
        Orden.contadorOrdenes = contadorOrdenes;
    }

    public int getContadorProductos() {
        return contadorProductos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        return "Orden{" + "id=" + id + ", productos=" + productos + '}';
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < MAX_PRODUCTOS) {
            productos[contadorProductos++] = producto;
        } else {
            System.out.println("Exedio el limite de productos" + MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;//Paraca calsular el total 
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];//recuperamos el elementode la posicion 0
            total += producto.getPrecio();// total = total + producto.getPrecio()
        }
        return total;

    }

    public void mostrarOrden() {
        System.out.println("N° Orden: " + this.id);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            // Producto producto = this.productos[i];  Primera forma
            System.out.println(productos[i]);//Segunda forma mejorada
        }
    }

}
