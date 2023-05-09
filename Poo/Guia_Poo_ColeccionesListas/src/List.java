import java.util.*;

public class List {

    // LISTAS //
    //Las listas constan de dos métodos:
    //• remove(int índice): Este método remueve un elemento de un índice especifico. Esto mueve
    //los elementos, de manera que no queden índices sin elementos.
    //• remove(elemento): Este método remueve la primera aparición de un elemento a borrar en una


    // tamaño dinámico
    static ArrayList<Integer> arrList = new ArrayList<>();
    public static void insertArrList(){
        for (int i = 5; i >= 0; i--) {
            arrList.add(i);
        }
        for (int list : arrList) {
            System.out.println("insertArrList : " +list);
        }
    }
    //lista de doble enlace es un tipo de lista enlazada que permite moverse hacia Adelante y hacia atrás.
    static LinkedList<Integer> linkList = new LinkedList<>();
    public static void insertLinkedList(){
        for (int i = 5; i >= 0; i--) {
            linkList.add(i);
        }

        Iterator iterator = linkList.iterator();
        System.out.println("insertLinkedList ITERATOR  : "+ iterator);

        for (int list : linkList) {
            System.out.println("insertLinkedList : " +list);
        }
    }


    //da un valor único a cada elemento.  El conjunto de datos no se almacena en un orden específico
    static HashSet<String> hashSet = new HashSet<>();
    public static void insertHash(){
        for (int i = 5; i >= 0; i--) {
            String a = "";
            hashSet.add(a += i);
        }
        Iterator iterator = hashSet.iterator();
        System.out.println("insertLinkedList ITERATOR  : "+ iterator);
        for (String list : hashSet) {
            System.out.println("insertHash : " +list);
        }
    }

    //elementos de manera ordenada ascendente de menor a mayor. TreeSet No admite duplicados.,
    static TreeSet<Integer> treeSet = new TreeSet<>();
    public static void insertTreeSet(){
        for (int i = 5; i >= 0; i--) {
            treeSet.add(i);
        }

        Iterator iterator = treeSet.iterator();
        System.out.println("insertLinkedList ITERATOR  : "+ iterator);
        for (int list : treeSet) {
            System.out.println("insertTreeSet : " + list);
        }
    }

    //  Los elementos del conjunto se encuentran en el orden que se insertan, similar a una lista pero sin dejar ingresar valores repetido.
    static LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    public static void insertHashSet(){
        for (int i = 5; i >= 0; i--) {
            String a = "";
            linkedHashSet.add(a += i);
        }

        Iterator iterator = linkedHashSet.iterator();
        System.out.println("insertLinkedList ITERATOR  : "+ iterator);

        for (String list : linkedHashSet) {
            System.out.println("insertHashSet : " + list);
        }
    }

}
