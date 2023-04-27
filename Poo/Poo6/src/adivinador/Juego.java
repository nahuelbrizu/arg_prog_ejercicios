package adivinador;

import java.util.Random;
import java.util.Scanner;

/*
Crea una clase "Juego" que tenga un método "iniciar_juego"
 que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número
 el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos
 recibe una pista de "más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número
 el número de veces que cada jugador ha ganado.
 */
public class Juego {

    private int num;
    private int cont;
    public void iniciarJuego(){

    }

    public Juego() {
    }

    public Juego(int num, int cont){
        this.num = num;
        this.cont = cont;
    }

    public int getNum() {return num;}

    public void setNum(int num) {
        this.num = num;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }


    public void crearJuego(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int jugador, numeroJugador1, numeroJugador2, numeroAleatorio;

        System.out.println("Bienvenido al juego de dos jugadores. ");
        System.out.print("Seleccione su jugador (1 o 2): ");
        jugador = sc.nextInt();

        if (jugador == 1) {
            System.out.println("Has seleccionado el jugador 1.");
            System.out.println("El jugador 2 deberá adivinar el número que pienses.");


            System.out.print("Jugador 1, piensa un número entre 1 y 10. : ");
            numeroAleatorio = random.nextInt(10) + 1;

            // Pedir al jugador 2 que adivine el número
            for (int i = 0; i < 5; i++) {
                System.out.println("Jugador 2, intento #" + (i+1) + ":");
                numeroJugador2 = sc.nextInt();

                if (numeroJugador2 == numeroAleatorio) {
                    System.out.println("¡Felicidades, has adivinado el número!");
                    return;
                }
            }

            System.out.println("Lo siento, el número era " + numeroAleatorio + ". El juego ha terminado.");

        } else if (jugador == 2) {
            System.out.println("Has seleccionado el jugador 2.");
            System.out.println("Deberás adivinar el número que piense el jugador 1.");

            System.out.println("Jugador 1, piensa un número entre 1 y 100.");
            numeroJugador1 = sc.nextInt();

            // Pedir al jugador 2 que adivine el número
            for (int i = 0; i < 5; i++) {
                System.out.println("Intento #" + (i+1) + ":");
                numeroJugador2 = sc.nextInt();

                if (numeroJugador2 == numeroJugador1) {
                    System.out.println("¡Felicidades, has adivinado el número!");
                    return;
                }
            }

            System.out.println("Lo siento, no has logrado adivinar el número. El juego ha terminado.");

        } else {
            System.out.println("Selección inválida. Debe elegir el jugador 1 o el jugador 2.");
        }

    }
}



