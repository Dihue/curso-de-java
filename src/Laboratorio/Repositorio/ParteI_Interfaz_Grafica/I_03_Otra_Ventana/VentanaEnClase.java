package Laboratorio.Repositorio.ParteI_Interfaz_Grafica.I_03_Otra_Ventana;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class VentanaEnClase extends JFrame {

	public VentanaEnClase() {
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Toolkit sistema = Toolkit.getDefaultToolkit();
		Image logo = sistema.getImage(
			"D:\\Dihue\\Documents\\TUP\\Repositorios\\CursoDeJava\\src\\TUP_Logo.jpg");

		setIconImage(logo);

		setTitle("Mi primer ventana con imagen");

		PanelEnClase panelcito = new PanelEnClase();
		add(panelcito);
		setVisible(true);
	}

}
