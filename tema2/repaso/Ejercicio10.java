package tema2.repaso;

public class Ejercicio10 {

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
       
        int combinacion=0;
        for(int i=0; i<14; i++) {

            try {
                combinacion = generarNumero(1, 3);

                switch (combinacion) {
                    case 1:
                        System.out.println("1");
                        break;
                    case 2:
                        System.out.println(" X");
                        break;
                    case 3:
                        System.out.println("  2");
                        break;
                
                    default:
                        break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }

    }
}

