package org.example;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String apellido, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nDirección: " + direccion +
                "\nTeléfono: " + telefono;
    }
}
