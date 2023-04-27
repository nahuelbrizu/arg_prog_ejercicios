package packag.graficar;

import java.util.ArrayList;
import java.util.HashMap;

public class Graficador {
    public static void graficar(HashMap<Integer, ArrayList<Double>> map) {
        int alto = 20;
        int mitadAlt = alto / 2;
        int largo = 50;
        int mitadLarg = largo / 2;
        String li  = "";
        for (int i = alto; i >= 0; i--) {
            for (int x = 0; x <= largo; x++) {
                if (map.containsKey(x - mitadLarg) && map.get(x - mitadLarg).contains((double) i - mitadAlt)) {
                    System.out.print("*");
                    li +="*";

                } else if (x == mitadLarg) {
                    System.out.print("\u001B[31m");
                    System.out.print("|");
                    System.out.print("\u001B[0m");
                    li +="|";
                } else if (i == mitadAlt) {
                    System.out.print("\u001B[31m");
                    System.out.print("-");
                    System.out.print("\u001B[0m");
                    li +="=";
                } else {
                    System.out.print("-");
                    li += "-";
                }
            }
            System.out.println("");
        }
    }
}
