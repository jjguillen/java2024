package ejerciciosintroPOO;

public class Incidencia {

    enum Estado { ABIERTA, ENPROCESO, RESUELTA };

    private String codigo;
    private Estado estado;
    private String problema;
    private String solucion;

    //Propiedad estática para llevar el número de incidencias pendientes
    private static int pendientes = 0;

    public Incidencia(String codigo, String problema, String solucion) {
        this.codigo = codigo;
        this.estado = Estado.ABIERTA;
        this.problema = problema;
        this.solucion = solucion;

        //Incrementar el número de incidencias pendientes.
        Incidencia.pendientes++;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public static int getPendientes() {
        return Incidencia.pendientes;
    }

    public void resuelve(String solucion) {
        this.estado = Estado.RESUELTA;
        this.solucion = solucion;

        Incidencia.pendientes--;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incidencia{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucion='").append(solucion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
