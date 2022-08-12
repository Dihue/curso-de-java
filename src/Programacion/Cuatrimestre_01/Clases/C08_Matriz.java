package Cuatrimestre_01.Clases;

import java.util.Scanner;

public class C08_Matriz {
    public static void main(String[] args) {
        // Matriz
        int[][] matriz = new int[5][5];

        // Asigno valores a la matriz
        matriz[0][0] = 99;
        matriz[3][2] = 100;

        // Estructuras repetitivas
        Scanner scan = new Scanner(System.in);

        // Carga de valores en la matriz
        for (int y=0; y<5; y++){
            // Filas
            for (int x=0; x<5; x++){
                // Columnas
                System.out.println("Ingresar el valor para la posicion ["+ y +"]["+ x +"]");
                matriz[y][x] = scan.nextInt();
            }
        }

        // Imprimir los valores de la matriz
        for (int y=0; y<2; y++){
            // Filas
            for (int x=0; x<2; x++){
                // Columnas
                int v = matriz[y][x];

                System.out.println(v + " ");
            }
            System.out.println();
        }
    }
}
