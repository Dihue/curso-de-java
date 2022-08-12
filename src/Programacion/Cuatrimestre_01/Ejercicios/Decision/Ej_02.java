package Cuatrimestre_01.Ejercicios.Decision;

import java.util.Scanner;

/*
Escribir dos funciones que resuelvan los siguiente problemas
a) Dado un numero entero n, indicar si es par o no.
b) Dado un numero entero n, indicar si es primo o no.
 */
public class Ej_02 {
    public static void main(String[] args) {
        int n;
        System.out.println("Ingresar un número entero: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        Par(n);
        Primo(n);
    }

    public static int Par(int a) {

        if (a % 2 == 0) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
        return 0;
    }

    public static int Primo(int a) {
        if (a%2==0 && a!=2 && a%3==0 && a!=3 && a%5==0 && a!=5) {
            System.out.println("no es primo");
        } else {
            System.out.println("es primo");
        }
        return 0;
    }
}
