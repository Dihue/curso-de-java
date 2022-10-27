package Laboratorio.Repositorio.ParteE_04_Colecciones_Iteradores;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Banco {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Juan Perez", "123123", 10050, 123);
		Cliente cliente2 = new Cliente("Maria Gomez", "213123", 20000, 122);
		Cliente cliente3 = new Cliente("Carlos Algo", "321321", 12300, 132);
		Cliente cliente4 = new Cliente("Ana Otro", "123412", 543123, 213);

		/*
		Se importa el paquete Set y HashSet que se empleará debido a que permite el
		acceso aleatorio de los elementos
	 	*/
		Set<Cliente> clientesDelBanco = new HashSet<>();

		// Agregar clientes a la colección
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);

		/*
		ITERADORES: utilizamos la interfaz Iterator para crear nuestro iterador.
		El objeto iterator debe recibir para su creación la colección seguida del
		método iterator.
		 */
		Iterator<Cliente> iterador = clientesDelBanco.iterator();

		while (iterador.hasNext()) {
			String elemento = iterador.next().getNombre();
			/*
			Esto no puede ser ocupado como un foreach, ya que cada uso del iterador
			nos avanza un lugar y solo podemos mostrar un elemento
			 */
			System.out.println(elemento);
		}

		/*
		Debemos reasignar al iterador para poder inicializarlo nuevamente, ya que
		el recorrido anterior lo dejó en el final.
		 */
		iterador = clientesDelBanco.iterator();

		/*
		ELIMINAR UN ELEMENTO DE LA COLECCIÓN:
		no se puede eliminar por medio de un foreach porque no se puede leer un
		elemento y a la vez eliminarlo
		 */
		while (iterador.hasNext()) {
			String elementoEliminar = iterador.next().getNombre();

			if (elementoEliminar.equals("Carlos Algo")) {
				iterador.remove();
			}
		}

		System.out.println("\nDespués de eliminar el elemento");

		// Recorrer la colección
		for (Cliente cliente: clientesDelBanco) {
			System.out.println(cliente);
		}

	}

}
