package agenda;

public class ContactoEmpresa extends Contacto {

    private String cif;
    private String email;


    public ContactoEmpresa(String nombre, String telefono, String cif, String email) {
        super(nombre, telefono);
        this.email = email;
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contacto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", cif='").append(cif).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
