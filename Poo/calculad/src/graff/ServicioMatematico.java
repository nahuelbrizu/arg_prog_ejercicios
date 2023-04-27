package graff;


import graff.opmatematicas.CalculadoraFuncional;

public class ServicioMatematico {

    public static double funcionLineal(double x, double pendiente, double ordenada) {
        return pendiente * x + ordenada;
    }

    public static double funcionCuadratica(double x, double a, double b, double c) {
        return a * x * x + b * x + c;
    }

    public static double funcionExponencial(double x, double a, double b) {
        return a * Math.pow(b, x);
    }

    public static double funcionLogaritmica(double x, double a, double b, double c) {
        return a * Math.log(x - b) + c;
    }

    public static Posiciones crearOperacion(double desde, double hasta, double incremento, CalculadoraFuncional funcion) {
        Posiciones posiciones = new Posiciones();
        for (double x = desde; x <= hasta; x += incremento) {
            double y = funcion.crearOperacion(x, posiciones);
            posiciones.agregarCoordenadas((int)x,(int) y);
        }
        return posiciones;
    }
}
