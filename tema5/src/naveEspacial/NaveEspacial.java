package naveEspacial;

import java.util.Objects;

public class NaveEspacial {

    public enum TipoNave { CRUCERO, CAZA, DESTRUCTOR }

    private String nombre;
    private TipoNave tipo;
    private Arma canionDelantero;
    private Arma canionTrasero;
    private Arma canionSuperior;

    public NaveEspacial(String nombre, TipoNave tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.canionDelantero = null;
        this.canionTrasero = null;
        this.canionSuperior = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoNave getTipo() {
        return tipo;
    }

    public void setTipo(TipoNave tipo) {
        this.tipo = tipo;
    }

    public Arma getCanionDelantero() {
        return canionDelantero;
    }

    public Arma getCanionTrasero() {
        return canionTrasero;
    }

    public Arma getCanionSuperior() {
        return canionSuperior;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NaveEspacial{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", canionDelantero=").append(canionDelantero);
        sb.append(", canionTrasero=").append(canionTrasero);
        sb.append(", canionSuperior=").append(canionSuperior);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NaveEspacial that = (NaveEspacial) o;
        return Objects.equals(nombre, that.nombre) && tipo == that.tipo && Objects.equals(canionDelantero, that.canionDelantero) && Objects.equals(canionTrasero, that.canionTrasero) && Objects.equals(canionSuperior, that.canionSuperior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, canionDelantero, canionTrasero, canionSuperior);
    }

    public boolean equipar(Arma arma) {
        boolean result = false;

        //Orden de las armas: Delantera, Trasera, Superior
        //1. Es un cañón triple
        if (arma.isEsTriple()) {
            if (this.canionDelantero != null) {
                return false;
            } else {
                this.canionDelantero = arma;
                this.canionTrasero = arma;
                this.canionSuperior = arma;
                return true;
            }
        }

        //2. Es un cañón normal
        if (!arma.isEsTriple()) {
            //1. Delantera libre
            if (this.canionDelantero == null) {
                this.canionDelantero = arma;
                return true;
            }
            //2. Delantera ocupada, trasera libre
            else if (this.canionTrasero == null) {
                this.canionTrasero = arma;
                return true;
            }
            //3. Deltantera ocupada, trasera ocupada, superior libre
            else if (this.canionSuperior == null) {
                this.canionSuperior = arma;
                return true;
            }
            //4. Todas ocupadas
            else {
                return false;
            }

        }


        return result;
    }
}
