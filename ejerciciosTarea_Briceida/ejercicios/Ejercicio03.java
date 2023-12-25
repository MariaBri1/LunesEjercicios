public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        Ejercicio 3: Tabla de multiplicar
Descripción: Genera la tabla del 5 hasta el producto de 5x10.
         */

        System.out.println("Tabla de multiplicar del 5:");

        int num = 5;
        
        for (int i = 1; i <= 10; ++i) {
            int producto = num * i;
            System.out.println(num + " * " + i + " = " + producto);
        }
    }
}
