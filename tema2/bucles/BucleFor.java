package tema2.bucles;

public class BucleFor {
    
    public static void main(String[] args) {
        //int i,j

        //Del 100 al 1 con for
        for(int num=100; num>=1; num--) {
            System.out.println(num);
        }

        //Números impares del 1 al 100
        for(int num=1; num<=100; num = num+2 ) { //num+=2
            System.out.println(num);
        }

         //Números pares del 1 al 100
        for(int num=2; num<=100; num = num+2 ) { //num+=2
            System.out.println(num);
        }
            

    }
}
