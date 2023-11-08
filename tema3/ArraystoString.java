package tema3;
import java.util.Arrays;

public class ArraystoString {
    
    public static void main(String[] args) {
        
        int notas[] = new int[10];

        Arrays.fill(notas, 5);

        System.out.println( Arrays.toString(notas) );
    
    }
}
