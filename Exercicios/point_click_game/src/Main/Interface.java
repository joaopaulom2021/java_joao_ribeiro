package Main;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

// ------------------------------ Interface - Construtor ------------------------------ //

public class Interface{
	
	//Define propriedades
	public Janela 	  janela;
	public Principal  instancia;
	public Mensagem   texto[];
	public Background bgWindow[];
	public JLabel	  bgContainer[];
	public Object	  objContainer[];
	public ImageIcon  bgImage[];
	
	//Define variaveis
	public String  windowTitle  = "Point and Click Game";
	public int 	windowWidth 	= 800;
	public int 	windowHeight 	= 600;
	
	public Font format	  = new Font("Book Antiqua", Font.PLAIN, 16);
	public int  msgWidth  = 700; public int msgHeight = 150;
	public int  msgLocX	  = 50;  public int msgLocY   = 410;
	
	public int bgWidth	  = 700; public int bgHeight  = 350;
	public int bgLocX	  = 50;  public int bgLocY	  = 50;
	
	//Construtor
	public Interface(Principal instancia)
	{
		this.instancia  = instancia;
		
		//Instancia objetos
		this.texto    	  = new Mensagem[10];
		this.bgWindow     = new Background[10];
		this.objContainer = new Object[10];
		
		//Cria cenários
		createScenario();
	}
	
	//Cria mensagens
	public void createMessage(String message, int i)
	{
		this.texto[i] = new Mensagem(message);
		this.texto[i].setProperties(msgLocX, msgLocY, msgWidth, msgHeight);
		this.texto[i].objConstruct(format, Color.WHITE);
	}
	
	//Cria janela
	public void createWindow(String title, int width, int height, Color bg)
	{
		this.janela	= new Janela(title);
		this.janela.setProperties(width, height, bg);
		this.janela.objConstruct();
	}
	
	//Cria background
	public void createBackground(int x, int y, int width, int height, int i)
	{
		this.bgWindow[i] = new Background();
		this.bgWindow[i].setProperties(x, y, width, height);
	}
	
	//Cria objetos
	public void createObject(String url, int x, int y, int width, int height, int i)
	{
		this.objContainer[i] = new Object();
		this.objContainer[i].setProperties(x, y, width, height);
		this.objContainer[i].objConstruct(url);
	}
	
	public void createScenario()
	{
		// --------------------------- Cenário 01 --------------------------- //
		
		createWindow(windowTitle, windowWidth, windowHeight, Color.BLACK);
		createMessage("Seja bem-vindo ao Point and Click Game!", 0);
		createBackground(bgLocX, bgLocY, bgWidth, bgHeight, 0);
		
		createObject("../inc/chest(200).png", 420, 150, 200, 200, 0);
		createObject("../inc/hero(150).png", 50, 50, 150, 225, 1);
		
		objContainer[0].addPopupMenu(new String[]{"Olhar", "Abrir"});
		
		this.bgWindow[0].addObject(objContainer[0]);
		this.bgWindow[0].addObject(objContainer[1]);
		this.bgWindow[0].objConstruct("../inc/background(700).jpg");
		
		//Apresenta janela
		this.janela.add(bgWindow[0]);
		this.janela.add(texto[0]);
		this.janela.setVisible(true);
	}
}