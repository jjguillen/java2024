import java.util.Scanner;

public class Password {

    //Properties --
    int longitud;
    String passwd;

    //Constructors --
    public Password() {
        //Pedir por pantalla la longitud deseada > 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime longitud de la password");
        this.longitud = Integer.parseInt(sc.nextLine());

        //Llamar a un método generate_password() que genere caracteres aleatorios
        generate_password();
    }

    public Password(String passwd) {
        this.passwd = passwd;
        this.longitud = passwd.length();
    }


    //Methods ----------------------------------------------------------------

    private int generarNumero(int min, int max) {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }
    private void generate_password() {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < this.longitud; i++) {
            int letra = generarNumero(32, 126);
            sb.append((char) letra);
        }

        this.passwd = sb.toString();
    }



   @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Password{");
        sb.append("longitud=").append(longitud);
        sb.append(", passwd='").append(passwd).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
