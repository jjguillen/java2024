package tema2.bucles;
import java.util.Scanner;

public class VocalNoVocal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        //1. while
        String caracter=".";

        System.out.println("Dime un caracter ");
        caracter = sc.nextLine();

        while ( !caracter.equals(" ") ) {            

            if ( caracter.equals("a") || 
                 caracter.equals("e") || 
                 caracter.equals("i") || 
                 caracter.equals("o") || 
                 caracter.equals("u") ) {
                    System.out.println("Vocal");
            } else {
                System.out.println("No vocal");
            }

            System.out.println("Dime un caracter ");
            caracter = sc.nextLine();
        }


    }
}
