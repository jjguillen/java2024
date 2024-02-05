package agenda;

public class ContactoPersona extends Contacto {

    private String apodo;


    public ContactoPersona(String nombre, String telefono, String apodo) {
        super(nombre, telefono);
        this.apodo = apodo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contacto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", apodo='").append(apodo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void pintar() {
        System.out.println(apodo + " ( " + nombre + " )  -> " + telefono);
    }
}
