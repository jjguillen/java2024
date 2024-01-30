package electrodomesticos;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Lavadora l1 = new Lavadora("Bosh", "Caña2000", 400, 40,
                Electrodomestico.Clase.B, Electrodomestico.Color.Gris, 10);

        Lavadora l2 = new Lavadora("Bosh", "Caña1000", 300, 30,
                Electrodomestico.Clase.E, Electrodomestico.Color.Negro, 8);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime resolución TV ");
        Television.Tecnologia tec = Television.Tecnologia.valueOf(sc.nextLine());

        Television t1 = new Television("LG", "E2000", 2000, 15,
                Electrodomestico.Clase.C, Electrodomestico.Color.Negro, 55, tec, Television.Resolucion._4K);

        ArrayList<Electrodomestico> mediamarkt = new ArrayList<>();
        mediamarkt.add(l1);
        mediamarkt.add(l2);
        mediamarkt.add(t1);

        for(Electrodomestico elec: mediamarkt) {
            System.out.println(elec.precioFinal());
        }




    }



}
