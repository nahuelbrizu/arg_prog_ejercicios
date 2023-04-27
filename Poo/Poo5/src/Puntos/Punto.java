package Puntos;

import java.util.Scanner;

public class Punto {
    private int x1, y1, x2, y2;
    public Punto() {
    }
    public Punto(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1x1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1y1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2x2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void crearPuntos(){
        Scanner inp = new Scanner(System.in);
        System.out.print("ingrese los puntos x del primer :");
        this.x1 = inp.nextInt();
        System.out.print("ingrese los puntos y del primer :");
        this.y1 = inp.nextInt();
        System.out.print("ingrese los puntos x2 del primer :");
        this.x2 = inp.nextInt();
        System.out.print("ingrese los puntos y2 del primer :");
        this.y2 = inp.nextInt();
    }

        public double distancia(){
        int op = (x2-x1)*(y2-y1) + (y2-y1)*(y2-y1);
        return  Math.sqrt(op);
    }
    //public double calcularDistancia() {
      //  double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        //return distancia;
   // }

}


/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
 Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto.
 Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
 */
