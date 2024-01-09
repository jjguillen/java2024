public class Main {

    public static void main(String[] args) {

        Password pw1 = new Password(12);
        Password pw2 = new Password("12345678");

        System.out.println(pw1);
        System.out.println(pw2);

        System.out.println(pw1.getLongitud());

        StrongPassword psw1 = new StrongPassword(15);
        System.out.println(psw1);

    }
}
