package naveEspacial;

public class Monstruo extends Personaje {

    public enum Clase {BICHO, PLANTA, ROCA}
    protected Clase clase;

    public Monstruo(String nombre, int salud, Clase clase) {
        super(nombre, salud);
        this.clase = clase;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
}
