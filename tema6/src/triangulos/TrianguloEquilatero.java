package triangulos;

public class TrianguloEquilatero extends Triangulo {
    public TrianguloEquilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    public double area() {
        return (Math.sqrt(3) / 4) * Math.pow(this.lado1,2);
    }
}
