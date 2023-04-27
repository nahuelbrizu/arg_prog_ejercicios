package pack.funcion;


import pack.coord.Posiciones;


public class Cuadratica implements Calculadora {
    private double a;
    private double b;
    private double c;

    public Cuadratica() {
    }

    public Cuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public static double crearOperacion(double x, Calculadora cuadratica) {
        Cuadratica cuadratica1 = (Cuadratica) cuadratica;
        return cuadratica1.getA() * x * x + cuadratica1.getB() + cuadratica1.getC();
    }
    public Posiciones calcularValores(int desde, double hasta, double incremento, Calculadora cuadratica) {
        Cuadratica cuadratica1 = (Cuadratica) cuadratica;
        Posiciones posiciones = new Posiciones();
        for (int x = desde; x <= hasta; x += incremento) {
            double y = crearOperacion(x, cuadratica1);
            posiciones.agregarCoordenada(x, y);
        }
        return posiciones;
    }

    @Override
    public String toString() {
        return "Cuadratica{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }


}
