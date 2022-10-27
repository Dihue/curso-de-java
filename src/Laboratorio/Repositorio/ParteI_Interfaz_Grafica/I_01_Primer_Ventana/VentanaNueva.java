package Laboratorio.Repositorio.ParteI_Interfaz_Grafica.I_01_Primer_Ventana;

import javax.swing.*;

public class VentanaNueva extends JFrame {
	private JPanel PanelPrincipal;
	private JButton button1;
	private JButton button2;
	private JCheckBox checkBox1;
	private JCheckBox checkBox2;
	private JCheckBox checkBox3;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JTextField textField1;
	private JPasswordField passwordField1;
	private JSlider slider1;
	private JProgressBar progressBar1;

	public VentanaNueva() {
		setSize(400, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(PanelPrincipal);
	}

}
