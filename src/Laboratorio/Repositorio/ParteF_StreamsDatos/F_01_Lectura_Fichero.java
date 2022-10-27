package Laboratorio.Repositorio.ParteF;

import java.io.FileReader;

public class F_01_Lectura_Fichero {

	public static void main(String[] args) {
		
		LeerFichero accesoExternos = new LeerFichero();
		accesoExternos.leerDatos();
		
	}

}
class LeerFichero {

	public void leerDatos() {
		try {
			// Entrada en el flujo de datos, el túnel por donde irán los datos
			FileReader entrada = new FileReader(
				"D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TextoPrueba.txt");

			// Nos devuelve el número correspondiente al caracter UNICODE o -1 si está en el final
			int caracter = entrada.read();

			// Parsea el número correspondiente al caracter en un caracter (casting)
			char letra = (char) caracter;

				/*
				Preguntamos por -1 para saber cuando termina (último caracter)
				El caracter tiene el número equivalente al código UNICODE de cada letra
				 */
			while (caracter != -1) {
				// Escribir el caracter actual
				System.out.println(letra);
				// Avanzar un caracter
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
