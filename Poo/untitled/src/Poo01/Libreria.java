package Poo01;
import  Poo01.libreria.Libros;

import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        Libros l1 = new Libros();

        System.out.print(" ingrese el isbn del libro : ");
        String isbn = input.next();
        System.out.print(" ingrese el titulo del libro : ");
        String titulo = input.next();
        System.out.print(" ingrese el author del libro : ");
        String author = input.next();
        System.out.print(" ingrese el numPaginas del libro : ");
        String numPag = input.next();

         l1.llenarLibros(isbn,titulo,author, numPag);
         l1.mostrarLibro();




    }
}
