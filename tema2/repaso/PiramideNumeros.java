package tema2.repaso;

public class PiramideNumeros {
    
    public static void main(String[] args) {
        
        //Vamos a realizar la siguiente pirámide
        //    1         numFilas-algo  4-1  espacios 3
        //   121                       4-2  espacios 2
        //  12321                      4-3  espacios 1
        // 1234321                     4-4  espacios 0

        // 1
        // 12
        // 123
        // 1234 

        int numFilas=4;

        for(int i=1; i<=numFilas; i++) {

            //Espacios
            for(int j=numFilas-i; j>=0; j--) {
                System.out.print(" ");
            }

            //Números 1, 12, 123, 1234
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }

            //Números _,1,21,321
            for(int j=i; j>1; j--) {
                System.out.print(j-1);
            }

            System.out.println();
        }

    }
}
