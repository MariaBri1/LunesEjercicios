import java.util.Scanner;


public class AreaCirculo {
    public static void main(String[] args) {
        //Area de un circulo
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio=scanner.nextDouble();

        final double PI = Math.PI;

        double area = PI * Math.pow(radio, 2);

        System.out.print("El área del círculo con radio " + radio + " es: " + area);

        scanner.close();
    }
}