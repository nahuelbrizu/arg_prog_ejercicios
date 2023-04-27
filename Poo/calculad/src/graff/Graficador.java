package graff;

import java.util.ArrayList;
import java.util.HashMap;


import graff.opmatematicas.CalculadoraFuncional;

public class Graficador {
    public static HashMap<Integer, ArrayList<Character>> graficar(Posiciones posiciones, CalculadoraFuncional funcion, int ancho, int alto) {
        HashMap<Integer, ArrayList<Character>> mapaGrafico = new HashMap<>();
        int mitadAncho = ancho / 2;
        int mitadAlto = alto / 2;
        for (int y = mitadAlto; y >= -mitadAlto; y--) {
            ArrayList<Character> fila = new ArrayList<>();
            for (int x = -mitadAncho; x <= mitadAncho; x++) {
                char simbolo = ' ';
                if (x == 0 && y == 0) {
                    simbolo = '+';
                } else if (x == 0) {
                    simbolo = '|';
                } else if (y == 0) {
                    simbolo = '-';
                } else {
                    double resultado = funcion.crearOperacion(x, posiciones);
                    if (resultado != Double.NaN && Math.abs(resultado) <= (double) mitadAlto) {
                        simbolo = '*';
                    }
                }
                fila.add(simbolo);
            }
            mapaGrafico.put(y + mitadAlto, fila);
        }
        return mapaGrafico;
    }
}

