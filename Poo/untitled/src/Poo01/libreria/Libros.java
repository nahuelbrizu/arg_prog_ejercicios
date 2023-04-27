package Poo01.libreria;

import java.util.Scanner;

public class Libros {

    private String isbn;
    private String titulo;
    private String author;
    private String numPag;

    public Libros() {
    }

    public Libros(String isbn, String titulo, String author, String numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.author = author;
        this.numPag = numPag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNumPag() {
        return numPag;
    }

    public void setNumPag(String numPag) {
        this.numPag = numPag;
    }

    public void llenarLibros(String isbn, String titulo, String author, String numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.author = author;
        this.numPag = numPag;
    }

    public void mostrarLibro(){
        System.out.println("isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", author='" + author + '\'' +
                ", numPag='" + numPag + '\'' );
    }
}
