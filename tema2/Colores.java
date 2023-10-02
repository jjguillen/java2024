package tema2;
import java.util.Scanner;

public class Colores {
    public static void main(String[] args) {
        //1. Declarar variables
        String color1, color2;
        
        //2. Leer de teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime primer color (R,A,V) ");
        color1 = sc.nextLine();
        System.out.println("Dime segundo color (R,A,V)");
        color2 = sc.nextLine();

        //3. Resolver combinaciones
        //Rojo, Azul, Verde
        //Posibilidades
        //Rojo - Azul
        //Rojo - Verde
        //Rojo - Rojo
        //Azul - Rojo
        //Azul - Verde
        //Azul - Azul
        //Verde - Rojo
        //Verde - Azul
        //Verde - Verde

        
        //SOLUCION 1 - Preguntar cada caso
        if (color1.equals("R") && color2.equals("A")) {
            System.out.println("Magenta");
        } else if (color1.equals("R") && color2.equals("V")) {
            System.out.println("Amarillo");
        } else if (color1.equals("R") && color2.equals("R")) {
            System.out.println("Rojo, vaya");
        } else if (color1.equals("A") && color2.equals("R")) {
            System.out.println("Magenta");
        } else if (color1.equals("A") && color2.equals("V")) {
            System.out.println("Cyan");
        } else if (color1.equals("A") && color2.equals("A")) {
            System.out.println("Azul");
        } else if (color1.equals("V") && color2.equals("A")) {
            System.out.println("Cyan");
        } else if (color1.equals("V") && color2.equals("V")) {
            System.out.println("Verde");
        } else if (color1.equals("V") && color2.equals("R")) {
            System.out.println("Amarillo");
        }


        //SOLUCION 2
        //Dividir según el primer color
        if (color1.equals("R")) {
            if (color2.equals("V")) {
                System.out.println("Amarillo");
            } else if (color2.equals("A")) {
                System.out.println("Magenta");
            } else {
                System.out.println("Rojo");
            }

        } else if (color1.equals("V")) {
            if (color2.equals("R")) {
                System.out.println("Amarillo");
            } else if (color2.equals("A")) {
                System.out.println("Cyan");
            } else {
                System.out.println("Verde");
            }
        } else if (color1.equals("A")) {
            if (color2.equals("V")) {
                System.out.println("Cyan");
            } else if (color2.equals("A")) {
                System.out.println("Azul");
            } else {
                System.out.println("Magenta");
            }
        }

        //SOLUCIÓN 3
        //Me doy cuenta que el primer y segundo color son la misma combinación que segundo y primer color
        if ( color1.equals("R") && color2.equals("A") || 
            color1.equals("A") && color2.equals("R") ) {
            System.out.println("Magenta");
        } else  if ( color1.equals("R") && color2.equals("V") || 
            color1.equals("V") && color2.equals("R") ) {
            System.out.println("Amarillo");
        } else  if ( color1.equals("A") && color2.equals("V") || 
            color1.equals("V") && color2.equals("A") ) {
            System.out.println("Cyan");
        } else if (color1.equals(color2)) {
            System.out.println(color1);
        } else {
            System.out.println("Mezcla incorrecta");
        }




    }
}
