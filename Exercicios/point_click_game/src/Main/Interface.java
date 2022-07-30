package Main;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

// ------------------------------ Interface - Construtor ------------------------------ //

public class Interface{
	
	//Define propriedades
	public Janela 	 janela;
	public Principal instancia;
	public Mensagem  msgIntro;
	
	//Define variaveis
	String  windowTitle  	 = "Point and Click Game";
	int 	windowWidth 	 = 800;
	int 	windowHeight 	 = 600;
	
	Font 	format	  	  = new Font("Book Antiqua", Font.PLAIN, 16);
	String	msgIntroText  = "Seja bem-vindo ao Point and Click Game!";
	int	msgWidth  = 700; int msgHeight = 150;
	int msgLocX	  = 50;  int msgLocY   = 400;
	
	//Construtor
	public Interface(Principal instancia)
	{
		this.instancia  = instancia;
		
		this.janela			= new Janela(windowTitle, windowWidth, windowHeight, Color.BLACK);
		this.msgIntro		= new Mensagem(msgIntroText, format, Color.BLUE, Color.WHITE);
		this.msgIntro.setBounds(msgLocX, msgLocY, msgWidth, msgHeight);
		
		this.janela.add(msgIntro);
		this.janela.setVisible(true);
	}
}