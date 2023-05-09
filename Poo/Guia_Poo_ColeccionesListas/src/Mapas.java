import java.util.*;

public class Mapas {
    // MAPAS //
    ///Los mapas modelan un objeto a través de una llave y un valor.
    // las implementaciones de mapas son HashMap, TreeMap, LinkedHashMap y HashTable.
    //remove(llave): Este método remueve la primera aparición de la llave de un elemento a borrar en
    //un mapa.

    //Un HashMap, almacena pares clave / valor en una tabla hash, y los elementos no están ordenados de ninguna manera.
    //ofrece un rendimiento de tiempo constante en operaciones básicas
    public static HashMap<Integer, Integer> hashMap = new HashMap<>();

    public static void setHashMap(){
        for (int i = 5; i >= 0; i--) {
            int x = (int) (Math.random() * i+100);
            hashMap.put(i , x);
        }
        //Para recorrer mapas vamos a tener que usar el objeto Map.Entry en el for each.
        for (Map.Entry<Integer,Integer> list : hashMap.entrySet()) {
            System.out.println("HashMap ID: " + list.getKey() + "HashMap " + list.getValue());
        }
    }


    // TreeMap
    //Los TreeMaps en Java se ordenará según el orden natural de las claves
    //se agrega un bit adicional a cada nodo que etiqueta al nodo como negro o rojo.
    // Este equilibrio es importante porque el rendimiento está directamente relacionado con la altura del árbol.
    public static TreeMap<Integer,Integer> treeMap =new TreeMap<>();
    public static void setTreeMap(){
        for (int i = 5; i >= 0; i--) {
            int x = (int) (Math.random() * i+100);
            treeMap.put(i , x);
        }
        for (Map.Entry<Integer,Integer> list : treeMap.entrySet()) {
            System.out.println("treeMap ID: " + list.getKey() + "treeMap"+ list.getValue());
        }
    }

    // LinkedHashMap
    //  agrega una lista vinculada a la estructura del HashMap.
    //  Esto significa que obtenemos los beneficios de rendimiento de un HashMap, con ordenamiento (orden en que se insertaron los elementos).
    public static LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
    public static void setLinkedHashMap(){
        for (int i = 5; i >= 0; i--) {
            int x = (int) (Math.random() * i+100);
            linkedHashMap.put(i , x);
        }
        for (Map.Entry<Integer,Integer> list : linkedHashMap.entrySet()) {
            System.out.println("linkedHashMap ID: " + list.getKey() + "linkedHashMap "+ list.getValue());
        }
    }

}
