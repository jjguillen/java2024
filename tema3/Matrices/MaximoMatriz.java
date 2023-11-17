package tema3.Matrices;

public class MaximoMatriz {
    

    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maximoMatriz(int matriz[][]) {

        int maximo = -1;
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                //Check max
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }

        return maximo;
    }


    public static void main(String[] args) {
        

        int tabla[][] = new int[5][5];

        for(int i=0; i < tabla.length; i++) {            //FILAS
            for(int j=0; j < tabla[0].length; j++) {     //COLUMNAS                    
                tabla[i][j] = generarNumero(100, 500);
            }
        }

        pintarMatriz(tabla);

        System.out.println( maximoMatriz(tabla));
    }
}
