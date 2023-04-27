package pack.servicio;

import pack.funcion.Cuadratica;
import pack.funcion.Exponencial;
import pack.funcion.Lineal;
import pack.funcion.Logaritmica;

import java.util.Scanner;

public class Servicio {
    private static Scanner inp = new Scanner(System.in).useDelimiter("\n");

    public static Lineal crearLineal() {
        Lineal lineal = new Lineal();
        System.out.print(" ingrese la pendiente : ");
        lineal.setPendiente(inp.nextDouble());
        System.out.print(" ingrese la ordenada : ");
        lineal.setOrdenadaAlOrigen(inp.nextDouble());
        return lineal;
    }
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
    public static Exponencial crearExponencial(){
        Exponencial expoenencial = new Exponencial();
        System.out.print(" ingrese la base : ");
        expoenencial.setBase(inp.nextDouble());
        System.out.print(" ingrese la exponenete : ");
        expoenencial.setExponente(inp.nextDouble());
        return expoenencial;
    }

    public static Logaritmica crearLogaritmica(){
        Logaritmica logaritmica = new Logaritmica();
        System.out.print("ingrese la base : ");
        logaritmica.setBase(inp.nextDouble());
        return logaritmica;
    }

}
