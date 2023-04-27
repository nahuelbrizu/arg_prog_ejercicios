package graff.opmatematicas.funciones;

import graff.coordenadas.Posiciones;
import graff.opmatematicas.CalculadoraFuncional;

public abstract class Logaritmica implements CalculadoraFuncional {
    private double base;

    public Logaritmica() {
    }

    public Logaritmica(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }



    public double crearOperacion(double x, Posiciones posiciones) {
        return Math.log(x) / Math.log(base);

    }

    public Posiciones calcularValores(double desde, double hasta, double incremento) {
        Posiciones posiciones = new Posiciones();
        for (double x = desde; x <= hasta; x += incremento) {
            crearOperacion(x, posiciones);
        }
        return posiciones;
    }
}
