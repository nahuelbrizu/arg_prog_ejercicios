package Radio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();

        Scanner inp = new Scanner(System.in).useDelimiter("\n");
        System.out.print("ingrese el Radio : ");
        double rad = inp.nextDouble();
        c1.crearCircunferencia(rad);
        c1.mostrarCircunferencia();
    }
}
