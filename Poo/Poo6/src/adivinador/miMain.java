package adivinador;

public class miMain {
    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();
        p1.createPlayer("Player1");
        p2.createPlayer("Player2");


        Juego j1 = new Juego();
        j1.crearJuego();




    }
}
