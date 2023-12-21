public class Calculadora {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        // SUMA
        int suma = num1 + num2;
        //RESTA
        int resta = num1 - num2;
        //MULTIPLICACION
        int multiplicacion = num1 * num2;

        // DIVISION
        int division = 0;
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            System.out.println("No se puede dividir entre cero");
        }

        // IMPRESION
        System.out.println("******* Operaciones Matemáticas *******");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        if (num2 != 0) {
            System.out.println("División: " + division);
        }
    }
}
