package org.example;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private String sku;

    public Producto(String nombre, double precio, int cantidad, String sku) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean reducirCantidad(int cantidadComprada) {
        if (cantidad >= cantidadComprada) {
            cantidad -= cantidadComprada;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nPrecio: " + precio +
                "\nCantidad: " + cantidad +
                "\nSKU: " + sku;
    }
}
