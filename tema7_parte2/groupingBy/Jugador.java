package tema7_parte2.groupingBy;

public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private Double altura;
    private String pais;

    public Jugador(String nombre, Double altura, String pais) {
        this.nombre = nombre;
        this.altura = altura;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", altura=").append(altura);
        sb.append(", pais='").append(pais).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
