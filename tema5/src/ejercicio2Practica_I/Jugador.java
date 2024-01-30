package ejercicio2Practica_I;

public class Jugador {

    enum Clase { MAGO, BRUJO, CABALLERO, BARBARO };

    private String nombre;
    private Clase clase;
    private int nivel;
    private int experiencia;
    private int salud;
    private Arma armaDerecha;
    private Arma armaIzquierda;

    public Jugador(String nombre, Clase clase) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = 1;
        this.salud = 200;
        this.experiencia = 0;
        this.armaDerecha = null;
        this.armaIzquierda = null;
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append('}');
        return sb.toString();
    }

    public void subirNivel() {
        this.nivel++;
        this.salud += Math.pow(2.5, nivel);
    }

    public void tomarPocion(int puntos) {
        if (this.salud + puntos > 10000)
            this.salud = 10000;
        else
            this.salud += puntos;
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

    public boolean equipar(Arma arma) {
        //Arma a dos manos
        if (arma.isDosManos()) {
            if (this.armaIzquierda == null && this.armaDerecha == null) {
                this.armaDerecha = arma;
                this.armaIzquierda = arma;
                return true;
            } else {
                return false;
            }
        } else {
            if (this.armaDerecha == null) {
                this.armaDerecha = arma;
                return true;
            } else if (this.armaIzquierda == null) {
                this.armaIzquierda = arma;
                return true;
            } else {
                return false;
            }
        }
    }

    //public void golpear(Monstruo monstruo) {}
}
