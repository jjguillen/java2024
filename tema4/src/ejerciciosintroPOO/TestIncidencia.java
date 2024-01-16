package ejerciciosintroPOO;

public class TestIncidencia {

    public static void main(String[] args) {
        Incidencia inc1 = new Incidencia("I001", "Farola rota en calle nosequé", null);
        Incidencia inc2 = new Incidencia("I002", "Tubería rota en calle nosequé2", null);
        Incidencia inc3 = new Incidencia("I003", "Borracho durmiendo en calle nosequé2", null);
        Incidencia inc4 = new Incidencia("I004", "Papelera rota en calle nosequé2", null);

        System.out.println("El número de incidencias pendientes es " + Incidencia.getPendientes());

        inc1.resuelve("Han cambiado la bombilla");
        inc4.resuelve("Cambio de papelera nueva");

        System.out.println(inc1);
        System.out.println("El número de incidencias pendientes es " + Incidencia.getPendientes());



    }

}
