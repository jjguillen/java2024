package examen2023.io;

import examen2023.entities.Hotel;
import examen2023.entities.HotelPlaya;
import examen2023.entities.HotelRural;
import examen2023.entities.Reserva;
import examen2023.services.Buking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DAOReservas {

    public static Buking cargarCSV() throws IOException {
        Path hotelesFile = Paths.get(".","examen2023", "resources", "hoteles.csv");
        Path reservasFile = Paths.get(".", "examen2023", "resources", "reservas.csv");

        Buking buk = new Buking();

        //LEER HOTELES
        List<Hotel> hoteles = Files.lines(hotelesFile)
                .map( linea -> {
                    String[] cad = linea.split(",");

                    int tipoHotel = Integer.parseInt(cad[7]);
                    if (tipoHotel == 1) {
                        HotelRural hr = new HotelRural(cad[0],cad[1],cad[2],cad[3],
                                            Integer.parseInt(cad[4]),
                                            Double.parseDouble(cad[5]),
                                            Integer.parseInt(cad[6]),
                                            Boolean.parseBoolean(cad[8])
                                            );
                        return hr;
                    } else {
                        HotelPlaya hp = new HotelPlaya(cad[0],cad[1],cad[2],cad[3],
                                Integer.parseInt(cad[4]),
                                Double.parseDouble(cad[5]),
                                Integer.parseInt(cad[6]),
                                Boolean.parseBoolean(cad[8])
                        );
                        return hp;
                    }
                })
                .toList();

        buk.setHoteles(hoteles);

        //LEER RESERVAS
        Set<Reserva> reservas = Files.lines(reservasFile)
                .map( linea -> {
                    String[] cad = linea.split(",");

                    Hotel hotel = buk.findHotelById(Long.parseLong(cad[6]));

                    Reserva reserva = new Reserva(LocalDate.parse(cad[0]), LocalDate.parse(cad[1]),
                            Integer.parseInt(cad[2]), Integer.parseInt(cad[3]),
                            cad[4], cad[5], hotel);
                    return reserva;
                })
                .collect(Collectors.toSet());

        buk.setReservas(reservas);


        return buk;
    }

}
