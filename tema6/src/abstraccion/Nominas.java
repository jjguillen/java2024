package tema6.src.abstraccion;

import java.util.ArrayList;

public class Nominas {
    private ArrayList<Persona> empleados = new ArrayList<>();

    public Nominas() {
    }

    public void imprimirNominas() {
        for(Persona p : empleados) {
            System.out.println(p.calcularNominaMensual());
        }
    }
}
