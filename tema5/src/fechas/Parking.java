package fechas;
import java.time.Duration;
import java.time.LocalTime;

public class Parking {

    private int numPlazas;
    private LocalTime horaEntrada;

    public Parking(int numPlazas, LocalTime horaEntrada) {
        this.numPlazas = numPlazas;
        this.horaEntrada = horaEntrada;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Parking{");
        sb.append("numPlazas=").append(numPlazas);
        sb.append(", horaEntrada=").append(horaEntrada);
        sb.append('}');
        return sb.toString();
    }

    public long minutosTranscurridos() {
        Duration dr = Duration.between(this.horaEntrada, LocalTime.now());
        return dr.getSeconds()/60;
    }
}
