package tema2.bucles;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = n; i > 0; i--) {
            //System.out.println("imprimir " + (i+1) + " asteriscos");

            for(int j=0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
