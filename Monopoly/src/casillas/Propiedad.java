package casillas;

public class Propiedad extends Casilla{

    private int precioCompra;
    private int precioAlquiler; //Lo que pagas al caer
    //private Jugador propietario;


    public Propiedad(int numero, String nombre, int precioCompra, int precioAlquiler) {
        super(numero, nombre);
        this.precioCompra = precioCompra;
        this.precioAlquiler = precioAlquiler;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Propiedad{");
        sb.append(" numero=").append(numero);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precioCompra=").append(precioCompra);
        sb.append(", precioAlquiler=").append(precioAlquiler);
        sb.append('}');
        return sb.toString();
    }
}
