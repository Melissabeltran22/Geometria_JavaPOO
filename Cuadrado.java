package Geometria;
public class Cuadrado extends FiguraGeometrica {
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public double calcularArea() {
        return alto * ancho; // En el caso del cuadrado, alto y ancho son iguales (lado)
    }

    @Override
    public double calcularPerimetro() {
        return 4 * alto; // En el caso del cuadrado, el perímetro es simplemente 4 veces el lado
    }
}
