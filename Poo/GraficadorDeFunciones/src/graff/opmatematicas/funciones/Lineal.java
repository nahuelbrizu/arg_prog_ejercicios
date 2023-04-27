package graff.opmatematicas.funciones;

import graff.coordenadas.Posiciones;
import graff.opmatematicas.CalculadoraFuncional;

public class Lineal implements CalculadoraFuncional {
    private double pendiente;
    private static double ordenada;


    public Lineal(double pendiente, double ordenada) {
        this.pendiente = pendiente;
        this.ordenada = ordenada;

    }

    public double getPendiente() {
        return pendiente;
    }

    public void setPendiente(double pendiente) {
        this.pendiente = pendiente;
    }

    public static double getOrdenada() {
        return ordenada;
    }

    public static void setOrdenada(double ordenada) {
        Lineal.ordenada = ordenada;
    }

    public double crearOperacion(double x, Posiciones posiciones) {
        return ordenada  * x + pendiente + ordenada;
    }

    public Posiciones calcularValores(double desde, double hasta) {
        Posiciones posiciones = new Posiciones();
        for (double x = desde; x <= hasta; x++) {
            double y = crearOperacion(x, posiciones);
            posiciones.agregarCoordenadas(x, y);
        }
        return posiciones;
    }



}