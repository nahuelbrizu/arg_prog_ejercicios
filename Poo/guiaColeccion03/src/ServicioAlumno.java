import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioAlumno {

    static Scanner inp =  new Scanner(System.in).useDelimiter("\n");

    static boolean exit = false;
    private static List<Alumno> listaAlumnos = new ArrayList<>();

    public void AlumnoService() {
        this.listaAlumnos = listaAlumnos;
    }

        public void crearAlumnos() {
            Scanner scanner = new Scanner(System.in);

            String opcion;
            do {
                System.out.print("Ingrese el nombre del alumno: ");
                String nombre = scanner.nextLine();
                ArrayList<Integer> notas = new ArrayList<>();
                for (int i = 1; i <= 3; i++) {
                    System.out.print("Ingrese la nota " + i + ": ");
                    int nota = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después de leer la nota
                    notas.add(nota);
                }
                Alumno alumno = new Alumno(nombre, notas);
                listaAlumnos.add(alumno);

                System.out.print("¿Desea crear otro alumno? (s/n): ");
                opcion = scanner.nextLine();
            } while (opcion.equalsIgnoreCase("s"));
        }

        public static void notaFinal() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
            String nombre = scanner.nextLine();

            boolean encontrado = false;
            for (Alumno alumno : listaAlumnos) {
                String foundName = alumno.getNombre();
                if (foundName.equalsIgnoreCase(nombre)) {
                    double notaFinal = alumno.notaFinal();
                    System.out.println("La nota final de " + alumno.getNombre() + " es: " + notaFinal);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("El alumno no se encuentra en la lista.");
            }
        }


}


/*
En el servicio de Alumnos deberemos tener un bucle que crea un objeto Alumnos.
Se pide toda la información al usuario y ese Alumnos se guarda en una lista de tipo Alumnos y
se le pregunta al usuario si quiere crear otro Alumnos o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumnos:

Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */