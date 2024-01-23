package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList2 {

    public static void main(String[] args) {

        //Otras formas de iniciar una ArrayList con datos
        ArrayList<Integer> numeros = new ArrayList<>( Arrays.asList(1,2,3,4,5,6) );
        ArrayList<String> palabras = new ArrayList<>() {
            {
                add("Hola");
                add("Mundo");
            }
        };

        System.out.println(numeros);
        System.out.println(palabras);
    }
}
