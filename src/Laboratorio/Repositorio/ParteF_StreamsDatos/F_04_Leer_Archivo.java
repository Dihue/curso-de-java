package Laboratorio.Repositorio.ParteF_StreamsDatos;

import java.io.FileInputStream;
import java.io.IOException;

public class F_04_Leer_Archivo {

	public static void main(String[] args) {
		// Debe estar rodeado de un try-catch porque puede dar error por no encontrar el archivo
		try {
			FileInputStream lecturaDeArchivo = new FileInputStream(
				"D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TUP_Logo.jpg");

			// Se crea una variable para ver si llegó el final de la lectura
			boolean final_archivo = false;

			// Esto sucederá mientrs no se llegue al final del archivo
			while (!final_archivo) {
				// Variable para almacenar cada byte del archivo
				int byteImagenEntrada = lecturaDeArchivo.read();

				// El -1 indica que se llegó al final
				if (byteImagenEntrada == -1) {
					final_archivo = true;
				}
				// Para mostrar los bits en la consola
				System.out.println(byteImagenEntrada);
			}

			// Cerrar el canal de lectura para no consumir recursos del equipo
			lecturaDeArchivo.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
