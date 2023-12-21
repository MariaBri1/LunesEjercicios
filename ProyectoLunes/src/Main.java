
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  /*      int vidas=1;
        char valor='1';
        String nombre="george";

        System.out.println("vidas = " + vidas);
        System.out.println(valor);
        System.out.println(nombre);

        short num1=32767;
        byte num2=127;

        float alturaM=1.7f;
*/
        //Imprimir info
        String nombre="Briceida";
        String apellido="Baldeon";
        byte edad=18;
        String ciudad="Lima";
        float altura=1.71f;

        System.out.println("Me llamo " + nombre + " y me apellido "
                + apellido + " , tengo " + edad +" años de edad "
                + " soy de la ciudad de " + ciudad + " y mido " + altura );
        
        //operaciones con variables 
        
        int num1=10;
        int num2=20;

        //suma
        int resultado=num1 + num2;
        System.out.println("resultado = " + resultado);
        //resta
        int resultado2=num1 - num2;
        System.out.println("resultado 2= " + resultado2);

        num1 = num1+5;
        System.out.println("num1 = " + num1);


        String str1="hola";
        String str2="mundo";
        String result=str1+" "+str2;

        System.out.println("result = " + result);

        //constantes
        final float PI=3.14f;
        
        num1=10;
        num2=5;

        float resultadoDiv= (float) num1/num2;
        System.out.println("resultadoDiv = " + resultadoDiv);


        float num1f=10;
        float num2f=0;

        float resultadoDivf=  num1f/num2f;
        System.out.println("resultadoDiv f= " + resultadoDivf);

        //operador modulo
        num1=10;
        num2=3;
        System.out.println(num1%num2);
        
        
        //calcule el area de un rectangulo
        
        float base=10f;
        float altura1= 20f;
        float area=base*altura;

        System.out.println("El area es = " + area);


        //calcule el area de un rectangulo

        float baseTriangulo=10f;
        float alturaTriangulo= 20f;
        float areaTriangulo= (base*altura)/2;

        System.out.println("El area es = " + area);
        
        
    }
}