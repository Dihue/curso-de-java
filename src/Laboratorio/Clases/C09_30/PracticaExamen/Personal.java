package Laboratorio.Clases.C09_30.PracticaExamen;

import Laboratorio.Trabajos_Practicos.Facultad.Estudiante;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Personal {
	List<Persona> personasLista = new LinkedList<>();

	public Personal() {

	}

	public void listarPersona() {
		for (Persona personaListar: personasLista) {
			System.out.println(personaListar.toString());
		}
	}

	public void agregarPersona(Persona persona) {
		personasLista.add(persona);
	}

	public void eliminarPersona(int dniEliminar) {
		Iterator<Persona> iteratorPersona = personasLista.iterator();
		while (iteratorPersona.hasNext()) {
			int personaEliminar = iteratorPersona.next().getDni();
			if (personaEliminar == dniEliminar) {
				iteratorPersona.remove();
			}
		}
	}

	public void modificarPersona(int dniBuscar) {

	}

	public void verSueldo(int dniVerSueldo) {

	}

	public void aumentarSalario(int dniAumento, double incremento) {

	}
}
