public class StrongPassword extends Password {

    public StrongPassword(int longitud) {
        super(longitud);
    }

    protected void generate_password() {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < this.getLongitud(); i++) {
            int letra = generarNumero(32, 126);
            sb.append((char) letra);
        }

        this.setPasswd(sb.toString());
    }
}
