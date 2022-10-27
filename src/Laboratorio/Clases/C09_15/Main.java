package Laboratorio.Clases.C09_15;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) {

		try {
			BufferedReader texto = new BufferedReader(new FileReader("src/Laboratorio/Clases/C09_15/_Apunte.txt"));
			//BufferedImage imagen = ImageIO.read(new File("src/Laboratorio/Clases/imagen.png"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
