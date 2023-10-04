package tema2;
import java.util.Scanner;

public class DiasDelMes {
    
    public static void main(String[] args) {
        
        int mes, dia;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el mes");
        mes = sc.nextInt();
        System.out.println("Dime el día");
        dia = sc.nextInt();

        switch (mes) {
            case 1,3,5,7,8,10,12:  //31 días
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
            //Falta case 30 días
            //Falta case 28 días
            
            default:
                System.out.println("Mes incorrecto");
        }
    }
}
