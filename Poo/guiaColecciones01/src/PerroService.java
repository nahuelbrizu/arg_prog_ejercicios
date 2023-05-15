import java.util.*;

public class PerroService extends Perros{
    Scanner scanner = new Scanner(System.in);


    Perros p1 = new Perros();

    public void menu(){
        boolean exit = false;

        while (!exit) {
            System.out.println("----- Menu de Perros -----");
            System.out.println("1. Ingresar raza de perro");
            System.out.println("2. Guardar otro perro");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (option) {
                case 1:
                    System.out.print("Ingrese la raza del perro: ");
                    String breed = scanner.nextLine();
                    p1.agregarPerro(breed);
                    System.out.println("Raza de perro agregada: " + breed);
                    break;
                case 2:
                    System.out.print("¿Desea ingresar otro perro? (S/N): ");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("N")) {
                        exit = true;
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, ingrese una opcion valida.");
                    break;
            }
        }


       p1.eliminarPerro();
       p1.verPerros();
    }

}

   /*
        Continuando el ejercicio anterior,
        después de mostrar los perros,
        al usuario se le pedirá
        un perro y se recorrerá la lista con un Iterator,
        se buscará el perro en la lista. Si el perro
        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
        la lista ordenada.
    */
