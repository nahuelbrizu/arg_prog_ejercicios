import Entidades.Cadena;
import Entidades.CadenaServicio;

public class Main {
    public static void main(String[] args) {
        CadenaServicio cadenaServicio = new CadenaServicio();
        Cadena a = cadenaServicio.crearFrase();
        cadenaServicio.mostrarVocales(a);
        cadenaServicio.invertirFrase(a);
        cadenaServicio.vecesRepetido(a ,'a');
        cadenaServicio.compararLongitud(a, "la casa de carlitos");
        cadenaServicio.unirFrases(a, "me gusta mirar el cielo cuando el sol no pega fuerte");
        cadenaServicio.reemplazar(a, '$');
        cadenaServicio.contieneLetra(a, 'h');

    }
}
