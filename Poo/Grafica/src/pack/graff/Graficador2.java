package pack.graff;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;

public class Graficador2 {
    public static void graficar2(HashMap<Integer, ArrayList<Double>> map) {
        int alto = 200;
        int mitadAlt = alto / 2;
        int largo = 200;
        int mitadLarg = largo / 2;

        BufferedImage image = new BufferedImage(largo + 1, alto + 1, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y <= alto; y++) {
            for (int x = 0; x <= largo; x++) {
                if (map.containsKey(x - mitadLarg) && map.get(x - mitadLarg).contains((double) mitadAlt - y)) {
                    image.setRGB(x, y, Color.white.getRGB());
                } else if (x == mitadLarg || y == mitadAlt) {
                    image.setRGB(x, y, Color.BLUE.getRGB());
                } else {
                    image.setRGB(x, y, Color.black.getRGB());
                }
            }
        }
        saveImage(image, "img/grafico.png");
    }

    private static void saveImage(BufferedImage image, String filename) {
        try {
            File file = new File(filename);
            int cont = 1;
            String sinExtencion = filename.substring(0, filename.lastIndexOf("."));
            String extencion = filename.substring(filename.lastIndexOf(".") + 1);

            while(file.exists()){
                filename = sinExtencion + "-" + cont + "." +extencion;
                file = new File(filename);
                cont++;
            }
            ImageIO.write(image, "png", file);
            System.out.println("La imagen se ha guardado en " + filename);
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
}
