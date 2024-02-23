package Monopoly.src.casillas;

public class Carta {
    private String texto;
    private int cantidad;

    public Carta(String texto, int cantidad) {
        this.texto = texto;
        this.cantidad = cantidad;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carta{");
        sb.append("texto='").append(texto).append('\'');
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }
}
