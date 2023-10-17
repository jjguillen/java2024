package tema2.funciones;

import java.util.Scanner;

public class primeroejemplo {
    
    /**
     * Función que pinta una cara sonriente
     */
    public static void caraSonriente(long cantidad) {
        for(long i=0; i<cantidad; i++) {
            System.out.print(";)");
        }
        System.out.println();
    }

    /**
     * Devuelve el número mayor de los dos argumentos
     * @param num1
     * @param num2
     * @return Un int con el mayor de los dos números
     */
    public static int mayor(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }


    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        /*
        System.out.println("Dime el número de caras que quires que pinte");

        long cantidadCaras = sc.nextLong();

        caraSonriente(cantidadCaras);
        */

        int numero1,numero2,numero3, numero4;

        System.out.println("Dime el primer número");
        numero1 = sc.nextInt();

        System.out.println("Dime el segundo número");
        numero2 = sc.nextInt();

        System.out.println("Dime el tercer número");
        numero3 = sc.nextInt();

        System.out.println("Dime el cuarto número");
        numero4 = sc.nextInt();

        System.out.println("El mayor es " + mayor( mayor(numero1, numero2), mayor(numero3, numero4) ) );
        
        mayor(1,2);
        mayor(numero1, numero2);
        mayor( (int) Math.pow(3,3), (int) Math.pow(4,2));












        

       

    }
}
