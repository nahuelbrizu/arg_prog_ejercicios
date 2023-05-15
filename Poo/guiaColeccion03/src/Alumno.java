import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    private String nombre;
    ArrayList<Integer> notas = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }


    public double notaFinal() {
        double promedio = 0.0;
        for (Integer nota : notas) {
            promedio += nota;
        }
        promedio /= notas.size();
        return promedio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }


}


        /*
             Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
             alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
                con sus 3 notas.

         */