import herencia.Book;
import herencia.DVD;
import herencia.Usuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book1= new Book(1,
                "gkgk",   true, "Renato");


        DVD dvs2 = new DVD(2, "dvd1", true,  "Renajkto", (short)120);

        ArrayList<Integer> array =new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(6);
        array.add(98);


    }
}