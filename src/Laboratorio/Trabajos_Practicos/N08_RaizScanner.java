package Laboratorio.Trabajos_Practicos;
/*
Crea una clase con el nombre de RaizScanner. Al ejecutar el programa nos debe pedir
introducir un número por consola.

Después de introducir el número y pulsar ENTER, el programa devuelve en consola la
raíz cuadrada del número tal y como aparece en la siguiente imagen:

     introduce un número:
     9
     la raíz de 9 es = 3.0
*/
import java.util.Scanner;

public class N08_RaizScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		int numero = scan.nextInt();

		double raiz = Math.sqrt(numero);
		System.out.println("La raíz de " + numero + " es = " + raiz);
	}

}
