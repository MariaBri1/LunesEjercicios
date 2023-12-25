import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número : ");
        int numero = scanner.nextInt();
        
        int numAntiguo = numero;
        int suma = 0;

        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos de " + numAntiguo + " es: " + suma);
    }
}
