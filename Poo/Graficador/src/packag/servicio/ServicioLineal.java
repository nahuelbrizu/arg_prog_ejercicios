package packag.servicio;

import packag.funciones.Lineal;

import java.util.Scanner;

public class ServicioLineal {

    private static final Scanner inp = new Scanner(System.in).useDelimiter("\n");
    public static Lineal crearLineal() {
       Lineal lineal = new Lineal();
        System.out.print(" ingrese la pendiente : ");
       lineal.setPendiente(inp.nextDouble());
        System.out.print(" ingrese la ordenada : ");
       lineal.setOrdenadaAlOrigen(inp.nextDouble());
       return lineal;
    }


    public static double crearOperacion(double x, Lineal lineal) {
        return lineal.getPendiente() * x + lineal.getOrdenadaAlOrigen();
    }
}
    // cuadratica
    // exponenecial
