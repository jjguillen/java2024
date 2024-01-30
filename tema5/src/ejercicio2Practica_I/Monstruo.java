package ejercicio2Practica_I;

public class Monstruo {

    enum Clase { GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA, VAMPIRO };

    private String nombre;
    private Clase clase;
    private int nivel;
    private int salud;
    private int puntosD;

    public Monstruo(String nombre, Clase clase, int puntosD) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = 1;
        this.salud = 100;
        this.puntosD = puntosD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
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

    public int getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }

    public void subirNivel() {
        this.nivel++;
        this.salud += Math.pow(2, nivel);
    }

    public boolean reducirVida(int puntos) {
        this.salud -= puntos;
        if (this.salud <= 0) {
            this.salud = 0;
            return true;
        } else {
            return false;
        }
    }
    
    //public void golpear(Jugador jugador) {}
}
