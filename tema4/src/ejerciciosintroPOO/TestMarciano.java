package ejerciciosintroPOO;

import org.w3c.dom.ls.LSOutput;

public class TestMarciano {

    public static void main(String[] args) {

        Marciano m1 = new Marciano();
        Marciano m2 = new Marciano("Marciano jefe", 100);

        System.out.println(m1);
        System.out.println(m2);

        for(int i=0; i<50; i++) {
            Marciano mm = new Marciano();
        }

        System.out.println(Marciano.numMarcianos);

        m2.muerto();
        m2 = null; //Destruir el objeto

        System.out.println(Marciano.numMarcianos);
    }


}
