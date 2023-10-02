package tema2;
import java.util.Scanner;

public class UserPass {
    
    public static void main(String[] args) {
        //1. Declarar variables
        String user, passwd;

        //2. Leer de teclado los dos valores
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime nombre de usuario: ");
        user = sc.nextLine();

        System.out.println("Dime password: ");
        passwd = sc.nextLine();

        //3. Comprobar si son igual a "pepe" el usuario y el password a "12345678"
        if ( (user.equals("pepe")) && (passwd.equals("12345678")) ) {
            System.out.println("Bienvenido a COD2, entrando al juego .....");
        } else {
            System.out.println("Error en las credenciales");
        }




    }
}
