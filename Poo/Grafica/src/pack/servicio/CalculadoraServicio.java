package pack.servicio;


import pack.coord.Posiciones;
import pack.funcion.Cuadratica;
import pack.funcion.Exponencial;
import pack.funcion.Lineal;
import pack.funcion.Logaritmica;

import pack.graff.Graficador;
import pack.graff.Graficador2;


public class CalculadoraServicio {


    public static void   CalculadoraServicio(){
        Lineal lineal =  Servicio.crearLineal();
        Posiciones posiciones = lineal.calcularValores(-2000,2000,1, lineal);
        Graficador.graficar(posiciones.getPosicionesMap());
        Graficador2.graficar2(posiciones.getPosicionesMap());


        Cuadratica cuadratica = Servicio.crearCuadratica();
        Posiciones posiciones1 = cuadratica.calcularValores(-2000, 2000 , 1, cuadratica);
        Graficador.graficar(posiciones1.getPosicionesMap());
        Graficador2.graficar2(posiciones1.getPosicionesMap());

        Exponencial exponencial = Servicio.crearExponencial();
        Posiciones posiciones2 = exponencial.calcularValores(-2000,2000,1, exponencial);
        Graficador.graficar(posiciones2.getPosicionesMap());
        Graficador2.graficar2(posiciones2.getPosicionesMap());

        Logaritmica logaritmica = Servicio.crearLogaritmica();
        Posiciones posiciones3 = logaritmica.calcularValores(-2000,2000,1 , logaritmica);
        Graficador.graficar(posiciones3.getPosicionesMap());
        Graficador2.graficar2(posiciones3.getPosicionesMap());

    }
}
