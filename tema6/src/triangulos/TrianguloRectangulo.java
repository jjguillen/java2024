package triangulos;

public class TrianguloRectangulo extends Triangulo {

    public TrianguloRectangulo(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    public double area() {
        return (this.lado1 * this.lado2) / 2;
    }
}
