package electrodomesticos;

public class Electrodomestico {

    enum Clase { A, B, C, D, E, F };
    enum Color { Blanco, Negro, Rojo, Azul, Gris };

    protected String marca;
    protected String modelo;
    protected double precioBase;
    protected double peso;
    protected Clase clase;
    protected Color color;

    public Electrodomestico(String marca, String modelo, double precioBase, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.peso = peso;
        this.clase = Clase.F;
        this.color = Color.Blanco;
    }

    public Electrodomestico(String marca, String modelo, double precioBase, double peso, Clase clase, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.peso = peso;
        this.clase = clase;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public Clase getClase() {
        return clase;
    }

    public Color getColor() {
        return color;
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
        sb.append('}');
        return sb.toString();
    }

    /**
     * Según el consumo energético y el peso, se incrementará el precio del producto
     * @return El precio modificado según peso y consumo
     */
    public double precioFinal() {
        double precioFinal;
        precioFinal = this.precioBase;

        //Incrementamos según consumo
        switch (this.clase) {
            case A: precioFinal += 100; break;
            case B: precioFinal += 80; break;
            case C: precioFinal += 60; break;
            case D: precioFinal += 50; break;
            case E: precioFinal += 30; break;
            case F: precioFinal += 10; break;
        }

        //Incrementamos por peso
        if ( (peso >= 0) && (peso <= 19)) {
            precioFinal += 10;
        } else if ( (peso >= 20) && (peso <= 49)) {
            precioFinal += 50;
        } else if ( (peso >= 50) && (peso <= 79)) {
            precioFinal += 80;
        } else if ( peso > 80 ) {
            precioFinal += 100;
        }

        return precioFinal;
    }
}
