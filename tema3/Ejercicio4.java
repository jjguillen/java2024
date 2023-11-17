package tema3;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int total;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de personas");
        total = Integer.parseInt(sc.nextLine());

        double altura[] = new double[total];

        double media=0;
        for(int i=0; i < altura.length; i++) {
            System.out.println("Dime la altura de la persona " + i + " :");
            altura[i] = Double.parseDouble(sc.nextLine());
            media += altura[i];
        }

        media = media / altura.length;

        //Contar cuántos hay por debajo y cuántos por encima de la media
        int porEncima=0, porDebajo=0;
        for(int i=0; i < altura.length; i++) {
            if (altura[i] > media)
                porEncima++;
            if (altura[i] < media)
                porDebajo++;
            
        }

        System.out.println( Arrays.toString(altura) );
        System.out.println(" La media es: " + media);
        System.out.println(" Por encima hay: " + porEncima);
        System.out.println(" Por debajo hay: " + porDebajo);
    }
}
