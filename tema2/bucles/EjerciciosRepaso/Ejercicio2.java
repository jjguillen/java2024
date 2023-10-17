package tema2.bucles.EjerciciosRepaso;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int cantidadNumeros;
        int numero;
        int cantidadMayorCero=0;
        int cantidadMenorCero=0;
        int cantidadCero=0;
        
        Scanner sc = new Scanner(System.in);        

        //1. Pedir cuántos números vas a introducir
        System.out.println("Dime cuántos números vas a escribir");
        cantidadNumeros = sc.nextInt();

        //2. Pedir por teclado en un bucle todos esos números
        for(int i=0; i < cantidadNumeros; i++) {
            System.out.println("Escribe un número");
            numero = sc.nextInt();

            if (numero > 0) {
                cantidadMayorCero++;
            } else if (numero < 0) {
                cantidadMenorCero++;
            } else if (numero == 0) {
                cantidadCero++;
            }
        }

        //3. Pintar resultados
        System.out.println("Números mayores que cero " + cantidadMayorCero);
        System.out.println("Números menores que cero " + cantidadMenorCero);
        System.out.println("Números iguales que cero " + cantidadCero);


    }
}
