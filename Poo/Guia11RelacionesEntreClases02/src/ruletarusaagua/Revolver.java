package ruletarusaagua;

import java.util.Random;

public class Revolver {
    private int posActual;
    private int posAgua;

    public Revolver() {
    }

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    public void  llenarRevolver(){
        //• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
        //deben ser aleatorios.
        Random rand = new Random();
        posActual = rand.nextInt(6);
        posAgua = rand.nextInt(6);

    }

    public boolean mojar(){
        //• mojar(): devuelve true si la posición del agua coincide con la posición actual
       return posActual == posAgua;
    }
    public void siguienteChorro(){
        //• siguienteChorro(): cambia a la siguiente posición del tambor
        posActual = (posActual + 1) % 6;
    }

    @Override
    public String toString() {
        return "Posición actual: " + posActual + ", Posición del agua: " + posAgua;
    }
}



/*
--Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.

Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

 */