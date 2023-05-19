package Laboratorio.Clases.C11_10.PracticaExamen;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClienteOutput {
    private FileOutputStream archivo;
    private ObjectOutputStream salida;

    // Abrir fichero
    public void abrir() {
        try {
            archivo = new FileOutputStream(
                    "C:\\Users\\Dihue\\Desktop\\Repositories\\CursoDeJava\\src\\" +
                            "Laboratorio\\Clases\\C11_10\\PracticaExamen\\DatosSerializados.txt");
            salida = new ObjectOutputStream(archivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Cerrar fichero
    public void cerrar() {
        if (salida != null) {
            try {
                salida.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Escribir en el fichero
    public void escribir(Cliente cliente) {
        if (salida != null) {
            try {
                salida.writeObject(cliente);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
