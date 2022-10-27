package Programacion.Cuatrimestre_02.Clases.C09_27;

public class Main {

	public static void main(String[] args) {

		int resultado = factorial(3);

		System.out.println(resultado);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		// queda en espera la multiplicación
		// porque vuelve a llamar al método hasta que sale
		return  n * factorial(n-1);
	}

}
/*
Si el n ingresado es 3:

4ª Factorial(0) -> cumple el caso base y retorna el 1									= 1
3º Factorial(1) -> queda en espera, toma el retorno de Factorial(0) (1*factorial(0)) 	= 1
2ª Factorial(2) -> queda en espera, toma el retorno de Factorial(1) (2*factorial(1)) 	= 2
1ª Factorial(3) -> queda en espera, toma el retorno de Factorial(2) (3*factorial(2)) 	= 6

 */