package Calcu;

import java.util.Scanner;

public class Operacion {
    private double num1;
    private double num2;


    public Operacion() {
    }
    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    public void crearOperacion() {
        Scanner inp = new Scanner(System.in);
        System.out.print("ingrese el primer num : ");
        this.num1 = inp.nextDouble();
        System.out.print("ingrese el segundo num : ");
        this.num2 = inp.nextDouble();

    }

    public double suma(){
        return num1 + num2;
    }
    public double resta(){
        return num1 - num2;

    }
    public double multi(){
        if (num1 == 0 || num2 == 0) {
            System.out.println("error : multiplicacion por 0");
            return 0;
        } else   return num1 * num2;

    }
    public double div(){
        if (num2 == 0) {
            System.out.println("error : division por 0");
            return 0;
        } else return num1 / num2;
    }

}
