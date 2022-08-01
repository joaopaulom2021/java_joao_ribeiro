package Main;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;

// ----------------------------- Interface - Janela ----------------------------- //

public class Janela extends JFrame{
	
	//Construtor
	public Janela(String title)
	{
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		screen = Toolkit.getDefaultToolkit().getScreenSize();
	}
	
	//Propriedades
	int   		width;
	int   		height;
	Color 		bg;
	Dimension	screen;
	
	//Métodos
	public void setProperties(int width, int height, Color bg)
	{
		this.width  = width;
		this.height = height;
		this.bg		= bg;
	}
	
	public void objConstruct()
	{
		setSize(width, height);
		getContentPane().setBackground(bg);
		setLocation((screen.width/2)-(width/2), (screen.height/2)-(height/2));
	}
}