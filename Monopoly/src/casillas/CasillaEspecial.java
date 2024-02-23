package Monopoly.src.casillas;

public abstract class CasillaEspecial extends Casilla {

    private int cantidad;

    public CasillaEspecial(int numero, String nombre, int cantidad) {
        super(numero, nombre);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CasillaEspecial{");
        sb.append(" numero=").append(numero);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }

}
