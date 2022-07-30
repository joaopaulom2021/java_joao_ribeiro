package Main;

import javax.swing.JFrame;
import java.awt.Color;

// ----------------------------- Interface - Janela ----------------------------- //

public class Janela extends JFrame{
	
	//Construtor
	public Janela(String title, int width, int height, Color bg)
	{
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLocationRelativeTo(null);
		getContentPane().setBackground(bg);
		setLayout(null);
	}
}