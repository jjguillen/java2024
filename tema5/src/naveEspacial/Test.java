package naveEspacial;

public class Test {

    public static void main(String[] args) {

        Arma ar1 = new Arma("Cañón láser v1", 100, false);
        NaveEspacial n1 = new NaveEspacial("Halcón milenario", NaveEspacial.TipoNave.CAZA);

        System.out.println(n1);
    }
}
