package appbanco;

public class Banco {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta();

        c1.crearCuenta("nahuel", 3000.00);
        c1.retirar_dinero();
    }
}
