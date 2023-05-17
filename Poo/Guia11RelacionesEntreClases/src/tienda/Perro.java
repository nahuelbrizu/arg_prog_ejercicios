package tienda;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private double tamano;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
}
/*
Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y
 */