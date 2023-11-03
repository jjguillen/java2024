package tema2.repaso;

public class Ejercicio6 {
    
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
        
        //NOTAS (Spain)
        //1,2,3,4 -> suspenso
        //5 -> suficiente
        //6 -> bien
        //7,8 -> notable
        //9,10 -> sobresaliente

        int nota=0;
        int contSuspenso=0;
        int contSuficiente=0;
        int contBien=0;
        int contNotable=0;
        int contSobresaliente=0;

        for(int i=1; i<=20; i++) {

            try {
                 nota = generarNumero(1, 10);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
           
            switch (nota) {
                case 1,2,3,4:
                    System.out.println("Suspenso");
                    contSuspenso++;
                    break;
                case 5:
                    System.out.println("Suficiente");
                    contSuficiente++;
                    break;
                case 6:
                    System.out.println("Bien");
                    contBien++;
                    break;
                case 7,8:
                    System.out.println("Notable");
                    contNotable++;
                    break;
                case 9,10:
                    System.out.println("Sobresaliente");
                    contSobresaliente++;
                    break;
            
                default:
                    break;
            }

        }

        System.out.println("Suspensos " + contSuspenso);
        System.out.println("Suficientes " + contSuficiente);
        System.out.println("Bienes " + contBien);
        System.out.println("Notables " + contNotable);
        System.out.println("Sobresalientes " + contSobresaliente);

    }
}
