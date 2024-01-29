package herencia;

public class Cliente extends Persona {

    private String numCuentaCliente;
    private double cuotaMensual;


    public Cliente(String nombre, String telefono, String email, String ciudad, String direccion,
                   String numCuentaCliente, double cuotaMensual) {
        super(nombre, telefono, email, ciudad, direccion);
        this.numCuentaCliente = numCuentaCliente;
        this.cuotaMensual = cuotaMensual;
    }

    public String getNumCuentaCliente() {
        return numCuentaCliente;
    }

    public void setNumCuentaCliente(String numCuentaCliente) {
        this.numCuentaCliente = numCuentaCliente;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("numCuentaCliente='").append(numCuentaCliente).append('\'');
        sb.append(", cuotaMensual=").append(cuotaMensual);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public void contratarTarifaFibra() {
        System.out.println("Son 50€");
    }
}
