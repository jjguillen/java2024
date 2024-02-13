package polimorfismo;

import logistica.entidades.NivelRefrigeracion;

public class ProductoRefrigerado extends Producto {

    private NivelRefrigeracion nivelRefrigeracion;

    public ProductoRefrigerado(String nombre, double peso, NivelRefrigeracion nivelRefrigeracion) {
        super(nombre, peso);
        this.nivelRefrigeracion = nivelRefrigeracion;
    }

    public NivelRefrigeracion getNivelRefrigeracion() {
        return nivelRefrigeracion;
    }

    public void setNivelRefrigeracion(NivelRefrigeracion nivelRefrigeracion) {
        this.nivelRefrigeracion = nivelRefrigeracion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductoRefrigerado{");
        sb.append("nivelRefrigeracion=").append(nivelRefrigeracion);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularCostoEnvio(boolean esInternacional) {
        double costo = super.calcularCostoEnvio(esInternacional);
        if (this.nivelRefrigeracion.equals(NivelRefrigeracion.N1)) {
            costo += 10;
        }
        if (this.nivelRefrigeracion.equals(NivelRefrigeracion.N2)) {
            costo += 30;
        }
        return costo;
    }
}
