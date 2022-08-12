package Cuatrimestre_01.Clases;

import java.util.Scanner;

public class C07_Arreglos {
    public static void main(String[] args) {
        int opcion, hs, min, seg;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una opción");
        System.out.println("1 - Convertir a segundos");
        System.out.println("2 - Convertir a horas, minutos y segundos");
        System.out.println("3 - Salir");

        opcion = scan.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese hora");
                hs = scan.nextInt();
                System.out.println("Ingrese minutos");
                min = scan.nextInt();
                System.out.println ("Ingrese segundos");
                seg = scan.nextInt();

                System.out.println ("La hora en segundos es " + Segundos(hs,min,seg));
                break;
            }
            case 2: {
                System.out.println ("Ingrese hora en segundos");
                seg = scan.nextInt();
                Hora(seg);
                break;
            }
            case 3: break;
            default: System.out.println ("Opcion no valida");
        }
        System.out.println("se sale");
    }

    public static void Hora(int seg) {
        int a,b,c;
        a = seg/3600;
        b = (seg-a*3600)/60;
        c = seg-a*3600-b*60;
        System.out.println ("La hora es: " + a + ":" + b + ":" + c);
    }

    public static int Segundos (int hor, int min, int seg) {
        int a,b;
        a = hor*3600;
        b = min*60;
        return (a+b+seg);
    }


}

    /*
    public static void main(String[] args) {
        // Declaracion: nombre tamaño tipo de dato
        // Referencia de elemento: mediante el nombre del arreglo y un indice

        Scanner scan = new Scanner(System.in);

        // Declaro indice para la dimension del arreglo
        System.out.println("Ingresar la cantidad de ventas: ");
        int dimension = scan.nextInt();
        double total = 0;

        // Declaro arreglo
        // Arreglo unidimencional
        double[] ventas = new double[dimension];
        String[] productos = new String[dimension];

        // Cargo arreglo con valores
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese el producto: ");
            productos[i] = scan.next();

            System.out.println("Ingrese el monto de la venta: ");
            ventas[i] = scan.nextDouble();

            total = total + ventas[i];
        }

        for (int i = 0; i < dimension; i++) {
            System.out.println("El producto "+ productos[i] +" se vendio "+ ventas[i]);
        }
        System.out.println("Total es: "+ total);
    }

*/