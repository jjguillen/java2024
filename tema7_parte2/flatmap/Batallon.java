package tema7_parte2.flatmap;

import java.util.ArrayList;

public class Batallon {

    private String identificacion;
    private ArrayList<Soldado> soldados;

    public Batallon(String identificacion) {
        this.identificacion = identificacion;
        soldados = new ArrayList<>();
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public void addSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public void removeSoldado(Soldado soldado) {
        soldados.remove(soldado);
    }
}
