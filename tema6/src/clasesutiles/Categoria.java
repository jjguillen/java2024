package clasesutiles;

public enum Categoria {
    PERIFERICOS(0.05,"http://imagen.jpg"),
    PLACASBASE(0, "http://imagen2.jpg"),
    CPU(0.04, "http://imagen3.jpg"),
    GRAFICAS(0.10, "http://imagen4.jpg");

    private double descuento;
    private String imagen;

    private Categoria(double descuento, String imagen) {
        this.descuento = descuento;
        this.imagen = imagen;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}

