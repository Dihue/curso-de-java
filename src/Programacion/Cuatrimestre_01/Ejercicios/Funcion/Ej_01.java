package Cuatrimestre_01.Ejercicios.Funcion;

import java.util.Scanner;

/*
Escribir un programa que pregunte al usuario:
a) Su nombre, y luego lo salude.
b) Dos numeros, y luego muestre el producto.
 */
public class Ej_01 {
    public static void main(String[] args) {
        String nombre;
        int a, b;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar nombre");
        nombre = scan.nextLine();
        System.out.println("Primer número");
        a = scan.nextInt();
        System.out.println("Segundo número");
        b = scan.nextInt();

        System.out.println(Saludar(nombre));
        System.out.println("El producto es " + Producto(a,b));

    }

    public static String Saludar(String a) {
        return "Hola " + a;
    }

    public static int Producto(int a, int b) {
        return a * b;
    }
}
