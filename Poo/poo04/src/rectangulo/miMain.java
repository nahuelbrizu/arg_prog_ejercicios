package rectangulo;

import java.util.Scanner;

public class miMain {
    public static void main(String[] args) {
        Rectangulo re = new Rectangulo();
        Scanner inp = new Scanner(System.in);


        System.out.print("ingrese el la base : ");

        double base = inp.nextDouble();

        System.out.print("ingrese el altura : ");

        double altura = inp.nextDouble();

        re.crearRectangulo(base, altura);

        double superficie = re.superficie();
        double perimetro = re.perimetro();

        re.dibujarRectangulo();
        System.out.println("");
        System.out.println(" la superficie es  : " + superficie);
        System.out.println(" el perimetro es  : " + perimetro);

    }
}
