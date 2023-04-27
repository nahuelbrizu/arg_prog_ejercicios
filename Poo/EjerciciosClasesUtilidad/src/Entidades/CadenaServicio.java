package Entidades;

public class CadenaServicio {
    public CadenaServicio() {
    }

    public Cadena crearFrase(){
        Cadena cadena = new Cadena();
        System.out.print("ingrese una frase :");
        System.out.println("");
        cadena.setFrase("casa blanca");
        return cadena;
    }


    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        for(int i = 0; i < cadena.getLongitud(); i++) {
            char c = cadena.getFrase().charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " vocales.");
    }


    public void invertirFrase(Cadena cadena){
        String cad = "";
        for (int i = cadena.getLongitud() -1; i >= 0; i--){
            cad += cadena.getFrase().charAt(i);
        }
        System.out.println(cad);
        //deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    }

    public void vecesRepetido(Cadena cadena,char letra){
        int contador = 0;
        for(int i = 0; i < cadena.getLongitud() ; i++) {
            if(cadena.getFrase().charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " " + letra);

        // recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    }

    public int compararLongitud(Cadena cadena,String frase){
        int resta = cadena.getLongitud() - frase.length();
        System.out.println("la diferencia de caracteres  entre " +  "| "+ cadena.getFrase() +" |" + " y " + "| " +  frase  +" |"+ " es : " + resta);
        return resta;
        //deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
    }
    public String unirFrases(Cadena cadena,String frase){
       return cadena.getFrase().concat(frase);
        //deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    }

    public void  reemplazar(Cadena cadena, char letra) {
        String nuevaFrase = cadena.getFrase().replace('a', letra);
        System.out.println("La nueva frase es: " + nuevaFrase);
        //deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

    }

    public boolean contieneLetra(Cadena cadena, char letra) {
        boolean contiene = false;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra) {
                contiene = true;
                break;
            }
        }
        System.out.println( contiene);
        return contiene;
        //deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    }
}
