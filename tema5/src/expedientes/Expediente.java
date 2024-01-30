package expedientes;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Objects;

public class Expediente {

    enum Modalidad { FPB, GRADOMEDIO, GRADOSUPERIOR }

    public static int totalExpedientes = 0;

    private final int id = totalExpedientes + 10000; //No puede cambiar
    private String nombre;
    private String apellidos;
    private char sexo;
    private LocalDate fechaNacimiento;
    private Modalidad modalidad;
    private int curso;
    private ArrayList<NotasCurso> calificaciones; //Array de elementos de la otra clase

    public Expediente(String nombre, String apellidos, char sexo, LocalDate fechaNacimiento,
                      Modalidad modalidad, int curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.modalidad = modalidad;
        this.curso = curso;

        //Inicializar ArrayList
        this.calificaciones = new ArrayList<>();

        //Incrementar el contador de expendientes
        Expediente.totalExpedientes++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public static int getTotalExpedientes() {
        return totalExpedientes;
    }

    public int getId() {
        return id;
    }

    public ArrayList<NotasCurso> getCalificaciones() {
        return calificaciones;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expediente{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", modalidad=").append(modalidad);
        sb.append(", curso=").append(curso);
        sb.append(", calificaciones=").append(calificaciones);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expediente that = (Expediente) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    /**
     * Con la fecha de nacimiento me calcula la edad
     * @return
     */
    public int getEdad() {
        Period periodo = Period.between(this.fechaNacimiento, LocalDate.now());
        return periodo.getYears();
    }

    /**
     * Dice si eres o no mayor de edad
     * @return true si tienes 18 o más años
     */
    public boolean mayorEdad() {
        return (this.getEdad() >= 18);
    }

    /**
     * Recorrer todas las notasCurso y ver que la nota final es mayor que 5 en todas
     * @return
     */
    private int getSuspensos() {
        int contSusp = 0;
        //Recorrer calificaciones
        for(NotasCurso nc : this.calificaciones) {
            if (nc.getNotaFinal() < 5)
                contSusp++;
        }

        return contSusp;
    }

    /**
     * Un alumno titula si no tiene ningún suspenso
     * @return true si no tiene suspenso. false en otro caso
     */
    public boolean titula() {
        return (this.getSuspensos() == 0);
    }

    /**
     * Suma las notas finales de cada materia que tiene y devuelve la media de todas
     * @return Media de las notas finales de las asignaturas
     */
    public double mediaExpendiente() {
        int total = this.calificaciones.size();
        int acumulador = 0;

        for(NotasCurso nc: this.calificaciones) {
            acumulador += nc.getNotaFinal();
        }

        return acumulador / (double) total;
    }

    /**
     * Añadir NotasCurso al array de calificaciones
     * @param nc NotasCurso
     */
    public void addCalificacion(NotasCurso nc) {
        this.calificaciones.add(nc);
    }

}
