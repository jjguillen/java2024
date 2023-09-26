import java.util.Scanner;

public class Ejercicio2Tema1 {
    
    public static void main(String[] args) {

        double calif1EV, calif2EV, calif3EV, califExamenFinal, califTrabajoFinal;
        double notaFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la nota primera evaluación");
        calif1EV = sc.nextDouble();
        System.out.println("Dime la nota segunda evaluación");
        calif2EV = sc.nextDouble();
        System.out.println("Dime la nota tercera evaluación");
        calif3EV = sc.nextDouble();

        System.out.println("Dime nota del examen final");
        califExamenFinal = sc.nextDouble();

        System.out.println("Dime la nota del trabajo final");
        califTrabajoFinal = sc.nextDouble();

        notaFinal = (((calif1EV + calif2EV + calif3EV)/3) * 0.55) + 
                    (califExamenFinal * 0.3) +
                    (califTrabajoFinal * 0.15);
        
        System.out.println("Tu nota es " + notaFinal);

        sc.close();


    }
}
