package electrodomesticos;

public class Television extends Electrodomestico {

    enum Tecnologia { OLED, QLED, MICROLED };
    enum Resolucion { FHD, QHD, _4K, _8K };

    private double pulgadas;
    private Tecnologia tecnologia;
    private Resolucion resolucion;

    public Television(String marca, String modelo, double precioBase, double peso,
                      Clase clase, Color color, double pulgadas, Tecnologia tecnologia, Resolucion resolucion) {
        super(marca, modelo, precioBase, peso, clase, color);
        this.pulgadas = pulgadas;
        this.tecnologia = tecnologia;
        this.resolucion = resolucion;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public Resolucion getResolucion() {
        return resolucion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Electrodomestico{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", precioBase=").append(precioBase);
        sb.append(", peso=").append(peso);
        sb.append(", clase=").append(clase);
        sb.append(", color=").append(color);
        sb.append(", pulgadas=").append(pulgadas);
        sb.append(", tecnología=").append(tecnologia);
        sb.append(", resolucion=").append(resolucion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (this.tecnologia.equals(Tecnologia.OLED)) {
            precioFinal += 200;
        }

        System.out.println(("Estoy en Tv"));
        return precioFinal;
    }
}
