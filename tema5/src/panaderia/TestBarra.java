package panaderia;

public class TestBarra {

    public static void main(String[] args) {
        BarraDePan b1 = new BarraDePan(7, 4, 25);
        BarraDePan b2 = new BarraDePan(8, 4, 25);


        b1.setLargo(8);
        System.out.println(b1.getLargo());

        System.out.println(b1);

        if (b1.equals(b2)) { //Comparar objetos b1 == b2
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        //b2 = null; //Destruir un objeto

        BarraDePan b3 = new BarraDePan(b1);
        BarraDePan b4 = new BarraDePan(b3);
        System.out.println("Largo de b3 " +  b3.getLargo());

        BarraDePan.incrementarNumeroBarras();
        BarraDePan.incrementarNumeroBarras();

        System.out.println(BarraDePan.getNumeroBarras());
        System.out.println(BarraDePan.getNumeroBarras());
        System.out.println(BarraDePan.getNumeroBarras());
        System.out.println(BarraDePan.getNumeroBarras());

        System.out.println("NumBarras para todos: " + BarraDePan.getNumeroBarras());

        System.out.println(b1.getCantLevadura());
        b1.meterLevadura(b2);
        System.out.println(b1.getCantLevadura());
        System.out.println(b2.getCantLevadura());

        BarraDePan b8 = new BarraDePan();
        System.out.println(b8);

        b8 = null;
        System.gc();

        BarraDePan b9 = new BarraDePan(20, 5);
        System.out.println(b9);


    }
}
