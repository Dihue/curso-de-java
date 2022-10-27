package Laboratorio.Repositorio.ParteH_ArchivosDirectorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class H_05_Crear_Directorio_Usuario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nombre de la carpeta: ");
		String nombreCarpeta = scan.nextLine();

		File carpeta = new File(
			"D:"+File.separator+"Dihue"+File.separator+"Documents"+File.separator+
			"TUP"+File.separator+"Repositorios"+File.separator+"CursoDeJava"+File.separator+
			"src"+File.separator+"Laboratorio"+File.separator+"Repositorio"+File.separator+
			"ParteH_ArchivosDirectorios"+File.separator+nombreCarpeta);

		carpeta.mkdir();

		System.out.println("Nombre del archivo: ");
		String nombreArchivo = scan.nextLine();

		System.out.println("Contenido para el archivo: ");
		String frase = scan.nextLine();

		try {
			FileWriter contenidoDelArchivo = new FileWriter(
				"D:"+File.separator+"Dihue"+File.separator+"Documents"+File.separator+
					"TUP"+File.separator+"Repositorios"+File.separator+"CursoDeJava"+File.separator+
					"src"+File.separator+"Laboratorio"+File.separator+"Repositorio"+File.separator+
					"ParteH_ArchivosDirectorios"+File.separator+nombreCarpeta+
					File.separator+nombreArchivo+".txt", true);

			// Escribe en el archivo, el contenido escrito por el usuario
			contenidoDelArchivo.write(frase.toString());

			contenidoDelArchivo.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
