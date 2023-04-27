package servicios;

public class ParDeNumerosService {

    public ParDeNumeros crearNums(){
        ParDeNumeros nums = new ParDeNumeros();
        return nums;
    }

    public void  mostrarValores(ParDeNumeros parDeNumeros){
        //muestra cuáles son los dos números guardados.
        double num1 = parDeNumeros.getNum1();
        double num2 = parDeNumeros.getNum2();
        System.out.println(num1);
        System.out.println(num2);
    }

    public double devolverMayor (ParDeNumeros parDeNumeros){
        double mayor = parDeNumeros.getNum1();
        if (parDeNumeros.getNum2() > mayor) {
            mayor = parDeNumeros.getNum2();
        }
        return mayor;
        // retornar cuál de los dos atributos tiene el mayor valor
    }
    public double calcularPotencia(ParDeNumeros parDeNumeros){
        double mayor = devolverMayor(parDeNumeros);
        double menor = parDeNumeros.getNum1();
        if (parDeNumeros.getNum2() < menor) {
            menor = parDeNumeros.getNum2();
        }
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
        //para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
    }
    public double calculaRaiz(ParDeNumeros parDeNumeros){
        double menor = parDeNumeros.getNum1();
        if (parDeNumeros.getNum2() < menor) {
            menor = parDeNumeros.getNum2();
        }
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
        // para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

}
