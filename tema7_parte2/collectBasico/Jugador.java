package tema7_parte2.collectBasico;

public class Jugador implements Comparable<tema7_parte1.nba.Jugador>{
    private String nombre;
    private Double altura;

    public Jugador(String nombre, Double altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public int compareTo(tema7_parte1.nba.Jugador o) {
        return o.getAltura().compareTo(this.getAltura());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
}
