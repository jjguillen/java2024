package examen2024.app;

import examen2024.io.DAOTicketsSoporte;
import examen2024.services.ServicioSoporte;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        ServicioSoporte ss = DAOTicketsSoporte.cargarCSV();

        ss.getTecnicos().forEach(System.out::println);
    }
}
