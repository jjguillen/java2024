package tema6.src.abstraccion;

public abstract class Persona {

    protected String nombre;
    protected String apellidos;
    protected String email;
    protected String dni;
    protected String ciudad;

    public Persona(String nombre, String apellidos, String email, String dni, String ciudad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.dni = dni;
        this.ciudad = ciudad;
    }

    public Persona() {
        this.email = this.dni + "@empresa.com";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public abstract double calcularNominaMensual();
}
