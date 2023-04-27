package graff;

import java.util.ArrayList;
import java.util.HashMap;

public class Posiciones {
    private final HashMap<Integer, ArrayList<Double>> posicionesMap;

    public Posiciones(){
        this.posicionesMap = new HashMap<>();
    }
    public HashMap<Integer, ArrayList<Double>> getPosicionesMap(){
        return posicionesMap;
    }
    public void agregarCoordenadas(int x, int y){
        if(!posicionesMap.containsKey(x)){
            posicionesMap.put(x, new ArrayList<>());
        }
        posicionesMap.get(x).add((double)y);
    }
}
