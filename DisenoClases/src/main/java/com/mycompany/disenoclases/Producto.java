package com.mycompany.disenoclases;

class Producto {

    private int idProducto;
    private String nombre;
    private double precio;

    private static int contadorProductos;//Para contar el numero de obj productos creados

    public Producto() {
        this.idProducto = contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

  
}
