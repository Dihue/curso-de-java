package Laboratorio.Repositorio.ParteI_Interfaz_Grafica.I_02_Copiar_Pegar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame {

	private JPanel PanelPrincipal;
	private JLabel Texto;
	private JTextField textoUsuario;
	private JTextField textoPegado;
	private JButton botonLimpiar;
	private JButton botonCopiar;
	private JLabel Mensaje;
	private JLabel Mensaje2;

	public Ventana() {
		// Define el tamaño de la ventana
		setSize(300,200);
		// Hace visible la ventana
		setVisible(true);
		// Hace que la X cierre el programa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Pone la ventana en el centro relativo de la pantalla
		setLocationRelativeTo(null);

		// Coloca el panel con su contenido
		setContentPane(PanelPrincipal);

		botonCopiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoEscrito = textoUsuario.getText();
				System.out.println("El texto copiado es " + textoEscrito);
				textoPegado.setText(textoEscrito);
			}
		});

		botonLimpiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textoPegado.setText("");
				textoUsuario.setText("");
			}
		});
	}

}
