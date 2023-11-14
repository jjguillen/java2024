package tema3.ClaseArrays;
import java.util.Arrays;

public class ArraysFill {
    
    public static void main(String[] args) {
        
        int notas[] = new int[10];

        Arrays.fill(notas, 5);

        for(int i=0; i<notas.length; i++)
            System.out.print(notas[i] + " ");
    
    }
}
