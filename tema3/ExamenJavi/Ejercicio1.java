package tema3.Examen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * Método para rellenar la matriz con valores aleatorios del 1 al 100
     * @param matriz
     */
    public static void rellenarMatriz(int matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
    }

        public static void pintarMatriz(int matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void intercambiarFilas(int fila1, int fila2, int matriz[][]) {
        int tempFila[] = matriz[fila1];
        matriz[fila1] = matriz[fila2];
        matriz[fila2] = tempFila;
    }

    public static int[] sumaDiagonales(int matriz[][]) {
        int sumaDiagonales[] = new int[2];

        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                if (i == j) {
                    sumaDiagonales[0] += matriz[i][j];
                } else if ( j == matriz.length - i) {
                    sumaDiagonales[1] += matriz[i][j];
                }
            }
        }

        return sumaDiagonales;
    }

    public static int[] maximo(int matriz[][]) {
        int max = -1;
        int resultado[] = new int[3];

        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];

                    resultado[0] = max;
                    resultado[1] = i;
                    resultado[2] = j;
                }
            }
        }

        return resultado;
    }

    public static int[][] traspuesta(int matriz[][]) {
        int matrizT[][] = new int[5][5];

        for(int i=0; i<matriz[0].length; i++) {
            for(int j=0; j<matriz.length; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }

        return matrizT;
    }

    public static void main(String[] args) {
        int opcion=0;

        int matriz[][] = new int[5][5];

        rellenarMatriz(matriz);
        pintarMatriz(matriz);

        try {
            Scanner sc = new Scanner(System.in);

            while (opcion != 7) {

                System.out.println("1. Intercambiar fila");
                System.out.println("2. Suma columna");
                System.out.println("3. Suma diagonal");
                System.out.println("4. Pintar coordenadas");
                System.out.println("5. Pintar traspuesta");
                System.out.println("6. Ordenar filas");
                System.out.println("7. Salir");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        int fila1=0, fila2=0;
                        
                        System.out.println("Dime la primera fila");
                        fila1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Dime la segunda fila");
                        fila2 = Integer.parseInt(sc.nextLine());

                        intercambiarFilas(fila1,fila2,matriz);

                        pintarMatriz(matriz);
                        break;
                    case 2:
                        int columna=0;
                        int suma=0;
                        System.out.println("Dime la columna");
                        columna = Integer.parseInt(sc.nextLine());

                        for(int i=0; i < matriz.length; i++)
                            suma += matriz[i][columna];

                        System.out.println("La suma de la columna " + columna + " es " + suma);
                        break;
                    case 3:
                        int diagonales[] = sumaDiagonales(matriz);
                        System.out.println("Suma Dp = "+ diagonales[0] + " Di = " + diagonales[1]);
                        break;
                    case 4:
                        int maximo[] = maximo(matriz);
                        System.out.println("El valor máximo es " + maximo[0] + " y está en " + maximo[1]+ " - " + maximo[2]);
                        break;
                    case 5:
                        int matrizT[][] = traspuesta(matriz);
                        pintarMatriz(matrizT);
                        break;
                    case 6:
                        for(int i=0; i<matriz.length; i++)
                            Arrays.sort(matriz[i]);

                        pintarMatriz(matriz);                            
                        break;
                    case 7:
                        System.out.println("Adiós");
                        break;

                        
                    default:
                        break;
                }


            }            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        
    }
}
