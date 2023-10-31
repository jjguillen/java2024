package tema2.pruebaclase;

import java.util.Scanner;

public class Palotes {
    
    /**
     * Return number of digits of an integer
     * @param n
     * @return
     */
    public static int calcularNumeroDigitos(int n) {
        int resultado = 0;

        while(n > 0) {
            n = n / 10;
            resultado++;
        }

        return resultado;
    }

    public static void pintarPalotes(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("|");
        }
    }

    public static void convierteEnPalotes(int n) {
        int resto=1;
        int numeroDigitos=0;
        int digito;

        numeroDigitos = calcularNumeroDigitos(n);
        
        for(int i=numeroDigitos-1; i>=0; i--) {
            digito = (int) ( n / Math.pow(10, i) );
            n = (int) (n - (digito * Math.pow(10, i)));

            //System.out.println(n + " - " + digito);
            pintarPalotes(digito);

            if  (i!=0) {                
                System.out.print("-");
            } else {
                if (digito == 0) {
                    System.out.print("-");
                }
            }
                
        }
        


    }



    public static void main(String[] args) {
        
        int numero;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            numero = Integer.parseInt(sc.nextLine());

            convierteEnPalotes(numero);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }





    }
}
