package graff;

import graff.coordenadas.Posiciones;
import graff.opmatematicas.funciones.Lineal;

import java.util.ArrayList;
import java.util.HashMap;

import static graff.Graficador.graficar;

public class Main {
    public static void main(String[] args) {
        Lineal funcionLineal = new Lineal(2, 0);
        Posiciones posiciones = funcionLineal.calcularValores(-10, 30);
        graficar(posiciones.getPosicionesMap());
    }
}
