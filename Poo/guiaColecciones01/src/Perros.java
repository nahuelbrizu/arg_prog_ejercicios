import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Perros {
    private String raza;
    private ArrayList<String> listaPerros = new ArrayList<>();


    public ArrayList<String> getListaPerros() {
        return listaPerros;
    }

    public void setListaPerros(ArrayList<String> listaPerros) {
        this.listaPerros = listaPerros;
    }

    public Perros() {
    }

    public Perros(String raza) {
        this.raza = raza;
        listaPerros.add(raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void agregarPerro(String raza){
        this.raza = raza;
        listaPerros.add(raza);
    }
    public void verPerros(){
        for (String perro : getListaPerros()) {
            System.out.println(perro);
        }
    }

    public void eliminarPerro() {
        Collections.sort(getListaPerros());
        Scanner scanner = new Scanner(System.in);
        if (!getListaPerros().isEmpty()) {
            System.out.print("Ingrese el perro que desea eliminar: ");
            String perro = scanner.nextLine();
            Iterator<String> iterator = getListaPerros().iterator();
            while (iterator.hasNext()) {
                String perroActual = iterator.next();
                if (perroActual.equals(perro)) {
                    iterator.remove();
                    System.out.println(perro + " Perro eliminado de la lista.");
                    break; // Se encontró y eliminó el perro, se sale del bucle
                }
            }
            if (!iterator.hasNext()) {
                System.out.println("El perro no se encuentra en la lista.");
            }
        } else {
            System.out.println("La lista de perros está vacía.");
        }
    }


    @Override
    public String toString() {
        return "Perros{" +
                "raza='" + raza + '\'' +
                ", listaPerros=" + listaPerros +
                '}';
    }
}
   /*
        Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
        programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
        después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
        salir, se mostrará todos los perros guardados en el ArrayList.
         */