package Laboratorio.Clases.C09_08;

public class Main {

	public static void main(String[] args) {
		Bicicleta bici1 = new Bicicleta("Ariel",2,26);
		boolean freno = bici1.frenos();
		boolean seguro = bici1.seguro();
		//freno = true;
		// seguro = true;

		bici1.marchar(10);

		imprimirFrenos(freno);
		imprimirSeguro(seguro);

	}

	public static void imprimirFrenos(boolean paramFreno) {
		if (paramFreno) {
			System.out.println("Tiene frenos");
		} else {
			System.out.println("No tiene frenos");
		}
	}


	public static void imprimirSeguro(boolean paramSeguro) {
		if (paramSeguro) {
			System.out.println("Tiene seguro");
		} else {
			System.out.println("No tiene seguro");
		}
	}
}
