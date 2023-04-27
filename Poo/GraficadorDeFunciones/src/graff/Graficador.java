package graff;

import java.util.ArrayList;
import java.util.HashMap;

public class Graficador {
    public static void graficar(HashMap<Integer, ArrayList<Double>> map) {
        int alto = 40;
        int mitadAlt = alto / 2;
        int largo = 80;
        int mitadLarg = largo / 2;
        String li  = "";
        for (int i = alto; i >= 0; i--) {
            for (int x = 0; x <= largo; x++) {
                if (map.containsKey(i) && map.get(i).contains((double) (x - mitadLarg))) {
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
