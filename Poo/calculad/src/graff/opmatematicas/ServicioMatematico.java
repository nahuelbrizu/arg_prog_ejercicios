package graff.opmatematicas;


import graff.Posiciones;


public class ServicioMatematico {

    public static double crearOperacion(double x, String operacion) {
        double resultado = 0;
        switch (operacion) {
            case "sin":
                resultado = Math.sin(x);
                break;
            case "cos":
                resultado = Math.cos(x);
                break;
            case "tan":
                resultado = Math.tan(x);
                break;
            case "log":
                resultado = Math.log(x);
                break;
            case "exp":
                resultado = Math.exp(x);
                break;
            case "sqrt":
                resultado = Math.sqrt(x);
                break;
            case "pow":
                resultado = Math.pow(x, 2);
                break;
        }
        return resultado;
    }

    public static Posiciones calcularValores(int desde, int hasta, String operacion) {
        Posiciones posiciones = new Posiciones();
        for (int i = desde; i <= hasta; i++) {
            double resultado = crearOperacion(i, operacion);
            posiciones.agregarCoordenadas(i, (int) resultado);
        }
        return posiciones;
    }
}
