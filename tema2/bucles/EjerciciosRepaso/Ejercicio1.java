package tema2.bucles.EjerciciosRepaso;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        int numero=0; //Número que va escribiendo el usuario
        int numeroAdivinar; //Número que tengo que adivinar
        int intentos=0; //Contador para el número de intentos

        Scanner sc = new Scanner(System.in);

        //Adivinar un número que generar el ordenador

        //Generar el número que el usuario debe adivinar
        numeroAdivinar = (int) (Math.random() * 100) - 1;

        while ( numero != numeroAdivinar ) {
            //Cada vez que se repita es un intento
            intentos++;

            //El usuario piensa y escribe un número
            System.out.println("Dime el número que crees que he generado: ");
            numero = sc.nextInt();

            //Ver si es más grande o más pequeño
            if (numero < numeroAdivinar) {
                System.out.println("El número es mayor");
            } else if (numero > numeroAdivinar) {
                System.out.println("El número es menor");
            } else {
                System.out.println("Acertaste");
            }

            if (intentos == 10) {
                System.out.println("Te has pasado de intentos");
                break;
            }
        }

        System.out.println("El número de intentos que has empleado es: " + intentos);


    }
}
