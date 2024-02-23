package juego;

import casillas.Casilla;
import casillas.Propiedad;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int dinero;
    private ArrayList<Propiedad> propiedadesCompradas;
    private Casilla casillaActual;

    public Jugador(String nombre, Casilla casillaInicial) {
        this.nombre = nombre;
        this.dinero = 100000;
        this.propiedadesCompradas = new ArrayList<>();
        this.casillaActual = casillaInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Propiedad> getPropiedadesCompradas() {
        return propiedadesCompradas;
    }

    public Casilla getCasillaActual() {
        return casillaActual;
    }

    public void setCasillaActual(Casilla casillaActual) {
        this.casillaActual = casillaActual;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("dinero=").append(dinero);
        sb.append(", propiedadesCompradas=").append(propiedadesCompradas);
        sb.append(", casillaActual=").append(casillaActual);
        sb.append('}');
        return sb.toString();
    }

    public void comprarPropiedad(Propiedad propiedad) {
        this.dinero -= propiedad.getPrecioCompra();
        propiedad.setPropietario(this);
        this.propiedadesCompradas.add(propiedad);
    }

    public void venderPropiedad(Propiedad propiedad, int precioVenta) {
        this.dinero += precioVenta;
        propiedad.setPropietario(null);
        this.propiedadesCompradas.remove(propiedad);
    }

    public void pagar(int cantidad) {
        this.dinero -= cantidad;
    }

    public void cobrar(int cantidad) {
        this.dinero += cantidad;
    }


}
