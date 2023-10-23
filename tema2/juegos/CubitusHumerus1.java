package tema2.juegos;

import java.util.Scanner;

public class CubitusHumerus1 {
    
    /**
     * Función que simula la tirada de un dado de 10 caras
     * @return un valor aleatorio entre 1 y 10
     */
    public static int generarTirada() {
        int tirada;

        tirada = (int) (Math.random() * 10 ) + 1;

        return tirada;
    }

    public static void main(String[] args) {
        int tirada1, tirada2;
        int totalJugador1=0, totalJugador2=0;
        int totalEmpate=0;
        int turnos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime los turnos que váis a jugar: ");
        turnos = sc.nextInt();

        for(int i=1; i<=turnos; i++) {
            System.out.println("Turno " + i);
            
            tirada1 = generarTirada();
            tirada2 = generarTirada();

            System.out.println("Cubitus (j1): " + tirada1 + " Humerus (j2): " + tirada2);

            //Calcular ganador
            
            if (tirada1 > tirada2) {   //Gana jugador1 Cubitus
                System.out.println("Este turno lo gana Cubitus");
                totalJugador1 = totalJugador1 + (tirada1 + tirada2);
                if (totalEmpate > 0) {
                    totalJugador1 = totalJugador1 + totalEmpate;
                    totalEmpate = 0;
                }

            } else if (tirada2 > tirada1) {  //Gana jugador2 Humerus
                System.out.println("Este turno lo gana Humerus");
                totalJugador2 = totalJugador2 + (tirada1 + tirada2);

                if (totalEmpate > 0) {
                    totalJugador2 = totalJugador2 + totalEmpate;
                    totalEmpate = 0;
                }

            } else {  //Empate
                totalEmpate = totalEmpate + (tirada1 + tirada2);
            }

            //Pintar el total de cada jugador
            System.out.println("Cubitus lleva " + totalJugador1);
            System.out.println("Humerus lleva " + totalJugador2);
            System.out.println();
        }

        System.out.println("Total de Cubitus " + totalJugador1);
        System.out.println("Total de Humerus " + totalJugador2);

    }
}
