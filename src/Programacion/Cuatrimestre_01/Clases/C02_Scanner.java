package Cuatrimestre_01.Clases;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Declaracion de variables
        int A;
        int B;

        // Salida por pantalla con el pedido de datos
        System.out.println("Ingrese valores numéricos: ");

        // Implementacion del Scanner
        Scanner scan = new Scanner(System.in);

        // Asignacion del valor para las variables
        A = scan.nextInt();
        B = scan.nextInt();

        // Salida por pantalla del valor de las variables
        System.out.println("Los valores son "+ A +" y "+ B);

        // Finalizar el proceso del Scanner (buena practica)
        scan.close();

    }
}
