package polimorfismo;

import logistica.entidades.NivelFragil;

public class ProductoFragil extends Producto {

    private NivelFragil nivelFragilidad;

    public ProductoFragil(String nombre, double peso, NivelFragil nivelFragilidad) {
        super(nombre, peso);
        this.nivelFragilidad = nivelFragilidad;
    }

    public NivelFragil getNivelFragilidad() {
        return nivelFragilidad;
    }

    public void setNivelFragilidad(NivelFragil nivelFragilidad) {
        this.nivelFragilidad = nivelFragilidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductoFragil{");
        sb.append("nivelFragilidad=").append(nivelFragilidad);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularCostoEnvio(boolean esInternacional) {
        double costo = super.calcularCostoEnvio(esInternacional);

        if (this.nivelFragilidad.equals(NivelFragil.N1)) {
            costo += 20;
        }
        if (this.nivelFragilidad.equals(NivelFragil.N2)) {
            costo += 50;
        }

        return costo;
    }
}
