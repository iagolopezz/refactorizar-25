package org.example;

public class Tienda {
    private String direccion;
    private String telefono;

    public Tienda(String direccion, String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String toString() {
        return "Dirección: " + direccion + "\nTeléfono: " + telefono;
    }
}
