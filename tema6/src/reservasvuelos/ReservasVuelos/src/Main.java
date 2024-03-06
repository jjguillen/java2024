import entidades.Pasajero;
import entidades.TipoAsiento;
import entidades.TipoTarifa;
import entidades.Vuelo;
import servicios.Atrapame;
import servicios.ReservaVuelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("RESERVAS VUELOS");

        //Crear 5 pasajeros
        Pasajero p1 = new Pasajero(1l, "Javier", "Guillén", "48484848F", "jj@gmail.com" ,
                "Micasa", "Mojacar", "España", "77899987", "Alérgico gluten",
                "ninguna");
        Pasajero p2 = new Pasajero(2l, "Ana", "Gómez", "41340440A", "ana@gmail.com" ,
                "Micasa", "Vera", "España", "77899981", "Alérgico gluten",
                "ninguna");
        Pasajero p3 = new Pasajero(3l, "Andrés", "Valero", "51999393B", "andres@gmail.com" ,
                "Micasa", "Garrucha", "España", "66899987", "Alérgico gluten",
                "ninguna");
        Pasajero p4 = new Pasajero(4l, "Verónica", "García", "22334455C", "vero@gmail.com" ,
                "Micasa", "Palomares", "España", "77899666", "Alérgico gluten",
                "ninguna");
        Pasajero p5 = new Pasajero(5l, "Juan", "Martínez", "33445599D", "juan@gmail.com" ,
                "Micasa", "Carboneras", "España", "55899987", "Alérgico gluten",
                "ninguna");

        //Crear 100 vuelos
        Atrapame atr = new Atrapame();
        for(int i=0; i<1000; i++) {
            atr.addVuelo( new Vuelo("RG56Z-"+i, "Madrid", "Los Ángeles",
                    LocalDate.of(2024,i%12 + 1,i%27 + 1), LocalTime.of(16,00),
                    500.0 + i*10, 150) );
        }

        Vuelo vueloAtr = atr.getVuelos().get(0);

        //Reserva 1
        ArrayList<Pasajero> pasajeros1 = new ArrayList<>();
        pasajeros1.add(p1);
        pasajeros1.add(p2);
        atr.crearReserva(vueloAtr, pasajeros1, TipoTarifa.OPTIMA, TipoAsiento.BUSINESS);

        //Reserva 2
        ArrayList<Pasajero> pasajeros2 = new ArrayList<>();
        pasajeros2.add(p3);
        pasajeros2.add(p4);
        atr.crearReserva(vueloAtr, pasajeros2, TipoTarifa.FLEXIBLE, TipoAsiento.TURISTA);

        //Reserva 3
        ArrayList<Pasajero> pasajeros3 = new ArrayList<>();
        pasajeros3.add(p1);
        pasajeros3.add(p5);
        atr.crearReserva(vueloAtr, pasajeros3, TipoTarifa.CONFORT, TipoAsiento.TURISTA);

        //Reserva 4
        ArrayList<Pasajero> pasajeros4 = new ArrayList<>();
        pasajeros4.add(p1);
        pasajeros4.add(p2);
        pasajeros4.add(p3);
        atr.crearReserva(vueloAtr, pasajeros4, TipoTarifa.OPTIMA, TipoAsiento.BUSINESS);

        //Reserva 5
        ArrayList<Pasajero> pasajeros5 = new ArrayList<>();
        pasajeros5.add(p3);
        pasajeros5.add(p4);
        pasajeros5.add(p5);
        atr.crearReserva(vueloAtr, pasajeros4, TipoTarifa.OPTIMA, TipoAsiento.TURISTA);

        //System.out.println(vueloAtr);

        System.out.println(atr.getReservas());
        System.out.println(atr.buscarReservas("48484848F"));

        atr.buscarVuelos(LocalDate.of(2024,2,2), "Los Ángeles").stream()
                .forEach(v -> System.out.println(v.getCodigo()));





    }
}