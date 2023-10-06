package tema2.bucles;

public class Decenas {
    public static void main(String[] args) {
        

        //Mostrar todas las decenas que hay entre el 100 y el 300

        for(int num=100; num <= 300; num++) {
            if (num % 10 == 0) {
                System.out.println(num);
            }
        }

        for(int num=100; num <= 300; num+=10) {
            System.out.println(num);
        }

        int numero = 100;
        while (numero <= 300) {
            System.out.println(numero);
            numero+=10;
        }

    }
}
