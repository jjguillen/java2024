package tema2;
import java.util.Scanner;

public class ViajeDeEstudios {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numAlumnos, costeTotal=0;
        System.out.println("Dime el número de alumnos que van al viaje");
        numAlumnos = sc.nextInt();

        //Comprobar cada caso
        if (numAlumnos >= 100) {
            costeTotal = numAlumnos * 65;
        } else if ( numAlumnos >= 50 && numAlumnos <= 99) {
            costeTotal = numAlumnos * 70;
        } else if (numAlumnos >= 30 && numAlumnos <= 49) {
            costeTotal = numAlumnos * 95;
        } else if (numAlumnos < 30) {
            costeTotal = 4000;
        }

        System.out.println("El coste total del viaje es " + costeTotal + "€");
        System.out.println("El coste por alumno es: " + (costeTotal / numAlumnos)  + "€");


    }
}
