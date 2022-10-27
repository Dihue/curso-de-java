package Laboratorio.Repositorio.ParteF;

import java.io.BufferedReader;
import java.io.FileReader;

public class F_03_Buffers_Por_Defecto {

	public static void main(String[] args) {
		LeerFicheroConBuffer lectura = new LeerFicheroConBuffer();
		lectura.LeerDatos();
	}

}

class LeerFicheroConBuffer {

	public void LeerDatos() {
		try {
			FileReader entrada = new FileReader(
				"D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TextoPrueba.txt");

			// El buffer donde guardaremos
			BufferedReader miBuffer = new BufferedReader(entrada);

			// Variable vacía donde guardamos lo leído
			String linea = "";

			while (linea != null) {
				// Guarda en el buffer, cada línea
				linea = miBuffer.readLine();

				// Imprime en consola cada línea
				System.out.println(linea);

				// La última línea impresa será null porque no puede leer más
			}
			entrada.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
