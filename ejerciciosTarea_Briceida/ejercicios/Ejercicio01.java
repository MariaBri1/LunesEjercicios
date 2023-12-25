import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        Contador de números pares
Descripción: Itera sobre los números del 1 al 50 e imprime solo los números pares.
         */

        System.out.println("Se mostrara los numeros pares los cuales son los siguientes :");

        int i = 1;


        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
