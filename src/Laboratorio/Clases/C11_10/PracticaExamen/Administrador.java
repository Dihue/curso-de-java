package Laboratorio.Clases.C11_10.PracticaExamen;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador implements Serializable {
    private ArrayList<Cliente> clientes;
    //private ClienteOutput salida = new ClienteOutput();

    public Administrador() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente() {
        Scanner leer = new Scanner(System.in);

        // Pedir datos de un cliente
        System.out.println("Nombre: ");
        String nombre = leer.nextLine();

        System.out.println("Apellido: ");
        String apellido = leer.nextLine();

        System.out.println("Dirección: ");
        String direccion = leer.nextLine();

        System.out.println("DNI: ");
        int dni = leer.nextInt();

        // Creación del objeto cliente
        Cliente cliente = new Cliente(nombre,apellido,direccion,dni);
        // Agregar cliente a la lista
        this.clientes.add(cliente);
        /*salida.abrir();
        salida.escribir(cliente);
        salida.cerrar();*/
    }

    public void listarCliente() {
        for (Cliente clienteLista : clientes) {
            System.out.println(clienteLista.imprimirInformacion());
        }
    }

    public void buscarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombreCliente = leer.nextLine();

        for (Cliente clienteLista : clientes) {
            if (clienteLista.getNombre().equalsIgnoreCase(nombreCliente)) {
                System.out.println(clienteLista.toString());
                break;
            }
        }
    }

    public void eliminarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombreCliente = leer.nextLine();

        for (Cliente clienteLista : clientes) {
            if (clienteLista.getNombre().equalsIgnoreCase(nombreCliente)) {
                clientes.remove(clienteLista);
                System.out.println("Cliente eliminado");
                break;
            }
        }
    }

    public void agregarActivos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombreCliente = leer.nextLine();

        for (Cliente clienteLista : clientes) {
            if (clienteLista.getNombre().equalsIgnoreCase(nombreCliente)) {
                System.out.println("Nombre del activo: ");
                String nombre = leer.nextLine();

                System.out.println("Monto del activo: ");
                double monto = leer.nextDouble();

                Activo activoNuevo = new Activo(nombre, monto);
                clienteLista.agregarActivo(activoNuevo);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "clientes=" + clientes +
                '}';
    }
}
