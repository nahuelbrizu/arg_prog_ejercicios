package graff.opmatematicas.funciones;

import graff.coordenadas.Posiciones;
import graff.opmatematicas.CalculadoraFuncional;

public abstract class Exponencial implements CalculadoraFuncional {
    private double base;
    private double exponente;

    public Exponencial() {
    }

    public Exponencial(double base, double exponente) {
        this.base = base;
        this.exponente = exponente;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getExponente() {
        return exponente;
    }

    public void setExponente(double exponente) {
        this.exponente = exponente;
    }


    public double crearOperacion(double x, Posiciones posiciones) {
        return Math.pow(base, exponente * x);

    }

    public Posiciones calcularValores(double desde, double hasta, double incremento) {
        Posiciones posiciones = new Posiciones();
        for (double x = desde; x <= hasta; x += incremento) {
            crearOperacion(x, posiciones);
        }
        return posiciones;
    }
}
