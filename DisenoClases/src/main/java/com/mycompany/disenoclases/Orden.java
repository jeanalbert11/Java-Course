package com.mycompany.disenoclases;

public class Orden {

    private int idOrden;
    private Producto[] productos;//Declaramos la variable arreglo
    private static int contadorOrdenes;
    private static int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        //Inicializamos el areglo
        this.productos = new Producto[MAX_PRODUCTOS];
    }
    
    public void addProducto(Producto producto){
        productos[contadorProductos++] = producto;
    }

}
