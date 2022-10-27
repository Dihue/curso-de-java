package Laboratorio.Clases.C09_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cine {

	public static void main(String[] args) {

		List<Espectador> listaEspectadores = new ArrayList<>();
		SalaCine salaCreada = new SalaCine(2,"Sala 1","Terminator");


		int opcion, salir = -1, silla = 1;
		Scanner scan = new Scanner(System.in);


		System.out.printf("Bienvenido/a al sistema de carga de Espectadores");
		do {
			System.out.printf("\n-> 1. Agregar espectador");
			System.out.printf("\n-> 2. Terminar la carga de espectadores");
			System.out.printf("\n-> 3. Salir");

			System.out.printf("\nOpción: ");
			opcion = scan.nextInt();

			if (opcion == 1) {
				System.out.printf("\nIngresar nombre del espectador: ");
				String nombre = scan.next();

				System.out.printf("\nIngresar DNI del espectador: ");
				int dni = scan.nextInt();

				Espectador espectador = new Espectador(nombre, dni, 'a', silla);
				silla++;
				listaEspectadores.add(espectador);

			}
			else if (opcion == 2) {
				if (salaCreada.getCapacidad() >= listaEspectadores.size()) {
					SalaCine salaAsignada = new SalaCine(salaCreada.getCapacidad(),
						salaCreada.getName(), salaCreada.getPelicula(), listaEspectadores);
					opcion = salir;
				} else {
					System.out.println("Imposible asignar lista de espectadores\nCapacidad de la sala superada");
					opcion = salir;
				}
			} else if (opcion == 3) {
				System.out.println("Finalizando...");
				opcion = salir;
			}

		} while (opcion > 0);

		System.out.println(listaEspectadores);
		System.out.println("Capacidad: " + salaCreada.getCapacidad());
		System.out.println("Lista: " + listaEspectadores.size());


	}

	public char[] abecedario() {
		char[] letra = new char[26];
		for ( int i=0; i<26; i++) {
			letra[i] = (char) ('A' + i );
		}
		return letra;
	}

}
