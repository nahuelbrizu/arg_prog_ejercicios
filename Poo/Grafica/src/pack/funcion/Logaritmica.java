package pack.funcion;

import pack.coord.Posiciones;

public class Logaritmica implements  Calculadora{
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



    public double crearOperacion(double x, Calculadora logaritmica) {
        Logaritmica log = (Logaritmica) logaritmica;
        return Math.log(x) / Math.log(log.getBase());
    }

    public Posiciones calcularValores(int desde, double hasta, double incremento, Calculadora logaritmica) {
        Logaritmica log = (Logaritmica) logaritmica;
        Posiciones posiciones = new Posiciones();
        for (int x = desde; x <= hasta; x += incremento) {
            double y = crearOperacion(x, log);
            posiciones.agregarCoordenada(x, y);
        }
        return posiciones;
    }
}
