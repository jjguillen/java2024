package arrayList;

import java.util.ArrayList;

public class Tablero {

    private String nombre;
    private ArrayList<Casilla> casillas; //Definición

    public Tablero() {
        this.casillas = new ArrayList<Casilla>(); //Creación del ArrayList
        for(int i=0; i<75; i++) {
            this.casillas.add(new Casilla(i,"Texto"));
        }
    }

    public Tablero(String nombre) {
        this.nombre = nombre;
        this.casillas = new ArrayList<Casilla>(); //Creación del ArrayList
        for(int i=0; i<75; i++) {
            this.casillas.add(new Casilla(i,"Texto"));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public void addCasilla(Casilla casilla) {
        this.casillas.add(casilla);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tablero{");
        sb.append("casillas=").append(casillas);
        sb.append('}');
        return sb.toString();
    }
}
