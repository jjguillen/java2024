package logistica.entidades;

public class Producto implements Transportable {

    protected String nombre;
    protected double peso;

    public Producto(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularCostoEnvio(boolean esInternacional) {
        double costo = 20;
        if (esInternacional) {
            costo += 30;
        }
        costo += this.peso * 0.2;
        return costo;
    }
}
