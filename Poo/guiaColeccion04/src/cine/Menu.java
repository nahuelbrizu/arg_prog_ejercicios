package cine;

import java.util.Scanner;

public class Menu {

    public static void menu() {


        Scanner inp = new Scanner(System.in);
        int opcion = 0;

        while(opcion !=4)

        {
            System.out.println("----- Menu de Servicio de Peliculas -----");
            System.out.println("1. Ingresar pelicula");
            System.out.println("2. Ordenar peliculas por duracion (de mayor a menor)");
            System.out.println("3. Mostrar peliculas");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = inp.nextInt();
            inp.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println();
                    ServicioPelicula.ingresarPeli();
                    break;
                case 2:
                    System.out.println();
                    ServicioPelicula.ordenarPelis();
                    System.out.println("Las peliculas se han ordenado correctamente.");
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    ServicioPelicula.mostarPelis();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, ingrese una opcion valida.");
                    System.out.println();
                    break;
            }
        }
    }
}

