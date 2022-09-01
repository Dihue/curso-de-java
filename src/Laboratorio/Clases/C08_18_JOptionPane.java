package Laboratorio.En_Clase;

import javax.swing.JOptionPane;

public class C08_18_JOptionPane {

	public static void main(String[] args) {
		//String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		//int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));

		int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce primer número: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce segundo número: "));

		int suma = a + b;

		String mensaje = "Resultado: " + a + " + " + b + " = " + suma;

		System.out.println(mensaje);

		JOptionPane.showMessageDialog(null, mensaje);

		if (suma == 100) {
			System.out.println("cien");
		} else if (suma > 100) {
			int valor = suma - 100;
			System.out.println("Es mayor por " + valor);
		} else if (suma == 0) {
			System.out.println("No existe");
		}
	}
}