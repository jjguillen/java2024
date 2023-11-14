package tema3.ClaseArrays;

import java.util.Arrays;

public class ArraysBinarySearch {
    
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
        int numeros[] = new int[100];

        //Rellenamos el array
        for(int i=0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        //Pintamos el array
        System.out.println( Arrays.toString(numeros) );
        
        //Buscar el número 96 en el array numeros
        int posicion;
        posicion = buscarNormal(numeros, 96);

        if (posicion != -1) {
            System.out.println("Encontrado, está en la posición " + posicion + " y es " + numeros[posicion]);
        } else {
            System.out.println("Ese número no está en el array");
        }

        //Búsqueda binaria
        Arrays.sort(numeros);

        System.out.println( Arrays.toString(numeros) );

        posicion = Arrays.binarySearch(numeros, 96);

        if (posicion >= 0) {
            System.out.println("Encontrado, está en la posición " + posicion + " y es " + numeros[posicion]);
        } else {
            System.out.println("Ese número no está en el array");
        }

    }
}
