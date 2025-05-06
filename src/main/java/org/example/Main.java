package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Tienda> tiendas = new ArrayList<>();
    private static List<Trabajador> trabajadores = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarDatos();
        mostrarMenu();
    }

    private static void inicializarDatos() {
        // Tiendas
        Tienda tienda1 = new Tienda("Calle 123", "1234567");
        Tienda tienda2 = new Tienda("Calle 456", "7654321");
        tiendas.add(tienda1);
        tiendas.add(tienda2);

        // Trabajadores
        trabajadores.add(new Trabajador("Juan", "Perez", "Calle 123", "1234567", tienda1));
        trabajadores.add(new Trabajador("Maria", "Lopez", "Calle 456", "7654321", tienda1));
        trabajadores.add(new Trabajador("Pedro", "Gomez", "Calle 789", "4567890", tienda2));
        trabajadores.add(new Trabajador("Ana", "Garcia", "Calle 101", "0987654", tienda2));

        // Clientes
        clientes.add(new Cliente("Carlos", "Perez", "Calle 123", "1234567"));
        clientes.add(new Cliente("Ana", "Lopez", "Calle 456", "7654321"));
        clientes.add(new Cliente("Pedro", "Gomez", "Calle 789", "4567890"));
        clientes.add(new Cliente("Maria", "Garcia", "Calle 101", "0987654"));

        // Productos
        productos.add(new Producto("Patatas", 1.5, 100, "1234"));
        productos.add(new Producto("Manzanas", 2.5, 200, "5678"));
        productos.add(new Producto("Peras", 3.5, 300, "9101"));
        productos.add(new Producto("Uvas", 4.5, 400, "1121"));
        productos.add(new Producto("Fresas", 5.5, 500, "3141"));
        productos.add(new Producto("Platanos", 6.5, 600, "5161"));
        productos.add(new Producto("Naranjas", 7.5, 700, "7181"));
        productos.add(new Producto("Mangos", 8.5, 800, "9201"));
    }

    private static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar información de todas las tiendas");
            System.out.println("2. Mostrar información de todos los trabajadores");
            System.out.println("3. Mostrar productos disponibles");
            System.out.println("4. Últimos 3 productos añadidos");
            System.out.println("5. Comprar productos");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> mostrarTiendas();
                case 2 -> mostrarTrabajadores();
                case 3 -> mostrarProductos();
                case 4 -> mostrarUltimosProductos();
                case 5 -> comprarProducto();
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static void mostrarTiendas() {
        System.out.println("\n--- TIENDAS ---");
        for (int i = 0; i < tiendas.size(); i++) {
            System.out.println("Tienda " + (i + 1) + ":\n" + tiendas.get(i));
            System.out.println("-------------------------");
        }
    }

    private static void mostrarTrabajadores() {
        System.out.println("\n--- TRABAJADORES ---");
        for (int i = 0; i < trabajadores.size(); i++) {
            System.out.println("Trabajador " + (i + 1) + ":\n" + trabajadores.get(i));
            System.out.println("-------------------------");
        }
    }

    private static void mostrarProductos() {
        System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Producto " + (i + 1) + ":\n" + productos.get(i));
            System.out.println("-------------------------");
        }
    }

    private static void mostrarUltimosProductos() {
        System.out.println("\n--- ÚLTIMOS 3 PRODUCTOS AÑADIDOS ---");
        int total = productos.size();
        for (int i = total - 3; i < total; i++) {
            System.out.println(productos.get(i));
            System.out.println("-------------------------");
        }
    }

    private static void comprarProducto() {
        System.out.println("\n--- COMPRA DE PRODUCTO ---");
        System.out.print("Ingrese el SKU del producto: ");
        String sku = scanner.next();

        Producto productoSeleccionado = null;
        for (Producto producto : productos) {
            if (producto.getSku().equalsIgnoreCase(sku)) {
                productoSeleccionado = producto;
                break;
            }
        }

        if (productoSeleccionado == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = scanner.nextInt();

        if (productoSeleccionado.reducirCantidad(cantidad)) {
            System.out.println("Compra realizada con éxito.");
        } else {
            System.out.println("No hay suficiente stock disponible.");
        }
    }
}
