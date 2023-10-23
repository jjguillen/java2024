package tema2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExcepcion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 30;

        try {            
            System.out.println("Dime un número");
            numero = sc.nextInt();

            //Si el error salta aquí el resto del try no se ejecuta
            numero = numero / 0;

        } catch (InputMismatchException ex) {
            System.out.println("Error leyendo un entero");
        } catch (ArithmeticException ex) {
            System.out.println("Ha ocurrido un error en la división " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error");
        } finally {
            sc.close();
            System.out.println("Qué ha pachado?");
        }

        System.out.println("El programa continúa");

    }
}
