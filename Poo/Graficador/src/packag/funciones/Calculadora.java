package packag.funciones;

import packag.coordenadas.Posiciones;

public interface Calculadora {
    Posiciones calcularValores(int desde, double hasta, double incremento, Calculadora calculadora);
}
