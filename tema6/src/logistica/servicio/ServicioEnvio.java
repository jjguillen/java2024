package logistica.servicio;
import java.util.ArrayList;

public class ServicioEnvio {

    private ArrayList<Envio> envios;

    public ServicioEnvio() {
        this.envios = new ArrayList<Envio>();
    }

    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
    }

    public void generarInformeEnvios() {
        int contador = 1;
        for(Envio envio: this.envios) {
            System.out.println("Envío " + contador++ + " -----------------------------------");
            envio.listarProductos();
            System.out.println("Costo total del envío: " + envio.calcularCostoTotalEnvio() + " €");
            System.out.println("Días transcurridos: " + envio.diasTranscurridos() + " días");
        }
    }
}
