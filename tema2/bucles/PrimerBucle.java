package tema2.bucles;

public class PrimerBucle {
    
    public static void main(String[] args) {
        
        int num = 1;

        while (num <= 3) {
            //Nos tiene que acercar a que la condición sea false, para que el bucle termine
            System.out.println(num);
            num++;
        }

        while (true) {
            System.out.println(num);
            num++;

            if (num == 3000) {
                break;
            }
        }

        System.out.println(num);
    }
}
