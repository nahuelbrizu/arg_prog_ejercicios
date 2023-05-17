import tienda.Perro;
import tienda.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Persona p1 =  new Persona();
        Persona p2 = new Persona();
        Perro pe1 = new Perro("charly","callejero", 3, 23.49);
        Perro pe2 = new Perro("cogo","cruza", 10, 35.10);

        p1.setNombre("nahuel");
        p1.setApellido("Brizuela");
        p1.setDocumento("36902695");
        p1.setEdad(30);
        p1.adoptarPerro(pe1);
        p2.setNombre("lucas");
        p2.setApellido("rimbano");
        p2.setDocumento("36932323395");
        p2.setEdad(27);
        p2.adoptarPerro(pe2);
        System.out.println();
        p1.mostrarInformacion();
        System.out.println();
        p2.mostrarInformacion();
    }
}


/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros.
Después, vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
