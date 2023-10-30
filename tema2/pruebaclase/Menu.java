package tema2.pruebaclase;

import java.util.Scanner;

public class Menu {

    /**
     * Suma los dígitos de un número
     * @param numero
     * @return
     */
    public static int sumaDigitos(int numero) {
        int resultado = 0;
        int resto=1;

        while(resto > 0) {
            resto = numero % 10;
            resultado = resultado + resto;
            numero = numero / 10;
        }

        return resultado;
    }

    /**
     * Devuelve si el número pasado como parámetro es primo o no
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {
        boolean esPrimo=true;

        for(int i=2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        return esPrimo;
    }


    /**
     * Devuelve la longitud de la circunferencia cuyo radio es número
     * @param numero
     * @return
     */
    public static double longitudCircunferencia(int numero) {
        double longitud=0;

        longitud = Math.PI * numero * 2;

        return longitud;
    }



    public static void main(String[] args) {
        
        int numero=0;
        int opcion=0;
        Scanner sc;

        try {
            sc = new Scanner(System.in);
            System.out.println("Dime un número de varias cifras:");
            numero = Integer.parseInt(sc.nextLine());   
            
            while (opcion != 4) {
                //Pintar opciones
                System.out.println("1. Suma de dígitos");
                System.out.println("2. Es número primo");
                System.out.println("3. Longitud circunferencia");
                System.out.println("4. Salir");

                //Leer de teclado la opción elegida
                System.out.println("Dime una opción:");
                opcion = Integer.parseInt(sc.nextLine());

                //Switch con la opción elegida
                switch (opcion) {
                    case 1:
                        int suma = sumaDigitos(numero);
                        System.out.println("La suma es: " + suma);
                        break;
                
                    case 2:
                        boolean esPrimo = esPrimo(numero);
                        if (esPrimo)
                            System.out.println(numero + " es primo");
                        else
                            System.out.println(numero + " no es primo");
                        
                        break;
                    case 3:
                        double longitud = longitudCircunferencia(numero);
                        System.out.println("La longitud de la circunferencia de radio " + numero + " es " + longitud);
                        break;
                    case 4:
                        System.out.println("Hasta la próxima");
                    default:
                        System.out.println("Opción no válida, elige un número entre 1 - 4");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error leyendo de teclado: " + e.getMessage());
        }

       





    }
}
