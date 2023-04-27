package colegio;



public class Escuela {
    private Estudiante[] estudiantes;

    public Escuela() {
        estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Nahuel", 9.5);
        estudiantes[1] = new Estudiante("Maria", 8.2);
        estudiantes[2] = new Estudiante("Pedro", 6.7);
        estudiantes[3] = new Estudiante("Luisa", 9.0);
        estudiantes[4] = new Estudiante("Carlos", 7.8);
        estudiantes[5] = new Estudiante("Sofia", 8.5);
        estudiantes[6] = new Estudiante("Andres", 6.0);
        estudiantes[7] = new Estudiante("Ana", 7.2);
    }

    public double calcularPromedio() {
        double sumaNotas = 0.0;
        for (Estudiante e : estudiantes) {
            sumaNotas += e.getNota();
        }
        return sumaNotas / estudiantes.length;
    }

    public String[] obtenerNombresNotasMayoresAlPromedio() {
        double promedio = calcularPromedio();
        int cantidadNotasMayores = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNota() > promedio) {
                cantidadNotasMayores++;
            }
        }
        String[] nombresNotasMayores = new String[cantidadNotasMayores];
        int i = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNota() > promedio) {
                nombresNotasMayores[i] = e.getNombre();
                i++;
            }
        }
        return nombresNotasMayores;
    }

    public Estudiante[] obtenerEstudiantesNotasMayoresAlPromedio() {
        double promedio = calcularPromedio();
        int cantidadEstudiantesNotasMayores = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNota() > promedio) {
                cantidadEstudiantesNotasMayores++;
            }
        }
        Estudiante[] estudiantesNotasMayores = new Estudiante[cantidadEstudiantesNotasMayores];
        int i = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNota() > promedio) {
                estudiantesNotasMayores[i] = e;
                i++;
            }
        }
        return estudiantesNotasMayores;
    }
}