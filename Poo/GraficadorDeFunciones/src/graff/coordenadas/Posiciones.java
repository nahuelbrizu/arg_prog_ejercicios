package graff.coordenadas;

import java.util.ArrayList;
import java.util.HashMap;

public class Posiciones {
    private final HashMap<Integer, ArrayList<Double>> posicionesMap;

    public Posiciones() {
        this.posicionesMap = new HashMap<>();
    }

    public HashMap<Integer, ArrayList<Double>> getPosicionesMap() {
        return posicionesMap;
    }

    public void agregarCoordenadas(double x, double y) {
        if (!posicionesMap.containsKey((int) x)) {
            posicionesMap.put((int) x, new ArrayList<>());
        }
        posicionesMap.get((int) x).add(y);
    }
}
