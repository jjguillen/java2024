package tema7_parte1.nba;

public class Jugador implements Comparable<Jugador>{
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
    public int compareTo(Jugador o) {
        return o.getAltura().compareTo(this.getAltura());
    }
}
