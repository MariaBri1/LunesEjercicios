public class FlujoControl {
    public static void main(String[] args) {
        boolean check =true;
        boolean check2 =false;

        int i=14;
        int j=14;

        System.out.println(i<j);

        //operador >=
        System.out.println(i>=j);


        //operador ==
        System.out.println("i==j = " + i==j);

        //operador !=
        System.out.println(i!=j);

        //condicional
        if (i<j){
            System.out.println("es mayor" );
        }else {
            System.out.println("es menor" );
        }
    }
}
