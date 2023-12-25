public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Ejercicio 2: Suma de números impares
Descripción: Suma todos los números impares del 1 al 100.
         */
        int sumaImpar=0;


        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0){
                sumaImpar+= i;
            }
        }

        System.out.println("La suma de los numeros del 1 al 100 es : "+sumaImpar);
    }
}
