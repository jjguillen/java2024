public class EjemploConversionTipos {
    
    public static void main(String[] args) {
        
        int numero = 100;

        System.out.println( numero );
        System.out.println( (char) numero );

        double precio = 99.99;
        System.out.println( (int) precio); //Convertir a entero, quita la parte decimal
        System.out.println(Math.ceil(precio)); //Redondear hacia arriba
        System.out.println(Math.floor(precio)); //Redondear hacia abajo

        long numeroGrande = 200000000000000L;
        System.out.println((int) numeroGrande);

    }
}
