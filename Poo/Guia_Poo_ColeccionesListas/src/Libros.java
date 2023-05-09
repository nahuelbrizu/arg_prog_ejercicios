import java.util.Scanner;

public class Libros {
    private String nombre;
    private String autor;
    Scanner inp = new Scanner(System.in).useDelimiter("\n");


    public Libros() {
    }

    public Libros(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public  void setAutor(String autor) {
        this.autor = autor;
    }
    public Libros crearLibro(){
        System.out.print("ingrese el nombre del Libro: ");
        String nombre = inp.nextLine();
        System.out.print("ingrese el nombre del Author: ");
        String autor =  inp.nextLine();
        return new Libros(nombre, autor);
    }


    @Override
    public String toString() {
        return "Libros{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }


}
