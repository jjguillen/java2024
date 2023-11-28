package tema3.pruebaEvaluable;

import java.util.Arrays;

public class ajedrez {

    public static void pintar(String tablero[][]) {
        for(int i=0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
    }

    public static String[] coordenadasAjedrez(int i, int j) {
        int coordX;
        char coordY;

        //Array resultado
        String[] coordenadaResultado = new String[2];

        //Comprobar que la i y la j estén entre 0 y 7
        if ( (i>=0 && i<=7) && (j>=0 && j<=7) ) {
            coordX = (8 - i);
            coordY = (char) (97 + j);
            coordenadaResultado[0] = Integer.toString(coordX);
            coordenadaResultado[1] = Character.toString(coordY);
        } else {
            System.out.println("Coordenadas inválidas");
        }

        return coordenadaResultado;
    }

    public static void main(String[] args) {
        //Tablero
        String tablero[][] = new String[8][8];
        
        //Rellenamos con W y B
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                //Filas pares empiezan por W
                if (i % 2 == 0) {
                    //Si es par una W, si es impar una B
                    if (j % 2 == 0) {
                        tablero[i][j] = "WW";
                    } else {
                        tablero[i][j] = "BB";
                    }
                }

                //Filas impares empiezan por B
                if (i % 2 != 0) {
                    //Si es par una W, si es impar una B
                    if (j % 2 == 0) {
                        tablero[i][j] = "BB";
                    } else {
                        tablero[i][j] = "WW";
                    }
                }
            }
        }

        //Ponemos las piezas en su sitio
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                //Peones
                if (i == 1) {
                    tablero[i][j] = "IN";
                }
                if (i == 6) {
                    tablero[i][j] = "IB";
                }
                //Torres
                if ( (i==0 && j==0) || (i==0 && j==7) ) {
                    tablero[i][j] = "TN";
                }
                if ((i==7 && j==0) || (i==7 && j==7)) {
                    tablero[i][j] = "TB";
                }
                //Caballos
                if ( (i==0 && j==1) || (i==0 && j==6) ) {
                    tablero[i][j] = "LN";
                }
                if ((i==7 && j==1) || (i==7 && j==6)) {
                    tablero[i][j] = "LB";
                }
                //Alfiles
                if ( (i==0 && j==2) || (i==0 && j==5) ) {
                    tablero[i][j] = "XN";
                }
                if ((i==7 && j==2) || (i==7 && j==5)) {
                    tablero[i][j] = "XB";
                }
                //Queen
                if ( i==0 && j==3 ) {
                    tablero[i][j] = "ON";
                }
                if (i==7 && j==3) {
                    tablero[i][j] = "OB";
                }
                //King
                if (i==0 && j==4)  {
                    tablero[i][j] = "+N";
                }
                if (i==7 && j==4) {
                    tablero[i][j] = "+B";
                }
            }
        }

    

        pintar(tablero);

        String coord[] = coordenadasAjedrez(7, 7);
        System.out.println(Arrays.toString(coord));





    }
}
