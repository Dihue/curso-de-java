package Laboratorio.En_Clase;

import javax.swing.JOptionPane;

public class C08_18 {

	public static void main(String[] args) {
		//String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		//int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));

		int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce primer número: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce segundo número: "));

		int suma = a + b;

		String mensaje = "Resultado: " + a + " + " + b + " = " + suma;

		System.out.println(mensaje);

		JOptionPane.showMessageDialog(null, mensaje);

	}
}