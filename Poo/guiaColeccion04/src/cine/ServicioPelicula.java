package cine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ServicioPelicula extends Pelicula {
    private static ArrayList<Pelicula> peliculas = new ArrayList<>();
    static Scanner inp = new Scanner(System.in).useDelimiter("\n");

    public static void ingresarPeli(){
        /*
            En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
            todos sus datos y guardándolos en el objeto Pelicula.
            Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
            crear otra Pelicula o no.
         */
        boolean crearOtra = true;

        while (crearOtra) {


            System.out.println("----Ingresar los datos de la pelicula----");
            System.out.print("ingrese el titulo de la pelicula : ");
            String titulo = inp.nextLine();
            System.out.print("ingrese el titulo de la director : ");
            String director = inp.nextLine();
            System.out.print("ingrese el titulo de la duracion : ");
            int duracion = inp.nextInt();
            inp.nextLine(); // Limpiar el buffer de entrada
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula); // Agrego a la lista peliculas
            System.out.print("¿ Desea crear otra pelicula? (Si/No): ");
            String respuesta = inp.nextLine();

            if (respuesta.equalsIgnoreCase("No")) {
                crearOtra = false;
            }

        }

    }

    public static void ordenarPelis(){
        /*
        • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
            pantalla.
        • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
            pantalla.
        • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
        • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
         */

        //         • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion).reversed());
        System.out.println("Peliculas ordenadas por duracion (de mayor a menor):");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " - Duración: " + pelicula.getDuracion() + " minutos");
        }
        System.out.println();

        // • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
        //            pantalla.
        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion));
        System.out.println("Peliculas ordenadas por duracion (de menor a mayor):");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " - Duración: " + pelicula.getDuracion() + " minutos");
        }
        System.out.println();

        // Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));
        System.out.println("Peliculas ordenadas por titulo:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo());
        }
        System.out.println();

        //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));
        System.out.println("Peliculas ordenadas por Director:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " - Director: " + pelicula.getDirector());
        }

    }


    public static void mostarPelis(){
        /*
        • Mostrar en pantalla todas las películas.
        • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
         */
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas para mostrar.");
        } else {
            System.out.println("Peliculas Guardadas:");
            for (Pelicula pelicula : peliculas) {
                System.out.println(pelicula + " ");
                if (pelicula.getDuracion() > 1) {
                    System.out.println("Peliculas mayores a una hora : ");
                    System.out.println(pelicula + " ");
                }
            }
        }
    }




}

/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */