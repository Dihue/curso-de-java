package Laboratorio.Repositorio.ParteE.E_10_Colecciones_TreeSet;

import java.util.TreeSet;

public class ColeccionesTreeSet {

	public static void main(String[] args) {
		TreeSet<String> ordenaGente = new TreeSet<>();

		ordenaGente.add("Juan");
		ordenaGente.add("Pedro");
		ordenaGente.add("Ana");
		ordenaGente.add("Zafira");

		/*
		El listado se mostrará en orden alfabético, puesto que este tipo de
		lista posee un método que permite esta operación
		 */
		for (String gente: ordenaGente) {
			System.out.println(gente);
		}
	}

}
