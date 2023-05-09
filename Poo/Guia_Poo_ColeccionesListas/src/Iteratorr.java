import java.util.*;

public class Iteratorr {


    // LISTAS //

    // tamaño dinámico
    static ArrayList<Integer> arrList = new ArrayList<>();
    public static void insertArrList(){
        for (int i = 5; i >= 0; i--) {
            arrList.add(i);
        }
        Iterator iterator = arrList.iterator();
        System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println("arrList ITERATOR  : "+ iterator.next()+ "_");
        }
        System.out.println();

    }
    //lista de doble enlace es un tipo de lista enlazada que permite moverse hacia Adelante y hacia atrás.
    static LinkedList<Integer> linkList = new LinkedList<>();
    public static void insertLinkedList(){
        for (int i = 5; i >= 0; i--) {
            linkList.add(i);
        }

        Iterator iterator = linkList.iterator();
        System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println("linkList ITERATOR  : "+ iterator.next()+ "_");
        }
        System.out.println();


    }


    //da un valor único a cada elemento.  El conjunto de datos no se almacena en un orden específico
    static HashSet<String> hashSet = new HashSet<>();
    public static void insertHash(){
        for (int i = 5; i >= 0; i--) {
            String a = "";
            hashSet.add(a += i);
        }
        Iterator iterator = hashSet.iterator();
        System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println("hashSet ITERATOR  : "+ iterator.next()+ "_");
        }
        System.out.println();

    }

    //elementos de manera ordenada ascendente de menor a mayor. TreeSet No admite duplicados.,
    static TreeSet<Integer> treeSet = new TreeSet<>();
    public static void insertTreeSet(){
        for (int i = 5; i >= 0; i--) {
            treeSet.add(i);
        }

        Iterator iterator = treeSet.iterator();
        System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println("treeSet ITERATOR  : "+ iterator.next()+ "_");
        }
        System.out.println();
    }

    //  Los elementos del conjunto se encuentran en el orden que se insertan, similar a una lista pero sin dejar ingresar valores repetido.
    static LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    public static void insertHashSet(){
        for (int i = 5; i >= 0; i--) {
            String a = "";
            linkedHashSet.add(a);
        }

        Iterator iterator = linkedHashSet.iterator();
        System.out.println( iterator);

        while (iterator.hasNext()){
            System.out.println("linkedHashSet ITERATOR  : "+iterator.next());
        }
        System.out.println();

    }
}
