package frac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Servicio servicio = new Servicio();

        System.out.println("Ingrese el numerador de la primera fracción:");
        int numerador1 = scanner.nextInt();
        System.out.println("Ingrese el denominador de la primera fracción:");
        int denominador1 = scanner.nextInt();
        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);

        System.out.println("Ingrese el numerador de la segunda fracción:");
        int numerador2 = scanner.nextInt();
        System.out.println("Ingrese el denominador de la segunda fracción:");
        int denominador2 = scanner.nextInt();
        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Sumar fracciones");
        System.out.println("2. Restar fracciones");
        System.out.println("3. Multiplicar fracciones");
        System.out.println("4. Dividir fracciones");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Fraccion resultadoSuma = servicio.sumar(fraccion1, fraccion2);
                System.out.println(fraccion1 + " + " + fraccion2 + " = " + resultadoSuma);
                break;
            case 2:
                Fraccion resultadoResta = servicio.restar(fraccion1, fraccion2);
                System.out.println(fraccion1 + " - " + fraccion2 + " = " + resultadoResta);
                break;
            case 3:
                Fraccion resultadoMultiplicacion = servicio.multiplicar(fraccion1, fraccion2);
                System.out.println(fraccion1 + " * " + fraccion2 + " = " + resultadoMultiplicacion);
                break;
            case 4:
                Fraccion resultadoDivision = servicio.dividir(fraccion1, fraccion2);
                System.out.println(fraccion1 + " / " + fraccion2 + " = " + resultadoDivision);
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}
