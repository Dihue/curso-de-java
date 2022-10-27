package Laboratorio.Repositorio.ParteE_05_Colecciones_LinkeList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Provincias {

	public static void main(String[] args) {

		// Mezclar dos listas de forma intercalada
		LinkedList<String> provincias = new LinkedList<>();

		provincias.add("Chaco");
		provincias.add("Corrientes");
		provincias.add("Misiones");
		provincias.add("Formosa");

		LinkedList<String> capitales = new LinkedList<>();

		capitales.add("Resistencia");
		capitales.add("Corrientes Capital");
		capitales.add("Posadas");
		capitales.add("Formosa Capital");

		System.out.println("\n--- Las dos Listas ---");
		System.out.println(provincias);
		System.out.println(capitales);

		// Es necesario un iterador por lista
		ListIterator<String> iteradorProvincias = provincias.listIterator();
		ListIterator<String> iteradorCapitales = capitales.listIterator();

		/*
		Recorrer con un while y para saber si está vacía la lista con hashNext()
		definimos que mientras existan elementos en el iterador de Capitales,
		seguirá recorriendo
		 */
		while (iteradorCapitales.hasNext()) {
			if (iteradorProvincias.hasNext()) {
				iteradorProvincias.next();
			}
			iteradorProvincias.add(iteradorCapitales.next());
		}

		// Ahora la lista provincias tiene también las capitales
		System.out.println("\nLista Provincias intercaladas con la lista Capitales");
		System.out.println(provincias);

		/*
		BORRAR los lugares pares de la lista de Provincias para usar el mismo iterador
		debemos reiniciarlo con una asignación
		 */
		iteradorProvincias = provincias.listIterator();

		while (iteradorProvincias.hasNext()) {
			iteradorProvincias.next();

			// Preguntamos si hay más elementos delante para seguir
			if (iteradorProvincias.hasNext()) {
				// Pasamos uno más porque queremos eliminar las posiciones pares
				iteradorProvincias.next();
				// Eliminar elemento
				iteradorProvincias.remove();
			}
		}

		/*
		Si volvemos a imprimir la lista, podremos ver que solo están las provincias,
		porque las capitales estaban en las posiciones pares.
		 */
		System.out.println("\n Sin las Capitales");
		System.out.println(provincias);

	}

}
