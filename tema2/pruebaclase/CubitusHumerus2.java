package tema2.pruebaclase;

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
        int tirada=0;
        int totalJ1=0, totalJ2=0;
        int totalPartidasJ1=0, totalPartidasJ2=0;


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime cuántos turnos vais a jugar");
            turnos = Integer.parseInt(sc.nextLine());   
            
            for(int i=0; i<turnos; i++) {
                totalJ1 = 0;
                totalJ2 = 0;

                //Sumo dados impares de J1
                System.out.print("Tirada J1 -> ");
                for(int j=0; j<4; j++) {
                    tirada = generarNumero(1,6);
                    if ( tirada % 2 != 0) {
                        totalJ1 = totalJ1 + tirada;
                    }
                    System.out.print(tirada+", ");
                }
                System.out.println();
                System.out.println("Total= "+ totalJ1);

                //Sumo dados pares de J2
                System.out.print("Tirada J2 -> ");
                for(int j=0; j<3; j++) {
                    tirada = generarNumero(1,6);
                    if ( tirada % 2 == 0) {
                        totalJ2 = totalJ2 + tirada;
                    }
                    System.out.print(tirada+", ");
                }
                System.out.println();
                System.out.println("Total= "+ totalJ2);

                //Quién gana
                if (totalJ1 > totalJ2) {
                    totalPartidasJ1++;
                } 
                if (totalJ2 > totalJ1) {
                    totalPartidasJ2++;
                }

                System.out.println();
                
            }


            if (totalPartidasJ1 > totalPartidasJ2)
                System.out.println("Gana J1");
            else
                System.out.println("Gana J2");
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        


    }
}
