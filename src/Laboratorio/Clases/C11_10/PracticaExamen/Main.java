package Laboratorio.Clases.C11_10.PracticaExamen;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Administrador administrador = new Administrador();



        int opcion = 0;
        Scanner leer = new Scanner(System.in);

        File archivo = new File(
                "C:"+File.separator+"Users"+File.separator+"Dihue"+File.separator+
                        "Desktop"+File.separator+"Repositories"+File.separator+"CursoDeJava"+File.separator+
                        "src"+File.separator+"Laboratorio"+File.separator+"Clases"+File.separator+
                        "C11_10"+File.separator+"PracticaExamen"+File.separator+"DatosSerializados.txt");

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(
                    "C:\\Users\\Dihue\\Desktop\\Repositories\\CursoDeJava\\src\\" +
                            "Laboratorio\\Clases\\C11_10\\PracticaExamen\\DatosSerializados.txt"));

            ArrayList<Cliente> clienteEntrada = (ArrayList<Cliente>) flujoEntrada.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        do {
            System.out.println("\n- - - - - - - - - - Menú Principal - - - - - - - - - -\n");
            System.out.println("-> 1. Crear Cliente");
            System.out.println("-> 2. Listar clientes (todos los datos, excepto los activos)");
            System.out.println("-> 3. Buscar por nombre y listar datos completos de un cliente");
            System.out.println("-> 4. Buscar y eliminar un cliente");
            System.out.println("-> 5. Agregar Activos a un cliente");
            System.out.println("-> 6. Salir");

            System.out.println("Ingresar opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar cliente
                    System.out.println("1) Crear cliente: ");
                    administrador.agregarCliente();
                    break;
                case 2:
                    System.out.println("2) Listar clientes: ");
                    administrador.listarCliente();
                    break;
                case 3:
                    System.out.println("3) Buscar y listar datos completos de un cliente ");
                    administrador.buscarCliente();
                    break;
                case 4:
                    System.out.println("4) Buscar y eliminar un cliente: ");
                    administrador.eliminarCliente();
                    break;
                case 5:
                    System.out.println("5) Agregar Activos a un cliente");
                    administrador.agregarActivos();
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("\nOpción incorrecta");
            }

        } while (opcion != 6);


        try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(
                    "C:\\Users\\Dihue\\Desktop\\Repositories\\CursoDeJava\\src\\" +
                            "Laboratorio\\Clases\\C11_10\\PracticaExamen\\DatosSerializados.txt"));

            flujoSalida.writeObject(administrador.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
