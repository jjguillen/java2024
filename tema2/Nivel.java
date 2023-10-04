package tema2;
import java.util.Scanner;

import javax.swing.text.Style;

public class Nivel {
    
    public static void main(String[] args) {
       int num;

       Scanner sc = new Scanner(System.in);
       System.out.println("Dime el nivel (1-5): ");

       num = sc.nextInt();

       if (num == 1) {
            System.out.println("Iniciado");
       } else if (num == 2) {
            System.out.println("Amateur");
       } else if (num == 3) {
            System.out.println("Profesional");
       } else if (num == 4) {
            System.out.println("Experto");
       } else if (num == 5) {
            System.out.println("Nivel Dios");
       } else {
            System.out.println("Nivel incorrecto");
       }


       switch (num) {
        case 1:
            System.out.println("Iniciado");
            break;
        case 2:
            System.out.println("Amateur");
            break;
        case 3:
            System.out.println("Profesional");
            break;
        case 4:
            System.out.println("Experto");
            break;
        case 5:
            System.out.println("Nivel Dios");
            break;
        default:
            System.out.println("Nivel incorrecto");
            break;
       }

       

    }
}
