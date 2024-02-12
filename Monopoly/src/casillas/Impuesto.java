package casillas;

public class Impuesto extends CasillaEspecial {

    public Impuesto(int numero, String nombre, int cantidad) {
        super(numero, nombre, cantidad);
    }

    @Override
    public void accion() {
        System.out.println("Quitar " + this.getCantidad() + " al jugadors");
    }
}
