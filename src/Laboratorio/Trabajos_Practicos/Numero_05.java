package Laboratorio.Trabajos_Practicos;

public class Numero_05 {

	public static void main(String[] args) {
		float A = 1, B = 2, C = 3, E = 5, F = 6, G = 7, J = 10;

		float T1 = F/E, T2 = B/C, T3 = G/B, T4 = B/(C*J), T5 = A/C;

		float numerador = T1 - T2 * T3 + T4;

		float denominador = T5 / E;

		float resultado = numerador / denominador;

		System.out.println("Resultado del ejercicio es" + resultado);
	}

}
