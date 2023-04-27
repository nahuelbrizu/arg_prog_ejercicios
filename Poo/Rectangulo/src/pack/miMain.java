package pack;

public class miMain {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.CrearRectangulo(4, 6);

        double area = rectangulo1.calcular_area();
        System.out.println("El área del rectángulo es: " + area);
    }
}
