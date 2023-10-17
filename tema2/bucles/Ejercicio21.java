package tema2.bucles;

public class Ejercicio21 {
    
    public static void main(String[] args) {
        
        int numero = 139;
        int centenas, decenas, unidades;
        int numeroReves;

        centenas = numero / 100;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        System.out.println("Centenas " + centenas);
        System.out.println("Decenas " + decenas);
        System.out.println("Unidades " + unidades);

        numeroReves = (100 * unidades) + (10 * decenas) + centenas;

        System.out.println("El número al revés es " + numeroReves);

    }
}
