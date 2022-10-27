package Laboratorio.Repositorio.ParteI_Interfaz_Grafica.I_03_Otra_Ventana;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelEnClase extends JPanel {
	JButton botonAzul = new JButton("AZUL");
	JButton botonAmarillo = new JButton("AMARILLO");
	JButton botonMagenta = new JButton("MAGENTA");

	public PanelEnClase() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonMagenta);

		ColorDeFondo azul = new ColorDeFondo(Color.BLUE);
		botonAzul.addActionListener(azul);

		ColorDeFondo amarillo = new ColorDeFondo(Color.YELLOW);
		botonAmarillo.addActionListener(amarillo);

		ColorDeFondo magenta = new ColorDeFondo(Color.MAGENTA);
		botonMagenta.addActionListener(magenta);

		//botonAzul.setBackground(Color.BLUE);
	}

	private class ColorDeFondo implements ActionListener {
		private Color colorDeFondo;

		public ColorDeFondo(Color color) {
			this.colorDeFondo = color;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(this.colorDeFondo);
		}
	}

}
