import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ejercicio01guiaColecciones {
    static ArrayList<String> bebidas = new ArrayList<>();

    public static void agregarBebidas(){
        bebidas.add("cafe");
        bebidas.add("te");
        bebidas.add("Mate ");
        System.out.println("tambaño : " + bebidas.size());;
        System.out.println(
                "obtener2 "+ bebidas.get(2)
        );;


        //Colections

        Collections.sort(bebidas);
        //fill(List<T> lista, Objeto objeto) Este método reemplaza todos los elementos de la lista con un
        Iterator<String> it = bebidas.iterator();


        while(it.hasNext()){
            if(it.next().contains("cafe")) {
                 it.remove();
            }
            System.out.println(bebidas + "");
        }
    }

}
