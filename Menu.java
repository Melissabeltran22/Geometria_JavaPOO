import Geometria.Cuadrado;
import Geometria.Rectangulo;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> resultados = new ArrayList<>();
        int opcion;
        double alto, ancho;

        do {
            System.out.println("Seleccione la figura geométrica:");
            System.out.println("1. Rectángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el alto y ancho del rectángulo: --->");
                    alto = scanner.nextDouble();
                    ancho = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(alto, ancho);
                    resultados.add(rectangulo.calcularArea());
                    resultados.add(rectangulo.calcularPerimetro());
                    resultados.add(rectangulo.calcularHipotenusa());
                    break;
                case 2:
                    System.out.println("Ingrese el lado del cuadrado: --->");
                    alto = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(alto);
                    resultados.add(cuadrado.calcularArea());
                    resultados.add(cuadrado.calcularPerimetro());
                    resultados.add(cuadrado.calcularHipotenusa());
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 3);

        System.out.println("Resultados: --->");
        for (double resultado : resultados) {
            System.out.println(resultado);
        }

        scanner.close();
    }
}
