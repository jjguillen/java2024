package ejerciciosclase.tienda;

public class Direccion {

    private String calle;
    private String numero;
    private String piso;
    private String ciudad;
    private String cp;

    public Direccion(String calle, String numero, String piso, String ciudad, String cp) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}
