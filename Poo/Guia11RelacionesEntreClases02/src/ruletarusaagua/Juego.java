package ruletarusaagua;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        //este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
        if (jugadores.size() >= 6) {
            jugadores = new ArrayList<Jugador>(jugadores.subList(0, 6)); // si hay más de 6 jugadores, solo se toman los primeros 6
        }
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(){
        revolver.llenarRevolver();

    }
    public void ronda(){
        // cada ronda consiste en un jugador que se apunta con el revolver de agua y
        //aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
        //moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
        //mojar. Al final del juego, se debe mostrar que jugador se mojó.
        //Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
        boolean mojado = false;

        for (Jugador jugador: jugadores){
            mojado = jugador.disparo(revolver);
            System.out.println(jugador.getNombre());
            if(jugador.disparo(revolver)){
                System.out.println(jugador.getNombre() + " se mojo. Perdio el juego.");
                    return;
            }
            System.out.println(jugador.getNombre() + " se salvo!");
        }
        System.out.println("Todos los jugadores se salvaron. Se empieza una nueva ronda.");
        ronda();
    }
    public void jugar() {
        llenarJuego();
        ronda();
        for (Jugador jugador : jugadores) {
            if (jugador.getMojado()) {
                System.out.println(jugador.getNombre() + " fue el perdedor del juego.");
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Juego{" +
                "jugadores=" + jugadores +
                ", revolver=" + revolver +
                '}';
    }
}



/*
--Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.

Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */