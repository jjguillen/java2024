public class Ejercicio3T2 {
    
    public static void main(String[] args) {
        
        //Tenemos dos variables int, a y b, tenemos que intercambiar su valor

        int a, b;
        int temp;

        a = 5;
        b = 7;

        temp = b; //El 7 lo guardamos en temp
        b = a; //La b vale 5
        a = temp; //A la variable a, le asignamos el valor de b que habíamos guardado en temp

        System.out.println("La variable 'a' vale: " + a);
        System.out.println("La variable 'b' vale: " + b);


    }
}
