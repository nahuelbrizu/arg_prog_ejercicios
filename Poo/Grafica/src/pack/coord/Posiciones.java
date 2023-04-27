package pack.coord;

import java.util.ArrayList;
import java.util.HashMap;


public class Posiciones {
    private final HashMap<Integer, ArrayList<Double>> posicionesMap;
    public Posiciones() {
        this.posicionesMap = new HashMap<>();
    }


    public  HashMap<Integer, ArrayList<Double>> getPosicionesMap() {
        return posicionesMap;
    }

    // X deberia ser incrementar para que la linea escale en el grafico
    public void agregarCoordenada(int x, double y) {
        if (!posicionesMap.containsKey(x)) {
            posicionesMap.put(x, new ArrayList<>());
        }
        posicionesMap.get(x).add(y);
    }

}
