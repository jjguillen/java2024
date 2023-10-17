package tema2.funciones;

public class calculator {
    
    public static double calculadora(double a, double b, String operator) {
        if (operator.equals("+")) {
            return a+b;
        } else if (operator.equals("-")) {
            return a-b;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        
        System.out.println( calculadora(3.5, 4.2, "+") );
        System.out.println( calculadora(6.5, 4.2, "-") );

    }
}
