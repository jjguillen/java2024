package tema2.excepciones;

public class GenerarAleatorios {
    
    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max) throws Exception {
        //Si min > max, lanzamos Exception "min debe ser menor que max"
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }

        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static void main(String[] args) {
     
        try {
            System.out.println(generarNumero(1,10));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        



    }
}
