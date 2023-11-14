package tema3.ClaseArrays;

import java.util.Arrays;

public class ArraysBinarySearchAnalisis {
    
    /**
     * Método para buscar "valor" en el array numeros
     * @param numeros
     * @param valor
     * @return El índice de la posición en la que está el valor en el array
     *          O devuelve -1 si no lo encuentra
     */
    public static int buscarNormal(int[] numeros, int valor) {

        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return i;
            } 

            /*  Error, porque solo comprueba que el elemento en la posición no el buscado
            else {
                return -1;
            }
            */
        }

        return -1; //No encontrado
    }

    public static void main(String[] args) {
        
        //Creación de array con muchos números
        int numeros[] = new int[10000000];

        //Rellenamos el array
        for(int i=0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10000000) + 1;
        }

        //Pintamos el array
        //System.out.println( Arrays.toString(numeros) );
        
        //Buscar el número 96 en el array numeros
        int posicion;
        long inicio, fin;

        inicio = System.currentTimeMillis();

        posicion = buscarNormal(numeros, 9000006);

        fin = System.currentTimeMillis();
        System.out.println( "Ha tardado " + (fin - inicio) + " milisegundos");


        if (posicion != -1) {
            System.out.println("Encontrado, está en la posición " + posicion + " y es " + numeros[posicion]);
        } else {
            System.out.println("Ese número no está en el array");
        }

        //Búsqueda binaria
        Arrays.parallelSort(numeros);

        //System.out.println( Arrays.toString(numeros) );
        inicio = System.currentTimeMillis();
        posicion = Arrays.binarySearch(numeros, 9000006);
        fin = System.currentTimeMillis();
        System.out.println( "Ha tardado " + (fin - inicio) + " milisegundos");

        if (posicion >= 0) {
            System.out.println("Encontrado, está en la posición " + posicion + " y es " + numeros[posicion]);
        } else {
            System.out.println("Ese número no está en el array");
        }

    }
}
