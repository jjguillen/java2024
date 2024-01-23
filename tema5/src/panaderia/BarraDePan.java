package panaderia;

import java.util.Objects;

public class BarraDePan {

    private int largo;
    private int ancho;
    private int cantLevadura;

    private static int numeroBarras;


    //Constructor por defecto
    public BarraDePan() {
        this.largo = 5;
        this.ancho = 2;
        this.cantLevadura = 15;
    }

    //Constructor definido, le paso el valor de las propiedades
    public BarraDePan(int largo, int ancho, int cantLevadura) {
        this.largo = largo;
        this.ancho = ancho;
        this.cantLevadura = cantLevadura;
    }

    //Constructor definido
    public BarraDePan(int largo, int ancho){
        this.largo = largo;
        this.ancho = ancho;
        this.cantLevadura = 15;
    }

    //Constructor copia: le paso como parámetro otro objeto
    public BarraDePan(BarraDePan otra) {
         this.largo = otra.largo;
         this.ancho = otra.ancho;
         this.cantLevadura = otra.cantLevadura;
    }

    public int getLargo() {
        return this.largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return this.ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getCantLevadura() {
        return cantLevadura;
    }

    public void setCantLevadura(int cantLevadura) {
        this.cantLevadura = cantLevadura;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BarraDePan{");
        sb.append("largo=").append(largo);
        sb.append(", ancho=").append(ancho);
        sb.append(", cantLevadura=").append(cantLevadura);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        System.out.println("Estoy dentro de equals");
        if (o == null || this.getClass() != o.getClass()) return false;
        BarraDePan that = (BarraDePan) o;
        return this.largo == that.largo && ancho == that.ancho && cantLevadura == that.cantLevadura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(largo, ancho, cantLevadura);
    }

    public static int getNumeroBarras() {
        return numeroBarras;
    }

    public static void incrementarNumeroBarras() {
        BarraDePan.numeroBarras++;
    }

    public void meterLevadura(BarraDePan otra) {
        otra.cantLevadura = 100;
        this.cantLevadura += otra.cantLevadura;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalizando objeto");
    }
}
