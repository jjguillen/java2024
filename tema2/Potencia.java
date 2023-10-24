package tema2;

import java.util.Scanner;

public class Potencia {
    
    /**
     * Función que devuelve la potencia de un número
     * @param base
     * @param exponente
     * @return base elevado a exponente
     */
    public static double potencia(double base, int exponente) {

        double resultado=1; 
        for(int i=0; i < exponente; i++) {
            resultado = resultado * base;  //resultado *= base
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pedirle al usuario una base y un exponente, y devolver la potencia resultante, sin usar Math.pow(base, exponente)

        double base;
        int exponente;
        double resultado;


        try {
            System.out.println("Dime la base:");
            base = Double.parseDouble( sc.nextLine() );
            System.out.println("Dime el exponente: ");
            exponente = Integer.parseInt( sc.nextLine() );

            //Llama a una función que calcula la potencia de una base elevada a exp
            resultado = potencia(base, exponente);
            System.out.println("El resultado es " + resultado);
        } catch (Exception e) {
            System.out.println("La base debe ser un double y el exponente un entero");
        }


            




    }
}
