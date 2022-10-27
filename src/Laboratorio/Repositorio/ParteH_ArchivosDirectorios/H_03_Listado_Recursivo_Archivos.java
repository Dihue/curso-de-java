package Laboratorio.Repositorio.ParteH_ArchivosDirectorios;

import java.io.File;

public class H_03_Listado_Recursivo_Archivos {

	public static void main(String[] args) {
		File carpeta = new File(
			"D:"+File.separator+"Dihue"+File.separator+
				"Documents"+File.separator+"TUP"+File.separator+
				"Repositorios"+File.separator+"CursoDeJava");

		String [] nombres = carpeta.list();

		for (int i = 0; i < nombres.length; i++) {
			// Muestra el nombre del archivo o directorio
			System.out.println(nombres[i]);

			// Crea un nuevo objeto para analizar luego
			File f = new File(carpeta.getAbsolutePath(), nombres[i]);

			// Si es un directorio, ingresa en el condicional
			if (f.isDirectory()) {
				// Toma la lista de archivos del directorio
				String [] nombresEnSubCarpeta = f.list();

				for (int j = 0; j < nombresEnSubCarpeta.length; j++) {
					// Imprime el contenido del directorio
					System.out.println("\t |_ " + nombresEnSubCarpeta[j]);
				}
			}
		}
	}
}
