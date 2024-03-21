package Geometria;

public class Main {
    public static void main(String[] args) {

        double altoRect = 1;
        double anchoRect = 1;
        double ladoCuad = 1;

        Rectangulo rectangulo = new Rectangulo(altoRect, anchoRect);
        Cuadrado cuadrado = new Cuadrado(ladoCuad);

        double areaRect = rectangulo.calcularArea();
        double perimetroRect = rectangulo.calcularPerimetro();
        double hipotenusaRect = rectangulo.calcularHipotenusa();

        double areaCuad = cuadrado.calcularArea();
        double perimetroCuad = cuadrado.calcularPerimetro();
        double hipotenusaCuad = cuadrado.calcularHipotenusa();

    }
}