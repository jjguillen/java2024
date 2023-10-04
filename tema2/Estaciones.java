package tema2;
import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {
        int mes;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el mes (1-12)");
        mes = sc.nextInt();

        switch (mes) {
            case 3,4,5:
                System.out.println("Primavera");
                break;
            case 6,7,8:
                System.out.println("Verano");
                break;
            case 9,10,11:
                System.out.println("Otoño");
                break;
            case 12,1,2:
                System.out.println("Invierno");
                break;
            default:
                break;
        }

        switch (mes) {
            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Otoño");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Invierno");
                break;
            default:
                break;
        }

    }
}
