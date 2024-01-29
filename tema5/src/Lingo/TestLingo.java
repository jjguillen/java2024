package Lingo;

import java.util.Scanner;

public class TestLingo {

    public static void pintarArray(String[] letras) {
        for(int i=0; i<letras.length; i++) {
            System.out.println(letras[i]);
        }
    }
    public static void main(String[] args) {

        Lingo juego = new Lingo();
        System.out.println(juego.getPalabraAcertar());

        Scanner sc = new Scanner(System.in);
        String palabraUsuario = "";

        while(true) {
            System.out.println("Introduce tu palabra");
            palabraUsuario = sc.nextLine();

            //Comprobar el número de aciertos
            int numAciertos = juego.comprobar(palabraUsuario);
            if (numAciertos == 5) {
                System.out.println("Enhorabuena");
                break;
            } else {
                System.out.println("Has acertado " + numAciertos + " letras de la palabra");
                System.out.println("Sigue intentándolo");
            }
        }

        /*
        juego.probarLetra("a");
        juego.probarLetra("b");
        if (juego.probarLetra("b")) {
            System.out.println("Ya usada");
        }
        pintarArray(juego.getLetrasUsadas());
        */


    }
}
