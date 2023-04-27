package reloj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la hora:");
        int hora = scanner.nextInt();
        System.out.print("Ingrese los minutos:");
        int minutos = scanner.nextInt();

        System.out.print("Ingrese los segundos:");
        int segundos = scanner.nextInt();

        Tiempo tiempo = new Tiempo(hora, minutos, segundos);

        while (true) {
            tiempo.imprimirHoraCompleta();
            tiempo.avanzarUnSegundo();
            try {
                Thread.sleep(500); // Esperar un segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
