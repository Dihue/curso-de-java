package Laboratorio.Repositorio.ParteA.A_01_Introduccion;

public class EJ03_DeclaracionVariables {

	public static void main(String[] args) {

		// Declaración de variables
		String nombre = "Damian";
		String otroNombre = "damian";

		// Cantidad de letras
		System.out.println(nombre.length());

		// Nos devuelve el carácter del índice que se le indica
		System.out.println(nombre.charAt(0));

		// Devuelve un sub string indicando el índice y la cantidad de caracteres
		System.out.println(otroNombre.substring(1,4));

		// Compara dos cadenas
		System.out.println(nombre.equals(otroNombre));

		// Compara dos cadenas, pero ignora las mayúsculas y minúsculas
		System.out.println(nombre.equalsIgnoreCase(otroNombre));

	}

}
