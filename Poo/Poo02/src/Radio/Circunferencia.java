package Radio;

public class Circunferencia {


    private double radio;
    public Circunferencia() {

    }
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(double radio){
        this.radio = radio;
    }

    public double area(){
        return Math.PI * radio * radio;
    }

    public double perimetro(){
        return 2 * Math.PI * radio;
    }

    public void mostrarCircunferencia(){
        String fin =  "Circunferencia { " + "\n" +" radio= " + radio +"\n" +" perimetro= " + perimetro() + "\n" +" area= " + area() + "\n" +'}';
        System.out.println(fin);
    }


}
