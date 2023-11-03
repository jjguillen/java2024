package tema2.repaso;

import java.util.Scanner;

public class Ejercicio7 {
    
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



    public static void imprimirTirada(int numero) {
        switch (numero) {
                case 1:
                    System.out.println("Piedra");
                    break;
                case 2:
                    System.out.println("Papel");
                    break;
                case 3:
                    System.out.println("Tijera");
                    break;
        
                default:
                    break;
            }
    }

    public static void main(String[] args) {
        
        int tirada1=0;
        int tirada2=0;

        int partidas=0;
        int contadorJ1=0;
        int contadorJ2=0;
        int empates=0;


        try {

            Scanner sc = new Scanner(System.in);
            partidas = Integer.parseInt(sc.nextLine());

            for(int i=0; i<partidas; i++) {
                tirada1 = generarNumero(1, 3); //3,2,1
                tirada2 = generarNumero(1, 3);

                imprimirTirada(tirada1);
                imprimirTirada(tirada2);

                // papel - papel    E
                // papel - tijera   2
                // papel - piedra   1
                // tijera - papel   1
                // tijera - tijera  E
                // tijera - piedra  2
                // piedra - papel   2
                // piedra - tijera  1 
                // piedra - piedra  E
                // Piedra = 1, Papel=2, Tijera=3

                //EMPATE    
                if (tirada1 == tirada2) {
                    System.out.println("Empate");
                    empates++;
                }

                //GANA JUGADOR1
                if ( (tirada1 == 2 && tirada2 == 1) || (tirada1 == 3 && tirada2 == 2) || (tirada1 == 1 && tirada2 == 3) ) {
                    System.out.println("Gana jugador 1");
                    contadorJ1++;
                }

                //GANA JUGADOR2
                if ( (tirada1 == 2 && tirada2 == 3) || (tirada1 == 3 && tirada2 == 1) || (tirada1 == 1 && tirada2 == 2) ) {
                    System.out.println("Gana jugador 2");
                    contadorJ2++;
                }
            }
            



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Jugador1 ha ganado " + contadorJ1);
        System.out.println("Jugador2 ha ganado " + contadorJ2);
        System.out.println("Ha habido empates " + empates);

    }
}
