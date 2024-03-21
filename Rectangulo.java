package Geometria;

public class Rectangulo extends FiguraGeometrica {
    public Rectangulo(double alto, double ancho) {
        super(alto, ancho);
    }
    @Override
    public double calcularArea() {
        return alto * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (alto + ancho);
    }

    @Override
    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(alto, 2) + Math.pow(ancho, 2));
    }
}
