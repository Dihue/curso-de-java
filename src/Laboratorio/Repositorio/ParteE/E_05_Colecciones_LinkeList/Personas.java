package Laboratorio.Repositorio.ParteE_05_Colecciones_LinkeList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Personas {

	public static void main(String[] args) {
		/*
		LinkedList:
		1) Acceso aleatorio
		2) Están ordenados
		3) Podemos añadir y eliminar sin restricciones
		4) Con un ListIterator podemos modificar en cualquier dirección
	 	*/

		// Se crea una lista enlazada
		LinkedList<String> personas = new LinkedList<>();

		// Agregar elementos a la lista
		personas.add("Black Widow");
		personas.add("Iron Man");
		personas.add("Thor");
		personas.add("Capitana Marvel");
		personas.add("Capitán América");

		// Para saber el tamaño de nuestra LinkedList
		System.out.println("Cantidad de elementos: " + personas.size());

		for (String persona: personas) {
			System.out.println(persona);
		}

		System.out.println("\n--- Usando el Iterador ---\n");

		ListIterator<String> iterador = personas.listIterator();

		// Agregar una persona en el lugar que queramos
		iterador.next();
		iterador.add("Scarlet With");

		for (String persona: personas) {
			System.out.println(persona);
		}

	}

}
