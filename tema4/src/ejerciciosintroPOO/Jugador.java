package ejerciciosintroPOO;

public class Jugador {
    //Properties
    private String nombre;
    private String clase;
    private int nivel;
    private int salud;

    public Jugador() {
        this.nombre = "NPC";
        this.clase = "NPC";
        this.nivel = 1;
        this.salud = 50;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void atacar(int damage, Jugador atacado) {
        atacado.setSalud( atacado.getSalud() - damage );
    }

    public void tomarPocion(int puntosSalud) {
        this.salud += puntosSalud;
        if (this.salud > 1500) {
            this.salud = 1500;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
    }
}
