package tema3;

public class Arrays1 {
    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static void main(String[] args) {
        
        int notas[] = new int[10000]; //Declaración de array e inicialización de tamaño

        notas[2] = 5;
        //System.out.println(notas[2]);

        int tam = 20;
        double precios[] = new double[tam];


        String nombres[] = new String[10];

        //Rellenar el array
        for(int i=0; i<=9999; i++) {
            notas[i] = generarNumero(1,10);
            System.out.print(notas[i] + " ");
        }
        
        System.out.println(

        );
        //Recorrer al revés
        for(int i=9999; i>=0; i--) {
            System.out.print(notas[i] + " ");
        }



    }
}
