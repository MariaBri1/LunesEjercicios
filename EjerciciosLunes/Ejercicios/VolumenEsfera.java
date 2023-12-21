import java.util.Scanner;

public class VolumenEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio de la esfera: ");
        double radio=scanner.nextDouble();

        final double PI = Math.PI;
        final float numero=4/3;

        double volumen = numero* PI * Math.pow(radio, 3);

        System.out.print("El volumen de la esfera con radio " + radio + " es: " + volumen);

        scanner.close();
    }
}
