public class Ejercicio06 {

        public static void main(String[] args) {
            System.out.println("Cuadrados perfectos hasta 100:");

            for (int i = 1; i <= 10; ++i) {
                int cuadrado = i * i;

                if (cuadrado <= 100) {
                    System.out.println(cuadrado);
                } else {
                    break;
                }
            }
        }
    }

