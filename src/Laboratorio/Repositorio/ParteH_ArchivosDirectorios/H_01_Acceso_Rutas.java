package Laboratorio.Repositorio.ParteH_ArchivosDirectorios;

import java.io.File;

public class H_01_AccesoRutas {

	public static void main(String[] args) {

		File archivo = new File(
			"D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TUP_Logo.jpg");

		// Nos muestra la ruta absoluta del archivo pero según el proyecto
		System.out.println("Ruta " + archivo.getAbsolutePath());

		// Ver si el archivo existe, sino existe devuelve un false
		System.out.println("Ruta: " + archivo.exists());

		if (archivo.exists()) {
			System.out.println("Existe");
		} else {
			System.out.println("No existe");
		}

	}

}
