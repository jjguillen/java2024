public class Ejercicio17 {
    
    public static void main(String[] args) {
        int n=0;

        n = (int) (Math.random() * (50 - 1)) + 1;
        System.out.println(n);

        n = (int) (Math.random() * (100 - 1)) + 1;
        System.out.println(n*2);

        n = (int) (Math.random() * (100 + 1 - (-100))) - 100 ;
        System.out.println(n);

        n = (int) (Math.random() * (6 - 1)) + 1;
        switch (n) {
            case 1:
                System.out.println("5");
                break;
            case 2:
                System.out.println("7");
                break;
            case 3:
                System.out.println("33");
                break;
            case 4:
                System.out.println("125");
                break;
            case 5:
                System.out.println("77");
                break;

            default:
                break;
        }




    }
}
