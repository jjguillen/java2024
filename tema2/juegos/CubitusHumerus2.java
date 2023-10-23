package tema2.juegos;

import java.util.Scanner;

public class CubitusHumerus2 {
    
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
        int turnos=0;
        int tiradaJ1=0;
        int tiradaJ2_1=0, tiradaJ2_2=0, tiradaJ2_3=0, tiradaJ2_4=0;
        int totalJ1=0, totalJ2=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántos turnos vamos a jugar: ");

        try {
            turnos = Integer.parseInt(sc.nextLine());

            for(int i=1; i <= turnos; i++) {
                System.out.println("Turno " + i +  "---------------------------");
                tiradaJ1 = generarNumero(1, 6);
                tiradaJ2_1 = generarNumero(1, 6);
                tiradaJ2_2 = generarNumero(1, 6);
                tiradaJ2_3 = generarNumero(1, 6);
                tiradaJ2_4 = generarNumero(1, 6);

                System.out.println("Tirada Jugador1 -> " + tiradaJ1);
                System.out.println("Tirada Jugador2 -> " + tiradaJ2_1 + ", " + tiradaJ2_2 + ", " + tiradaJ2_3 + ", " + tiradaJ2_4);

                if(tiradaJ1 == tiradaJ2_1 || tiradaJ1 == tiradaJ2_2 || tiradaJ1 == tiradaJ2_3 || tiradaJ1 == tiradaJ2_4) {
                    totalJ2++;
                } else {
                    totalJ1++;
                }
            }

        } catch (Exception ex) {
            System.out.println("No has introducido un número para los turnos a jugar");
        }

        System.out.println("El J1 ha sacado " + totalJ1 + " puntos");
        System.out.println("El J2 ha sacado " + totalJ2 + " puntos");

        

    }
}
