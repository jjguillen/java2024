package tema2.pruebaclase;

import java.util.Scanner;

public class CubitusHumerus1 {

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

    public static int maximo2(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static int minimo2(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static int maximo(int a, int b, int c, int d, int e) {
        return maximo2( maximo2( maximo2(a,b), maximo2(c,d)) , e);
    }

    public static int minimo(int a, int b, int c, int d, int e) {
        return minimo2( minimo2( minimo2(a,b), minimo2(c,d)) , e);
    }



    public static void main(String[] args) {
        
        int t1J1, t2J1, t3J1, t4J1, t5J1;
        int t1J2, t2J2, t3J2, t4J2, t5J2;
        int maxJ1=0, maxJ2=0;
        int minJ1=7, minJ2=7;
        int totalJ1=0, totalJ2=0;
        int totalPartJ1=0, totalPartJ2=0;
        int turnos=0;

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Dime los turnos que váis a jugar");
            turnos = Integer.parseInt(sc.nextLine());

            for(int i=0; i<turnos; i++) {

                t1J1 = generarNumero(1,6);
                t2J1 = generarNumero(1,6);
                t3J1 = generarNumero(1,6);
                t4J1 = generarNumero(1,6);
                t5J1 = generarNumero(1,6);

                t1J2 = generarNumero(1,6);
                t2J2 = generarNumero(1,6);
                t3J2 = generarNumero(1,6);
                t4J2 = generarNumero(1,6);
                t5J2 = generarNumero(1,6);

                maxJ1 = maximo(t1J1, t2J1, t3J1, t4J1, t5J1);
                maxJ2 = maximo(t1J2, t2J2, t3J2, t4J2, t5J2);
                minJ1 = minimo(t1J1, t2J1, t3J1, t4J1, t5J1);
                minJ2 = minimo(t1J2, t2J2, t3J2, t4J2, t5J2);

                totalJ1 = t1J1 + t2J1 + t3J1 + t4J1 + t5J1 - (maxJ1 + minJ1);
                totalJ2 = t1J2 + t2J2 + t3J2 + t4J2 + t5J2 - (maxJ2 + minJ2);

                System.out.println("Tirada J1 " + t1J1 + ", " + t2J1 + ", " + t3J1 + ", " + t4J1 + ", " + t5J1 + " -> " + totalJ1);
                System.out.println("Tirada J2 " + t1J2 + ", " + t2J2 + ", " + t3J2 + ", " + t4J2 + ", " + t5J2 + " -> " + totalJ2);

                //El que más puntuación saca gana la partida, e incremento su contador de partidas
                if (totalJ1 > totalJ2)
                    totalPartJ1++;
                if (totalJ2 > totalJ1)
                    totalPartJ2++;

                System.out.println();                
            }

            if (totalPartJ1 > totalPartJ2)
                System.out.println("Gana J1");
            else
                System.out.println("Gana J2");


        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }


    }
}
