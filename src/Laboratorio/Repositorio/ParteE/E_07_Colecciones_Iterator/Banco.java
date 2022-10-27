package Laboratorio.Repositorio.ParteE.E_07_Colecciones_Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Banco {

	public static void main(String[] args) {

		Cliente cliente01 = new Cliente("Gerardo García", 1, 12300);
		Cliente cliente02 = new Cliente("Storani Facundo", 2, 23050);
		Cliente cliente03 = new Cliente("Brollo Gino", 3, 45035);
		Cliente cliente04 = new Cliente("Cruz Emmanuel", 4, 11220);

		Set<Cliente> clientesBanco = new HashSet<Cliente>();

		clientesBanco.add(cliente01);
		clientesBanco.add(cliente02);
		clientesBanco.add(cliente03);
		clientesBanco.add(cliente04);

		/*
		Utilizamos la interfaz Iterator para crear nuestro iterador, el objeto iterador
		debe recibir, para su creación, la colección seguida del método iterator
		 */
		Iterator<Cliente> iterador = clientesBanco.iterator();

		// Eliminar un elemento de la colección
		while (iterador.hasNext()) {
			String elementoEliminar = iterador.next().getNombre();
			if (elementoEliminar.equals("Gerardo García")) {
				iterador.remove();
			}
		}

		// Recorrer la colección
		for (Cliente cliente: clientesBanco) {
			System.out.println(cliente.toString());
		}

	}

}
