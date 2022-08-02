package Main;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import Event.PopupSetText;
import Event.SceneTransition;

// ------------------------------ Interface - Construtor ------------------------------ //

public class Interface{
	
	//Define propriedades
	public Janela 	  	 	janela;
	public Principal  	 	instancia;
	public Mensagem   	 	textLabel;
	public Background 	 	bgWindow[];
	public JLabel	  	 	bgContainer[];
	public Object	  	 	objContainer[];
	public ImageIcon  	 	bgImage[];
	public BtnSceneTrans 	btnArrow[];
	public PopupSetText  	setTextEvent;
	public SceneTransition	setActScene;
	
	
	//Define variaveis
	public String   windowTitle  = "Point and Click Game";
	public int 		windowWidth  = 800;
	public int 		windowHeight = 600;
	
	public Font format	  = new Font("Book Antiqua", Font.PLAIN, 16);
	public int  msgWidth  = 700; public int msgHeight = 150;
	public int  msgLocX	  = 50;  public int msgLocY   = 410;
	
	public int bgWidth	  = 700; public int bgHeight  = 350;
	public int bgLocX	  = 50;  public int bgLocY	  = 50;
	
	//Construtor
	public Interface(Principal instancia)
	{	
		//Instancia objetos
		this.instancia    = instancia;
		this.textLabel 	  = new Mensagem();
		this.bgWindow     = new Background[10];
		this.objContainer = new Object[10];
		this.btnArrow     = new BtnSceneTrans[10];
		this.setTextEvent = new PopupSetText(textLabel);
		this.setActScene  = new SceneTransition(bgWindow);
		
		//Cria cenários
		createScenario();
	}
	
	//Cria mensagens
	public void createMessage(String message)
	{
		this.textLabel.setProperties(msgLocX, msgLocY, msgWidth, msgHeight);
		this.textLabel.objConstruct(message, format, Color.WHITE);
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
	public void createObject(String url, int x, int y, int width, int height, String[][] popupItems, String[][] itemDescription, int i)
	{
		this.objContainer[i] = new Object();
		this.objContainer[i].setProperties(x, y, width, height);
		this.objContainer[i].addPopupMenu(popupItems[i], itemDescription[i]);
		this.objContainer[i].objConstruct(url);
	}
	
	//Cria transição
	public void createTransition(int x, int y, int width, int height, String url, int i)
	{
		this.btnArrow[i] = new BtnSceneTrans();
		this.btnArrow[i].setProperties(x, y, width, height, url);
		this.btnArrow[i].objConstruct();
	}
	
	public void createScenario()
	{
		//Define variaveis
		String[][] popupItems 	 = {
			//Chest
			{"Olhar", "Abrir"},
			
			//Dwarf
			{"Conversar", "Atacar"}
		};
		String[][] itemDescription = {
			//Chest
			{
				"Um bau, provavelmente contem itens para novos aventureiros.",
				"Voce abre o bau e encontra uma espada!\n[1x Espada Curta - adicionada ao iventario]"
			},
			
			//Dwarf
			{
				"Dwarf: Ola, nunca te vi na vila antes. Tome cuidado por onde anda\nEstrangeiros sao um alvo facil por aqui.",
				"Seria tolice ataca-lo, nao seria nada agradavel levar um ataque desse martelo de guerra...",
			}
		};
		
		// --------------------------- Cenário 01 --------------------------- //
		
		createWindow(windowTitle, windowWidth, windowHeight, Color.BLACK);
		createMessage("Seja bem-vindo ao Point and Click Game!");
		createBackground(bgLocX, bgLocY, bgWidth, bgHeight, 0);
		
		createTransition(0, 150, 50, 50, "../inc/btnArrow(50).png", 0);
		this.btnArrow[0].setActionCommand("0");
		this.btnArrow[0].addActionListener(setActScene);
		
		createObject("../inc/chest(200).png", 420, 150, 200, 200, popupItems, itemDescription, 0);
		this.objContainer[0].addPopupEvent(setTextEvent, 0);
		this.objContainer[0].addPopupEvent(setTextEvent, 1);
		
		createObject("../inc/hero(150).png", 50, 50, 150, 225, popupItems, itemDescription, 1);
		this.objContainer[1].addPopupEvent(setTextEvent, 0);
		this.objContainer[1].addPopupEvent(setTextEvent, 1);
		
		this.bgWindow[0].add(btnArrow[0]);
		this.bgWindow[0].add(objContainer[0]);
		this.bgWindow[0].add(objContainer[1]);
		this.bgWindow[0].objConstruct("../inc/background(700).jpg");
		
		// --------------------------- Cenário 02 --------------------------- //
		
		createTransition(650, 150, 50, 50, "../inc/btnArrow_right(50).png", 1);
		this.btnArrow[1].setActionCommand("0");
		this.btnArrow[1].addActionListener(setActScene);
		
		createBackground(bgLocX, bgLocY, bgWidth, bgHeight, 1);
		this.bgWindow[1].add(btnArrow[1]);
		this.bgWindow[1].objConstruct("../inc/background2(700).png");
		
		//Apresenta janela
		this.janela.add(bgWindow[0]);
		this.janela.add(bgWindow[1]);
		this.janela.add(textLabel);
		this.janela.setVisible(true);
	}
}