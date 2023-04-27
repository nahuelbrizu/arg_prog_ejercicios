package graff.opmatematicas.funciones;

import graff.coordenadas.Posiciones;
import graff.opmatematicas.CalculadoraFuncional;

public abstract class Seno implements CalculadoraFuncional {
    private double amplitud;
    private double frecuencia;
    private double fase;

    public Seno() {
    }

    public Seno(double amplitud, double frecuencia, double fase) {
        this.amplitud = amplitud;
        this.frecuencia = frecuencia;
        this.fase = fase;
    }

    public double getAmplitud() {
        return amplitud;
    }

    public void setAmplitud(double amplitud) {
        this.amplitud = amplitud;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getFase() {
        return fase;
    }

    public void setFase(double fase) {
        this.fase = fase;
    }

    public double crearOperacion(double x, Posiciones posiciones) {
        return amplitud * Math.sin(frecuencia * x + fase);
    }
    public Posiciones calcularValores(double desde, double hasta, double incremento) {
        Posiciones posiciones = new Posiciones();
        for (double x = desde; x <= hasta; x += incremento) {
            crearOperacion(x, posiciones);
        }
        return posiciones;
    }
}
