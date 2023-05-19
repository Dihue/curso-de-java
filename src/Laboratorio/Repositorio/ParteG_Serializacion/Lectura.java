package Laboratorio.Repositorio.ParteG_Serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lectura {

	public static void main(String[] args) {
		try {
			ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(
				"C:\\Users\\Dihue\\Desktop\\Repositories\\CursoDeJava\\src\\Laboratorio\\Repositorio\\ParteG_Serializacion\\miObjetoSerializado.txt"));

			// Debemos crear una variable del objeto que queremos deserializer
			// Debemos hacer un casting de Object a la clase Personas
			Personas[] personasEntrada = (Personas[]) flujoEntrada.readObject();

			for (Personas pers : personasEntrada) {
				System.out.println(pers.toString());
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
