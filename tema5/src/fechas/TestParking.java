package fechas;

import java.time.LocalTime;

public class TestParking {

    public static void main(String[] args) {
        Parking pr1 = new Parking(100, LocalTime.of(16,00,05));

        System.out.println(pr1);
        System.out.println(pr1.minutosTranscurridos() + " minutos");
    }
}
