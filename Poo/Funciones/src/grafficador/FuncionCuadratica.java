package grafficador;

public class FuncionCuadratica extends Funcion {
    //a: coeficiente cuadrático
    //b: coeficiente lineal
    //c: término independiente
    private final double a;
    private final double b;
    private final double c;

    public FuncionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double evaluar(double x) {
        return a * x * x + b * x + c;
    }

    @Override
    public String toString() {
        return String.format("y = %.2fx^2 + %.2fx + %.2f", a, b, c);
    }
}

