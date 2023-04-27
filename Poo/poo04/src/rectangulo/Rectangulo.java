package rectangulo;

import java.util.Scanner;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double base() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void altura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;

    }
    public void dibujarRectangulo(){

        for (int y = 0; y < this.altura; y++){
            for (int x = 0; x < this.base; x++){
                if(y == 0 || y == this.altura -1 || x == this.base -1 || x == 0 ){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }

    }

    public double superficie() {
        return this.base * this.altura;
    }

    public double perimetro() {
        return (this.base * this.altura) * 2;
    }
}
