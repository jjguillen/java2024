package arrayList;
import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<String> palabras; //Definir el ArrayList
        palabras = new ArrayList<String>(); //Creación del ArrayList

        palabras.add("hola");
        palabras.add("mundo");

        System.out.println(palabras);

        palabras.add("cruel");

        System.out.println(palabras);

        palabras.remove(1);

        System.out.println(palabras);

        System.out.println(palabras.get(1));

        palabras.set(0, "Hola");

        System.out.println(palabras);

        palabras.clear();

        System.out.println(palabras);


    }
}
