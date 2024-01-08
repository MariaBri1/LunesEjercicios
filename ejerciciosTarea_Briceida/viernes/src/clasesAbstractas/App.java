package clasesAbstractas;
import java.lang.module.FindException;
import java.util.Scanner;


public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese la figura que desea (1. Cuadrado, 2. Círculo): ");
            int opcionFigura = scanner.nextInt();

            Figura figura = null;

            if (opcionFigura == 1) {
                //  cuadrado
                System.out.print("Ingrese el color del cuadrado: ");
                String colorCuadrado = scanner.next();
                System.out.print("Ingrese el lado del cuadrado: ");
                float ladoCuadrado = scanner.nextFloat();

                figura = new Cuadrado(colorCuadrado, ladoCuadrado);
            } else if (opcionFigura == 2) {
                //  círculo
                System.out.print("Ingrese el color del círculo: ");
                String colorCirculo = scanner.next();
                System.out.print("Ingrese el radio del círculo: ");
                float radioCirculo = scanner.nextFloat();

                figura = new Circulo(colorCirculo, radioCirculo);
            } else {
                System.out.println("Opción no válida. Saliendo del programa.");
                System.exit(0);
            }

            // Menú
            int opcion;
            do {
                System.out.println("\n--- Menú ---");
                System.out.println("1. Mostrar color");
                System.out.println("2. Mostrar área");
                System.out.println("3. Mostrar perímetro");
                System.out.println("4. Salir");
                System.out.print("Ingrese la opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Color de la figura: " + figura.getColor());
                        break;
                    case 2:
                        System.out.println("Área de la figura: " + figura.area());
                        break;
                    case 3:
                        System.out.println("Perímetro de la figura: " + figura.perimetro());
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 4);

            scanner.close();
        }
    }