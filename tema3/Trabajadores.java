package tema3;

import java.util.Scanner;

public class Trabajadores {
    public static void main(String[] args) {
        

        double salarios[] = new double[7];
        double total=0;

        Scanner sc = new Scanner(System.in);


        for(int i=0; i < salarios.length; i++) {
            System.out.println("Dime el salario del trabajador " + i);
            salarios[i] = Double.parseDouble(sc.nextLine());
        }

        for(int i=0; i < salarios.length; i++) {1
            System.out.print(salarios[i] + ", ");
            total = total + salarios[i];
        }

        System.out.println("El salario medio de mis trabajadores es " +  total / salarios.length );

    }
}
