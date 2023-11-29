package tema3.pruebaEvaluable;

import java.util.Arrays;

public class ajedrez {

    public static void pintar(String tablero[][]) {
        for(int i=0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
    }

    /**
     * Transforma coordenadas (0,0) de una matriz a las de ajedrez (1,a)
     * @param i
     * @param j
     * @return
     */
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

    /**
     * Detecta que i y j tienen valores ambas entre 0 y 7
     * @param i
     * @param j
     * @return
     */
    public static boolean posicionValida(int i, int j) {
        boolean valida = true;

        if (i<0 || i>7)
            return false;

        if (j<0 || j>7)
            return false;

        return valida;
    }


    /**
     * 
     * @param i - cx donde quiero mover
     * @param j - cy donde quiero mover
     * @param tablero
     * @return
     * @throws Exception
     */
    public static boolean piezaMismoColor(int i, int j, String tablero[][], String caballo) throws Exception {
        String color = "B";

        //Comprobar i,j son válidas
        if ( (i<0 || i>7) || (j<0 || j>7) ){
            throw new Exception("Coordenadas fuera de tablero");
        }

        //Comprobar que en i,j hay un caballo
        if (caballo != "LB" && caballo != "LN") {
            throw new Exception("No hay un caballo en esas coordenadas");
        }

        //Averiguar color del caballo
        if (caballo == "LB") {
            color = "B";
        }
        if (caballo == "LN") {
            color = "N";
        }

        //Comprobar el color de la casilla a donde voy
        if (tablero[i][j] == "WW" || tablero[i][j] == "BB")
            return false;
                
        String colorPieza = tablero[i][j].substring(1); //Me quedo con B o W
 
        if (colorPieza.equals(color))
            return true;
        else 
            return false;
    }


    /**
     * Dada una coordenada donde hay un caballo, muestra todos los posibles destinos a los que puede mover
     * @param i
     * @param j
     * @param tablero
     */
    public static void pintarMovimientosCaballo(int i, int j, String tablero[][]) throws Exception {

        //Comprobar i,j son válidas
        if ( (i<0 || i>7) || (j<0 || j>7) ){
            throw new Exception("Coordenadas fuera de tablero");
        }

        //Comprobar que en i,j hay un caballo
        if (tablero[i][j] != "LB" && tablero[i][j] != "LN") {
            throw new Exception("No hay un caballo en esas coordenadas");
        }

        //Posibles movimientos del caballo
        //M1
        if (posicionValida(i-2, j-1) && !piezaMismoColor(i-2, j-1, tablero, tablero[i][j])) {
            System.out.println(tablero[i-2][j-1] + "("+ (i-2)+ "," + (j-1) +  ")");
        }

        if (posicionValida(i-2, j+1) && !piezaMismoColor(i-2, j+1, tablero, tablero[i][j]) ) {
            System.out.println(tablero[i-2][j+1] + "("+ (i-2)+ "," + (j+1) +  ")");
        }

        if (posicionValida(i+2, j-1) && !piezaMismoColor(i+2, j-1, tablero, tablero[i][j])) {
            System.out.println(tablero[i+2][j-1] + "("+ (i+2)+ "," + (j-1) +  ")");
        }

        if (posicionValida(i+2, j+1) && !piezaMismoColor(i+2, j+1, tablero, tablero[i][j])) {
            System.out.println(tablero[i+2][j+1] + "("+ (i+2)+ "," + (j+1) +  ")");
        }

        if (posicionValida(i-1, j-2) && !piezaMismoColor(i-1, j-2, tablero, tablero[i][j])) {
            System.out.println(tablero[i-1][j-2] + "("+ (i-1)+ "," + (j-2) +  ")");
        }

        if (posicionValida(i+1, j-2) && !piezaMismoColor(i+1, j-2, tablero, tablero[i][j])) {
            System.out.println("" + tablero[i+1][j-2] + "("+ (i+1)+ "," + (j-2) +  ")");
        }

        if (posicionValida(i-1, j+2) && !piezaMismoColor(i-1, j+2, tablero, tablero[i][j])) {
            System.out.println(tablero[i-1][j+2] + "("+ (i-1)+ "," + (j+2) +  ")");
        }
        
        if (posicionValida(i+1, j+2) && !piezaMismoColor(i+1, j+2, tablero, tablero[i][j])) {
            System.out.println(tablero[i+1][j+2] + "("+ (i+1)+ "," + (j+2) +  ")");
        }


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

        try {
            pintarMovimientosCaballo(7, 6, tablero);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
