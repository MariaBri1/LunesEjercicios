import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numero=0,factorial=1;

        System.out.println("Ingrese el nuemro para determinar el factorial: ");
        numero=scanner.nextInt();

        int contador = 1;
        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }

        System.out.println("El factorial de " +numero+" es "+ factorial);

    }
}
