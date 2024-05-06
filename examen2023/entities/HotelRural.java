package examen2023.entities;

public class HotelRural extends Hotel {

    private boolean calefaccion;

    public HotelRural(String nombre, String direccion, String localidad, String provincia,
                      Integer numHabitaciones, Double precioNoche, Integer calificacion, boolean calefaccion) {
        super(nombre, direccion, localidad, provincia, numHabitaciones, precioNoche, calificacion);
        this.calefaccion = calefaccion;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HotelRural {");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", provincia='").append(provincia).append('\'');
        sb.append(", numHabitaciones=").append(numHabitaciones);
        sb.append(", precioNoche=").append(precioNoche);
        sb.append(", calificacion=").append(calificacion);
        sb.append(", calefaccion=").append(calefaccion);
        sb.append('}');
        return sb.toString();
    }
}
