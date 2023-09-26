import java.util.Scanner;

public class EjemploEntradaDatosCadenas {
    
    public static void main(String[] args) {
        
        String nombre;

         //Crear el objeto Scanner para leer de teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu nombre ");
        nombre = sc.nextLine(); //Lee de teclado hasta pulsar Enter

        System.out.println("Tu nombre es " + nombre);

    }
}
