package grafficador;
public class FuncionLineal extends Funcion {

    private final double pendiente;
    private final double ordenada;

    public FuncionLineal(double pendiente, double ordenada) {
        this.pendiente = pendiente;
        this.ordenada = ordenada;
    }

    public double pendiente() {
        return pendiente;
    }

    public double getOrdenada() {
        return ordenada;
    }

    @Override
    public double evaluar(double x) {
        return pendiente * x + ordenada;
    }

    @Override
    public String toString() {
        return String.format("y = %.2fx + %.2f", pendiente, ordenada);
    }
}
