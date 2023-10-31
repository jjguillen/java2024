package tema2;

import java.util.Scanner;

public class BusquedaBinaria {
    
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
        
        //Pienso un número
        //El PC genera un número aleatorio entre 1 y 100
        //Yo le digo si es mayor o menor que el que pensado
        //El PC genera un número aleatorio entre (1,generado) o (generado,100)
        //Repertir hasta acertar

        int numeroActual=0;
        int opcion=0;
        int min=1;
        int max=100;
        int contador=0;
        Scanner sc=null;

        System.out.println("Piensa un número de 1 a 100 pero no me lo digas, lo voy a acertar");

        try {
            sc = new Scanner(System.in);

            numeroActual = generarNumero(min, max);
            while (opcion != 1) {
                contador++;
                
                //System.out.println("Generando números entre " + min + " y " + max);
                System.out.println("¿Es tu número el " + numeroActual + "?");

                System.out.println("1. Es el número, acertáste!!!");
                System.out.println("2. Mi número es mayor");
                System.out.println("3. Mi número es menor");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Enhorabuena");
                        break;
                
                    case 2:
                        min = numeroActual+1;
                        numeroActual = generarNumero(min, max);

                        break;

                    case 3:
                        max = numeroActual-1;
                        numeroActual = generarNumero(min, max);

                        break;
                    default:
                        break;
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("He tardado " + contador + " intentos en acertarlo");



    }
}
