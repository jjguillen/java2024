package tema2.bucles;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 0; i < n; i++) {
            //System.out.print("imprimir " + (n-i-1) + " espacios | ");

            for(int j=n-i; j>0; j--) {
                System.out.print(" ");
            }

            for(int j=0; j < i+1; j++) {
                System.out.print("*");
            }

            for(int j=0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
