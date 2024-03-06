package tema6.src.abstraccion;

public class Directivo extends Persona {


    protected String cargo;
    protected double remuneracionAnual;
    protected int acciones;
    protected double plusNomina;

    public Directivo(String nombre, String apellidos, String email, String dni, String ciudad,
                    String cargo, double remuneracionAnual, int acciones, double plusNomina) {
        super(nombre, apellidos, email, dni, ciudad);
        this.cargo = cargo;
        this.remuneracionAnual = remuneracionAnual;
        this.acciones = acciones;
        this.plusNomina = plusNomina;
    }


    public double calcularNominaMensual() {
        return remuneracionAnual/12 + plusNomina;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getRemuneracionAnual() {
        return remuneracionAnual;
    }

    public void setRemuneracionAnual(double remuneracionAnual) {
        this.remuneracionAnual = remuneracionAnual;
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public double getPlusNomina() {
        return plusNomina;
    }

    public void setPlusNomina(double plusNomina) {
        this.plusNomina = plusNomina;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Directivo{");
        sb.append("cargo='").append(cargo).append('\'');
        sb.append(", remuneracionAnual=").append(remuneracionAnual);
        sb.append(", acciones=").append(acciones);
        sb.append(", plusNomina=").append(plusNomina);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
