package Laboratorio.Repositorio.ParteF;

import java.io.FileWriter;

public class F_02_Escritura_Fichero {

	public static void main(String[] args) {
		Escritura escribirArchivo = new Escritura();
		escribirArchivo.escribir();
	}

}

class Escritura {

	public void escribir() {
		// Lo que queremos escribir en el archivo
		String texto = "Esto se escribió en el archivo desde el programa";

		try {
			/*
			FileWrite solo con el parámetro nombre de archivo reescribe el archivo por completo
			FileWrite con parámetro nombre de archivo y el segundo en true, agrega a lo que ya
			tiene el archivo
			 */
			FileWriter escritura = new FileWriter(
				"D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TextoPrueba.txt");

			// Para escribir, recorremos caracter a caracter el String
			for (int i = 0; i < texto.length(); i++) {
				// Escribe letra por letra en el archivo
				escritura.write(texto.charAt(i));
			}
			// Escribir un salto de línea al finalizar
			escritura.write("\n");
			// Siempre cerra el FileWriter
			escritura.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
