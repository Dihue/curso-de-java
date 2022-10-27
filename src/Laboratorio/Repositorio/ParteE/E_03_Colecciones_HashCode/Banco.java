package Laboratorio.Repositorio.ParteE_03_Colecciones_HashCode;

import java.util.HashSet;
import java.util.Set;

public class Banco {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Juan Perez", "123123", 10050, 1234);
		Cliente cliente2 = new Cliente("Maria Gomez", "213123", 20000, 1223);

		/*
		El hashCode de cliente1 y cliente3 deberían ser los mismos, lo que significa que
		los dos son el mismo objeto que apuntan al mismo espacio de memoria
		 */
		Cliente cliente3 = cliente1;
		Cliente cliente4 = new Cliente("Ana Otro", "123412", 543123, 2134);

		// Colección seleccionada Set del tipo HashSet que permite el acceso aleatorio
		Set<Cliente> clientesDelBanco = new HashSet<>();

		// Agregar clientes a la colección
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);

		if (cliente3.equals(cliente1)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}

		System.out.println("HashCode cliente3: " + cliente3.hashCode());
		System.out.println("HashCode cliente1: " + cliente3.hashCode());

		System.out.println("\nListado de Clientes");
		for (Cliente cliente: clientesDelBanco) {
			System.out.println(cliente.toString());
		}

	}

}
