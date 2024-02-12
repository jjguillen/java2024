package juego;

import casillas.Carcel;
import casillas.Casilla;
import casillas.Impuesto;
import casillas.Propiedad;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Casilla> tablero;

    public Tablero() {
        this.tablero = new ArrayList<>();
        this.construirTablero();
    }

    /**
     * Generamos las 40 casillas del juego
     * 1 Inicio - 1
     * 1 Cárcel - 30 (te manda a la 11)
     * 6 Impuesto - 4, 16, 26, 36, 39
     * 5 Carta - 2, 7, 17, 22, 33
     * 27 Propiedad - 3,5,6,8,9,10,11 (cárcel), 12,13,14,15,18,19,20,21,23,24,25,27,28,29,
     *                30,31,32,34,35,37,38
     *
     */
    private void construirTablero() {
        //Inicio y cárcel
        Casilla inicio = new Casilla(1, "Inicio");
        Casilla carcel = new Casilla(11, "Bienvenido a la prisión");
        Carcel irCarcel = new Carcel(30, "Ve a prisión", 0, carcel);
        this.addCasilla(inicio);
        this.addCasilla(carcel);
        this.addCasilla(irCarcel);

        //Impuestos
        Impuesto impuesto1 = new Impuesto(4, "Impuesto IRPF", 1500);
        Impuesto impuesto2= new Impuesto(16, "Impuesto IBI", 700);
        Impuesto impuesto3= new Impuesto(26, "Impuesto Coche", 500);
        Impuesto impuesto4= new Impuesto(36, "Impuesto Sucesiones", 1000);
        Impuesto impuesto5= new Impuesto(39, "Impuesto Patrimonio", 3000);
        this.addCasilla(impuesto1);
        this.addCasilla(impuesto2);
        this.addCasilla(impuesto3);
        this.addCasilla(impuesto4);
        this.addCasilla(impuesto5);

        //Propiedades
        for(int i=3; i<39; i++) {
            switch (i) {
                case 3,5,6,8,9,10,11, 12,13,14,15,18,19,20,21,23,24,25,27,28,29,
                     30,31,32,34,35,37,38:
                    //int precioCompra = (10000 * ( 14 - (40 / i) )) + (1000 * i);
                    int precioCompra = (int) (10000 * Math.floor(Math.pow(1 + 0.05, i))) + (1000 * i/2);
                    int precioAlquiler = (int) (precioCompra / 2);
                    Propiedad propiedad = new Propiedad(i, "Propiedad "+i, precioCompra, precioAlquiler);
                    this.addCasilla(propiedad);
            }
        }
    }

    public ArrayList<Casilla> getTablero() {
        return tablero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tablero{");
        sb.append(System.getProperty("line.separator"));
        for(Casilla c: this.tablero) {
            sb.append(c.toString());
            sb.append(System.getProperty("line.separator"));
        }
        sb.append('}');
        return sb.toString();
    }

    public void addCasilla(Casilla c) {
        this.tablero.add(c);
    }
}
