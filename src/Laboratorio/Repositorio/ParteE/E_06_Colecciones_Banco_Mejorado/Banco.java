package Laboratorio.Repositorio.ParteE.E_06_Colecciones_Banco_Mejorado;

import java.util.HashSet;
import java.util.Set;

public class Banco {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Pedro", "123123", 34500);
		Cliente cliente2 = new Cliente("Juan", "123321", 34500);
		Cliente cliente3 = new Cliente("Mateo", "123456", 34500);
		Cliente cliente4 = new Cliente("Lucas", "123789", 34500);

		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();

		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);

		for (Cliente cliente: clientesDelBanco) {
			System.out.println(cliente.toString());
		}

		System.out.println("Eliminar un elemento");
		clientesDelBanco.remove(cliente2);

		for (Cliente cliente: clientesDelBanco) {
			System.out.println(cliente.toString());
		}

	}

}
