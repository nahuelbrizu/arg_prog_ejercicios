package miMain;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    public Empleado(){

    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }
    public void CrearEmpleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void calcular_aumento() {
        double aumento;

        if (edad > 30) {
            aumento = salario * 0.1;
        } else {
            aumento = salario * 0.05;
        }

        salario += aumento;
        System.out.println("El salario de " + nombre + " ha aumentado a $" + salario);
    }
}

