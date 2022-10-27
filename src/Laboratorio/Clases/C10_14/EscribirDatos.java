package Laboratorio.Clases.C10_14;

import java.io.FileWriter;

public class EscribirDatos {

	public void escribir(String texto) {

		try {
			/*
			FileWrite solo con el parámetro del nombre del archivo reescribe el archivo completo
			FileWrite con parámetro, nombre del archivo y el segundo parámetro true, agrega a los que ya tiene el archivo
			 */
			FileWriter escritura = new FileWriter("D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TextoPrueba.txt", true);

			// Para escribir recorremos carácter a carácter el String
			for (int i = 0; i < texto.length(); i++) {
				// Escribe letra por letra en el archivo
				escritura.write(texto.charAt(i));
			}
			// el \n es para hacer un salto de línea al final de la escritura
			escritura.write("\n");
			// Al no usar más el FileWrite, debemos cerrarlo
			escritura.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
