package Laboratorio.Clases.Segundo_Parcial;

import java.io.*;
import java.util.Scanner;

public class Main {
    static String direccionArchivo = "C:\\Users\\Dihue\\Desktop\\Repositories\\" +
            "CursoDeJava\\src\\Laboratorio\\Clases\\Segundo_Parcial\\BaseDatos.txt";

    public static void main(String[] args) {
        int opcion = 0, numero = 0;
        String dato1 = null, dato2 = null, dato3 = null;
        boolean verificar = true;
        Scanner scan = new Scanner(System.in);
        Empresa empresa = new Empresa();
        Cliente cliente = null;

        String linea;
        BufferedReader leer;

        do {
            menu();
            do {
                try {
                    System.out.println("\nOpción: ");
                    opcion = scan.nextInt();
                    verificar = true;
                } catch (Exception e) {
                    verificar = false;
                    scan.nextLine();
                    System.out.println("No es un valor válido");
                }
            } while (!verificar);

            switch (opcion) {
                // Crear Cliente
                case 1:
                    do {
                        try {
                            System.out.println("\nIngresar DNI: ");
                            numero = scan.nextInt();
                            verificar = true;
                        } catch (Exception e) {
                            verificar = false;
                            scan.nextLine();
                            System.out.println("Solo se permiten números enteros");
                        }
                    } while (!verificar);
                    System.out.println("\nIngresar apellido: ");
                    dato1 = scan.next();
                    System.out.println("\nIngresar nombre: ");
                    dato2 = scan.next();
                    System.out.println("\nIngresar dirección: ");
                    dato3 = scan.next();

                    Cliente clienteNuevo = new Cliente(numero,dato1,dato2,dato3);
                    empresa.agregarCliente(clienteNuevo);

                    String texto = clienteNuevo.getDni() + "," +
                            clienteNuevo.getApellido() + "," +
                            clienteNuevo.getNombre() + "," +
                            clienteNuevo.getDireccion();

                    escribirDatos(texto);
                    empresa.eliminarCliente(clienteNuevo.getDni());
                    break;

                //Listar datos de clientes (excepto los activos)
                case 2:
                    /*try {
                        leer = new BufferedReader(new FileReader(direccionArchivo));
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    while (true) {
                        try {
                            if ((linea = leer.readLine()) == null) {
                                break;
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        //System.out.println(linea);
                        cliente = crearCliente(linea);
                        empresa.agregarCliente(cliente);
                    }*/
                    System.out.println("\nLista de clientes: ");
                    System.out.println(empresa.imprimir());
                    break;
            }


        } while (opcion > 0);


        System.out.println("\nLeer datos: ");
        leerDatos();



    }

    public static void leerDatos() {
        try {
            FileReader entrada = new FileReader(direccionArchivo);

            int caracter = entrada.read();
            char letra = (char) caracter;

            while (caracter != -1) {
                System.out.print(letra);
                caracter = entrada.read();
                letra = (char) caracter;
            }
            entrada.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void escribirDatos(String texto) {
        try {
            FileWriter escritura = new FileWriter(direccionArchivo, true);

            for (int i = 0; i < texto.length(); i++) {
                escritura.write(texto.charAt(i));
            }
            escritura.write("\n");
            escritura.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Cliente crearCliente(String linea) {
        String[] valores = linea.split(",");
        int dni = Integer.parseInt(valores[0]);
        Cliente cliente = new Cliente(dni, valores[1], valores[2], valores[3]);
        return cliente;
    }

    public static void menu() {
        System.out.println("\n- - - - - - - - - - Menú Principal - - - - - - - - - -\n");
        System.out.println("-> 0. Salir");
        System.out.println("-> 1. Crear Cliente");
        System.out.println("-> 2. Listar datos de clientes (excepto los activos)");
        System.out.println("-> 3. Buscar y listar datos completos de un cliente");
        System.out.println("-> 4. Buscar y eliminar un cliente");
    }
}