package tienda;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private  Perro perro;
    private String documento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad,  String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }
    public void adoptarPerro(Perro perro){
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public void mostrarInformacion() {
        System.out.println("----- Informacion del Dueno -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + documento);
        System.out.println("Perro :" + perro.getNombre());

        if (perro != null) {
            System.out.println();
            System.out.println("----- Informacion del Perro -----");
            System.out.println("Nombre: " + perro.getNombre());
            System.out.println("Raza: " + perro.getRaza());
            System.out.println("Edad: " + perro.getEdad());
            System.out.println("Tamano: " + perro.getTamano());
        } else {
            System.out.println("No se ha asignado un perro a esta persona.");
        }
    }
}
/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
 */