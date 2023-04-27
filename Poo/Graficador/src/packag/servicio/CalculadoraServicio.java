package packag.servicio;

import packag.coordenadas.Posiciones;
import packag.funciones.Cuadratica;
import packag.funciones.Lineal;
import packag.graficar.Graficador;

public class CalculadoraServicio {


    public static void   CalculadoraServicio(){
        Lineal lineal =  ServicioLineal.crearLineal();
        Posiciones posiciones = lineal.calcularValores(-10,20,1, lineal);
        Graficador.graficar(posiciones.getPosicionesMap());

        Cuadratica cuadratica = ServicioCuadratica.crearCuadratica();
        Posiciones posiciones1 = cuadratica.calcularValores(-10, 20 , 1 , cuadratica);
        Graficador.graficar(posiciones1.getPosicionesMap());
    }
}
