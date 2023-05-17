package cine;

import java.util.Scanner;

import static cine.ServicioPelicula.peliculas;

public class Menu {

    public static void menu() {


        Scanner inp = new Scanner(System.in);
        int opcion = 0;

        while(opcion !=4)

        {
            System.out.println("----- Menu de Servicio de Peliculas -----");
            System.out.println("1. Ingresar pelicula");
            System.out.println("2. Ordenar peliculas)");
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
                    System.out.println("Seleccione el tipo de ordenación:");
                    System.out.println("1. Ordenar películas de mayor a menor duración");
                    System.out.println("2. Ordenar películas de menor a mayor duración");
                    System.out.println("3. Ordenar películas por título alfabéticamente");
                    System.out.println("4. Ordenar películas por director alfabéticamente");
                    System.out.println();
                    int opcionOrdenacion = inp.nextInt();
                    System.out.println();
                    switch (opcionOrdenacion) {
                        case 1:
                            ServicioPelicula.ordenarPelisMayorAmenor(peliculas);
                            break;
                        case 2:
                            ServicioPelicula.ordenarPelisMenorAmayor(peliculas);
                            break;
                        case 3:
                            ServicioPelicula.ordenarPelisPorTitulo(peliculas);
                            break;
                        case 4:
                            ServicioPelicula.ordenarPelisPorDirector(peliculas);
                            break;
                        default:
                            System.out.println("Opción de ordenación inválida. No se realizará ninguna acción.");
                            System.out.println();
                            break;
                    }
                    System.out.println("Las películas se han ordenado correctamente.");
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

