package packag.servicio;

import packag.funciones.Cuadratica;

import java.util.Scanner;
public class ServicioCuadratica {
    private static Scanner inp = new Scanner(System.in).useDelimiter("\n");
    public static Cuadratica crearCuadratica() {
        Cuadratica cuadratica = new Cuadratica();
        System.out.print(" ingrese la cuadratico : ");
        cuadratica.setA(inp.nextDouble());
        System.out.print(" ingrese la lineal : ");
        cuadratica.setB(inp.nextDouble());
        System.out.print(" ingrese la independiente : ");
        cuadratica.setC(inp.nextDouble());
        return cuadratica;
    }

    public static double crearOperacion(double x, Cuadratica cuadratica) {
        return cuadratica.getA() * x * x + cuadratica.getB() + cuadratica.getC();
    }
}
