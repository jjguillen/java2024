package casillas;

import juego.Jugador;
import juego.Tablero;

import java.util.Scanner;

public class Propiedad extends Casilla{

    private int precioCompra;
    private int precioAlquiler; //Lo que pagas al caer
    private Jugador propietario;


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

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Propiedad{");
        sb.append("precioCompra=").append(precioCompra);
        sb.append(", precioAlquiler=").append(precioAlquiler);
        sb.append(", propietario=").append(propietario);
        sb.append(", numero=").append(numero);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String accion(Jugador jugador) {
        //Pagar el alquiler o comprar la propiedad
        if (this.propietario != null) {
            jugador.setDinero(jugador.getDinero() - this.precioAlquiler);
            this.propietario.setDinero(this.propietario.getDinero() + this.precioAlquiler);
            return "Te toca pagar al propietario";
        } else {
            System.out.println("Deseas comprar esta propiedad (s/n):");
            Scanner sc = new Scanner(System.in);
            String respuesta = sc.nextLine();
            if (respuesta.equals("s") || respuesta.equals("S")) {
                this.propietario = jugador;
                jugador.setDinero(jugador.getDinero() - this.precioCompra);
                return "Enhorabuena has comprado " + this.getNombre();
            } else if (respuesta.equals("n") || respuesta.equals("N")) {
                return "Si no me compras sigue jugando ...";
            }
        }
        return "No entiendo la opción elegida, sigue jugando";
    }

}
