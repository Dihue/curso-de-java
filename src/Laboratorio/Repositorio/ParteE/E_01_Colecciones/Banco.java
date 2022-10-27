package Laboratorio.Repositorio.ParteE_01_Colecciones;

import java.util.HashSet;
import java.util.Set;

public class Banco {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Juan Perez", "123123", 10050);
		Cliente cliente2 = new Cliente("Maria Gomez", "213123", 20000);
		Cliente cliente3 = new Cliente("Carlos Algo", "321321", 12300);
		Cliente cliente4 = new Cliente("Ana Otro", "123412", 543123);

		/*
		Se importa el paquete Set y HashSet que se empleará debido a que permite el
		acceso aleatorio de los elementos
		 */
		Set<Cliente> clientesDelBanco = new HashSet<>();

		// Con esta estructura agregamos a la colección, los clientes
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);

		// Con un foreach podemos recorrer la colección de clientes del banco
		for (Cliente cliente: clientesDelBanco) {
			System.out.println(cliente.toString());
		}

		System.out.println("\nEliminando un cliente");
		// Eliminar un elemento de la colección
		clientesDelBanco.remove(cliente3);

		for (Cliente cliente: clientesDelBanco) {
			System.out.println(cliente.toString());
		}
	}

}
