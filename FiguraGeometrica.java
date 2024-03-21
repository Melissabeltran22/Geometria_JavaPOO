package Geometria;
public class FiguraGeometrica {
    protected double alto;
    protected double ancho;

    public FiguraGeometrica(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    public double calcularHipotenusa() {
        return alto * alto + ancho * ancho;
    }
}
