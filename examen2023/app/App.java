package examen2023.app;

import examen2023.io.DAOReservas;
import examen2023.services.Buking;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        Buking buk = DAOReservas.cargarCSV();

        buk.getHoteles().stream().forEach(System.out::println);
        buk.getReservas().stream().forEach(System.out::println);
    }
}
