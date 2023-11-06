package tema2.repaso;

public class Ejercicio12 {
    
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
        
        int tirada1=0, tirada2=0, tirada3=0, tirada4=0;
        int contador=0;

        do {
            tirada1 = generarNumero(1,6);
            tirada2 = generarNumero(1,6);
            tirada3 = generarNumero(1,6);
            tirada4 = generarNumero(1,6);
            contador++;

        } while ( !( tirada1 == tirada2 && tirada2 == tirada3 && tirada1 == tirada3 && tirada1 == tirada4) );


        System.out.println("Tirada: " + tirada1 + ", " + tirada2 + ", " + tirada3 + ", " + tirada4);
        System.out.println("Intentos: " + contador);
    }
}
