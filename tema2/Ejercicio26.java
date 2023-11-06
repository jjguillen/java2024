package tema2;

public class Ejercicio26 {

    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max) {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }


    public static void main(String[] args) {
       
        int numero=0;
        for(int i=0; i<8; i++) {
            numero = generarNumero(33, 125);
            System.out.print((char) numero);
        }

       

        System.out.println();


    }

}
