package tema2.repaso;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int numero1 = 320;
        int numero2 = 160;

        for(int i=numero1; i>=numero2; i=i-20) {
            //Otras cosas
            System.out.println(i);
        }

        int i=numero1;
        while( i >= numero2) {
            //Otras cosas
            System.out.println(i);


            i = i - 20;
        }
    }
}
