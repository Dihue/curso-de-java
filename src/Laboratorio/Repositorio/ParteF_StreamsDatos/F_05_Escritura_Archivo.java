package Laboratorio.Repositorio.ParteF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F_05_Escritura_Archivo {

	public static void main(String[] args) {
		try {
			File archivo = new File(
				"D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TUP_Logo.jpg");

			// Permite saber cuantos bytes tiene el archivo
			int tamanioDelArchivo = (int) archivo.length();

			int[] imagen = new int[tamanioDelArchivo];

			FileInputStream lecturaDeArchivo = new FileInputStream(
				"D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TUP_Logo.jpg");

			// Variable para indicar el final de la lectura
			boolean final_archivo = false;
			int cont = 0;

			// Esto sucede mientras no se llegue al final del archivo
			while (!final_archivo) {
				// Varible para almacenar cada byte del archivo
				int byteImagenEntrada = lecturaDeArchivo.read();

				if (byteImagenEntrada != -1) {
					// Escribe byte a byte
					imagen[cont] = byteImagenEntrada;
				} else {
					// El -1 indica que se llegó al final del archivo
					final_archivo = true;
				}
				cont++;
			}
			lecturaDeArchivo.close();

			CrearArchivo(imagen);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void CrearArchivo(int[] arrayExterno) {
		try {
			FileOutputStream archivoExterno = new FileOutputStream(
				"D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TUP_Logo2.jpg");

			for (int i = 0; i < arrayExterno.length; i++) {
				archivoExterno.write(arrayExterno[i]);
			}
			archivoExterno.close();
			System.out.println("Archivo creado");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
