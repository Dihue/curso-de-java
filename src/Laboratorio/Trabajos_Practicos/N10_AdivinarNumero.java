package Laboratorio.Trabajos_Practicos;
/*
En este desafío se trata de crear un programa en JAVA que haga que el usuario deba de
adivinar en el menor número de intentos posibles un número entero aleatorio entre 1 y
100 generado por el programa.

Al ejecutar el programa, este generará un número aleatorio entre 1 y 100 que el usua-
rio no sabrá.

A continuación, el programa pedirá la introducción de un número entero entre 1 y 100
por consola.

Si el número introducido por el usuario es mayor que el número aleatorio generado por
el programa, saldrá un mensaje por consola indicando que el número es menor.

Si el número introducido por el usuario es menor que el número aleatorio generado por
el programa, saldrá un mensaje por consola indicando que el número es mayor.

El proceso se repetirá indefinidamente hasta que averigüemos cuál es el número genera-
do aleatoriamente por el programa.

Una vez acertado, debe imprimir en consola un mensaje de “Correcto!”.

El programa debe de indicar el número de intentos consumidos para acertar con el número
aleatorio y luego de que el usuario ingrese el número se debe mostrar el número generado.
*/
import java.util.Scanner;

public class N10_AdivinarNumero {

	public static void main(String[] args) {

		int numeroAleatorio = (int) (Math.random() * 100 + 1);
		int numeroIngresado, contador = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Adivinar el número aleatorio entre 1 y 100");

		do {
			System.out.println("\nIngresar un número entero entre 1 y 100:");
			numeroIngresado = scan.nextInt();
			contador += 1;

			if (numeroIngresado <= 0 || numeroIngresado > 100) {
				System.out.println("Valor ingresado incorrecto");

			} else if (numeroIngresado > numeroAleatorio) {
				System.out.println("El número es menor");

			} else if (numeroIngresado < numeroAleatorio) {
				System.out.println("El número es mayor");

			} else {
				System.out.println("Correcto, el número aleatorio es " + numeroAleatorio);
				System.out.println("Utilizaste " + contador + " intentos");
			}
		} while (numeroAleatorio != numeroIngresado);

	}

}
