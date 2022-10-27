package Laboratorio.Repositorio.ParteH_ArchivosDirectorios;

import java.io.File;
import java.io.IOException;

public class H_04_Crear_Directorio {

	public static void main(String[] args) {
		// Crear una carpeta

		/*
		Colocar en el final, el nombre del directorio que queremos crear
		y luego, con mkdir creamos el directorio
		 */
		File carpeta = new File(
			"D:"+File.separator+"Dihue"+File.separator+"Documents"+File.separator+
				"TUP"+File.separator+"Repositorios"+File.separator+"CursoDeJava"+File.separator+
				"src"+File.separator+"Laboratorio"+File.separator+"Repositorio"+File.separator+
				"ParteH_ArchivosDirectorios"+File.separator+"Carpeta_Nueva");

		// Crea la carpeta
		carpeta.mkdir();

		// Crea un archivo vacío
		File archivo = new File(
			"D:"+File.separator+"Dihue"+File.separator+"Documents"+File.separator+
				"TUP"+File.separator+"Repositorios"+File.separator+"CursoDeJava"+File.separator+
				"src"+File.separator+"Laboratorio"+File.separator+"Repositorio"+File.separator+
				"ParteH_ArchivosDirectorios"+File.separator+"archivoVacio.txt");

		try {
			archivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
