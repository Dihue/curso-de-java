package Cuatrimestre_01.Practica;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int f1, c1, f2, c2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas de la matriz 1: ");
        f1 = scan.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz 1: ");
        c1 = scan.nextInt();

        int[][] matriz1 = new int[f1][c1];

        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Ingrese valor para la posición [" + i +"] [" + j +"]");
                matriz1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Ingrese la cantidad de filas de la matriz 2: ");
        f2 = scan.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz 2: ");
        c2 = scan.nextInt();

        int[][] matriz2 = new int[f2][c2];

        for (int i = 0; i < f2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println("Ingrese valor para la posición [" + i +"] [" + j +"]");
                matriz2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matriz 1:");
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print (matriz1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Matriz 2:");
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(" ");
        }

        if (f1==f2 && c1==c2) {
            System.out.println("Resultado de la suma:");
            int[][] sum = suma(matriz1,matriz2,f1,c1);
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print (sum[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
        else
            System.out.println ("La cantidad de filas y columnas de la matriz 1 debe ser igual a la de la matriz 2");
        if (c1 != f2)
            System.out.println("Columnas de matriz 1 deben ser igual a filas de matriz 2");
        else {
            System.out.println("Resultado de la multiplicacion:");
            int[][] mult = multiplicacion(matriz1,matriz2,f1,c1,f2,c2);
            for (int i = 0; i < f2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print (mult[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
    public static int[][] suma(int[][] mat1, int[][] mat2, int a, int b) {
        int resultado[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                resultado[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return resultado;
    }

    public static int[][] multiplicacion(int mat1[][], int mat2[][], int a, int b, int c, int d) {
        int[][] resultado = new int[c][d];
        // Necesitamos hacer esto por cada columna de la segunda matriz (B)
        for (int k = 0; k < d; k++) {
            // Dentro recorremos las filas de la primera (A)
            for (int i = 0; i < a; i++) {
                int suma = 0;
                // Y cada columna de la primera (A)
                for (int j = 0; j < b; j++) {
                    // Multiplicamos y sumamos resultado
                    suma += mat1[i][j] * mat2[j][k];
                }
                // Lo acomodamos dentro del producto
                resultado[i][k] = suma;
            }
        }
        return resultado;
    }
}