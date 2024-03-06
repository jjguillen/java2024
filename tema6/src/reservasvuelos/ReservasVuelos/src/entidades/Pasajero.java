package entidades;

public class Pasajero extends Persona {

    private String preferenciasComida;
    private String restriccionesMedicas;
    private Asiento asiento;

    public Pasajero(Long id, String nombre, String apellidos, String dniPasaporte, String email, String direccion,
                    String ciudad, String pais, String telefono, String preferenciasComida, String restriccionesMedicas) {
        super(id, nombre, apellidos, dniPasaporte, email, direccion, ciudad, pais, telefono);
        this.preferenciasComida = preferenciasComida;
        this.restriccionesMedicas = restriccionesMedicas;
    }

    public Pasajero(Pasajero pasajero) {
        this.id = pasajero.id;
        this.nombre = pasajero.nombre;
        this.apellidos = pasajero.apellidos;
        this.dniPasaporte = pasajero.dniPasaporte;
        this.email = pasajero.email;
        this.direccion = pasajero.direccion;
        this.ciudad = pasajero.ciudad;
        this.pais = pasajero.pais;
        this.telefono = pasajero.telefono;
        this.preferenciasComida = pasajero.preferenciasComida;
        this.restriccionesMedicas = pasajero.restriccionesMedicas;
    }

    public String getPreferenciasComida() {
        return preferenciasComida;
    }

    public void setPreferenciasComida(String preferenciasComida) {
        this.preferenciasComida = preferenciasComida;
    }

    public String getRestriccionesMedicas() {
        return restriccionesMedicas;
    }

    public void setRestriccionesMedicas(String restriccionesMedicas) {
        this.restriccionesMedicas = restriccionesMedicas;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dniPasaporte='" + dniPasaporte + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", telefono='" + telefono + '\'' +
                ", preferenciasComida='" + preferenciasComida + '\'' +
                ", restriccionesMedicas='" + restriccionesMedicas + '\'' +
                '}';
    }
}
