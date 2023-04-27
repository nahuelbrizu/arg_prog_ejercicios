package frac;

public class Servicio {


        public Fraccion sumar(Fraccion f1, Fraccion f2) {
            int numerador = f1.getNumerador() * f2.getDenominador() + f2.getNumerador() * f1.getDenominador();
            int denominador = f1.getDenominador() * f2.getDenominador();
            return new Fraccion(numerador, denominador);
        }

        public Fraccion restar(Fraccion f1, Fraccion f2) {
            int numerador = f1.getNumerador() * f2.getDenominador() - f2.getNumerador() * f1.getDenominador();
            int denominador = f1.getDenominador() * f2.getDenominador();
            return new Fraccion(numerador, denominador);
        }

        public Fraccion multiplicar(Fraccion f1, Fraccion f2) {
            int numerador = f1.getNumerador() * f2.getNumerador();
            int denominador = f1.getDenominador() * f2.getDenominador();
            return new Fraccion(numerador, denominador);
        }

        public Fraccion dividir(Fraccion f1, Fraccion f2) {
            int numerador = f1.getNumerador() * f2.getDenominador();
            int denominador = f1.getDenominador() * f2.getNumerador();
            return new Fraccion(numerador, denominador);
        }


}
