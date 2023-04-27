package pack.funcion;


import pack.coord.Posiciones;

public class Lineal implements Calculadora {
    private double pendiente;
    private double ordenadaAlOrigen;

    public Lineal() {
    }

    public Lineal(double pendiente, double ordenadaAlOrigen) {
        this.pendiente = pendiente;
        this.ordenadaAlOrigen = ordenadaAlOrigen;
    }



    public double getPendiente() {
        return pendiente;
    }

    public void setPendiente(double pendiente) {
        this.pendiente = pendiente;
    }

    public double getOrdenadaAlOrigen() {
        return ordenadaAlOrigen;
    }

    public void setOrdenadaAlOrigen(double ordenadaAlOrigen) {
        this.ordenadaAlOrigen = ordenadaAlOrigen;
    }

    public static double crearOperacion(double x, Calculadora lineal) {
        Lineal lineal1 = (Lineal)lineal;
        return lineal1.getPendiente() * x + lineal1.getOrdenadaAlOrigen();
    }
    public Posiciones calcularValores(int desde, double hasta, double incremento, Calculadora lineal) {
        Lineal lineal1 = (Lineal)lineal;
        Posiciones posiciones = new Posiciones();
        for (int x = desde; x <= hasta; x += incremento) {
            double y = crearOperacion(x, lineal1);
            posiciones.agregarCoordenada(x, y);
        }
        return posiciones;
    }
    @Override
    public String toString() {
        return "Lineal{" +
                "pendiente=" + pendiente +
                ", ordenadaAlOrigen=" + ordenadaAlOrigen +
                '}';
    }
}

