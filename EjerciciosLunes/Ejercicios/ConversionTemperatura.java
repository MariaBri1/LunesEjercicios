import java.util.Scanner;

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en Celsius: ");
        float temperaturaCelsius =scanner.nextFloat();

        final float escala = 9 / 5.0f;
        final float diferenciaEscalas = 32.0f;

        float temperatura= temperaturaCelsius * escala + diferenciaEscalas;

        System.out.println("La temperatura en grados Fahrenheit es: " + temperatura);
    }
}
