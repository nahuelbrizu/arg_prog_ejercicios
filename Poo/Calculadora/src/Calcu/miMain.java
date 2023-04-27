package Calcu;

import java.util.Scanner;

public class miMain {

    public static void main(String[] args) {

        Operacion n1 = new Operacion();
        Scanner inp = new Scanner(System.in);


        do {
            System.out.println("********************");
            System.out.println("****calculadora*****");
            System.out.println("ingrese S: para sumar");
            System.out.println("ingrese R: para restar");
            System.out.println("ingrese M: para Multiplicar");
            System.out.println("ingrese D: para Dividir");
            System.out.println("********************");
            System.out.print("ingrese la Operacion : ");
            String op = inp.next();
            op = op.toUpperCase();
            switch (op) {
                case "S":
                    n1.crearOperacion();
                    System.out.println("la suma es = " + n1.suma());
                    break;
                case "R":
                    n1.crearOperacion();
                    System.out.println("la resta es = " + n1.resta());
                    break;
                case "M":
                    n1.crearOperacion();
                    System.out.println("la multiplicacion es = " + n1.multi());
                    break;
                case "D":
                    n1.crearOperacion();
                    System.out.println("la division es = " + n1.div());
                    break;
                default:
                    System.out.println("El valor ingresado en la variable opcion es diferente");
            }
        }while (true);


    }
}
