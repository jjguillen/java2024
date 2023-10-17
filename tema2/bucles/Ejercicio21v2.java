package tema2.bucles;

public class Ejercicio21v2 {
    
    public static void main(String[] args) {
        
        int numero = 98765;
        int numeroInvertido = 0;
        
        while (numero != 0) {
            int digito = numero % 10;

            numeroInvertido = numeroInvertido * 10 + digito;

            numero /= 10;
        }
        
        System.out.println("Número invertido: " + numeroInvertido);
    }
}
