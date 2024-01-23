package arrayList;

public class TestTablero {

    public static void main(String[] args) {

        Tablero oca = new Tablero("La Oca");

        Casilla c1 = new Casilla(1, "Inicio");
        oca.addCasilla(c1);
        Casilla c2 = new Casilla(2, "Coche");
        oca.addCasilla(c2);
        oca.addCasilla(new Casilla(3, "Bicicleta"));

        System.out.println(oca);
    }
}
