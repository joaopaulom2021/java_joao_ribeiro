package Main;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

// ----------------------------- Interface - Mensagens ----------------------------- //

public class Mensagem extends JTextArea{
	
	//Construtor
	public Mensagem(String message)
	{
		super(message);
		setEditable(false);
		setLineWrap(true);
		setWrapStyleWord(true);
		setBackground(null);
	}
	
	//Propriedades
	public int x;
	public int y;
	public int width;
	public int height;
	
	//Métodos
	public void setProperties(int x, int y, int width, int height)
	{
		this.width  = width;
		this.height = height;
		this.x 	 	= x;
		this.y 	 	= y;
	}
	
	public void objConstruct(Font format, Color text)
	{
		setFont(format);
		setForeground(text);
		setBounds(x, y, width, height);
	}
}