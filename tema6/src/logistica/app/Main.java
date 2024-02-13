package logistica.app;

import logistica.entidades.NivelFragil;
import logistica.entidades.NivelRefrigeracion;
import logistica.entidades.ProductoFragil;
import logistica.entidades.ProductoRefrigerado;
import logistica.servicio.Envio;
import logistica.servicio.ServicioEnvio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        ProductoFragil pf1 = new ProductoFragil("TV Oled", 10, NivelFragil.N2);
        ProductoFragil pf2 = new ProductoFragil("Iphone 15 Pro", 0.1, NivelFragil.N1);
        ProductoFragil pf3 = new ProductoFragil("Piano cola", 100, NivelFragil.N2);

        ProductoRefrigerado pr1 = new ProductoRefrigerado("Tomates", 1000, NivelRefrigeracion.N2);
        ProductoRefrigerado pr2 = new ProductoRefrigerado("Aguacates", 300, NivelRefrigeracion.N1);
        ProductoRefrigerado pr3 = new ProductoRefrigerado("Pepinos", 500, NivelRefrigeracion.N2);

        Envio e1 = new Envio(false);
        Envio e2 = new Envio(true);
        e1.setFechaLLegada(LocalDate.now().plusDays(10));
        e1.agregarTransportable(pf1);
        e1.agregarTransportable(pf2);
        e1.agregarTransportable(pr1);

        e2.setFechaLLegada(LocalDate.now().plusDays(20));
        e2.agregarTransportable(pf3);
        e2.agregarTransportable(pr2);
        e2.agregarTransportable(pr3);

        ServicioEnvio se = new ServicioEnvio();
        se.agregarEnvio(e1);
        se.agregarEnvio(e2);

        se.generarInformeEnvios();




    }
}
