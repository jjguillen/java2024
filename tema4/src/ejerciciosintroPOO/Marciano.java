package ejerciciosintroPOO;

public class Marciano {

    private String nombre;
    private int vida;
    public static int numMarcianos = 0;

    public Marciano() {
        this.nombre = "Marciano base";
        this.vida = 20;
        Marciano.numMarcianos++;
    }

    public Marciano(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        Marciano.numMarcianos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void muerto() {
        Marciano.numMarcianos--;
    }

    public static int getNumMarcianos() {
        return Marciano.numMarcianos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Marciano{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", vida=").append(vida);
        sb.append('}');
        return sb.toString();
    }


}
