package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max) throws Exception {
        //Si min > max, lanzamos Exception "min debe ser menor que max"
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }

        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }


    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime el tamaño del array");
            int size = Integer.parseInt(sc.nextLine());
            System.out.println("Dime el número en que quieres que estén acabados");
            int num = Integer.parseInt(sc.nextLine());

            int numeros[] = new int[size];

            for(int i=0; i < numeros.length; i++) {
                numeros[i] = generarNumero(1,300);
            }

            System.out.println( Arrays.toString(numeros) );

            int numerosAcabadosEn[] = new int[size];
            int posicion=0;
            for(int i=0; i < numeros.length; i++) {
                //I want to know if numeros[i] ends with num
                if (numeros[i] % 10 == num) {
                    numerosAcabadosEn[posicion] = numeros[i];
                    posicion++;
                }
            }

            System.out.println( Arrays.toString(numerosAcabadosEn));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
