package Main;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

// ----------------------------- Interface - Mensagens ----------------------------- //

public class Mensagem extends JTextArea{
	
	//Construtor
	public Mensagem(String message, Font format, Color bg, Color text)
	{
		super(message);
		setBackground(bg);
		setForeground(text);
		setEditable(false);
		setLineWrap(true);
		setWrapStyleWord(true);
		setFont(format);
	}
}