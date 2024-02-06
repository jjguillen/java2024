package naveEspacial;

public class TestPartida {

    public static void main(String[] args) {

        Jugador jj = new Jugador("Aragorn", new Arma("Espada", 100, false),
                200, Jugador.Clase.PILOTO);
        Partida part = new Partida(jj);

        part.addMonstruo(new Monstruo("Malo1", 100, Monstruo.Clase.BICHO));
        part.addMonstruo(new Monstruo("Malo2", 100, Monstruo.Clase.BICHO));
        part.addMonstruo(new Monstruo("Malo3", 100, Monstruo.Clase.BICHO));
        part.addMonstruo(new Monstruo("Malo4", 100, Monstruo.Clase.BICHO));

        System.out.println(part);

        int turnos = 10;
        for(int i=0; i<turnos; i++) {

            if (part.getMonstruos().size() > 0) {
                Monstruo m = part.getMonstruos().get(0);

                //Combatir
                if (m.nombre.equals("Malo1")) {
                    part.removeMonstruo(m);
                }

                if (m.nombre.equals("Malo2")) {
                    System.out.println("Aquí estoy");
                }
            } else {
                System.out.println("Los has matado a todos");
            }



        }

        for(Monstruo m : part.getMonstruos()) {
            System.out.println(m.nombre);
        }


    }
}
