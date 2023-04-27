package appbanco;

import java.util.Scanner;

public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(){

    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void crearCuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }


    public void retirar_dinero() {
        Scanner inp = new Scanner(System.in);
        System.out.println("usted Tiene  : $" + saldo + " en su cuenta");
        System.out.print("cuanto dinero quiere retirar : ");
        double cantidad = inp.nextDouble();
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiraste $" + cantidad + ". Saldo restante: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar $" + cantidad);
        }
    }
}
