package pack.funcion;

import pack.coord.Posiciones;

public class Exponencial implements Calculadora {
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


    public double crearOperacion(double x, Calculadora exponencial) {
        Exponencial exponencial1 = (Exponencial) exponencial;
        return Math.pow(exponencial1.getBase(), exponencial1.getExponente() * x);

    }

    public Posiciones calcularValores(int desde, double hasta, double incremento, Calculadora exponencial) {
        Exponencial exponencial1 = (Exponencial) exponencial;
        Posiciones posiciones = new Posiciones();
        for (int x = desde; x <= hasta; x += incremento) {
            double y = crearOperacion(x, exponencial1);
            posiciones.agregarCoordenada(x, y);
        }
        return posiciones;
    }
}
