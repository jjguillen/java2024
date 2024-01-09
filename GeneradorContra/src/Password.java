import java.util.Scanner;

public class Password {

    //Properties --
    private int longitud;

    private String passwd;


    //Constructors --
    public Password(int longitud) {
        //Pedir por pantalla la longitud deseada > 8
        this.longitud = longitud;

        //Llamar a un método generate_password() que genere caracteres aleatorios
        generate_password();
    }

    public Password(String passwd) {
        this.passwd = passwd;
        this.longitud = passwd.length();
    }


    //Methods ----------------------------------------------------------------
    public int getLongitud() {
        return longitud;
    }

    public String getPasswd() {
        return passwd;
    }


    public void setPasswd(String passwd) {
        this.passwd = passwd;
        this.longitud = passwd.length();
    }

    protected int generarNumero(int min, int max) {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }
    protected void generate_password() {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < this.longitud; i++) {
            int letra = generarNumero(65, 122);
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
