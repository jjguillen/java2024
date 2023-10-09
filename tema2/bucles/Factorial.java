package tema2.bucles;

public class Factorial {
    
    public static void main(String[] args) {
        //El factorial de un número es la multiplicacion de todos los anteriores
        //Factorial de 7 es 1x2x3x4x5x6x7

        //Número del que queremos saber el factorial
        int numero = 7;

        //Acumulador de multiplicaciones
        double factorial = 1;

        for(int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
