package tema2.bucles;
import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma=0;
        int contador=0;
        double media=0;

        int num=-1;

        while (num != 0) {
            num = sc.nextInt();

            //Para que no sume el 0 en el contador
            if (num!=0) {
                suma = suma + num;
                contador++;
            }
        }

        media = (suma / contador);

        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);
    }
}
