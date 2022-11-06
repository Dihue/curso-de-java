package Laboratorio.Clases.C10_21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PrimerVentana extends JFrame {
	private JPanel PanelPrincipal;
	private JButton botonCopiar;
	private JButton botonLimpiar;
	private JLabel Texto;
	private JTextField textoUsuario;
	private JTextField textoPegado;
	private JLabel mensaje;
	private JLabel texto2;

	public PrimerVentana() {
		setSize(1024, 768);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(PanelPrincipal);


		// Escuchador de acción para el botón copiar
		botonCopiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Variable para almacenar el texto ingresado
				String textoEscrito = textoUsuario.getText();
				// Mensaje por consola para control
				System.out.println("El texto copia es " + textoEscrito);
				// Cambia el texto vacío por el nuevo almacenado
				textoPegado.setText(textoEscrito);
			}
		});

		// Escuchador de acción para el botón limpiar
		botonLimpiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Para poner vacío en la entrada y salida de texto
				textoPegado.setText("");
				textoUsuario.setText("");
			}
		});

		/*
		String paraMostrar = mensaje.getText();
		JOptionPane.showMessageDialog(paraMostrar);
		 */
	}

}
