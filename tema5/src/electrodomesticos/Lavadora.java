package electrodomesticos;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(String marca, String modelo, double precioBase, double peso,
                    Clase clase, Color color, int carga) {
        super(marca, modelo, precioBase, peso, clase, color);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Lavadora {");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", precioBase=").append(precioBase);
        sb.append(", peso=").append(peso);
        sb.append(", clase=").append(clase);
        sb.append(", color=").append(color);
        sb.append(", carga=").append(carga);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (this.carga > 8) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
