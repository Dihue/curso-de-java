package Laboratorio.Clases.C10_14;

import java.io.FileReader;

public class LeerDatos {

	public void leerDatos() {
		try {

			// Entrada en el flujo de datos. El túnel donde irán los datos.
			FileReader entrada = new FileReader(
				"D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TextoPrueba.txt");

			// Nos devuelve el número correspondiente al carácter UNICODE o -1 si está al final.
			int caracter = entrada.read();
			// Parsea el número correspondiente al carácter en un carácter
			char letra = (char) caracter;

			/*
			Preguntamos por -1 para saber cuando termina, el carácter tiene el número equivalente
			al código UNICODE de cada letra.
			 */
			while (caracter != -1) {
				// Escribir el carácter actual
				System.out.print(letra);
				// Avanza un carácter
				caracter = entrada.read();
				letra = (char) caracter;
			}
			// Siempre hay que cerrar los buffers o accesos a ficheros externos
			entrada.close();


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
