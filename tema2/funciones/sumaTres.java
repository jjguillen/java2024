package tema2.funciones;

public class sumaTres {
    
    public static double suma(double a, double b, double c) {
        double resultado;
        resultado = a + b + c;
        return resultado;
    }

    public static void main(String[] args) {
        
        System.out.println( suma(4.5, 6.9, 7.2) );
    }
}
