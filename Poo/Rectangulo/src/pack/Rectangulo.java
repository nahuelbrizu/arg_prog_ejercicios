package pack;



public class Rectangulo {
    private double lado1;
    private double lado2;
    public Rectangulo(){

    }
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void CrearRectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcular_area() {
        double area = lado1 * lado2;
        return area;
    }
}

