
public class EjemploSuma {

    public static int sumar(int a, int b) {
        int resultado;
        int num1=20;

        System.out.println("El valor de num1 en la función es " + num1);
        resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        
        /*
        int num1 = 10;
        int num2 = 20;
        int suma;
        */

        //INICIALIZAR LAS VARIABLES CON UN VALOR
        int num1=10, num2=20, suma=0;

        suma = sumar(num1, num2);

        System.out.println("El valor de num1 es " + num1);
        System.out.println("La suma es " + suma);
    }
}
