package tienda;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;
    private double ventas;

    public Tienda() {
        this.ventas = 0;
        this.productos = new ArrayList<>(); //Incializar ArrayList en el constructor
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public void adquirirProducto(Producto producto) {
        this.productos.add(producto);
    }

    /**
     * BUSCAR el producto con ese  identificador, y si hay stock lo vendemos, decrementando
     * el stock y aumentando las ganancias.
     * @param identificador
     */
    public void venderProducto(long identificador, int cantidad) {
        boolean encontrado =  false;
        //Recorremos los productos hasta encontrar el producto con el identificador
        for(Producto producto : this.productos) {
            if (producto.getId() == identificador) {
                encontrado = true;
                //Vender
                boolean hayStock = producto.vender(cantidad);
                if (hayStock) {
                    this.ventas += producto.calcularPrecio(cantidad);
                } else {
                    System.out.println("No hay unidades disponibles, repón el producto");
                }
            }
        }

        if (!encontrado) {
            System.out.println("Ese identificador no corresponde a ningún producto de la tienda");
        }

    }


}
