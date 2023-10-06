package tema2.bucles;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pide una contraseña por teclado mientras su longitud sea menor que 10
        //Pintar la contraseña

        //Usar String, nextLine, cadena.length() -> tamaño

        String password="";
        int longitud=0;

        while (longitud <= 10) {
            System.out.println("Dime password: ");
            password = sc.nextLine();
            longitud = password.length();
        }

        System.out.println(password);














    }
}
