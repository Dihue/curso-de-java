package Laboratorio.Repositorio.ParteH_ArchivosDirectorios;

import java.io.File;

public class H_02_ListarArchivos {

	public static void main(String[] args) {
		/*
		Usamos el constructor que nos pide el parch
		Usamos File.separator para que traiga el separador de carpetas
		 */
		File directorio = new File(
			"D:"+File.separator+"Dihue"+File.separator+
				"Documents"+File.separator+"TUP"+File.separator+
				"Repositorios"+File.separator+"CursoDeJava");

		String [] nombres = directorio.list();

		// Lista todos los elementos que se encuentren en la carpeta
		System.out.println("\nLista de archivos: ");

		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}

}
