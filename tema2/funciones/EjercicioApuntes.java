package tema2.funciones;
import java.util.Scanner;

public class EjercicioApuntes {
    
    /**
     * Función que dice si el segundo número es múltiplo del primer número
     * @param n1
     * @param n2
     * @return un booleano indicando si es múltiplo o no
     */
    public static boolean calcularEsMultiplo(int n1, int n2) {
        if (n1 % n2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int numero1, numero2;
        boolean esMultiplo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número ");
        numero1 = sc.nextInt();
        System.out.println("Dime otro número ");
        numero2 = sc.nextInt();

        //Decir si numero2 es múltiplo de número1
        esMultiplo = calcularEsMultiplo(numero1, numero2);
        System.out.println("El número " + numero2 + " es múltiplo de " + numero1 + " -> " + esMultiplo);

        //Decir si numero1 es múltiplo de número2
        esMultiplo = calcularEsMultiplo(numero2, numero1);
        System.out.println("El número " + numero1 + " es múltiplo de " + numero2 + " -> " + esMultiplo);



    }
}
