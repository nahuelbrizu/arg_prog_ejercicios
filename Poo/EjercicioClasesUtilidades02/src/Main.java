import servicios.ParDeNumeros;
import servicios.ParDeNumerosService;

public class Main {
    public static void main(String[] args) {
        ParDeNumerosService numerosService = new ParDeNumerosService();
        ParDeNumeros a = numerosService.crearNums();
        numerosService.mostrarValores(a);
        numerosService.devolverMayor(a);
        numerosService.calcularPotencia(a);
        numerosService.calculaRaiz(a);
    }
}
