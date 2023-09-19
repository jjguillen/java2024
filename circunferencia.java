class Circunferencia {

    public static void main(String[] args) {

        //1. Definir variables
        double radio, superficie, longitud;

        //2. Introducir el valor del radio de la circunferencia
        radio = 7;

        //3. Calcular la superficie y la longitud;
        superficie = 3.1416 * radio * radio;
        longitud = 2 * 3.1416 * radio;

        //4. Imprimirlo por pantalla
        System.out.println("La superficie es " + superficie);
        System.out.println("La longitud es " + longitud);


    }
    
}