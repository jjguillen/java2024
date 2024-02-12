package logistica.servicio;

import logistica.entidades.Transportable;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Envio {

    private ArrayList<Transportable> productos;
    private LocalDate fechaSalida;
    private LocalDate fechaLLegada;
    private boolean esInternacional;

    public Envio(boolean esInternacional) {
        this.productos = new ArrayList<>();
        this.fechaSalida = LocalDate.now();
        this.fechaLLegada = null;
    }

    public ArrayList<Transportable> getProductos() {
        return productos;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(LocalDate fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public void agregarTransportable(Transportable item) {
        this.productos.add(item);
    }

    public boolean isEsInternacional() {
        return esInternacional;
    }

    public void setEsInternacional(boolean esInternacional) {
        this.esInternacional = esInternacional;
    }

    public double calcularCostoTotalEnvio() {
        double costoTotal=0;
        for(Transportable item: this.productos) {
            costoTotal += item.calcularCostoEnvio(this.esInternacional);
        }
        return costoTotal;
    }

    public void listarProductos() {
        for(Transportable item: this.productos) {
            System.out.println(item);
            //ERROR: item.getNombre(); --> es un ArrayList de Transportable, no de Producto
            System.out.println("Su costo total de envío es: " +
                        item.calcularCostoEnvio(this.esInternacional) + " €");
        }
    }

    public int diasTranscurridos() {
        Period periodo = Period.between(this.fechaSalida, this.fechaLLegada);
        return periodo.getDays();
    }
}
