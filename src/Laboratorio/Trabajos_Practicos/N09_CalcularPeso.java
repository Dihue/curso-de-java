package Laboratorio.Trabajos_Practicos;
/*
Debes crear un programa que permita calcular el peso ideal de una persona teniendo en
cuenta lo siguiente:

	Si la persona es una mujer, el peso ideal será igual a la altura en cm -120
	Si la persona es un hombre, el peso ideal será igual a la altura en cm -110

El programa pedirá al usuario dos datos:
	La altura en cm.
	El género, pudiendo ser este hombre o mujer.

En función de los datos introducidos, el programa imprimirá en consola el peso ideal.
*/

import java.util.Scanner;

public class N09_CalcularPeso {

	public static void main(String[] args) {

		int altura, pesoIdeal, genero;
		Scanner scan = new Scanner(System.in);

		System.out.println("\nIngrese se altura en cm: ");
		altura = scan.nextInt();

		System.out.println("\nSeleccione su género:\n1 - Femenino\n2 - Masculino");
		genero = scan.nextInt();

		if (genero == 1) {
			if (altura < 120) {
				pesoIdeal = 120 - altura;
				mensaje(pesoIdeal);

			} else {
				pesoIdeal = altura - 120;
				mensaje(pesoIdeal);
			}
		} else if (genero == 2) {
			if (altura < 110) {
				pesoIdeal = 110 - altura;
				mensaje(pesoIdeal);

			} else {
				pesoIdeal = altura - 110;
				mensaje(pesoIdeal);
			}
		} else {
			System.out.println("Opción incorrecta");
		}

	}

	private static void mensaje(int pesoIdeal) {
		System.out.println("Su peso ideal es " + pesoIdeal + " kg");
	}

}
