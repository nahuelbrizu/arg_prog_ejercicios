import java.util.*;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println("------TREE SET----");
        List.insertTreeSet();
        System.out.println("-----HashSet-----");
        List.insertHashSet();
        System.out.println("-----HASH-----");
        List.insertHash();
        System.out.println("-----LINKED LIST-----");
        List.insertLinkedList();
        System.out.println("-----ARRAY LISST-----");
        List.insertArrList();



            System.out.println("------HasMAP----");
            Mapas.setHashMap();
            System.out.println("------TREE MAP----");
            Mapas.setTreeMap();
            System.out.println("---linked HashMap----");
            Mapas.setLinkedHashMap();


 */
/*
        Iteratorr.insertHashSet();
        Iteratorr.insertArrList();
        System.out.println("------HasMAP----");

        Iteratorr.insertHash();
        Iteratorr.insertLinkedList();
        Iteratorr.insertHashSet();
        Iteratorr.insertTreeSet();
*/

    ArrayList<Libros> libros = new ArrayList<>();
    Libros libro = new Libros();

    libros.add(libro.crearLibro());


    for (Libros ejemplar:libros){
        System.out.println(ejemplar);
    }

    ejercicio01guiaColecciones.agregarBebidas();

    }
}
