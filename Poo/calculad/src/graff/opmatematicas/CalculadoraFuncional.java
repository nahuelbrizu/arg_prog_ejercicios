package graff.opmatematicas;


import graff.Posiciones;

public interface CalculadoraFuncional {
    double crearOperacion(double x, Posiciones posiciones);

    Posiciones calcularValores(int desde, int hasta);

    double calcularLineal(double x, double a, double b);

    double calcularCuadratica(double x, double a, double b, double c);

    double calcularCubica(double x, double a, double b, double c, double d);

    double calcularSeno(double x);

    double calcularCoseno(double x);

    double calcularTangente(double x);

    double calcularLogaritmoNatural(double x);

    double calcularExponencial(double x);
}

