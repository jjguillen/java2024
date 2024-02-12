package casillas;

public class Carcel extends CasillaEspecial {

    private Casilla carcel;

    public Carcel(int numero, String nombre, int cantidad, Casilla carcel) {
        super(numero, nombre, cantidad);
        this.carcel = carcel;
    }

    @Override
    public void accion() {
        System.out.println("Manda al jugador a la casilla " + carcel.getNumero());
    }
}
