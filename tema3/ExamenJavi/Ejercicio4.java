package tema3.ExamenJavi;

import java.util.Arrays;

public class Ejercicio4 {
    
    public static void pintarTablero(String tablero[][]) {
        for(String linea[]: tablero) {
            System.out.println(Arrays.toString(linea));
        }
    }

    public static void colocarBarco(int x, int y, String direccion, int longitud, String letra, String tablero[][]) {

        if (comprobarBarco(x, y, direccion, longitud, tablero)) {
            int dx = 0;
            int dy = 0;
            switch (direccion) {
                case "arriba":
                    dx = -1;
                    break;
                case "abajo":
                    dx = 1;
                    break;
                case "derecha":
                    dy = 1;
                    break;
                case "izquierda":
                    dy = -1;
                    break;
            
                default:
                    break;
            }

            int a = x;
            int b = y;
            for(int i=0; i < longitud; i++) {
                tablero[a][b] = letra;
                a += dx;
                b += dy;
            }
        } else {
            System.out.println("No se puede poner barco");
        }
        

    }

    public static boolean colocarBarco2(int x, int y, String direccion, int longitud, String letra, String tablero[][]) {

        int dx = 0;
        int dy = 0;
        switch (direccion) {
            case "arriba":
                dx = -1;
                break;
            case "abajo":
                dx = 1;
                break;
            case "derecha":
                dy = 1;
                break;
            case "izquierda":
                dy = -1;
                break;
        
            default:
                break;
        }

        int a = x;
        int b = y;

        try {
            for(int i=0; i < longitud; i++) {
                if (tablero[a][b].equals("a")) {}
                a += dx;
                b += dy;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No puedo colocar barco");
            return false;
        }

        a = x;
        b = y;

        try {
            for(int i=0; i < longitud; i++) {
                tablero[a][b] = letra;
                a += dx;
                b += dy;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No puedo colocar barco");
            return false;
        }
        
        
        return true; 
    }

    public static boolean comprobarBarco(int x, int y, String direccion, int longitud, String tablero[][]) {
        boolean sePuede = true;

        switch (direccion) {
            case "arriba":
                if (x - longitud < 0)
                    return false;
                break;
            case "abajo":
                if (x + longitud > tablero.length)
                    return false;
                break;
            case "derecha":
                if (y + longitud > tablero.length)
                    return false;
                break;
            case "izquierda":
                if (y - longitud < 0)
                    return false;
                break;
        
            default:
                break;
        }


        return sePuede;
    }

    public static boolean disparar(int x, int y, String tablero[][]) {

        if (tablero[x][y].equals("a")) {
            tablero[x][y] = "x";
            return false;
        } else {
            tablero[x][y] = "x";
            return true;
        }

    }


    public static void main(String[] args) {
        
        String tablero[][] = new String[10][10];

        for(int i=0; i<tablero.length; i++) {
            Arrays.fill(tablero[i], "a");
        }

        pintarTablero(tablero);
        System.out.println();

        colocarBarco(3,3, "abajo", 4, "p", tablero );

        pintarTablero(tablero);

        colocarBarco(4,4, "derecha", 4, "c", tablero );
        
        System.out.println();
        pintarTablero(tablero);

        colocarBarco(8,8, "abajo", 3, "s", tablero );
        colocarBarco(1,8, "arriba", 3, "s", tablero );
        colocarBarco(8,8, "derecha", 3, "s", tablero );
        colocarBarco(8,1, "izquierda", 3, "s", tablero );
        
        System.out.println();
        pintarTablero(tablero);

        System.out.println(disparar(4,4,tablero));
        System.out.println(disparar(0,0, tablero));

        System.out.println();
        pintarTablero(tablero);

    }
}
