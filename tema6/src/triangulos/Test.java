package triangulos;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();

        TrianguloEquilatero te1 = new TrianguloEquilatero(2,2,2);
        TrianguloRectangulo tr1 = new TrianguloRectangulo(2,2,2);
        //System.out.println(te1.area());

        triangulos.add(te1);
        triangulos.add(tr1);
        for(Triangulo t: triangulos) {
            System.out.println(t.area());
        }

    }
}
