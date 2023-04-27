package colegio;

public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();

        double promedio = escuela.calcularPromedio();
        System.out.println("El promedio de notas de todo el curso es: " + promedio);

        String[] nombresNotasMayoresAlPromedio = escuela.obtenerNombresNotasMayoresAlPromedio();
        System.out.println("Los estudiantes con notas mayores al promedio son:");
        for (String nombre : nombresNotasMayoresAlPromedio) {
            System.out.println(nombre);
        }

        Estudiante[] estudiantesNotasMayoresAlPromedio = escuela.obtenerEstudiantesNotasMayoresAlPromedio();
        System.out.println("Todos los estudiantes con una nota mayor al promedio son:");
        for (Estudiante e : estudiantesNotasMayoresAlPromedio) {
            System.out.println(e.getNombre() + " - Nota: " + e.getNota());
        }
    }

}




