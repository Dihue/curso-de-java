package Laboratorio.Clases.C10_14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n--- Antes de sobreescribir el fichero ---\n");
		LeerDatos accesoExterno = new LeerDatos();
		accesoExterno.leerDatos();

		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresar texto para sobre escribir:");
		String textoNuevo = scan.nextLine();

		EscribirDatos escribirElArchivo = new EscribirDatos();
		escribirElArchivo.escribir(textoNuevo);

		System.out.println("\n--- Luego de sobreescribir el fichero ---\n");

		accesoExterno.leerDatos();

	}

}
