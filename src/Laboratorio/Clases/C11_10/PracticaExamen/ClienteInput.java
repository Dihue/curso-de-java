package Laboratorio.Clases.C11_10.PracticaExamen;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClienteInput {
    private FileInputStream archivo;
    private ObjectInputStream entrada;

    // Abrir fichero
    public void abrir() {
        try {
            archivo = new FileInputStream(
                    "C:\\Users\\Dihue\\Desktop\\Repositories\\CursoDeJava\\src\\" +
                    "Laboratorio\\Clases\\C11_10\\PracticaExamen\\DatosSerializados.txt");
            entrada = new ObjectInputStream(archivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Cerrar fichero
    public void cerrar() {
        if (entrada != null) {
            try {
                entrada.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Leer el fichero
    public Cliente leer() {
        Cliente cliente = null;
        if (entrada != null) {
            try {
                cliente = (Cliente) entrada.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return cliente;
    }
}
