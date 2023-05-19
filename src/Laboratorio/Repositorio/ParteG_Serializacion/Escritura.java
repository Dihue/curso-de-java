package Laboratorio.Repositorio.ParteG_Serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escritura {

	public static void main(String[] args) {

		Personas[] personas = new Personas[4];

		personas[0] = new Personas("Goku", 2134);
		personas[1] = new Personas("Bulma", 1876);
		personas[2] = new Personas("Vegueta", 1234);
		personas[3] = new Personas("Gohan", 4213);

		// Creamos el canal para guardar el objeto
		// Utilizamos un try-catch en caso de no poder escribirse el objeto
		try {
			// FileOutputStream("miObjetoSerializado")
			ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(
				"C:\\Users\\Dihue\\Desktop\\Repositories\\CursoDeJava\\src\\Laboratorio\\Repositorio\\ParteG_Serializacion\\miObjetoSerializado.txt"));

			// Escribe el objeto en un archivo
			flujoSalida.writeObject(personas);
			System.out.println("Serialización completa");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
