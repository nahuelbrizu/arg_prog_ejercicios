package pack.funcion;

import pack.coord.Posiciones;

public interface Calculadora {
    Posiciones calcularValores(int desde, double hasta, double incremento, Calculadora calculadora);


    }
