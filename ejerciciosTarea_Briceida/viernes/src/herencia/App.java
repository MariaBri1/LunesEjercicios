package herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear una instancia de Library y agregar algunos usuarios e items
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<LibraryItem> items = new ArrayList<>();
        Library biblioteca = new Library("Biblioteca Principal", items, usuarios);

        Usuario usuario1 = new Usuario("usuario1", 1);
        Usuario usuario2 = new Usuario("usuario2", 2);

        DVD dvd1 = new DVD(1, "Pelicula1", true, "Director1", (short) 120);
        DVD dvd2 = new DVD(2, "Pelicula2", true, "Director2", (short) 90);

        biblioteca.users.add(usuario1);
        biblioteca.users.add(usuario2);

        biblioteca.libraryItems.add(dvd1);
        biblioteca.libraryItems.add(dvd2);

        Scanner scanner = new Scanner(System.in);

        // Menú interactivo
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Realizar préstamo");
            System.out.println("2. Realizar devolución");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Realizar préstamo
                    System.out.print("Ingrese el ID del usuario: ");
                    int userIdPrestamo = scanner.nextInt();
                    System.out.print("Ingrese el ID del item: ");
                    int itemIdPrestamo = scanner.nextInt();
                    biblioteca.prestamo(itemIdPrestamo, userIdPrestamo);
                    break;
                case 2:
                    // Realizar devolución
                    System.out.print("Ingrese el ID del usuario: ");
                    int userIdDevolucion = scanner.nextInt();
                    System.out.print("Ingrese el ID del item: ");
                    int itemIdDevolucion = scanner.nextInt();
                    biblioteca.devolucion(itemIdDevolucion, userIdDevolucion);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}