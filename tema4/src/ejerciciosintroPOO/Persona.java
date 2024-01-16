package ejerciciosintroPOO;

public class Persona {

    //PROPERTIES
    private String nombre;
    private String apellidos;
    private int edad;
    private double altura;
    private String ciudad;
    private String email;

    public static int numPersonas;

    public final String orientacionPolitica = "Liberal"; //Propiedad final
    public static final int numMaximoPersonas = 100;     //Propiedad estática y final


    //CONSTRUCTORS
    Persona() {
        this.nombre = "Sin nombre";
        this.apellidos = "Sin apellidos";
        this.altura = 0;
        this.ciudad = "No tiene";
        this.email = "nada";
        this.edad = 0;
        Persona.numPersonas++;
    }

    Persona(String nombre, String apellidos, int edad, double altura, String ciudad, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.altura = altura;
        this.ciudad = ciudad;
        this.email = email;
        this.edad = edad;
        Persona.numPersonas++;
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return this.nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //METHODS
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" PERSONA [");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", altura=").append(altura);
        sb.append(", edad=").append(edad);
        sb.append(", email='").append(email).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(']');
        return sb.toString();
    }
}
