package adivinador;

import java.util.Scanner;

public class Player {
    private String name;
    private int puntaje = 0;


    public void player(){
    }

    public void player(String name , int puntaje){
        this.name = name;
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, int puntaje) {
        this.name = name;
    }
    public String createPlayer(String name){
        Scanner inp = new Scanner(System.in);
        System.out.print("ingresa tu nombre : ");
        name = inp.next();
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }
}
