package tema7_parte2.soldados;

import java.util.ArrayList;

public class Batallon {

    private String identificacion;
    private ArrayList<Soldado> soldados;

    public Batallon(String identificacion) {
        this.identificacion = identificacion;
        soldados = new ArrayList<>();
    }

    public void addSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public void removeSoldado(Soldado soldado) {
        soldados.remove(soldado);
    }
}
