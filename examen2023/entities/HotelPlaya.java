package examen2023.entities;

public class HotelPlaya extends Hotel {

    private boolean aireAcondicionado;

    public HotelPlaya(String nombre, String direccion, String localidad, String provincia,
                      Integer numHabitaciones, Double precioNoche, Integer calificacion, boolean aireAcondicionado) {
        super(nombre, direccion, localidad, provincia, numHabitaciones, precioNoche, calificacion);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HotelPlaya {");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", provincia='").append(provincia).append('\'');
        sb.append(", numHabitaciones=").append(numHabitaciones);
        sb.append(", precioNoche=").append(precioNoche);
        sb.append(", calificacion=").append(calificacion);
        sb.append(", aireAcondicionado=").append(aireAcondicionado);
        sb.append('}');
        return sb.toString();
    }
}
