package org.example;

public class Trabajador {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private Tienda tienda;

    public Trabajador(String nombre, String apellido, String direccion, String telefono, Tienda tienda) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tienda = tienda;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nDirección: " + direccion +
                "\nTeléfono: " + telefono +
                "\nTienda: " + tienda.getDireccion();
    }
}
