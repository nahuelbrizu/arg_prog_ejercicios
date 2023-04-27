package grafficador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graficador {
    public static HashMap<Integer, ArrayList<Double>> graficar(ArrayList<Funcion> funciones) {
        HashMap<Integer, ArrayList<Double>> map = new HashMap<Integer, ArrayList<Double>>();
        int alto = 20;
        int mitadAlt = alto / 2;
        int largo = 50;
        int mitadLarg = largo / 2;
        for (int i = alto; i >= -alto; i--) {
            ArrayList<Double> listaY = new ArrayList<Double>();
            for (int x = -mitadLarg; x <= mitadLarg; x++) {
                double y = 0;
                for (Funcion funcion : funciones) {
                    y += funcion.evaluar(x);
                }
                if (Math.round(y) == i) {
                    System.out.print("*");
                    listaY.add(y);
                } else if (x == 0 && i == mitadAlt) {
                    System.out.print("=");
                } else if (x == 0) {
                    System.out.print("|");
                } else if (i == mitadAlt) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            map.put(i, listaY);
        }
        return map;
    }

    public static void graficar(HashMap<Integer, ArrayList<Double>> posicionesF1, double ordenada) {
    }
}
